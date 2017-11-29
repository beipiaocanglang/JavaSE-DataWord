/**
 * 形式参数传递的问题
 * 		基本类型：形式参数的改变不影响实际参数
 * 		引用类型：显示参数的改变直接影响实际参数
 */
//形式参数是基本类型
class Demo{
	public int sum(int a, int b){
		return a+b;
	}
}

//形式参数是引用类型(引用类型包含类、接口、对象)
class Student{
	public void show(){
		System.out.println("我爱java");
	}
}
class StudentDemo{
	//如果你看到一个方法的形式参数是一个类 类型(引用类型)，那么实际需要这个参数的对象
	public void mothed(Student s){//调用的时候把main方法中的对象地址传到这里相当于Student s = new Student();
		s.show();
	}
}

//测试类
class ArgsTest{
	public static void main(String[] args) {
		//形式参数是基本类型
		Demo d = new Demo();
		int result = d.sum(10,20);
		System.out.println("result:"+result);

		//形式参数是引用类型
		Student s = new Student();
		StudentDemo sd = new StudentDemo();
		sd.mothed(s);
	}
}