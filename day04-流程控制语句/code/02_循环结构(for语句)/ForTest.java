/**
 * 流程控制语句 -- 循环结构(for循环)
 * 练习：
 *      1、请在控制台输出数据1-10
 *      2、请在控制台输出数据10-1
 *      3、求出1-10之间数据之和
 *      4、求出1-100之间偶数和
 *      5、求出1-100之间奇数和
 *      6、求5的阶乘
 *          n != n*(n-1)
 *          n != n*(n-1)*n*(n-2)......3*2*1
 *      7、在控制台输出所有的”水仙花数”
 *          所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
 *          举例：153就是一个水仙花数。
 *          153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 127 = 153
 *           分析：
 *               A:三位数其实高数了我们范围
 *               B:通过for循环可以获取到每一个三位数
 *               C:如何获取ge、shi、bai位数呢
 *                   假设数据是：153
 *                       ge:153%10=3
 *                       shi:153/10%10=5
 *                       bai:153/10/10%10=1
 *                       qian:X/10/10/10%10
 *                       ......
 *
 *      8、统计”水仙花数”共有多少个*
 *      9、请在控制台输出满足如下条件的五位数
 *           个位等于万位
 *           十位等于千位
 *           个位+十位+千位+万位=百位
 *          分析：
 *              A:五位数告诉了我们范围
 *              B:分解每一个五位数的个、十、百、千、万上的数
 *              C:根据条件判断即可
 * 
 *      10、请统计1-1000之间同时满足如下条件的数据有多少个：
 *          对3整除余2
 *          对5整除余3
 *          对7整除余2
 *          分析：
 *              A:0~1000告诉了我们范围
 *              
 */
class ForTest {
    public static void main(String[] args) {
        System.out.println("******在控制台输出1-10******");
        inputData1_10();
        System.out.println("******在控制台输出10-1******");
        inputData10_1();
        System.out.println("******在控制台输出1-10之和******");
        input1_10Sum();
        System.out.println("******在控制台输出1-100偶数和******");
        input1_100OuShuSum();
        System.out.println("******在控制台输出1-100奇数和******");
        input1_100JiShuSum();
        System.out.println("******在控制台输出5的阶乘******");
        inputNum5JieCheng();
        System.out.println("******在控制台输出水鲜花数******");
        inputShuiXianHua();
        System.out.println("******在控制台输出满足条件的五位数******");
        manZuTiaoJianWuWeiShu();
        System.out.println("******在控制台输出1000以内满足条件的五位数******");
        input1_1000ManZuTiaoJianWuWeiShu();
    }

    /**
     * 1、请在控制台输出数据1-10
     */
    public static void inputData1_10(){
        for (int x=1; x<=10; x++) {
            System.out.println(x);
        }
    }

    /**
     * 2、请在控制台输出数据10-1
     */
    public static void inputData10_1(){
        for (int x=10; x>=1; x--) {
            System.out.println(x);
        }
    }

    /**
     * 3、求出1-10之间数据之和
     */
    public static void input1_10Sum(){
        int totalNum = 0;
        for (int x=1; x<=10; x++) {
            totalNum += x;
        }
        System.out.println("totalNum:"+totalNum);
    }
   
    /**
     * 4、求出1-100之间偶数和
     */
    public static void input1_100OuShuSum(){
        int totalNum = 0;
        //方式一：
        for (int x=1; x<=100; x++) {
            //0~100之间的偶数和
            if(x % 2 == 0){
                totalNum += x;
            }
        }
        System.out.println("0~100的偶数和:"+totalNum);

        //方式二：
        //0~100之间的偶数和
        int totalNum1 = 0;
        for (int x=0; x<=100; x+=2) {
            totalNum1 += x;
        }
        //0~100之间的奇数和
        System.out.println("0~100的偶数和:"+totalNum1);
    }

    /**
     * 5、求出1-100之间奇数和
     */
    public static void input1_100JiShuSum(){
        int totalNum = 0;
        //方式一：
        for (int x=1; x<=100; x++) {
            //0~100之间的奇数和
            if(x % 2 != 0){
                totalNum += x;
            }
        }
        System.out.println("0~100的奇数和:"+totalNum);

        //方式二：
        //0~100之间的偶数和
        int totalNum1 = 0;
        for (int x=1; x<=100; x+=2) {
            totalNum1 += x;
        }
        //0~100之间的奇数和
        System.out.println("0~100的奇数和:"+totalNum1);
    }

    /**
     * 6、求5的阶乘
     */
    public static void inputNum5JieCheng(){
        int jc = 1;
        //原始从1开始
        //for(int x=1;x<=5;x++){
        //改进后从2开始
        for(int x=1;x<=5;x++){
            jc *= x;
        }
        System.out.println("0~5的阶乘:"+jc);
    }
    
    /**
     * 7、在控制台输出所有的”水仙花数”
     * 8、统计水仙花个数
     */
    public static void inputShuiXianHua(){
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

    /**
     * 9、请在控制台输出满足如下条件的五位数
     *      个位等于万位
     *      十位等于千位
     *      个位+十位+千位+万位=百位
     */
    public static void manZuTiaoJianWuWeiShu(){
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

    /**
     * 10、请统计1-1000之间同时满足如下条件的数据有多少个
     *      对3整除余2
     *      对5整除余3
     *      对7整除余2
     */
    public static void input1_1000ManZuTiaoJianWuWeiShu(){
        int num = 0;
        for(int x=1;x<=1000;x++){
            if((x%3 == 2) && (x%5 == 3) && (x%7 == 2)){
                num += 1;
                System.out.println(x);
            }
        }
        System.out.println("满足条件的有："+num);   
    }
}