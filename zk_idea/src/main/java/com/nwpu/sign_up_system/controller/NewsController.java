package com.nwpu.sign_up_system.controller;

import com.nwpu.sign_up_system.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import net.sf.json.JSONObject;
import org.apache.commons.collections4.Get;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Api(tags="发布热点新闻的接口")
@Controller
@ResponseBody
public class NewsController {



    @Autowired
    NewsService newsService;
    @ApiOperation(value = "发布新闻， 返回一个string的处理结果的文字描述")
    @RequestMapping(value = "/publishNews", method = RequestMethod.POST)
    @ApiResponses({
            @ApiResponse(code=400,message="发布新闻的参数格式不正确"),
            @ApiResponse(code=404,message="新闻字符串参数过长，超出限制")
    })
    public String publishNews(@RequestParam("title") String title,
//                            @RequestParam("id") int id,
                              @RequestParam("date") Date date,
                              @RequestParam("content") String content,
                              @RequestParam("sender") String sender,
                              @RequestParam("tag") String tag
    ) {
        return newsService.publishNews(title, date, content, sender, tag);
    }



    @ApiOperation(value = "返回所有的新闻")
    @RequestMapping(value = "/findAllNews", method = RequestMethod.GET)
    public JSONObject findAllNews() {
        return newsService.findAllNews();
    }


    @ApiResponses({
            @ApiResponse(code=200,message="id is not exist, failed!"),
            @ApiResponse(code=200,message="delete successfully!")
    })
    @ApiOperation(value = "删除某一条新闻， 返回一个string的处理结果的文字描述")
    @RequestMapping(value = "/deleteOneNew", method = RequestMethod.POST)
    public String findAllNews(@RequestParam("id") int id) {
        String title = newsService.findTitleById(id);
        if (title == null) return "id is not exist, failed!";
        else return newsService.deleteNews(id);
    }


}
