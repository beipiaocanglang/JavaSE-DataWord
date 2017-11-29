/**
 * 这是一个标准的private修饰的案例
 */
class Student{
	private String name;
	private int age;
	
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int a){
		age = a;
	}
}

class privateStudentTest{
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.getName()+"---"+s.getAge());

		System.out.println("---------------");

		//赋值
		s.setName("zhangsan");
		s.setAge(27);
		//s.age = 27;//age可以在Student中访问private
		System.out.println(s.getName()+"---"+s.getAge());
	}
}