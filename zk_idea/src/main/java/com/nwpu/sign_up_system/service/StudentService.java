package com.nwpu.sign_up_system.service;

import io.swagger.annotations.Api;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Api(tags="实现News相关操作的Service组件")
@Service
public interface StudentService {
    /**
     * 指定删除某一学生的报名信息
     *
     * @param id
     * @return
     */
    @Transactional
    String deleteStudent(int id);

    /**
     * 首次录入某一学生的得分分数
     *
     * @param id
     * @return
     */
    @Transactional
    String addScoreToStudent(int id, int score);

    /**
     * 修改某一学生的得分分数
     *
     * @param id
     * @return
     */
    @Transactional
    String changeScoreToStudent(int id, int score);

    /**
     * 学号和姓名同时匹配, 查询某一学生所得的分数
     *
     * @param id
     * @return
     */
    int getScoreOfStudent(int id, String name);

    /**
     * 返回所有学生的报名信息。
     *
     * @return
     */
    JSONArray findAllStudents();
}
