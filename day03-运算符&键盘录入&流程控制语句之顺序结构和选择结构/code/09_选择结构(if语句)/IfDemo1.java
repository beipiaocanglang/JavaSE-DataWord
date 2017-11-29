/**
 * 流程控制语句 -- 选择结构 -- 格式2
 *      if(关系表达式) {
 *		     语句体1;
 *	    } else {
 *		     语句体2;
 *	    }
 *
 * 执行流程
 *      首先判断关系表达式看其结果是true还是false
 *      如果是true就执行语句体1
 *      如果是false就执行语句体2
 *
 * If选择结构的注意事项：
 *      格式二的else后面是没有比较表达式的，只有if后面有
 */
public class IfDemo1 {
    public static void main(String[] args){   

        int a = 10;
        int b = 20;

        if (a == b) {
            System.out.println("a等于b");
        } else {
            System.out.println("a不等于b");
        }
    } 
}