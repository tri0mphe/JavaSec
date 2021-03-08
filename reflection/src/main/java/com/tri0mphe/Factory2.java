package com.tri0mphe;

import com.tri0mphe.util.Person;

//使用反射的例子
public class Factory2 {

    public static Person getInstance(String jobName) {
        Person p=null;
        try {
            p =(Person)Class.forName(jobName).newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return p;
    }
}
