package com.wbazmy.pojo;

/**
 * @author Zhang Yang
 * @description
 * @date 2022/4/14 - 23:39
 */
public class Student {
    private String name;
    private int id;
    private int classId;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", classId=" + classId +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }
}
