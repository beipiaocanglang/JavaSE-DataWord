/**
 * 类型转换
 *      一般我们在做比较的或运算的时候要求参与运算的数据类型必须一致，才有可操作性
 * 
 *      默认转换(从小到大的转换) 
 *          (1): byte,short,char ———> int ———> long ———> float ———> double
 *          (2): byte,short,char 相互之间不转换，他们参与运算首先转换为int类型
 *          注意：
 *              如果在运算中有byte,short,char类型的和int类型相运算则byte,short,char类型必然会先转成int类型然后再与int类型相运算(同理long—float—double)
 *              
 *              有long类型，其他的会先转成long再参与运算
 * 
 *              有float类型，其他的会先转成float再参与运算
 * 
 *              有double类型，其他的会先转成double再参与运算
 * 
 *              小的数据类型会先转成大的数据类型再与大的数据类型相加减
 * 
 *              
 *      
 */
class DataTypeDemo1 {
	public static void main(String[] args) {
        /**
         * int类型做加法运算 
         *  3是整数类型
         *  4是整数类型
         * 整数类型做加法运算会直接相加
         * 可以写成：
         *      int a = 3;
         *      int b = 4;
         *      int c = a + b;//c=4
         */ 
        System.out.println(3 + 4);//结果：7

        //定义一个byte类型，定义一个int类型  相加
        byte a = 5;
        int b = 6;

        //直接输出不会报错
        System.out.println(a + b);

        //大类型和小类型相加  转成小类型会报错 损失精度
        byte c = (byte)(a + b);
        System.out.println(c);//错误: 不兼容的类型: 从int转换到byte可能会有损失

        //大类型和小类型相加  转成小类型会报错  正常相加
        int d = a+ b;
        System.out.println(d);//默认转换  小的会自动转换成大的数据类型
	}
}