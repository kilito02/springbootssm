package com.itheima.springbootssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class ShopCart {
    private int id;
    private Date createTime;
    private int userId;
    private int isDelete;
    private int contentId;
    private int num;
    private double price;
    private String img;
    private String title;
    private String description;
    private String ip;
    private String ipAddress;
    private String url;
}