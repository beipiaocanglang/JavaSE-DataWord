/**
 * 二维数组
 * 定义：
 *     元素是一维数组的数组
 * 格式：
 *     格式一：动态初始化
 *         格式1(推荐)：
 *             数据类型[][] 数组名 = new 数据类型[m][n];
 *             解释：
 *                 m：表示这个二维数组有多少个一维数组
 *                 n：表示每一个一维数组的元素个数
 *         格式2：
 *             数据类型 数组名[][] = new 数据类型[m][n];
 *         格式3：
 *             数据类型[] 数组名[] = new 数据类型[m][n];
 *         面试小陷阱：
 *             int x,y;//定义了两个int类型的变量x和y
 *             int[] x,y[];//定义了一个一维数组x和一个二维数组y，而不是定义了两个二维数组x和y
 * 
 *         图解：
 *             见图3
 * 
 *     格式二：动态初始化
 *          数据类型[][] 变量名 = new 数据类型[m][];
 *          m：表示这个二维数组中有几个一维数组，没有具体的给出每一个一维数组中有多少个元素，可以动态赋值
 *          举例：
 *              int[][] arr = new int[3][];
 * 
 *          图解4
 *              二维数组的格式二
 * 
 *     格式三：静态初始化
 *          数据类型[][] 变量名 = new 数据类型[][]{{元素…},{元素…},{元素…}};
 *          简化版：
 *              数据类型[][] 变量名 = {{元素…},{元素…},{元素…}};
 *          举例：
 *              int[][] arr = {{1,2,3},{1,3},{2}};
 *       
 * 
 */
class Array2Demo {
    public static void main(String[] args) {
        System.out.println("******格式一******");
        geShiEr_active1();
        System.out.println("******格式二******");
        geShiEr_active2();
        System.out.println("******格式三******");
        geShiEr_static();
    }

    /**
     * 格式三:静态初始化
     */
    public static void geShiEr_static(){
        int[][] arr = {{1,2,3},{4,5},{6}};

        System.out.println(arr);
        System.out.println(arr[0]);//[I@6bc7c054
        System.out.println(arr[1]);//[I@232204a1
        System.out.println(arr[2]);//[I@4aa298b7

        System.out.println(arr[0][0]);//1
        System.out.println(arr[1][0]);//4
        System.out.println(arr[2][0]);//6
    }

    /**
     * 格式二:动态初始化
     */
    public static void geShiEr_active2(){
        /**
         * 定义一个二维数组arr
         * 这个二维数组有三个一维数组元素
         * 但是每一个一维数组中没有给出具体的元素个数，需要手动给出
         */
        int[][] arr = new int[3][];
        
        //输出二维数组名称
        System.out.println(arr);//[[I@7852e922  两个[代表二维数组
        //输出二维数组中的一维数组名称
        System.out.println(arr[0]);//null 因为只开辟的内存空间 而没有赋值 一维数组是引用类型 引用类型的默认值是null
        System.out.println(arr[1]);//null
        System.out.println(arr[2]);//null
        //给一维数组赋值
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];
        //输出二维数组中的一维数组名称
        System.out.println(arr[0]);//[I@4e25154f 此时一维数组已经有值，所以输出的是地址值
        System.out.println(arr[1]);//[I@70dea4e
        System.out.println(arr[2]);//[I@5c647e05
        //输出每一个一维数组中的元素
        System.out.println(arr[0][0]);//0
        System.out.println(arr[0][1]);//0
    }
    /**
     * 格式一:动态初始化
     */
    public static void geShiEr_active1(){
        /**
         * 定义一个二维数组arr
         * 这个二维数组有三个一维数组元素
         * 每一个一维数组元素中有两个元素
         */
        int[][] arr = new int[3][2];
        
        //输出二维数组名称
        System.out.println(arr);//[[I@7852e922  两个[代表二维数组
        //输出二维数组中的一维数组名称
        System.out.println(arr[0]);//[I@4e25154f  一个[代表二维数组
        System.out.println(arr[1]);//[I@70dea4e
        System.out.println(arr[2]);//[I@5c647e05
        //输出每一个一维数组中的元素
        System.out.println(arr[0][0]);//0
        System.out.println(arr[0][1]);//0
    }
}