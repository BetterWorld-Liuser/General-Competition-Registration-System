package com.nwpu.sign_up_system.service;


import com.nwpu.sign_up_system.model.Students;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public interface ExcelService {

    /**
     * 从指定路径的excel中读出所有的学生对象并放置于一个数组中
     * @param filePath  excel的文件路径
     * @return
     */
     List<Students> getStudentsList(String filePath) throws IOException;


     String saveStudentsToSQL(List<Students> students) throws  Exception;


}
