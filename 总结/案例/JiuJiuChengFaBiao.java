/**
 * 练习：在控制台输出九九乘法表。
 *     1*1=1
 *     1*2=2    2*2=4
 *     1*3=3    2*3=6   3*3=9
 *     1*4=4    2*4=8   3*4=12  4*4=16
 *     ...
 *     1*9=9    2*9=18  3*9=27  4*9=36  ... 9*9=81
 * 注意：
 *     \X:x为未知字符，标识转移字符
 *     '\n'    换行
 *     ‘\t’    tab键的位置
 *     ‘\r’    回车
 */
class JiuJiuChengFaBiao {
    public static void main(String[] arge){
        for (int x=1; x<=9; x++) {
            for(int y=1; y<=x; y++){
                System.out.print(y + "*" + x + "=" + y * x + '\t');
            }
            System.out.println();
        }
    }
}
