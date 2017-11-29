/**
 * 三目运算练习题
 *      1、获取两个整数中的最大值
 *      2、获取三个整数中的最大值
 *      3、比较两个整数是否相同
 */
public class OperatorTest {
    public static void main(String[] args){   
        //1、获取两个整数中的最大值
        int a = 100;
        int b = 200;
        int c = (a>b)?a:b;
        System.out.println(c);

        //2、获取三个整数中的最大值
        int d = 100;
        int e = 200;
        int f = 300;
        //方式1
        int g = (((d>e)?d:e)>f)?((d>e)?d:e):f;
        System.out.println(g);
        //方式2
        int max = (d > e)?((d > f)?d : f):((e > f)?e : f);
        System.out.println("max:"+max);
        //方式3
        int temp = (d > e)?d:e;
        int max1 = (temp > f )?temp:f;
        System.out.println("max1:"+max1);

        //3、比较两个整数是否相同
        int h = 200;
        int j = 400;
        boolean k = h == j;
        System.out.println(k);
    } 
}