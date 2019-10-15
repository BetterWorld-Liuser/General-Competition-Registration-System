package com.nwpu.sign_up_system.controller;


import com.nwpu.sign_up_system.service.ExcelService;
import com.nwpu.sign_up_system.utils.Download_file_util;
import com.nwpu.sign_up_system.utils.Upload_file_util;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@ResponseBody
@Controller
public class FilesController {

    @Autowired
    ExcelService excelService;


    @PostMapping("/uploadfile")
    public String upload(@RequestParam("uploadFile") MultipartFile uploadFile) throws Exception {

        //此处应有检查上传文件的后缀名.
        Upload_file_util upload_file_util = new Upload_file_util();
        String fileNameStus = upload_file_util.upload(uploadFile);//上传成功则返回存放文件的路径

        if(fileNameStus.equals("error_01"))  return "上传失败，上传文件为空。";

        else if(fileNameStus.equals("error_02"))  return "请上传2007年后新版的excel文件，比如：**.xlsx";

        else {
            String result = excelService.saveStudentsToSQL(excelService.getStudentsList(fileNameStus));//保存至sql数据库
            return result;
        }

    }


    //文件下载相关代码
    @RequestMapping("/downloadfile")
    public String downloadFile(HttpServletRequest request, HttpServletResponse response, @RequestParam("fileName") String fileName) {

        Download_file_util download_file_util = new Download_file_util();

       return download_file_util.downloadFile(request, response, fileName);

    }
}
