package com.hbuas.POJO;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
