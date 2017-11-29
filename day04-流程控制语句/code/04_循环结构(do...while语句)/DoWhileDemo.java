/**
 * 流程控制语句--循环语句(do...while循环)
 *   基本格式
 *      do {
 *           循环体语句;
 *      }while((判断条件语句);
 * 
 *   扩展格式
 *      初始化语句;
 *      do {
 *           循环体语句;
 *           控制条件语句;
 *       } while((判断条件语句);
 *
 */
class DoWhileDemo {
    public static void main(String[] arge){
        //输出5此Helloworld
        int x=0;
        do{
            System.out.println("Helloworld");
            x++;
        } while (x<10);

        System.out.println("*************************");

        //求和
        int sum = 0;
        int y = 1;
        do{
            sum += y;
            y++;
        } while(y<=100);
        System.out.println(sum);
    }
}