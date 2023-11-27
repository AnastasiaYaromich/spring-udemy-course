package com.yaromich.spring.database.repository;

import com.yaromich.spring.database.pool.ConnectionPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UserRepository {
    private final ConnectionPool connectionPool;

    @Autowired
    public UserRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
