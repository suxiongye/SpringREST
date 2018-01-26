/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package rest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author suxiongye
 * @Package model
 * @Description: 书籍
 * @date 2018/1/26 15:01
 */
@Entity
public class Bookmark {
    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @GeneratedValue
    private Long id;

    public String uri;
    public String description;

    public Bookmark() {

    }

    public Bookmark(Account account, String uri, String description) {
        this.account = account;
        this.uri = uri;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public String getDescription() {
        return description;
    }

    public String getUri() {
        return uri;
    }
}
