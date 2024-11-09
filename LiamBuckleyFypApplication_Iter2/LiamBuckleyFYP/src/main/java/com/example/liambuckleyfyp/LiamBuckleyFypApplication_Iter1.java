//Line 8 and 13 are the only changes made to the orginal file used with GitHub Co-pilot
package com.example.liambuckleyfyp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.liambuckleyfyp.repository")
@EntityScan(basePackages = "com.example.liambuckleyfyp.model")
public class LiamBuckleyFypApplication_Iter1 {
    public static void main(String[] args) {
        SpringApplication.run(LiamBuckleyFypApplication_Iter1.class, args);
    }
}