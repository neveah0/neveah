package pattern;
//接口的应用：工厂方法的设计模式
public class TestFactoryMethod {
	public static void main(String[] args) {
		IWorkFactory stuWork = new StudentWorkFactory();
		stuWork.getWork().doWork();
		
		IWorkFactory teacWork = new TeacherWorkFactory();
		teacWork.getWork().doWork();
	}
}

interface IWorkFactory{
	Work getWork();
}
class StudentWorkFactory implements IWorkFactory{

	@Override
	public Work getWork() {
		return new StudentWork();
	}
	
}
class TeacherWorkFactory implements IWorkFactory{

	@Override
	public Work getWork() {
		return new TeacherWork();
	}
	
}

interface Work{
	void doWork();
}

class StudentWork implements Work{

	@Override
	public void doWork() {
		System.out.println("学生写作业");
	}
	
}
class TeacherWork implements Work{

	@Override
	public void doWork() {
		System.out.println("老师批改作业");
	}
	
}
