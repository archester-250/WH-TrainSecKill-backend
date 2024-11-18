package com.pku;
import com.pku.properties.JwtProperties;
import com.pku.utils.JwtUtil;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class SeckillTests {
    private JwtProperties jwtProperties;
    @Test
    public void testJWT(){

        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", 1);
        claims.put("userName", "admin");
        String secretKey = "djasidjaosidjaosijiofjaoifjsdoifasdf";
        String token = JwtUtil.createJWT(secretKey, 100000, claims);
        System.out.println(token);
        Jws a = JwtUtil.parseJWT(secretKey, token);
        Map<String, Object> map = (Map<String, Object>) a.getPayload();
        System.out.println("Id:  "+map.get("userId"));

    }
}
