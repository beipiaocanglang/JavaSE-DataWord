/**
 * 练习三：杨辉三角
 *      1
 *      1 1	
 *      1 2 1
 *      1 3 3 1
 *      1 4 6 4 1 
 *      1 5 10 10 5 1
 * 分析：
 *      A：任何一行的第一列和最后一列都是1
 *      B：从第三行开始，每一个数据都是它上一行的前一列和上一行的本列之和
 * 步骤：
 *      A：定义一个二维数组，如果这个二维数组的行数数n，那么我们也现将列数定成n，这里的n来自键盘录入
 *      B：给这个二维数组的人一行的第一列和最后一列赋值1
 *      C：按照上面的分析给其他元素赋值
 *      D：遍历这个二维数组
 */
class YangHuiSanJiao{
    public static void main(String[] args) {
        //创建键盘录入对象
    Scanner sc = new Scanner(System.in);
    
        System.out.println("请输入一个边数：");
    
        int n = sc.nextInt();
    
        //定义一个二维数组
        int[][] arr = new int[n][n];
    
        //给这个二维数组的人一行的第一列和最后一列赋值1
        for(int m=0; m<arr.length; m++){
            arr[m][0] = 1;//给任意一行的第一列赋值
            arr[m][m] = 1;//给任意一行的最后一列赋值
        }
    
        //第三行开始，每一个数据都是它上一行的前一列和上一行的本列之和
        for(int x=2;x<arr.length; x++){
            /**
             * 这里如果是y<=x是有问题的，就是最后一列已经有值了
             * 所以要x-1
             * 并且y也应该从1开始，因为第一列已经有值了
             */
            for(int y=1; y<=x-1; y++){
                //每一个数据都是它上一行的前一列和上一行的本列之和
                arr[x][y] = arr[x-1][y-1] + arr[x-1][y];
            }
        }
    
        //遍历二维数组
        for(int x=0; x<arr.length; x++){
            //这个时候就应该模仿九九乘法表，
            for(int y=0; y<=x; y++){
                System.out.print(arr[x][y]+"\t");
            }
            System.out.println();
        }
    }
}