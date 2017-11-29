/**
 * 流程控制语句 -- 选择结构(switch语句)
 * 
 * 格式：
 *      switch(表达式) {
 *          case 值1：
 *			    语句体1;
 *			    break;
 *		    case 值2：
 *			    语句体2;
 *			    break;
 *		   ......
 *		    default：	
 *			    语句体n+1;
 *			    break;
 *      }
 * 
 * 格式解释：
 *       switch：表示这是switch语句
 *          表达式的取值：byte,short,int,char
 *          JDK5以后可以是枚举
 *          JDK7以后可以是String
 * 
 *       case：case后面跟的是要和表达式进行比较的值
 *       语句体：可以是一条或多条语句
 *       break：表示中断，结束的意思，可以结束switch语句 
 *       default：语句表示所有情况都不匹配的时候，就执行该处的内容，和if语句的else相似。
 * 
 * 执行流程：
 *       首先计算出表达式的值
 *       其次，和case依次比较，一旦有对应的值，就会执行相应的语句体，在执行的过程中，遇到break就会结束。
 *       最后，如果所有的case都和表达式的值不匹配，就会执行default语句体部分，然后程序结束掉
 * 
 * 注意事项
 *       A:case后面只能是常量，不能是变量，而且，多个case后面的值不能出现相同的
 *       B:default可以省略吗?
 *          可以省略。一般不建议。它的作用是对其他不正确的q情况给出提示
 *          特殊情况：
 *              除非判断的值是固定的。(比如单选题(只有ABCD不可能出现别的))
 *       C:break可以省略吗?
 *          最后一个可以省略
 *          其他也可以省略，但是一般不建议。否则结果可能不是你想要的(会出现case穿透)，
 *          例如：
 *              将下面案例中case为5的break注释，当键盘输入4时会输出两条结果
 *       D:default的位置一定要在最后吗?
 *          可以出现在switch语句任意位置。相当于if语句中的else
 *       E:switch语句的结束条件
 *          遇到break
 *          执行到程序的末尾
 *
 * 案例：
 *      根据键盘录入的数字判断并且输出对应的星期
 *      需求：
 *          键盘录入1，输出对应的星期一，
 *          键盘录入2，输出对应的星期二，
 *          。。。。。。
 *          键盘录入7，输出对应的星期日，
 */
import java.util.Scanner;
class InputNumOutputWeek {
    public static void main(String[] args) {
        //创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //提示语
        System.out.println("请输入一个数字(1~7)。");
        int inputNum = sc.nextInt();

        //定义一个变量, 错误: 需要常量表达式
        int num = 3;

        switch(inputNum){
            case 1:
                System.out.println("您输入的数字对应的是星期一");
                break;
            case 2:
                System.out.println("您输入的数字对应的是星期二");
                break;
            case 3:
                System.out.println("您输入的数字对应的是星期三");
                break;
            /*
            case后面的值不能重复，错误: case 标签重复
            case 3:
                System.out.println("您输入的数字对应的是星期三");
                break;
            */
            /*
            case后面的值不能是变量，错误: 需要常量表达式
            case num:
                System.out.println("您输入的数字对应的是星期三");
                break;
            */
            case 4:
                System.out.println("您输入的数字对应的是星期四");
                break;
            case 5:
                System.out.println("您输入的数字对应的是星期五");
                //如果将这里的break注释掉，结果可能不是想要的(case穿透)
                break;
            case 6:
                System.out.println("您输入的数字对应的是星期六");
                break;
            case 7:
                System.out.println("您输入的数字对应的是星期日");
                break;
            default:
                System.out.println("您输入的数字有误请重新输入。。。。");
                break;
        }
    }
}