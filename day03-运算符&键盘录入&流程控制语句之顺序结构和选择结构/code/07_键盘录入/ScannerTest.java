/**
 * 键盘录入联系
 *      1、键盘录入两个数据，并对这两个数据求和，输出其结果
 *      2、键盘录入两个数据，获取这两个数据中的最大值
 *      3、键盘录入三个数据，获取这三个数据中的最大值
 *      4、键盘录入两个数据，比较这两个数据是否相等
 */
import java.util.Scanner;
public class ScannerTest {
    
    /**
     * 1、键盘录入两个数据，并对这两个数据求和，输出其结果
     */
    /*public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入第一个数字：");
        int x = sc.nextInt();
        System.out.println("请您输入第二个数字：");
        int y = sc.nextInt();
        System.out.println("您输入的两个数字的和为：" + (x + y));
    }*/ 

    /**
     * 2、键盘录入两个数据，获取这两个数据中的最大值
     */
    /*public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入第一个数字：");
        int x = sc.nextInt();
        System.out.println("请您输入第二个数字：");
        int y = sc.nextInt();
        System.out.println("您输入的两个数的最大值为：" + ((x > y)?x:y));
    }*/ 

    /**
     * 3、键盘录入三个数据，获取这三个数据中的最大值
     */
    public static void main(String[] args){   
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入第一个数字：");
        int x = sc.nextInt();
        System.out.println("请您输入第二个数字：");
        int y = sc.nextInt();
        System.out.println("请您输入第三个数字：");
        int z = sc.nextInt();

        int temp = (x>y)?x:y;
        int max = temp>z?temp:z;

        System.out.println("您输入的三个数的最大值为：" + max);
    } 
}