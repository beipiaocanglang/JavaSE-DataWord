/**
 * 方法重载
 *      在同一个类中，方法名相同，参数列表不同，与返回值无关的方法教方法重载
 *      参数列表不同：
 *          A:参数列表不同
 *          B:参数类型不同
 */
class FunctonOverloadTest {
    public static void main(String[] args){  
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    } 

    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}