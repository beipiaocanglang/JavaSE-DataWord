/**
  *  常量概述
  *      在程序执行的过程中其值不可以发生改变
  *
  *  Java中常量分类
  *      字面值常量
  *      自定义常量
  *
  *  字面值常量
  *      (1): 字符串常量    用双引号括起来的内容(可以直接被输出的)
  *          举例："hello","world","HelloWorld"  
  *      
  *      (2): 整数常量      所有的整数(不用加双引号或单引号)
  *          举例：100,200
  *      
  *      (3): 小数常量      所有的小数(不用加双引号或单引号)
  *          举例：10.23,110.11
  *      
  *      (4): 字符常量      用单引号括起来的内容
  *          举例：'a','A','0'   （0 不是数字零、是字符零）
  *          错误的：'ab'
  *      
  *      (5): 布尔常量      比较特殊
  *          举例：true,false（真  假  ）
  *      
  *      (6): 空常量      
  *          举例：null
 */
class ConstantDemo {
	public static void main(String[] args) {
		//字符串常量
        System.out.println("HelloWorld");
        
        //整数常量
        System.out.println(100);

        //小数常量
        System.out.println(10.11);

        //字符常量
        System.out.println("j");

        //布尔常量
        System.out.println(true);
        System.out.println(false);

        //空常量
        //System.out.println(null);
	}
}