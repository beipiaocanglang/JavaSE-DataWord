/**     
 * 请在控制台输出满足如下条件的五位数
 *      个位等于万位
 *      十位等于千位
 *      个位+十位+千位+万位=百位
 */
class ManZuTiaoJianDeWuWeiShu {
    public static void main(String[] arge){
        //定义一个变量统计总共有多少个
        int num = 0;
        //五位数告诉了我们范围
        for(int x=10000;x<100000;x++){
            int ge = x%10;
            int shi = x/10%10;
            int bai = x/100%10;
            int qian = x/1000%10;
            int wan = x/10000%10;

            if((ge == wan) && (shi == qian) && (ge+shi+qian+wan) == bai){
                num += 1;
                System.out.println(x);
            }
        }
        System.out.println("满足条件的五位数有：" + num + "(个)");
    }
}
