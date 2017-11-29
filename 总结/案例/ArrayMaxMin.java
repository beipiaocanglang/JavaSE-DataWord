class ArrayMaxMin{
    public static void main(String[] args) {
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
}