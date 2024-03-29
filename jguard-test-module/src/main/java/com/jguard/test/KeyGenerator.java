package com.jguard.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;
import java.util.Base64;

@RestController
public class KeyGenerator extends BaseController {

    @PostMapping
    @CommonArgs
    @CommonApiOperation
    public ResponseTemplateDTO generate() {
        byte[] masterKey = new byte[96];
        new SecureRandom().nextBytes(masterKey);
        return Base64.getEncoder().encodeToString(masterKey);
    }
}
