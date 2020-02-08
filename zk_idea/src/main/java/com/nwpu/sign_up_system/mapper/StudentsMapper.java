package com.nwpu.sign_up_system.mapper;

import com.nwpu.sign_up_system.model.Students;
import io.swagger.annotations.Api;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
@Api(tags="管理学生事务，和数据库对接的Mapper")

@Mapper
@Repository
public interface StudentsMapper {
    @Select("select * from students ")
    ArrayList<Students> selectAllStudent() throws SQLException;

    @Insert("insert into students(name, id, teacher_name, is_pay_fee, school_name) " +
            "values(#{name},#{id},#{teacherName},#{isPayFee},#{schoolName})")
    void addStudent(Students students) throws SQLException;

    @Delete("delete  from students where id = #{id}")
    void deleteStudent(int id) throws SQLException;

    @Update("update  students set score = #{score} where id = #{id}")
    void updateScoreOfStudent(int id, int score) throws SQLException;

    @Select("select IFNULL ((select IFNULL(score, -2) from students where id = #{id} and name = #{name}), -1)")
    int selectScoreOfStudent(int id, String name) throws SQLException;
}
