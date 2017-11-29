/**
 * 数组：
 *      定义：存储同一个数据类型的多个元素(变量)的集合(容器),叫做数组
 * 定义格式：
 *      格式一:数据类型[] 数组名;
 *      格式二:数据类型 数组名[];
 * 举例：
 *      int[] a;//定义了一个int类型的数组a变量
 *      int a[];//定义了一个int类型的a数组变量
 * 注意：
 *      效果一样，都是定义了一个int类型的数组，只是在读法上有点小区别，现有的int a[]后有的int[] a，推荐使用格式一
 * 
 * 如何给初始化的数组赋值呢(如何初始化数组)？
 * 
 * 初始化概述：
 *      Java中的数组必须先初始化,然后才能使用。
 *      所谓初始化：就是为数组中的数组元素分配内存空间，并为每个数组元素赋值。
 * 初始化方式
 *      动态初始化：指定数组长度，由系统为数组分配初始值。
 *      静态初始化：指定每个数组元素的初始值，由系统决定数组长度。
 *      注意：
 *          各有用处，常用静态初始化，因为数组的值应该由自己定，由系统算长度
 *      动态初始化：
 *          格式：
 *              数据类型[] 数组名 = new 数据类型[数组长度];
 *              注：数组长度其实就是数组中元素的个数。
 *          举例：
 *              int[] arr = new int[3];
 *              解释：
 *                  定义了一个int类型的数组，这个数组中可以存放3个int类型的值。
 *                  左边：
 *                      int:说明数组中的元素的数据类型是int类型
 *                      []:说明是一个数组
 *                      arr:数组名称
 *                  右边：
 *                      new:为数组分配内存空间
 *                      int:说明数组中的元素的数据类型是int类型
 *                      []:说明是一个数组
 *                      3:数组长度，其实就是数组中存储的元素数量
 *          获取元素格式：
 *              数组名[索引]
 *              注意：索引其实就是没有个元素的编号，取值0 ~ 长度-1
 *          图解：
 *              见图2
 *          Java中的内存分配
 *              Java 程序在运行时，需要在内存中的分配空间。
 *              为了提高运算效率，就对空间进行了不同区域的划分，
 *              因为每一片区域都有特定的处理数据方式和内存管理方式。
 *                  栈：存储局部变量(局部变量：方法声明中或方法声明上的变量)
 *                  堆：存储new出来的东西
 *                  方法区：(面向对象部分讲)
 *                  本地方法区：(和系统相关)
 *                  寄存器：(给CPU使用)
 * 
 *              两个栈内存中的引用执行堆内存中的同一个空间，无论这两个谁的操作都在操作同一个空间  
 *      数组的静态初始化
 *          格式：
 *              数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
 *              举例：
 *                  int[] arr = new int[]{1,2,3};
 *          简化格式
 *              数据类型[] 数组名 = {元素1,元素2,…};
 *              举例：
 *                  int[] arr = {1,2,3}};
 *          解释：
 *              定义了一个int类型的数组，这个数组中可以存放3个int类型的值，并且值分别是1,2,3。
 * 注意：
 *      以后初始化时两种方式任选一种即可
 *      不能两种方法同时进行
 *      错误格式：
 *          int[] arr = new int[3]{1,2,3};//系统默认给了长度  你有指定了长度
 * 
 * 两种常见错误
 *      数组索引越界
 *          ArrayIndexOutOfBoundsException
 *          访问到了数组中的不存在的索引时发生。
 *      空指针异常
 *          NullPointerException
 *          数组引用没有指向实体(堆内存)，但是却在操作实体中的元素。
 *   
 * 
 */
class ArrayDemo{
    public static void main(String[] args){
        //int[] a;
        //System.out.println(a);//错误: 可能尚未初始化变量a

        /**
         * 动态初始化
         */
        int[] arr = new int[3];
        System.out.println(arr);//[I@677327b6：地址值
        /**
         * 其实数组中的没有个元素都是有编号的，0 ~ 长度-1
         * 用数组名称和编号的配合就可以获取到指定编号的元素，编号的专业术语叫索引
         * 通过数组名访问数组中元素的格式：数组名[索引]
         */
        System.out.println(arr[0]);//指定数组长度，系统给的初始化值：0
        System.out.println(arr[1]);//指定数组长度，系统给的初始化值：0
        System.out.println(arr[2]);//指定数组长度，系统给的初始化值：0

        System.out.println("***********动态初始化数组并赋值练习***********");

        //动态初始化数组并赋值练习
        activeInitArray();

        System.out.println("***********静态初始化数组直接赋值练习***********");
        /**
         * 静态初始化数组
         */
        int[] arr1 = new int[]{1,2,3};
        System.out.println(arr1);//[I@7f31245a
        System.out.println(arr1[0]);//1
        System.out.println(arr1[1]);//2
        System.out.println(arr1[2]);//3

        //简化格式
        int[] arr2 = {1,2,3};
        System.out.println(arr2);//[I@6d6f6e28
        System.out.println(arr2[0]);//1
        System.out.println(arr2[1]);//2
        System.out.println(arr2[2]);//3

        /**
         * 两种常见问题演示
         */
        int[] arr3 = {1,2,3};
        //System.out.println(arr3[3]);//ArrayIndexOutOfBoundsException:访问了不存在的索引
        arr3 = null;
        System.out.println(arr3[0]);//NullPointerException：：数组引用已经不再指向堆内存了
    }

    /**
     * 动态初始化数组案例
     * 定义一个数组，初始化 输出
     * 赋值后再次输出
     */
    public static void activeInitArray(){
        //初始化数组，输出
        int[] arr = new int[3];

        System.out.println(arr);//[I@677327b6
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0

        System.out.println("-----------------"); 
        
        arr[0] = 100;
        arr[2] = 500;

        System.out.println(arr);//[I@677327b6
        System.out.println(arr[0]);//0
        System.out.println(arr[1]);//0
        System.out.println(arr[2]);//0

    }
}