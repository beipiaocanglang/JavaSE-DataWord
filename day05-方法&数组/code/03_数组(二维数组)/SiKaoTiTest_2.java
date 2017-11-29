import java.util.Scanner;

/**
 * 二维数组思考题2：
 * 数据加密问题
 *      某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
 *	    在传递过程中需要加密，加密规则如下：
 *          首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
 *          最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
 *          然后，把加密后的结果在控制台打印出来。 
 * 分析：
 *      A:数据是小于8位的整数
 *          小于8位数，int类型就可以搞定，定义一个int类型的变量随便给一个数
 *          int number = 123456;
 *      B:加密规则
 *          a:首先将数据倒序
 *              结果：654321
 *          b:然后将每位数字都加上5，再除以10的余数代替该数字
 *              结果：109876
 *          c:最后将第一位和最后一位数字交换
 *              结果：609871
 *      C:输出到控制台
 * 
 * 通过分析我们得知 只要有办法讲数据转换成数组就比较好做了
 * 不能直接将数据写成数组int[] arr = {1,2,3,4,5,6};
 * 
 * 如何将数据转换成数组呢
 *      A:初始化一个数据
 *          int num = 123456;
 *      B:定义一个数组，数组的长度是多少？
 *          int[] arr = new int[8];//最大8
 *          在赋值的时候用一个变量记录索引的变化
 *          定义一个索引变量，int index = 0;
 *      C:获取数据中的每一个数
 *          a:获取值
 *              int ge = num%10;
 *              int shi = num/10%10;
 *              int bai num/100%10;
 *              ......
 *          b:赋值
 *              arr[index] = ge;
 *              index++;
 *              arr[index] = shi;
 *              index++;
 *              ......
 */
class SiKaoTiTest_2 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个要加密的数据(1-8)");
        int number = sc.nextInt();

        if(number > 8){
            System.out.println("你输入的数据超过8位，请重新输入");
            return;
        }

        String result = jiaMi(number);
        System.out.println("加密后的数据是:" + result);
    }

    /**
     * 加密方法
     */
    public static String jiaMi(int number){
        //定义一个数组,初始长度8，最大不能超过8
        int[] arr = new int[8];

        //定义一个索引变量记录索引的变化
        int index = 0;

        /**
         * 组成数组 + 倒序
         * 因为不知道是几位数，也就是说不知道要循环几遍，所以使用while循环,此while循环完成后数据正好逆序
         */
        while(number > 0){
            
            arr[index] = number%10;
            //索引记录变化
            index++;
            //每一次做完number%10这一步  原来的number都会比原来少一10倍
            number /= 10;
        }

        //每位数字都加上5，再除以10的余数代替该数字
        for(int x=0; x<index; x++){
            arr[x] += 5;//每一个数加5
            arr[x] %= 10;//每一个数对10取余
        }
        
        //最后将第一位和最后一位数字交换
        int temp = arr[0];
        arr[0] = arr[index - 1];
        arr[index - 1] = temp;

        String s = "";

        //遍历数组
        for(int x=0; x<index; x++){
            s += arr[x];
        }

        return s;
    }
}