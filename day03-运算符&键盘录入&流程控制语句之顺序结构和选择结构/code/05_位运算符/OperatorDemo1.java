/**
 * 面试题
 *      1、请自己实现两个整数变量的交换
 *      2、请用最有效率的方式写出计算2乘以8的结果
 */
public class OperatorDemo1 {
    public static void main(String[] args){   
        int a = 10;
        int b = 20;

        /**
         * 1、请自己实现两个整数变量的交换
         */
        //方式1：使用第三方变量交换(开发中用的)
        /*int c = a;

        a = b;

        b = c;

        System.out.println("a:"+a+"b:"+b);*/

        //方式2：使用位异或(面试)
        //左边：a、b、a
        //右边：a^b

       /* a = a ^ b;
        b = a ^ b;//a^b^b=a=b b已变成了a
        a = a ^ b;//a^b^a=b=a

        System.out.println("a:"+a+"b:"+b);*/

        //方式3：变量相加
        /*a = a + b;//30
        b = a - b;//30-20=10
        a = a - b;//30-10
        System.out.println("a:"+a+"b:"+b);*/

        //方式4：一句话搞定
        b = (a+b) - (a=b);//先算小括号a+b=30、再算a=b 这是a=20 所以b=10
        System.out.println("a:"+a+"b:"+b);
        /**
         * 2、请用最有效率的方式写出计算2乘以8的结果
         */
        System.out.println(2 << 3);//2 * 2^3 = 2 * 8 = 16
    }   
}