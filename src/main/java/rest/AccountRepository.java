/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package rest;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author suxiongye
 * @Package model
 * @Description: TODO
 * @date 2018/1/26 15:13
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
    Optional<Account> findByUsername(String username);
}
