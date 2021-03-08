package com.tri0mphe.test;

import com.tri0mphe.Factory;
import com.tri0mphe.Factory2;
import com.tri0mphe.util.Person;

public class MainTest {
    public static void main(String[] args) {
        Person p = Factory2.getInstance("com.tri0mphe.Virus");
        p.eat();
    }
}
