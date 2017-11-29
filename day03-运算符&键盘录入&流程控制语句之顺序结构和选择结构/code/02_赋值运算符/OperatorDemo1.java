/**
 * 运算符之赋值运算符
 *      基本赋值运算符：=
 *          把等号(=)右边的数据赋值给左边的变量
 *      扩展赋值运算符：+=、-=、*=、/=、%=
 *          把左边的数据和右边的数据做加、减、乘、除运算后再赋值给左边
 */
public class OperatorDemo1{
    public static void main(String[] args){

        /**
         * 基本赋值运算符
         *      把有变动数据赋值给左边
         */
        //定义变量
        int x = 10;//准确的读法：把3赋值给int类型的变量x

        int a,b;
        a = b = 10;
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        /**
         * 扩展赋值运算符
         *      左右两边做运算再赋值给左边
         */
        x += 20;
        System.out.println("x:"+x);
        
    }
}