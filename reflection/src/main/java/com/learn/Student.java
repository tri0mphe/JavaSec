package com.learn;

public class Student {

    public String name;
    protected int weight;
    char sex;
    private int age;

    //无参构造方法
    public Student(){
        System.out.println("调用了公有、无参构造方法执行了。。。");
    }

    //有一个参数的构造方法
    public Student(char name){
        System.out.println("姓名：" + name);
    }

    //有多个参数的构造方法
    public Student(String name ,int age){
        System.out.println("多个参数的构造方法"+"姓名："+name+"年龄："+ age);
    }

    //受保护的构造方法
    protected Student(boolean n){
        System.out.println("受保护的构造方法 n = " + n);
    }

    //私有构造方法
    private Student(int age){
        System.out.println("私有的构造方法   年龄："+ age);
    }

    public void learn(){
        System.out.println("调用 公有无参数的learn方法");
    }
    public void learn(String address){
        System.out.println("调用 公有有参数的learn方法 address:"+address);
    }
    void learn(String address,int time){
        System.out.println("调用 默认，有两个参数的learn方法  address:"+address+" time:"+time);
    }
    public static  void test(){
        System.out.println("调用了静态方法");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
