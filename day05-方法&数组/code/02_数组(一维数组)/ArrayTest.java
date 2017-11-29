import java.util.Scanner;

/**
 * 练习一：数组遍历(依次输出数组中的每一个元素)
 * 练习二：数组获取最值(获取数组中的最大值最小值)
 * 练习三：数组元素逆序 (就是把元素对调)
 * 练习四：数组查表法(根据键盘录入索引,查找对应星期)
 * 练习五：数组元素查找(查找指定元素第一次在数组中出现的索引)
 * 练习六：数组排序和二分查找(后面在数组高级部分讲解)
 */
class ArrayTest {
    public static void main(String[] args) {
        System.out.println("******依次输出数组中的每一个元素******");
        bianLiArray();
        System.out.println("******获取数组中的最大值最小值******");
        findZuiZhi();
        System.out.println("******数组逆序******");
        niXuArray();
        System.out.println("******数组查表法******");
        //arrayChaBiao();
        System.out.println("******查找制定元素第一次在数组中出现的索引******");
        fistIndex();
    }

    /**
     * 练习五：数组元素查找(查找指定元素第一次在数组中出现的索引)
     * 
     */
    public static void fistIndex() {
        //定义一个数组5
        int[] arr = {212,2323,433,555,66,77,88,99,00};  

        int index = -1;
        int data = 433;
        for (int x=0; x<arr.length; x++) {
            if (arr[x] == data) {
                index = x;
                break;
            }
        }
        System.out.println("第一次出现的索引：" + index);
    }

    /**
     * 练习四：数组查表法(根据键盘录入索引,查找对应星期)
     * 意思:
     *      根据键盘录入的索引查找对应的星期几
     *       String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};  
     */
    public static void arrayChaBiao() {
        //定义一个数组
        String[] arr = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};  

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数据(1-7)");
        int data = sc.nextInt();
        System.out.println("您要查找的数据是：" + arr[data-1]);
    }

    /**
     * 练习三：数组元素逆序 (就是把元素对调)
     * 思路:
     *      length/2(不管奇数还是偶数都可以)
     */
    public static void niXuArray() {
        //定义一个数组
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        
        //循环遍历，小于数组的长度
        for (int x = 0; x < arr.length/2; x++) {
            int temp = arr[x];
            arr[x] = arr[arr.length-1-x];
            arr[arr.length-1-x] = temp;
        }

        System.out.print("【");
        for (int x = 0; x < arr.length; x++) {
            if(x == arr.length -1){
                System.out.println(arr[x] + "】");
            }else{
                System.out.print(arr[x] + "、");
            }
        }
    }

    /**
     * 练习二：数组获取最值(获取数组中的最大值最小值)
     * 
     */
    public static void findZuiZhi() {
        //定义一个数组
        int[] arr = { 1, 2, 3, 4, 5, 6, 88, -1 };
        //定义一个变量存储最大值
        int max = arr[0];
        //定义一个变量存储最小值
        int min = arr[0];
        //循环遍历，小于数组的长度
        for (int x = 0; x < arr.length; x++) {
            //输出数组中的每一个元素
            int element = arr[x];

            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

    /**
     * 练习一：数组遍历(依次输出数组中的每一个元素)
     * 获取数组的长度：数组名.length
     */
    public static void bianLiArray() {
        //定义一个数组
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        //循环遍历，小于数组的长度
        for (int x = 0; x < arr.length; x++) {
            //输出数组中的每一个元素
            System.out.println(arr[x]);
        }
    }
}