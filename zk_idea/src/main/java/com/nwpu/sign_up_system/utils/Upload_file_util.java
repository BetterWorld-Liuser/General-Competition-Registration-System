package com.nwpu.sign_up_system.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

public class Upload_file_util {
    public String upload(MultipartFile uploadFile) throws Exception {
        if (null == uploadFile) {
            return "error_01";//空值
        }
        String fileName = uploadFile.getOriginalFilename();
        String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);
        if (!(fileType.equals("xlsx"))) {
            return ("error_02");//请上传2007年后新版的excel文件，比如：**.xlsx
        }
        File fileDir = new File("uploaded_files_here");
        if (!fileDir.exists()) {
            fileDir.mkdir();
        }
        String path = fileDir.getAbsolutePath();
        File file_new = new File(fileDir.getAbsolutePath(), fileName);
        uploadFile.transferTo(file_new);
        String fileNameStus = file_new.getAbsolutePath();
        return fileNameStus;
    }


    public String uploadOther(MultipartFile uploadFile) throws Exception {
        if (null == uploadFile) {
            return "error_01";//空值
        }
        String fileName = uploadFile.getOriginalFilename();
        String fileType = fileName.substring(fileName.lastIndexOf(".") + 1);

        File fileDir = new File("uploaded_files_here");
        if (!fileDir.exists()) {
            fileDir.mkdir();
        }
        String path = fileDir.getAbsolutePath();
        File file_new = new File(fileDir.getAbsolutePath(), fileName);
        uploadFile.transferTo(file_new);
        String fileNameStus = file_new.getAbsolutePath();
        return fileNameStus;
    }
}



