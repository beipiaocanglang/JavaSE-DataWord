/**
 * 死循环
 *      1、一定要注意控制条件语句控制的那个变量，一旦丢失，就会出现死循环
 *      2、两种最简单是死循环格式
 *          A:while(true){...}
 *          B:for(;;){...}
 */
class DieXunHuanDemo {
    public static void main(String[] arge){
        //丢失变量
        int x=1;
        while(x<10){
            System.out.println("死循环的第一种形似：" + x);
            x++;//此处x++不能丢失。
        }
        System.out.println("******************************");

        //死循环的第二种形式
        /*while(true){
            System.out.println("死循环的第二种形似");
        }*/

        System.out.println("******************************");

        //死循环的第三种形式
        for(;;){
            System.out.println("死循环的第三种形似");
        }
    }
}