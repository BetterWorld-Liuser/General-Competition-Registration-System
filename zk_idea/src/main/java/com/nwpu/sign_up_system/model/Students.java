package com.nwpu.sign_up_system.model;


import lombok.Data;

@Data
public class Students {

      private   int id;
      private String name;
      private   int  score;
      private String teacher_name;
      private boolean is_pay_fee;

    public Students() {
    }

    public Students(int id, String name, String teacher_name, boolean is_pay_fee) {
        this.id = id;
        this.name = name;
        this.teacher_name = teacher_name;
        this.is_pay_fee = is_pay_fee;
    }
}
