package com.hxh.hashcode;

import java.util.HashMap;

public class HashTest {
    private String name;
    private int age;

    public HashTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  int hashCode(){
        return name.hashCode()*3+age;
    }
    public boolean equals(Object obj)
    {
        return this.name.equals(((HashTest)obj).name) && this.age==((HashTest)obj).age;
    }
}
