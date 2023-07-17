package com.example.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.userdetails.UserDetailsService;

public class SecurityConfigurer extends WebSecurityConfigurerAdapter {
   @Autowired
    private MyUserDetailsService myUserDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService);
    }
}
