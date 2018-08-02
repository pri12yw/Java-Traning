package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicReflection {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String qcn = "lti.reflect.Customer";// qualified class name qcn

		// loading the class manually
		Class custClass = Class.forName(qcn);
		// getting the parameterised constructor
		Constructor custConst = custClass.getConstructor(String.class);
		// Instantiating with parameterised constructor
		Object obj = custConst.newInstance("Xyzzz");
		System.out.println(obj);

		// getting private method of class
		Method printMethod = custClass.getDeclaredMethod("print", null);

		// calling print method on customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);

	}

}
