class ArryNiXu{
    public static void main(String[] args) {
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
}