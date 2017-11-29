/**
 * 单目运算：~3
 * 双目运算：3 + 4
 * 三目运算：
 *      格式：比较表达式?表达式1 : 表达式2;
 *          比较表达式返回的是一个boolean类型的true或false
 *      执行流程：
 *          根据比较表达式的计算结果返回一个true或false
 *          如果是true，表达式1作为结果
 *          如果false，表达式2作为结果
 */
public class OperatorDemo {
    public static void main(String[] args){   
        int a = 3;
        int b = 4;

        int c = (a > b)? a : b;
        System.out.println(c);
    } 
}