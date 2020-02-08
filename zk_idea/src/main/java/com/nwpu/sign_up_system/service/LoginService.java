package com.nwpu.sign_up_system.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    int adminLogin(String id, String password);

    int adminRegister(String id, String password);
}
