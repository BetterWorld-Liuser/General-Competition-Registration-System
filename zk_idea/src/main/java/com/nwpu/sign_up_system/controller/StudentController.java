package com.nwpu.sign_up_system.controller;

import com.nwpu.sign_up_system.model.Students;
import com.nwpu.sign_up_system.service.StudentService;
import io.swagger.annotations.*;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Api(tags="管理学生信息，执行相关操作的接口")
@ResponseBody
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    /**
     * 返回所有学生的报名信息。
     *
     * @return jsonArray
     */
    @ApiOperation(value = "得到所有的学生信息")
//    @ApiResponses({
//            @ApiResponse(code=400,message="学生信息数据库为空"),
//            @ApiResponse(code=500,message="服务器没有响应")
//    })
    @RequestMapping(value = "/findAllStudents", method = RequestMethod.GET)
    public JSONArray findAllNews() {
        return studentService.findAllStudents();
    }

    /**
     * 指定删除某一学生的报名信息
     *
     * @param id
     * @return
     */
    @Transactional
    @RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
    @ApiOperation(value = "删除某个学生的相关数据")
    @ApiResponses({
            @ApiResponse(code=400,message="学生id的参数格式不正确"),
            @ApiResponse(code=404,message="数据库中不存在这个学生，查无此人")
    })
    public String deleteStudent(@RequestParam int id) {
        return studentService.deleteStudent(id);
    }


    /**
     * 添加学生
     */

    public String addStudent(@RequestParam int id,@RequestParam String name,@RequestParam String schoolName,@RequestParam String teacherName) {

        Students students = new Students(id,  name,  teacherName,  false);
        students.setSchoolName(schoolName);
        return studentService.addStudent(students);
    }


    /**
     * 更新学生
     */

    public String updateStudent(@RequestParam int id,@RequestParam String name,@RequestParam String schoolName,@RequestParam String teacherName,@RequestParam boolean isPayFee) {
        deleteStudent(id);
        Students students = new Students(id,  name,  teacherName,  isPayFee);
        students.setSchoolName(schoolName);
        return studentService.addStudent(students);
    }






    /**
     * 首次录入某一学生的得分分数
     *
     * @param id
     * @return
     */
    @Transactional
    @RequestMapping(value = "/addScoreToStudent", method = RequestMethod.POST)
    @ApiOperation(value = "录入得分， 返回一个string的处理结果的文字描述")
    @ApiResponses({
            @ApiResponse(code=200,message="携带的id和score参数格式不正确"),
            @ApiResponse(code=200,message="score过大，超出分数限制")
            ,@ApiResponse(code=200,message="数据库查无此人")
    })
    String addScoreToStudent(@RequestParam int id, @RequestParam int score) {
        return studentService.addScoreToStudent(id, score);
    }

    /**
     * 修改某一学生的得分分数
     *
     * @param id
     * @return
     */

    @Transactional
    @ApiOperation(value = "修改得分， 返回一个string的处理结果的文字描述")
    @ApiResponses({
            @ApiResponse(code=400,message="携带的id和score参数格式不正确"),
            @ApiResponse(code=404,message="score过大或者为负，违背分数的范围限制")
            ,@ApiResponse(code=503,message="数据库查无此人")
    })
    @RequestMapping(value = "/changeScoreToStudent", method = RequestMethod.POST)
    String changeScoreToStudent(@RequestParam int id, @RequestParam int score) {
        return studentService.addScoreToStudent(id, score);
    }

    /**
     * 学号和姓名同时匹配, 查询某一学生所得的分数
     *
     * @param id , name
     * @return string , 实现了容错处理。
     */
    @Transactional
    @ApiOperation(value = "查询分数， 返回一个string的处理结果的文字描述")
    @ApiResponses({
            @ApiResponse(code=200,message="没有查询到和学号以及姓名同时匹配的账户，请检查输入的学号和姓名是否正确."),
            @ApiResponse(code=200,message="此同学的得分成绩尚未录入，请耐心等待， 日后再次查询.")
    })
    @RequestMapping(value = "/getScoreOfStudent", method = RequestMethod.GET)
    String getScoreOfStudent(@RequestParam int id, @RequestParam String name) {
        int score = studentService.getScoreOfStudent(id, name);
        String score_str;
        if (score == -1) {
            score_str = "没有查询到和学号以及姓名同时匹配的账户，请检查输入的学号和姓名是否正确.";
        } else if (score == -2) {
            score_str = "此同学的得分成绩尚未录入，请耐心等待， 日后再次查询.";
        } else score_str = Integer.toString(score);
        return score_str;
    }
}
