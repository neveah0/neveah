
public class StudentTest {
	public static void main(String[] args) {
		Student stu1=new Student("李华",18,"female","东北大学");
		System.out.println(stu1.sayHello());
		System.out.println(stu1.study());
		}
}

class Student extends Person implements Consumer{
	String school;

	public Student(String name, int age, String sex,String school) {
		super(name, age, sex);
		this.school=school;
		
	}


	@Override
	public void useCredit() {
		// TODO Auto-generated method stub
		
	}
	public String getSchool() {
		return school;
	}
	public String study() {
		return super.getInfo()+"在"+getSchool()+"学习";
	}
	
	public String sayHello() {
		return "hello我叫"+super.getName()+"今年"+super.getAge()+"岁";
	}
}

  class Person {
	private String name;
	private int age;
	private String sex;
	
	public Person(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
     public String getInfo() {
    	 return getAge()+"岁的"+"学生"+getName();
     }
}

interface Consumer{
	default void useCredit(){
		
	}
}