package com.User.Auth.Playground.Authentication;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.Claims;
import java.util.Date;
import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {
    private static final String SECRET_KEY = "mysecretkeymysecretkeymysecretkeymysecretkey";
    private static final int EXPIRATION_TIME = 24 * 60 * 60 * 1000; // 24 hours

    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }

    public String generateToken(String username, String role) {
        return Jwts.builder()
                .subject(username)  // Changed from setSubject
                .claim("role", role)
                .issuedAt(new Date())  // Changed from setIssuedAt
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))  // Changed from setExpiration
                .signWith(getSigningKey())  // Removed SignatureAlgorithm parameter
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parser()
                    .verifyWith(getSigningKey())  // Changed from setSigningKey
                    .build()
                    .parseSignedClaims(token);  // Changed from parseClaimsJws
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String extractUsername(String token) {
        Claims claims = Jwts.parser()
                .verifyWith(getSigningKey())  // Changed from setSigningKey
                .build()
                .parseSignedClaims(token)  // Changed from parseClaimsJws
                .getPayload();  // Changed from getBody
        return claims.getSubject();
    }

    public String extractRole(String token) {
        Claims claims = Jwts.parser()
                .verifyWith(getSigningKey())  // Changed from setSigningKey
                .build()
                .parseSignedClaims(token)  // Changed from parseClaimsJws
                .getPayload();  // Changed from getBody
        return claims.get("role", String.class);
    }
}
