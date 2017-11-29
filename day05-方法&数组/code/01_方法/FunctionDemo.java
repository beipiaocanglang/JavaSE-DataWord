/**
 *  要想写好一个方法，就必须明确两个东西：
 *      A:返回值类型
 *          结果的数据类型
 *      B:参数列表
 *          你要传递几个参数，以及每个参数的数据类型
 *    
 * 方法的调用特点
 *      方法不调用不执行
 *
 * 需求：
 *      求两个数之和
 */
class FunctionDemo {
    public static void main(String[] args){  
        int x = 5;
        int y = 6;
        //方式一：单独调用，没意义
        sum(x,y);

        //方式二：输出调用，可以但是不推荐，调用成功后不一定就要输出
        System.out.println(sum(x,y));

        //方式三：赋值调用，推荐使用
        int result = sum(x,y);
        //在这里可以对调用后返回的 值做其他处理
        System.out.println(result);
    } 

    public static int sum(int a, int b){
        int c = a + b;
        return c;
    }
}