/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package rest;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author suxiongye
 * @Package model
 * @Description: TODO
 * @date 2018/1/26 15:15
 */
public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {
    Collection<Bookmark> findByAccountUsername(String username);
}
