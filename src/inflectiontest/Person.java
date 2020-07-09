package inflectiontest;

public class Person {
    private String name;
    private int age;
    
    
    public Person(){
    	
    }
    public Person(String name,int age) {
    	this.name=name;
    	this.age=age;
    	System.out.println("!!!!!!");
    }
    
    public String getName() {
    	return name;
    }
    
    public int getAge() {
    	return age;
    }
    
    public String toString() {
    	return "name: "+name+"  age: "+age;
    }
}
