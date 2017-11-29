import java.util.Scanner;

/**
 * 练习一：键盘录入两个数，输出最大值
 * 练习二：键盘录入两个数，判断是否相等
 * 练习三：键盘录入三个数，输出最大值
 * 练习四：根据需求在控制台输出对应的矩形
 * 练习五：在控制台输出nn乘法表
 */
class FunctionTest {
    public static void main(String[] args){  
        //练习一：键盘录入两个数，输出最大值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        //System.out.println("请输入第二个数据：");
        //int b = sc.nextInt();
        //System.out.println("请输入第三个数据：");
        //int c = sc.nextInt();

        //int result = getMax(a,b);
        //System.out.println("最大数是：" + result);

        //Boolean result = isEquals(a,b);
        //System.out.println("是否相等：" + result);

        //int result = getMaxNum(a,b,c);
        //System.out.println("最大数是：" + result);

        //inputJuXing(a, b);

        inputChengFaBiao(a);
    } 

    //练习一：键盘录入两个数，输出最大值
    public static int getMax(int a, int b){
        int c = ((a>b)?a:b);
        return c;
    }
    //练习二：键盘录入两个数，判断是否相等
    public static Boolean isEquals(int a, int b){
        if(a == b){
            return true;
        }
        return false;
    }
    //练习三：键盘录入三个数，输出最大值
    public static int getMaxNum(int a, int b, int c){
        /*if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(b>c){
                return b;
            }else{
                return c;
            }
        }*/

        //三元改进
        int result = ((a>b)?((a>c)?a:c):((b>c)?b:c));

        return result;
    }
    //练习四：根据需求在控制台输出对应的矩形
    public static void inputJuXing(int a, int b){
        for(int x=0; x<a; x++){
            for(int y=0; y<b; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //练习五：在控制台输出nn乘法表
    public static void inputChengFaBiao(int a){
        for(int x=1; x<=a; x++){
            for(int y=1; y<=x; y++){
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
}