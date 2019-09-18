package com.nwpu.sign_up_system.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
@ResponseBody
@Controller
public class FilesController {


    @PostMapping("/uploadfile")
    public String upload(@RequestParam("uploadFile") MultipartFile uploadFile) throws IOException {

        if (null == uploadFile) {
            return ("上传失败，无法找到文件！");
        }

        String fileName = uploadFile.getOriginalFilename();

        File fileDir = new File("uploaded_files_here");

        if(!fileDir.exists()){
            fileDir.mkdir();
        }
        String path = fileDir.getAbsolutePath();
        uploadFile.transferTo(new File(fileDir.getAbsolutePath(),fileName));


        return "successfully upload!";

    }


}
