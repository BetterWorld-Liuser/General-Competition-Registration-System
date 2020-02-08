package com.nwpu.sign_up_system.service_impl;

import com.nwpu.sign_up_system.mapper.AdminMapper;
import com.nwpu.sign_up_system.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {


    @Autowired
    AdminMapper adminMapper;


    @Override
    public int adminLogin(String id, String password) {

    String truePassword = adminMapper.findPasswordById(id);
    if(password.equals(truePassword)) return 1;
    else return 0;
    }

    @Override
    public int adminRegister(String id, String password) {

        String truePassword = adminMapper.findPasswordById(id);
        if(truePassword != null) return  2;
        int respons  = adminMapper.register(id, password);

        return respons;
    }
}
