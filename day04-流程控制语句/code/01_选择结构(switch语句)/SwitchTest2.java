/**
 * 流程控制语句 -- 选择结构(switch语句)
 * 练习题1：用switch语句实现键盘录入月份，输出对应的季节
 */
import java.util.Scanner;

class SwitchTest2 {
    public static void main(String[] args) {
        //模拟单选题
        System.out.println("请输入一个数字(1~12)：");

        Scanner sc = new Scanner(System.in);
        Integer season = sc.nextInt();

        switch(season){
            case 1:
                System.out.println("冬季");
                break;
            case 2:
                System.out.println("冬季");
                break;
            case 3:
                System.out.println("春季");
                break;
            case 4:
                System.out.println("春季");
                break;
            case 5:
                System.out.println("春季");
                break;
            case 6:
                System.out.println("夏季");
                break;
            case 7:
                System.out.println("夏季");
                break;
            case 8:
                System.out.println("夏季");
                break;
            case 9:
                System.out.println("秋季");
                break;
            case 10:
                System.out.println("秋季");
                break;
            case 11:
                System.out.println("秋季");
                break;
            case 12:
                System.out.println("冬季");
                break;
            default:
                System.out.println("您输入的月份有误，请重新输入");
                break;
        }

        System.out.println("*******************改进版*******************");

        switch(season){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("您输入的月份有误，请重新输入");
                break;
        }
    }
}