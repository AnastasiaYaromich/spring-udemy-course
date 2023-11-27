package com.yaromich.spring.service;

import com.yaromich.spring.database.entity.Company;
import com.yaromich.spring.database.repository.CompanyRepository;
import com.yaromich.spring.database.repository.CrudRepository;
import com.yaromich.spring.database.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    @Autowired
    public UserService(UserRepository userRepository, CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
