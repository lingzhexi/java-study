package com.codeling.javabase.base;

/**
 * 类 做了什么
 */
public class BaseType {
    //程序的入口
    public static void main(String[] args) throws Exception {
        String str = "xxx "; //字符串
        char c = '\u4e2d'; // 2 字节 字符型 Unicode 万国码 ，空格/tab \u4e2d\u56fd
        byte b = 1; //1赋值到类型为byte的变量b -128--127 二进制有关  1字节 8bit
        short s = 10; //串口 16bit
        int i = 22;   //20亿  32 bit足够了 数字默认int
        long l = 2200000000L;  //更大范围 64bit
        float f = 1.0f; //浮点型 小数 单精度 浮点类型
        double d = 2.0d; //浮点型 小数 双精度 浮点型
        boolean flag = true;
        System.out.println(c);
        System.out.println(Byte.SIZE/Byte.SIZE);
        byte by = (byte)256;  // int -128 --127 +1 ---> -128
        System.out.println(by);



        //条件 结构
        //条件判断，只判断一次
        if (!flag)
        {
            //条件体
            System.out.println("真的");
        }else if(false){
            System.out.println("假的");
        }else{
            System.out.println("最后");
        }
        System.out.println("switch");
        int type = 1;

        switch (type)
        {
            //switch 循环体
            case 1:
                System.out.println("case == 1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                //简单
                /*方法注释*/
                /**类型注释**/
                break;
            default:
                System.out.println("都没有找到该类型");
                break;
        }

        //循环
        //直到xx不满足
        int num = 0;
        while (num <5) {
            if (num == 3) { //num 等于 3 比较值 new xx(); equals(); 对象
                System.out.println("跳过3");
                continue;
            }
            System.out.println("num：" + num);
            num++;
        }
        //直到那个条件不满跳出
        do {

        } while (num<5);

        //异常捕获
        try
        {
            int count = 0;
            System.out.println(1 / 1); //开启流
        } catch (Exception e) //异常捕获
        {
            System.out.println(e.getMessage());
            throw new Exception();
        }finally { //try catch 最终都会执行到这里
            System.out.println("这里是finally"); // 关闭流 （资源，避免程序开销 --》 oom ）
        }
        //== equals()
        int it = 1;//栈
        String str1 = "hello";//堆

    }

    static void test() {
        System.out.println("这是test方法");
        return;
    }

   static void test2() {
        test();//调用test方法
    }

}
