package com.yaromich.spring;

import com.yaromich.spring.database.pool.ConnectionPool;
import com.yaromich.spring.database.repository.CrudRepository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ConnectionPool connectionPool = context.getBean("pool1", ConnectionPool.class);
        System.out.println(connectionPool);

        var companyRepository = context.getBean("companyRepository", CrudRepository.class);
        System.out.println(companyRepository.findById(1));
        context.close();
    }
}