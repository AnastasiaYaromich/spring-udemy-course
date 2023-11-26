package com.yaromich.spring.repository.pool;

import java.util.*;

public class ConnectionPool {
    private String username;
    private Integer poolSize;
    private List<Object> args;
    private Map<String, Object> properties;


    public ConnectionPool(String username, Integer poolSize, List<Object> args, Map<String, Object> properties) {
        this.username = username;
        this.poolSize = poolSize;
        this.args = args;
        this.properties = properties;
    }

    public void setProperties(Map<String, Object> properties) {
        this.properties = properties;
    }
}
