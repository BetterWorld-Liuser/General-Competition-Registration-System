package com.nwpu.sign_up_system.service_impl;

import com.nwpu.sign_up_system.mapper.StudentsMapper;
import com.nwpu.sign_up_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentsMapper studentsMapper;

    @Override
    public String deleteStudent(int id) {
        try {
            studentsMapper.deleteStudent(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "delete successfully";
    }

    @Override
    public String addScoreToStudent(int id, int score) {
        try {
            studentsMapper.updateScoreOfStudent(id, score);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "update successfully";
    }


    @Override
    public String changeScoreToStudent(int id, int score) {
        try {
            studentsMapper.updateScoreOfStudent(id, score);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "change score successfully";
    }

    @Override
    public int getScoreOfStudent(int id, String name) {
            int score;

        // TODO: 2019-10-10 查询未找到应该返回特殊字段

            try {
            score =  studentsMapper.selectScoreOfStudent(id, name);
        } catch (SQLException e) {
            e.printStackTrace();

            return -1;                      //-1代码代表查询失败
        }

        return score;
    }
}
