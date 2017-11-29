/**
 * 求出1-100之间奇数和偶数和
 */
class OutPut1_100JiShuHeOrOuShuHe{
    public static void main(String[] args){
        int totalNum = 0;
        int totalNum1 = 0;
        //方式一：
            /*for (int x=1; x<=100; x++) {
                //0~100之间的偶数和
                if(x % 2 == 0){
                    totalNum += x;
                }
                //0~100之间的奇数和
                if(x % 2 != 0){
                    totalNum1 += x;
                }
            }
            System.out.println("0~100的偶数和:"+totalNum);
            System.out.println("0~100的奇数和:"+totalNum1);
            System.out.println("0~100的总和:" + (totalNum1 + totalNum));*/
        //方式二：
            //0~100之间的偶数和
            for (int x=0; x<=100; x+=2) {
                totalNum += x;
            }
            for (int y=1; y<=100; y+=2) {
                totalNum1 += y;
            }
            //0~100之间的奇数和
            System.out.println("0~100的偶数和:"+totalNum);
            System.out.println("0~100的奇数和:"+totalNum1);
            System.out.println("0~100的和:" + (totalNum1 + totalNum));
    }
}