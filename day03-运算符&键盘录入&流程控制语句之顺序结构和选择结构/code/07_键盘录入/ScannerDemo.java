/**
 * 键盘录入
 *      为了使程序更接近实际开发 我们加入了键盘录入
 * 使用步骤：
 *      1、导包
 *          格式：import java.util.Scanner;
 *          位置：在class上面
 *      2、创建键盘录入对象
 *          Scanner sc = new Scanner();
 *      3、调用方法
 *          
 */
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args){   
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //提示语
        System.out.println("请您输入一个数字：");
        //调用键盘录入方法
        int x = sc.nextInt();

        System.out.println("您输入的内容是："+x);
    } 
}