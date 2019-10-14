package com.nwpu.sign_up_system.controller;

import com.nwpu.sign_up_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class StudentController {


    @Autowired
    StudentService studentService;


    /**
     * 指定删除某一学生的报名信息
     * @param id
     * @return
     */
    @Transactional
    @RequestMapping("/deleteStudent")
    public String deleteStudent(@RequestParam int id){

        return studentService.deleteStudent(id);

    }


    /**
     * 首次录入某一学生的得分分数
     *
     * @param id
     * @return
     */
    @Transactional
    @RequestMapping("/addScoreToStudent")

    String addScoreToStudent(@RequestParam int id, @RequestParam int score) {
        return studentService.addScoreToStudent(id, score);

    }


    /**
     * 修改某一学生的得分分数
     * @param id
     * @return
     */
    @Transactional
    @RequestMapping("/changeScoreToStudent")
    String changeScoreToStudent(@RequestParam int id, @RequestParam int score){

    return studentService.addScoreToStudent(id, score);

}


    /**
     * 学号和姓名同时匹配, 查询某一学生所得的分数
     *
     * @param id
     * @return
     */
    @Transactional
    @RequestMapping("/getScoreOfStudent")
    int getScoreOfStudent(@RequestParam int id, @RequestParam String name) {
        return studentService.getScoreOfStudent(id,name);
    }


}
