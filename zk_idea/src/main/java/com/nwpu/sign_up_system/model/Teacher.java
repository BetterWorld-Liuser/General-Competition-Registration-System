package com.nwpu.sign_up_system.model;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Teacher {
    String id;
    String password;
    String schoolName;
}
