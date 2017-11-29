/**
 * 进制的组成以及表现形式
 * 进制组成：
 *       二进制：由0，1组成。以0b开头。
 *       
 *       八进制：由0,1,...7组成。以0开头。
 *       
 *       十进制：由0,1,...9组成。默认整数是十进制。
 *       
 *       十六进制：由0,1,...9,a,b,c,d,e,f(大小写均可)组成。以0x开头。
 *
 *   进制表现形式
 *       见代码
 */
class JinZhiDemo1 {
	public static void main(String[] args) {
        System.out.println(0b100);//二进制、结果：4
        System.out.println(0100);//八进制、结果：64
        System.out.println(100);//十进制、结果：100
        System.out.println(0x100);//十六进制、结果：256
	}
}