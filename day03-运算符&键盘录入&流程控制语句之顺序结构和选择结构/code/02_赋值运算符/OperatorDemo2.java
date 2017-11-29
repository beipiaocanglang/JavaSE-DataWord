/**
 * 面试题
 *      short s=1; s = s+1; 
 *      short s=1; s+=1;
 *      上面两个代码有没有问题，如果有，那里有问题
 *      
 *  第一个有问题：
 *      会出现损失精度的问题
 * 
 *  第二个没有问题：
 *      扩展赋值运算符其实隐含了类型的强制转换
 *      s += 1;
 *      不等于s = s + 1;
 *      而是等价于s = (s的数据类型)(s + 1)
 *      
 */
public class OperatorDemo2{
    public static void main(String[] args){
        /**
         * 有问题：
         *      s是short类型，在做运算时会自动转成int类型，而s+1是int类型之间的运算，
         *      将int类型的运算结果int类型赋值给short类型，会损失精度
         */
        short s = 1; 
        //s = s + 1;
        System.out.println(s);
        
        /**
         * 没有问题，结果是2
         * 扩展赋值运算符隐含着强制转换
         * s += 1 不等于 s = s + 1
         */
        short d = 1; 
        d += 1;
        System.out.println(d);
    }
}