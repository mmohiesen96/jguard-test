package com.jguard.test;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jguard.test"})
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}