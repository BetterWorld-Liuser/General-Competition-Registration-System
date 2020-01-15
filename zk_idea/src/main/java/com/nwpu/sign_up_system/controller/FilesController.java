package com.nwpu.sign_up_system.controller;

import com.nwpu.sign_up_system.service.ExcelService;
import com.nwpu.sign_up_system.utils.Download_file_util;
import com.nwpu.sign_up_system.utils.Upload_file_util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Api(tags="用户上传或者下载报名表excel文件的接口")
@ResponseBody
@Controller
public class FilesController {
    @Autowired
    ExcelService excelService;
    @ApiOperation(value = "上传文件， 返回一个string的处理结果的文字描述")
    @PostMapping("/uploadfile")
    @ApiResponses({
            @ApiResponse(code=200,message="上传失败，上传文件为空。"),
            @ApiResponse(code=200,message="请上传2007年后新版的excel文件，比如：**.xlsx")
    })
    public String upload(@RequestParam("uploadFile") MultipartFile uploadFile) throws Exception {
        //此处应有检查上传文件的后缀名.
        Upload_file_util upload_file_util = new Upload_file_util();
        String fileNameStus = upload_file_util.upload(uploadFile);//上传成功则返回存放文件的路径
        if (fileNameStus.equals("error_01")) return "上传失败，上传文件为空。";
        else if (fileNameStus.equals("error_02")) return "请上传2007年后新版的excel文件，比如：**.xlsx";
        else {
            String result = excelService.saveStudentsToSQL(excelService.getStudentsList(fileNameStus));//保存至sql数据库
            return result;
        }
    }

    //文件下载相关代码
    @ApiOperation(value = "下载文件， 返回一个string的处理结果的文字描述")
    @RequestMapping(value = "/downloadfile", method = RequestMethod.POST)
    @ApiResponses({
//            @ApiResponse(code=200,message="fileName参数格式不正确")
    })
    public String downloadFile(HttpServletRequest request, HttpServletResponse response, @RequestParam("fileName") String fileName) {
        Download_file_util download_file_util = new Download_file_util();
        return download_file_util.downloadFile(request, response, fileName);
    }
}
