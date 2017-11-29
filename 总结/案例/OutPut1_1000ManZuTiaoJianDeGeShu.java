/**     
 * 请统计1-1000之间同时满足如下条件的数据有多少个
 *      对3整除余2
 *      对5整除余3
 *      对7整除余2
 */
class OutPut1_1000ManZuTiaoJianDeGeShu {
    public static void main(String[] arge){
        int num = 0;
        for(int x=1;x<=1000;x++){
            if((x%3 == 2) && (x%5 == 3) && (x%7 == 2)){
                num += 1;
                System.out.println(x);
            }
        }
        System.out.println("满足条件的有："+num);
    }
}
