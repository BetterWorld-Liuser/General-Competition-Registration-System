package com.nwpu.sign_up_system.service;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public interface StudentService {



    /**
     * 指定删除某一学生的报名信息
     * @param id
     * @return
     */
    @Transactional
    String deleteStudent(int id);




    /**
     * 首次录入某一学生的得分分数
     * @param id
     * @return
     */
    @Transactional
    String addScoreToStudent(int id, int score);



    /**
     * 修改某一学生的得分分数
     * @param id
     * @return
     */
    @Transactional
    String changeScoreToStudent(int id, int score);



    /**
     * 学号和姓名同时匹配, 查询某一学生所得的分数
     * @param id
     * @return
     */
    @Transactional
    int getScoreOfStudent(int id, String name);




}
