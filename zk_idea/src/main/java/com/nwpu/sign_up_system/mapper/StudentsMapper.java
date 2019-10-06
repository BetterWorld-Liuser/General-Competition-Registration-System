package com.nwpu.sign_up_system.mapper;


import com.nwpu.sign_up_system.model.Students;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;

@Mapper
@Repository
public interface StudentsMapper {


    @Insert("insert into Students(name, id, teacher_name, is_pay_fee) " +
            "values(#{name},#{id},#{teacher_name},#{is_pay_fee})")
    void addStudent(Students students)throws SQLException;












}
