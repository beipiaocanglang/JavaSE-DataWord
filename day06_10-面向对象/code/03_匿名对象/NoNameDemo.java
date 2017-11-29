/**
 * 匿名对象
 * 		定义：没有名字的对象叫做匿名对象，是对象的一种简化表示形式
 * 应用场景
 * 		A:调用方法，仅仅只调用一次的时候
 * 			好处：匿名对象调用完毕后就是垃圾，可以被垃圾回收器回收，因为栈中没有变量只想它
 * 			注意：调用多次时不适合
 * 		B:匿名对象可以作为实际参数传递
 * 			
 */
class Student{
	public void show(){
		System.out.println("我爱学习");
	}
}
class StudentDemo{
	public void mothed(Student s){
		s.show();
	}
}

//测试类
class NoNameDemo{
	public static void main(String[] args) {
		System.out.println("******匿名对象调用方法******");
		//带名字的对象调用
		Student s = new Student();
		s.show();

		//匿名对象调用
		new Student().show();;

		System.out.println("******匿名对象作为实际参数传递******");
		StudentDemo sd = new StudentDemo();
		sd.mothed(new Student());
		new StudentDemo().mothed(new Student());
	}
}