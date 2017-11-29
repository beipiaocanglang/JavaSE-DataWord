/**
 * 运算符
 *      分类：
 *          算术运算符、赋值运算符、比较运算符、逻辑运算符、位运算符、三元(三目)运算符
 * 
 *      运算符之算术运算符：
 *          +、-、*、/、%、++、--
 * 
 *      ++、——的操作
 *          作用：
 *              就是对变量自增1或者自减1操作
 *          使用：
 *              单独使用：
 *                  放操作数的前面和放后面的结果是一样，这种操作是嘴常见的
 * 
 *              参与运算使用(面试常见)
 *                  放在操作数前面，先自增或者自减，再参与运算
 *                  放在操作数后面，先参与运算，再自增或者自减
 * 
 *      注意事项：
 *          A:整数相除只能得到整数，想要得到小数必须将其中一个参数或者多个参数转换成浮点数
 *          B:/获取的是除法操作的商，%获取的是除法操作的余数
 */
public class OperatorDemo1{
    public static void main(String[] args){

        //定义变量
        int x = 3;//准确的读法：把3赋值给int类型的变量x
        int y = 4;

        //+、-、*、/、%的演示
        System.out.println(x + y);//加、7
        System.out.println(x - y);//减、-1
        System.out.println(x * y);//乘、12
        System.out.println(x / y);//除、0（整数相除只能得到整数）

        //就是想要得到一个正常的小数怎么办？只需要将其中一个数据变成浮点数即可
        System.out.println(x * 1.0 / y);//小数、0.75

        System.out.println(x % y);//3


        //++ 、 ——的演示

        /**
         * 单独使用:放操作数的前面和放后面的结果是一样，这种操作是嘴常见的
         */
        //x++;
        //y--;
        ++x;
        --y;
        System.out.println("x:"+x);
        System.out.println("y:"+y);

        System.out.println("************************************");

        /**
         * ++、--参与运算时使用
         *      放在操作数前面，先自增或者自减，再参与运算
         *      放在操作数后面，先参与运算，再自增或者自减
         */
        int a = 3;
        int b = 4;

        //int c = a++;
        //int d = b--;

        int c = ++a;
        int d = --b;

        System.out.println("a:"+a);//4、4
        System.out.println("b:"+b);//3、3
        System.out.println("c:"+c);//3、4
        System.out.println("d:"+d);//4、3
    }
}