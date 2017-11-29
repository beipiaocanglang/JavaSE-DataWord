/**
 * 比较运算符
 *      == 、 !=、> 、 >= 、 < 、<= 
 * 特点：  
 *      无论你操作的数据运算时简单还是复杂，结果都是boolean类型，其结果只有true和false
 * 注意：
 *      比较运算符"=="不能误写成”=“
 */
public class OperatorDemo1{
    public static void main(String[] args){   
        int a = 3;
        int b = 4;
        int c = 3;

        System.out.println(a == b);//false
        System.out.println(a == c);//true
        System.out.println((a+b) == (b+c));//true

        System.out.println("==============================");

        System.out.println(a != b);//true
        System.out.println(a > b);//false
        System.out.println(a >= b);//false
        System.out.println(a < b);//true
        System.out.println(a <= b);//true
        System.out.println("hello" instanceof String);//true

        System.out.println("==============================");
        System.out.println(a = b);//不能误写成 ”=“ 否者就会变成赋值
    }
}