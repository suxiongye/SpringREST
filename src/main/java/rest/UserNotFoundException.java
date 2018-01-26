/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package rest;

/**
 * @author suxiongye
 * @Package exception
 * @Description: TODO
 * @date 2018/1/26 16:12
 */
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String userId) {
        super("could not find user '" + userId + "'.");
    }
}
