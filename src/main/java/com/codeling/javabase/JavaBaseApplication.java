package com.codeling.javabase; //打包 javabase 文件打包--》xx.jar --> java -jar xx.jar || maven: mv clean package

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaBaseApplication.class, args);
    }
    //无返回值的方法 args
    public void test() {
        System.out.println("test");
        int i = test1();
    }
    //有返回值方法
    public int test1() {
        System.out.println("11");
        return 1;
    }
}
