/**
 * 跳转语句 -- break
 * break的使用场景：
 *     在选择结构switch语句中
 *     在循环语句中
 *         一般情况下在循环语句中加入了if语句
 *     注意：
 *         离开使用场景的存在是没有意义的
 * break的作用：
 *      跳出当前循环,不再执行后面的循环，但是循环外的代码还会继续往下执行(单独使用智能跳出单层循环)
 *      跳出单层循环
 *      跳出多层循环
 *         带标签的跳出
 *         格式：
 *              标签名(自定义): 循环语句
 *              注意：
 *                  标签名要符合Java的命名规则
 * 
 *      
 */
class BreakDemo {
    public static void main(String[] args){  
        //输出10次HelloWorld,输出三次后就跳出循环
        //跳出单层循环
        for (int x=0; x<10; x++) {
            if (x==3) {
                break;
            }
            System.out.println("HelloWorld");
        } 

        System.out.println("------------------------------------——————");

        //跳出多层循环
        wc:for(int a=0; a<4; a++){
            nc:for(int b=0; b<5; b++){
                if(b == 3){
                    break wc;
                }

                System.out.print("*");
            }
            System.out.println();
        }
    } 
}