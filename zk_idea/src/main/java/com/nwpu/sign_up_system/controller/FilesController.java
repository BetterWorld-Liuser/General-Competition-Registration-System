package com.nwpu.sign_up_system.controller;


import com.nwpu.sign_up_system.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
@ResponseBody
@Controller
public class FilesController {

    @Autowired
    ExcelService excelService;

    @PostMapping("/uploadfile")
    public String upload(@RequestParam("uploadFile") MultipartFile uploadFile) throws Exception {

        if (null == uploadFile) {
            return ("上传失败，无法找到文件！");
        }

        String fileName = uploadFile.getOriginalFilename();

        File fileDir = new File("uploaded_files_here");

        if(!fileDir.exists()){
            fileDir.mkdir();
        }
        String path = fileDir.getAbsolutePath();

        File file_new = new File(fileDir.getAbsolutePath(),fileName);
        uploadFile.transferTo(file_new);


        String fileNameStus = file_new.getAbsolutePath();
        excelService.saveStudentsToSQL(excelService.getStudentsList(fileNameStus));



        return "successfully upload!";

    }


}
