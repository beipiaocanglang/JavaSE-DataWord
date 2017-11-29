/**
 * 跳转语句 -- continue
 * continue的使用场景：
 *     在循环语句中
 *     注意：
 *          离开使用场景的存在是没有意义的
 * continue的作用：
 *     单层循环对比break，然后总结两个的区别
 *         break  退出当前循环
 *         continue  退出本次循环，继续下次循环
 *     也可以带标签的使用(不演示了)
 */
class ContinueDemo {
    public static void main(String[] args){  
        //对比continue和break的区别
        //跳出单层循环
        for (int x=0; x<5; x++) {
            if (x==3) {
                //break;//0、1、2
                continue;//0、1、2、4、5
            }
            System.out.println(x);
        } 

        System.out.println("-——————————————");
        //跳出多层循环
        wc:for (int a=0; a<3; a++) {
            for (int y=0; y<5; y++) {
                if (y==3) {
                    //break;//0、1、2
                    continue wc;//0、1、2、4、5
                }
                System.out.print(y);
            }
            System.out.println();
        }
    } 
}