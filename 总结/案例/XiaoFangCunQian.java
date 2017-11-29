/**
 * 需求：
 *      小芳的妈妈每天给她2.5元钱，她都会存起来，
 *      但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，
 *      请问，经过多少天，小芳才可以存到100元钱。
 * 分析：
 *      A:小芳的妈妈每天给她2.5元钱
 *          double dayMoney = 2.5;
 *      B:她都会存起来
 *          double daySum = 0.0;
 *      C:从第一天开始存
 *          int dayCount = 1;
 *      D:经过多少天，小芳才可以存到100元钱
 *          double result = 100;
 *      E:每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱
 *          说明要判断dayCount的值对5整除daySum减6元
 *          daySum -= 6;
 *          间接的说明 反之要daySum累加dayMoney
 *          daySum += dayMoney
 *      F:因为不知道需要存多少天，所以用死循环，一旦超过100 就退出
 */
class XiaoFangCunQian {
    public static void main(String[] args){  
        //每天要存的钱
        double dayMoney = 2.5;

        //累计存钱的初始化值
        double daySum = 0.0;

        //从第一天开始存
        int dayCount = 1;

        //最终存的钱大于等于100就可以
        double result = 100;

        //因为不知道需要存多少天，所以用死循环，一旦超过100 就退出
        while(true){
            //钱累加
            daySum += dayMoney;

            //判断是否超过100
            if(daySum >= result){
                System.out.println("一共花了"+dayCount+"天存储了"+daySum+"元");
                break;
            }

            //没有存够100，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱
            if(dayCount%5 == 0 || daySum%5 == 0){
                System.out.println("第"+dayCount+"天花了6元");
                //花去6元
                daySum -= 6;
            }
            dayCount++;
        }
    } 
}