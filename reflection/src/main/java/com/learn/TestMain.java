package com.learn;

import java.lang.reflect.Method;

public class TestMain {

    public static void main(String[] args) throws Exception {

        //获取 getRuntime方法方法
        Method method = (Method) Class.forName("java.lang.Class")
                .getMethod("getMethod", new Class[] {String.class, Class[].class })//得到getMethod方法
                .invoke(Class.forName("java.lang.Runtime"),"getRuntime",new Class[0]);//调用getMethod方法

        //以上等于执行Class.forName("java.lang.Runtime").getMethod("getRuntime")
        //调用Runtime.getRuntime函数，传入的obj根据上面的分析可以随便写
       Runtime runtime=(Runtime) method.invoke(null);
       runtime.exec("calc");
    }
}
