package com.nwpu.sign_up_system.service_impl;

import com.nwpu.sign_up_system.mapper.StudentsMapper;
import com.nwpu.sign_up_system.model.Students;
import com.nwpu.sign_up_system.service.StudentService;
import io.swagger.annotations.Api;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
@Api(tags="实现学生实体的相关操作的Service组件的实现")
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
        int score = 0;
        // TODO: 2019-10-10 查询未找到应该返回特殊字段
        try {
            score = studentsMapper.selectScoreOfStudent(id, name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return score;
    }

    @Override
    public JSONArray findAllStudents() {
        JSONArray jsonArray = new JSONArray();
        try {
            for (Students students : studentsMapper.selectAllStudent()) {
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("id", students.getId());
                jsonObject.put("name", students.getName());
                jsonObject.put("score", students.getScore());
                jsonObject.put("teacherName", students.getTeacher_name());
                jsonArray.add(jsonObject);   //添加一个学生信息json object进入json array数组中
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jsonArray;
    }
}
