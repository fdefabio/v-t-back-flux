/*package com.proyecto.vtb.vtaskback.auth.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Jwtservice {
    public  static final String BEARER  = "Bearer";

    private static final String USER    = "user";
    private static final String ROLES   = "roles";
    private static final String ISSUER   = "miw-spring5";
    private static final int EXPIRES_IN_MILLISECOND = 3600000;
    private static final String SECRET  = "rororoor";


    public String createToken(String user , List <String> roles){
        return JWT.create()
                .withIssuer(ISSUER)
                .withIssuedAt(new Date())
                .withNotBefore(new Date())
                .withExpiresAt(new Date((System.currentTimeMillis() + EXPIRES_IN_MILLISECOND)))
                .withClaim(USER, user)
                .withArrayClaim(ROLES, roles.toArray(new String[0]))
                .sign(Algorithm.HMAC256(SECRET));

    }

    public boolean isBearer (String authorization){
        return authorization != null && authorization .startsWith(BEARER) && authorization.split("\\.").length ==3;
    }

    public String user (String authorization) throws JWTDecodeException {
        return this.verify(authorization).getClaim(USER).asString();

    }

    private DecodedJWT verify (String authorization) throws JWTDecodeException {
        if (!this.isBearer(authorization)){
            throw new JWTDecodeException("It is not Bearer");
        }
        try {
            return JWT .require(Algorithm.HMAC256(SECRET))
                    .withIssuer(ISSUER).build()
                    .verify(authorization.substring(BEARER.length()));
        }catch (Exception Ex){
            throw new JWTDecodeException("JWT is wrong." + Ex.getMessage());
        }
    }

    public List <String>roles(String authorization) throws JWTDecodeException{
        return Arrays.asList(this.verify(authorization).getClaim(ROLES).asArray(String.class));
    }

}
*/