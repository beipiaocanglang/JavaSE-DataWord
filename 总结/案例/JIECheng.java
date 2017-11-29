/**     
 * 5的阶乘
 */
class JIECheng {
    public static void main(String[] arge){
        int jc = 1;
        //原始从1开始
        //for(int x=1;x<=5;x++){
        //改进后从2开始
        for(int x=1;x<=5;x++){
            jc *= x;
        }
        System.out.println("0~5的阶乘:"+jc);
    }
}
