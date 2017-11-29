/**
 * 流程控制语句 -- 选择结构 -- 格式3
 *      if(关系表达式1) {
 *          语句体1;
 *      }else if(关系表达式2) {
 *          语句体2;
 *      }
 *         。。。。。。
 *       else {
 *          语句体n+1;
 *      }
 *
 * 执行流程
 *      首先判断关系表达式1看其结果是true还是false
 *       如果是true就执行语句体1
 *       如果是false就继续判断关系表达式2看其结果是true还是false
 *       如果是true就执行语句体2
 *       如果是false就继续判断关系表达式…看其结果是true还是false
 *       …
 *       如果没有任何关系表达式为true，就执行语句体n+1。
 *
 *
 * If选择结构的注意事项：
 *      如果在执行的过程中执行了其中的任意一条表达式成立  则其他的就都不执行
 */
import java.util.Scanner;
public class PanDuanChengJi {
    public static void main(String[] args){   
        /**
         * 需求：根据键盘录入一个成绩，判断成绩的等级
         * 90~100 优秀
         * 80~90 好
         * 70~80 良
         * 60~70 及格
         * 0~60 不及格
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要查询的成绩");

        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("你当前成绩在优秀阶段");
        } else if (score >= 80 && score < 90) {
            System.out.println("你当前成绩在好阶段");
        } else if (score >= 70 && score < 80) {
            System.out.println("你当前成绩在良阶段");
        } else if (score >= 60 && score < 70) {
            System.out.println("你当前成绩在及格阶段");
        } else if (score >= 0 && score < 60) {
            System.out.println("你当前成绩不及格，再接再厉");
        } else {
            System.out.println("你输入的成绩有误，请重新输入");
        }
    } 
}