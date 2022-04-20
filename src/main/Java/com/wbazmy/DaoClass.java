package com.wbazmy;

import java.util.List;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/8 - 19:15
 */
public class DaoClass implements TestDao {
    private int num;
    private String name;
    private List<String> list;


    public void setList(List<String> list) {
        this.list = list;
    }


    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + num);
        System.out.println(list);
        System.out.println("Spring Running!");
    }


//    public void init(){
//        System.out.println("init");
//
//    }
//    public void destroy(){
//        System.out.println("destroy");
//
//    }
}
