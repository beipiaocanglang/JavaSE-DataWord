/**
 * 类型强制转换
 *      强制转换是从大的数据类型到小的数据类型。                    
 *      
 *      格式：
 *          目标数据类型 变量 = (目标数据类型) (被转换的数据);                
 *       
 *      注意：
 *          不要随意的去使用强制转换，因为它隐含了精度损失问题。   
 */
class DataTypeDemo2 {
	public static void main(String[] args) {

        //定义一个byte类型，定义一个int类型  相加
        byte a = 5;
        int b = 6;

        //直接输出不会报错
        System.out.println("正常相加，默认转换：" + (a + b));

        //大类型和小类型相加  转成小类型会报错 损失精度 可以使用类型强制转换
        byte c = (byte)(a + b);
        System.out.println("正常相加，强制转换：" + c);//错误: 不兼容的类型: 从int转换到byte可能会有损失
	}
}