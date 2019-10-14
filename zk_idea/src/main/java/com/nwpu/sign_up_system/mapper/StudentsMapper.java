package com.nwpu.sign_up_system.mapper;


import com.nwpu.sign_up_system.model.Students;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;

@Mapper
@Repository
public interface StudentsMapper {


    @Select("select * from students ")
    ArrayList<Students> selectAllStudent() throws SQLException;



    @Insert("insert into students(name, id, teacher_name, is_pay_fee) " +
            "values(#{name},#{id},#{teacher_name},#{is_pay_fee})")
    void addStudent(Students students)throws SQLException;


    @Delete("delete  from students where id = #{id}")
    void deleteStudent(int id)throws SQLException;


    @Update("update  students set score = #{score} where id = #{id}")
    void updateScoreOfStudent(int id,int score)throws SQLException;


    @Select("select IFNULL ((select IFNULL(score, -2) from students where id = #{id} and name = #{name}), -1)")
    int selectScoreOfStudent(int id, String name) throws SQLException;




}
