/**
 * 流程控制语句--循环区别
 *      do...while循环至少执行一次循环体
 *      for和while循环必须先判断条件是否成立，才能决定是否执行循环体
 * for while循环的区别
 *      A:for循环语句和while循环语句可以等价转换，但还是有些小区别的
 *      B:区别
 *          使用区别：
 *              控制条件语句所控制的那个变量，
 *              在for循环结束后，就不能再被访问到了，
 *              而while循环结束还可以继续使用，
 *              如果你想继续使用，就用while，否则推荐使用for。
 *              原因是for循环结束，该变量就从内存中消失，能够提高内存的使用效率。
 *
 *          场景区别：
 *              for循环适合针对一个范围判断进行操作
 *              while循环适合判断次数不明确操作
 * 三种循环语句的使用顺序：
 *      for > while > do...while
 *
 */
class XunHuanDiffDemo {
    public static void main(String[] arge){
        //do...while循环,至少执行一次循环体
        int x = 3;
        do{
            System.out.println("我爱java--do...while循环");
            x++;
        } while (x<3);

        System.out.println("*************************");

        //while循环，条件成立才能执行循环体
        int y = 4;
        while(y < 4){
            System.out.println("我爱java--while循环");
            y++;
        }
        
    }
}