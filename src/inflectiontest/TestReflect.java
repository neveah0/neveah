package inflectiontest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;

public class TestReflect {

	 @Test
	   public void test() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		   Class clazz=Person.class;
		   Constructor cons = clazz.getDeclaredConstructor(String.class,int.class);
	       cons.setAccessible(true);
	       Person p=(Person)cons.newInstance("ROY",20);
	       System.out.println(p);
	   }
	 @Test
	 public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		 Class clazz=Class.forName("inflectiontest.Person");
		 Object obj =clazz.newInstance();		 
		 Person p=(Person)obj;
		 System.out.println(p);
	 }
}
