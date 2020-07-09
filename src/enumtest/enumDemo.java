package enumtest;

public enum enumDemo {

	
	JACSONYEE("易烊千玺","20001128"),
	ROYWANG("王源","20001108"),
	KARRYWANG("王俊凯","19990921");
	
	private final String name;
	private final String time;
	
	private enumDemo(String name,String time) {
		this.name=name;
		this.time=time;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTime() {
		return time;
	}
}
