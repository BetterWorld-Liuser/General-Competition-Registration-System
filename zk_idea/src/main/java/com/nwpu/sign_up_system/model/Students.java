package com.nwpu.sign_up_system.model;

import io.swagger.annotations.Api;
import lombok.Data;
@Api(tags="学生的实体类")

@Data
public class Students {
    private int id;
    private String name;
    private String schoolName;
    private int score;
    private String teacherName;
    private boolean isPayFee;
    private String examType;

    public Students() {
    }

    public Students(int id, String name, String teacherName, boolean isPayFee) {
        this.id = id;
        this.name = name;
        this.teacherName = teacherName;
        this.isPayFee = isPayFee;
    }
}
