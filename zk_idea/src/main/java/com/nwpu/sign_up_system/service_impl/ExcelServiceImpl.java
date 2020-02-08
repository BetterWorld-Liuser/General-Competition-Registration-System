package com.nwpu.sign_up_system.service_impl;

import com.nwpu.sign_up_system.mapper.StudentsMapper;
import com.nwpu.sign_up_system.model.Students;
import com.nwpu.sign_up_system.service.ExcelService;
import io.swagger.annotations.Api;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
@Api(tags="实现excel表单上传的Service组件的实现")
@Service
public class ExcelServiceImpl implements ExcelService {
    @Autowired
    StudentsMapper studentsMapper;

    @Override
    public List<Students> getStudentsList(String filePath) throws IOException {
        XSSFWorkbook workBook = null;
        InputStream is = new FileInputStream(filePath);
        workBook = new XSSFWorkbook(is);
        List<Students> studentsList = new ArrayList<Students>();
        for (int numShett = 0; numShett < workBook.getNumberOfSheets(); numShett++) {
            XSSFSheet sheet = workBook.getSheetAt(numShett);
            //调用获取图片
            if (sheet == null) {
                continue;
            }
            for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
                Row row = sheet.getRow(rowNum);
                if (row == null) {
                    continue;
                }
                Students students = new Students();
                //Cell
                Cell stuName = row.getCell(0);
                if (stuName == null) {
                    continue;
                }
                students.setName(stuName.getStringCellValue());//name
                Cell id = row.getCell(1);
                if (id == null) {
                    continue;
                }
                students.setId((int) (id.getNumericCellValue()));//id
                Cell teacher = row.getCell(2);
                if (teacher == null) {
                    continue;
                }
                students.setTeacherName(teacher.getStringCellValue());//teacher_name
                Cell pay = row.getCell(3);
                if (pay == null) {
                    continue;
                }
                students.setPayFee(pay.getBooleanCellValue());//bool

                //新增属性：学生所属学校
                Cell schoolName = row.getCell(4);
                if (schoolName == null) {
                    continue;
                }
                students.setSchoolName(schoolName.getStringCellValue());


                studentsList.add(students);
            }
        }
        return studentsList;
    }

    @Override
    public String saveStudentsToSQL(List<Students> students) throws Exception {
        for (Students student : students) {
            studentsMapper.addStudent(student);
        }
        return "Save to sql successfully!";
    }
}



