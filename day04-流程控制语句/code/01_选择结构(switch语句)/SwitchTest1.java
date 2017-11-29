import java.util.Scanner;

/**
 * 流程控制语句 -- 选择结构(switch语句)
 * 练习题1：模拟单选题
 */
class SwitchTest1 {
    public static void main(String[] args) {
        //模拟单选题
        System.out.println("下面几个人当中你最喜欢谁?");

        System.out.println("65 林青霞");
        System.out.println("66 张曼玉");
        System.out.println("67 刘德华");
        System.out.println("68 姚晨");

        Scanner sc = new Scanner(System.in);
        int selectNum = sc.nextInt();

        char SelectResult = (char)selectNum;

        switch(SelectResult){
            case 'A':
                System.out.println("恭喜你，选择正确");
                break;
            case 'B':
                System.out.println("您的选择有误，请重新选择");
                break;
            case 'C':
                System.out.println("您的选择有误，请重新选择");
                break;
            case 'D':
                System.out.println("您的选择有误，请重新选择");
                break;
            default:
                System.out.println("您的选择有误，请重新选择");
                break;
        }
    }
}