/**
 * 定义一个学生类
 * 事物
 * 		属性		事物的信息描述
 * 		行为		事物的行为
 * 类
 * 		成员变量	事物的属性
 * 		成员方法	事物的行为
 * 
 * 定义一个类其实就是定义该类的成员变量和成员方法
 * 
 * 定义一个学生类
 * 		学生事物
 * 			属性：姓名、年龄、地址...
 * 			行为：吃饭、睡觉、学习...
 * 把事物转换成对应的类
 * 		成员变量：姓名、年龄、地址...
 * 		成员方法：吃饭、睡觉、学习...
 * 
 * 成员变量：和以前的变量定义的格式一样，但是位置不同，在类中方法外
 * 成员方法：和以前的方法定义的格式一样，但是今天把static先去掉
 * 
 * 如何使用队对象：
 * 		创建对象使用
 * 		格式：类名 对象名 = new 类名();
 * 
 * 如何使用成员变量：
 * 		获取值：对象名.成员变量名
 * 		赋值：对象名.成员变量 = 要赋的值(成员变量是什么数据类型的就需要赋值什么类型的)
 * 如何使用成员方法：
 * 		对象名.方法名(参数1,参数2,...);
 * 
 * 对象的内存图：
 * 		详见附件：见图11、一个对象的内存图
 * 		详见附件：见图11、二个对象的内存图
 * 		详见附件：见图11、三个对象的内存图
 */
//定义了一个学生类
class Student {
	//定义成员变量
	//姓名
	String name;
	//年龄
	int age;
	//地址
	String address;
	
	//定义方法
	//吃饭
	public void eat(){
		System.out.println("饿了要吃饭");
	}

	//睡觉
	public void sleep(){
		System.out.println("困了要睡觉");
	}

	//学习
	public void study(){
		System.out.println("缺乏知识要学习");
	}
}

//定义了一个学生类的测试类
class StudentDemo {
	public static void main(String[] args) {
		//创建学生类对象
		Student student = new Student();

		//输出学生类对象中的属性
		System.out.println(student.name +"---"+student.age+"---"+student.address);//null---0---null

		//给学生类对象中的属性赋值
		student.name = "zhangsan";
		student.age = 26;
		student.address = "beijing";

		System.out.println(student.name +"---"+student.age+"---"+student.address);//zhangsan---26---beijing

		//调用成员方法
		student.study();
		student.eat();
		student.sleep();
	}
}

