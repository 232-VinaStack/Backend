package com.demo.ViNaStack.DataBase;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DataBase {
    private static final Logger logger = LoggerFactory.getLogger(DataBase.class);


//    @Bean
//    CommandLineRunner initDataBase(Prod productRepossitories) {
//        return new CommandLineRunner() {
//            @Override
//            public void run(String... args) throws Exception {
//                Product productA = new Product(1);
//                Product productB = new Product(2);
//                logger.info("a" + productRepossitories.save(productA));
//                logger.info("a" + productRepossitories.save(productB));
//            }
//        };
//    }
}
