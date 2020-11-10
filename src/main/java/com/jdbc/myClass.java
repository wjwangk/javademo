package com.jdbc;

import com.mysql.jdbc.*;

import java.awt.print.PrinterAbortException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class myClass {

    private  int id;
    private  String name;
    private int age;
    private String sex;

    public int getId(){
        return id;
    }
    public void   setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void   setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void   setAge(int age){
        this.age = age;
    }

    public String getSex(){
        return sex;
    }
    public void   setSex(String sex){
        this.sex = sex;
    }

    public myClass(int id,String name,int age,String sex){

        this.id = id;
        this.name =name;
        this.age=age;
        this.sex=sex;

    }
}
