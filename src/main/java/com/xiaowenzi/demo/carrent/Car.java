package com.xiaowenzi.demo.carrent;

/**
 * 汽车类
 */
public class Car {
    /**
     * 序号
     */
    private int id;
    /**
     * 车名字
     */
    private String name;
    /**
     * 租金
     */
    private double rent;
    /**
     * 载人容量
     */
    private int peopleCapacity;
    /**
     * 货物容量
     */
    private double goodsCapacity;
    /**
     * 1：可载人的车；2：可载货的车；3：即可载人又可载货
     */
    private int type;
    /**
     * 车类型
     */

    private String tool;

    public void setTool(String tool) {  //私有设置变量tool的无参方法，传参
        this.tool = tool;        //setTool方法的传参String tool赋值给类中的成员变量tool
    }

    public String getTool() {      //获取变量tool的值，并返回结果
        return tool;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public double getGoodsCapacity() {
        return goodsCapacity;
    }

    public void setGoodsCapacity(double goodsCapacity) {
        this.goodsCapacity = goodsCapacity;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}