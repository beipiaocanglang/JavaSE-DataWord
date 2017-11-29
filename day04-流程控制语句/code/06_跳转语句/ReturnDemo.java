/**
 * 跳转语句 -- return
 *  return关键字不是为了跳转出循环体，更常用的功能是结束一个方法，也就是退出一个方法。
 *  跳转到上层调用的方法。
 */
class ReturnDemo {
    public static void main(String[] args){  
        for(int x=0; x<6; x++){
            if(x == 2){
                System.out.print("退出");
                //break;//01退出over
                //continue;//01退出345over
                return;//01退出
            }
            System.out.print(x);
        }
        System.out.println("over");
        System.out.println("---------------------");
    } 
}