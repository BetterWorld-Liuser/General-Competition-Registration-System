package com.nwpu.sign_up_system.model;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Api(tags="管理新闻的实体类")

@AllArgsConstructor
@Data
@NoArgsConstructor  //无参构造函数，对象映射使用
public class News {
    private String title; //标题
    private int id;   //主键
    private Date date; //time
    private String content; //内容
    private String sender;  //发布单位
    private String tag;   //标签

    public News(String title, Date date, String content, String sender, String tag) {
        this.title = title;
        this.date = date;
        this.content = content;
        this.sender = sender;
        this.tag = tag;
    }

}
