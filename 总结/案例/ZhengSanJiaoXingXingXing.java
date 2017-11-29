/**     
 * 练习：请输出如下图形
 *    *
 *    **
 *    ***
 *    ****
 *    *****
 */
class ZhengSanJiaoXingXingXing {
    public static void main(String[] arge){
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
}
