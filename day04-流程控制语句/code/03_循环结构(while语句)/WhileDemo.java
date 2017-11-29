import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 流程控制语句--循环语句(while循环)
 * 基本格式：
 *     while(判断条件语句) {
 *          循环体语句;
 *     }
 * 扩展格式：
 *      初始化语句;
 *      while(判断条件语句) {
 *          循环体语句;
 *          控制条件语句;
 *      }
 * 由此格式可见while循环和for循环是一样的，两者之间可以等价交换
 *
 */
class WhileDemo {
    public static void main(String[] arge){
        //测试
        //需求：输出10次HelloWorld
        //for循环版
        for(int x=0;x<10;x++){
            System.out.println("HelloWorld");
        }
        System.out.println("*****************************");

        //while循环版
        int x=0;
        while(x<10){
            System.out.println("HelloWorld");
            x++;
        }

        System.out.println("************以下是while的练习*************");
        Map<String, Object> describe = whileTest();
        System.out.println("sum:"+describe.get("sum"));
        System.out.println("count:"+describe.get("count"));

        System.out.println("************以下是统计珠穆拉玛峰的高度*************");
        Integer count = countSum();
        //F:输出统计变量
        System.out.println("需要折叠的次数："+ count);

    }

    /**
     * 练习：
     *      使用while循环统计1-100的和
     *      使用while循环统计水仙花个数
     */
    public static Map<String, Object> whileTest(){
        Map<String, Object> map = new LinkedHashMap<String, Object>();

        //1-100之间的和
        int sum = 0;
        int x = 1;
        while(x<=100){
            sum+=x;
            x++;
        }
        
        //统计水仙花数
        int count = 0;
        int y = 100;
        while(y<1000){
            int ge = y%10;
            int shi = y/10%10;
            int bai = y/100%10;
            if(ge*ge*ge+shi*shi*shi+bai*bai*bai == y){
                count++;
                System.out.println("每一个水仙花:"+y);
            }
            y++;
        }

        map.put("sum",sum);
        map.put("count",count);

        return map;
    }

    /**
     * 我国最高山峰是珠穆朗玛峰：8848m，我现在有一张足够大的纸张，厚度为：0.01m。请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
     * 实则为了练习for和while的区别
     * 分析：
     *      A:定义统计变量，默认0
     *      B:8848m是最终的厚度
     *      C:0.01m是初始厚度
     *      D:折叠多少次不低于珠穆拉玛峰的高度，折叠一次的厚度是原来的2倍
     *      E:只要折叠的厚度没有超过珠穆拉玛峰的高度就继续折叠，统计变量++
     *      F:输出统计变量
     */
    public static Integer countSum(){
        //A:定义统计变量，默认0
        int count = 0;
        //B:8848m是最终的厚度,为了简单884800m
        int end = 884800;
        //C:0.01m是初始厚度，为了简单1m
        int start = 1;

        while(start<end){
            //D:折叠多少次不低于珠穆拉玛峰的高度，折叠一次的厚度是原来的2倍
            start *= 2;
            //E:只要折叠的厚度没有超过珠穆拉玛峰的高度就继续折叠，统计变量++
            count++;
        }
        

        return count;
    }
}