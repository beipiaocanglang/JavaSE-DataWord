/**     
 * 输出水仙花个数和所有水仙花数
 */
class ShuiXianHuaShu {
    public static void main(String[] arge){
        //定义统计水仙花个数的变量
        int num = 0; 
        //三位数是告诉了我们范围
        for(int x=100;x<1000;x++){
            int ge = x%10;
            int shi = x/10%10;
            int bai = x/10/10%10;

            if(x == (ge*ge*ge+shi*shi*shi+bai*bai*bai)){
                num += 1;
                System.out.println(x);
            }
        }
        //8、统计水仙花个数
        System.out.println("水仙花个数：" + num + "（个）");
    }
}
