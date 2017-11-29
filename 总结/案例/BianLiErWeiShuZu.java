/**
 * 练习三：遍历二维数组
 * 分析：二维数组的长度就是一维数组的个数，一维数组的长度就是元素的个数
 */
class BianLiErWeiShuZu{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};
        
        for(int x=0; x<arr.length; x++){
            for(int y=0; y<arr[x].length; y++){
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println();
        }   
    }
}