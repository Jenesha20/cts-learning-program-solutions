package com.cognizant.spring_security;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController  // <---- Add this annotation here
public class AuthenticationController {

    private Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        logger.info("START - authenticate()");
        logger.debug("Authorization Header: {}", authHeader);

        Map<String, String> map = new HashMap<>();
        map.put("token", "");

        String user = getUser(authHeader);
        logger.debug("User extracted: {}", user);

        String token = generateJwt(user);
        map.put("token", token);

        logger.info("END - authenticate()");
        return map;
    }

    private String getUser(String authHeader) {
        logger.debug("Extracting user from authHeader");

        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }

        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decodedCredentials = new String(decodedBytes);

        logger.debug("Decoded credentials: {}", decodedCredentials);

        String[] parts = decodedCredentials.split(":", 2);
        return parts[0];
    }

    private String generateJwt(String user) {
        logger.debug("Generating JWT for user: {}", user);

        JwtBuilder builder = Jwts.builder()
                .setSubject(user)
                .setIssuedAt(new Date())
                .setExpiration(new Date((new Date()).getTime() + 1200000))
                .signWith(SignatureAlgorithm.HS256, "anonanonanonanonanonanonanonanonanonanonanonanonanonanonanonanonanonanon");

        return builder.compact();
    }
}
