/*
 * Copyright (C) 2018 Baidu, Inc. All Rights Reserved.
 */
package rest;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @author suxiongye
 * @Package rest
 * @Description: 权限
 * @date 2018/1/29 11:40
 */
public interface UserDetailsService {
    UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException;
}
