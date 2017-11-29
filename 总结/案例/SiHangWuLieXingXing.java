/**
 * 练习：请输出一个4行5列的星星(*)图案
 *     *****
 *     *****
 *     *****
 *     *****
 * 通过结果我们得出：
 *    外循环控制行数
 *    内循环控制列数
 */
class SiHangWuLieXingXing {
    public static void main(String[] arge){
        for(int y=0; y<4; y++){
            for (int x=0; x<5; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
