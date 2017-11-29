/**
 * 循环练习
 *      练习1：请输出一个4行5列的星星(*)图案
 *          *****
 *          *****
 *          *****
 *          *****
 *      
 *      练习2：请输出如下图形
 *           *
 *           **
 *           ***
 *           ****
 *           *****
 *      练习3：在控制台输出九九乘法表。
 *          1*1=1
 *          1*2=2    2*2=4
 *          1*3=3    2*3=6   3*3=9
 *          1*4=4    2*4=8   3*4=12  4*4=16
 *          ...
 *          1*9=9    2*9=18  3*9=27  4*9=36  ... 9*9=81
 */
class XunHuanTest {
    public static void main(String[] arge){
        System.out.println("**************练习1：请输出一个4行5列的星星(*)图案**************");
        xingXing();

        System.out.println("**************练习2：请输出如下图形**************");
        sanJiaoXing();

        System.out.println("**************练习3：在控制台输出九九乘法表。**************");
        jiuJiuChengFaBiao();
    }

    /**
     * 练习1：请输出一个4行5列的星星(*)图案。
     *      *****
     *      *****
     *      *****
     *      *****
     * 通过结果我们得出：
     *      外循环控制行数
     *      内循环控制列数
     */
    public static void xingXing(){
        for(int y=0; y<4; y++){
            for (int x=0; x<5; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 练习2：请输出如下图形
     *     *
     *     **
     *     ***
     *     ****
     *     *****
     */
    public static void sanJiaoXing(){
        //先输出一个5行5列的图形
        for(int y=0; y<5; y++){
            for (int x=0; x<5; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /**
         * 改进版
         * 列数是变化的：
         *      第一行：1列 y=0 y<=0 y++
         *      第二行：2列 y=0 y<=1 y++
         *      第三行：3列 y=0 y<=2 y++
         *      第四行：4列 y=0 y<=3 y++
         *      第五行：5列 y=0 y<=4 y++
         */
        for(int y=0; y<5; y++){
            for (int x=0; x<=y; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 练习3：在控制台输出九九乘法表。
     * 先列出九九乘法表
     * 1*1=1
     * 1*2=2    2*2=4
     * 1*3=3    2*3=6   3*3=9
     * 1*4=4    2*4=8   3*4=12  4*4=16
     * ...
     * 1*9=9    2*9=18  3*9=27  4*9=36  ... 9*9=81
     * 
     * 注意：
     *      \X:x为未知字符，标识转移字符
     *      '\n'    换行
     *      ‘\t’    tab键的位置
     *      ‘\r’    回车
     */
    public static void jiuJiuChengFaBiao(){
        for (int x=1; x<=9; x++) {
            for(int y=1; y<=x; y++){
                System.out.print(y + "*" + x + "=" + y * x + '\t');
            }
            System.out.println();
        }
    }
}