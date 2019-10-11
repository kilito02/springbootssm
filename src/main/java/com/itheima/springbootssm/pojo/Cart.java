package com.itheima.springbootssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Cart {
    private String id;
    private String name;
    private Double price;
    private Integer count;
    private String pic;
}
