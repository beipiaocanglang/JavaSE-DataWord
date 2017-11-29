/**
 * 求出1-10之间数据之和
 */
class OutPut1_10Sum{
    public static void main(String[] args){
        int totalNum = 0;
        
        for (int x=1; x<=10; x++) {
            totalNum += x;
        }

        System.out.println("totalNum:" + totalNum);
    }
}