/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package rest;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author suxiongye
 * @Package PACKAGE_NAME
 * @Description: 应用主类
 * @date 2018/1/26 15:17
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    CommandLineRunner init(AccountRepository accountRepository,
                           BookmarkRepository bookmarkRepository) {
        return (evt) -> Arrays.asList("jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
                            .forEach(a -> {
                                Account account =
                                    accountRepository.save(new Account(a, "password"));
                                bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/1" + a,
                                                                                   "A " + "description"));
                                bookmarkRepository.save(new Bookmark(account, "http://bookmark.com/2" + a,
                                                                                   "A " + "description"));
                            });
    }
}
