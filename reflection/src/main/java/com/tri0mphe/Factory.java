package com.tri0mphe;

import com.tri0mphe.impl.Soldier;
import com.tri0mphe.impl.Student;
import com.tri0mphe.util.Person;

//不使用反射构造工厂类
public class Factory {

    public static Person getInstance(String jobName){
        Person P =null;
        if("Soldier".equals(jobName)){
            P =new Soldier();
        }
        if("Student".equals(jobName)){
            P =new Student();
        }
        return  P;
    }
}




