package com.itheima.springbootssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Course {
    private Integer	id;
    public String	title;
    public String	description;
    public Double	price;
    public String	img;
    public Double	tprice;
}
