package com.example.securitymaster.security.annotation.customer;

import org.springframework.security.access.annotation.Secured;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static com.example.securitymaster.security.SecurityRoles.CUSTOMERS_ADMIN;
import static com.example.securitymaster.security.SecurityRoles.ROLES_PREFIX;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Secured(ROLES_PREFIX+CUSTOMERS_ADMIN)
public @interface CustomerAdmin {
}
