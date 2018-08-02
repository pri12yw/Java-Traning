package lti.reflect;

import java.security.BasicPermission;

public class Customer {
	private String name;
	
	public Customer() {
	}

	public Customer(String name) {
		
		this.name = name;
	}
private void print() {
	SecurityManager mgr = new SecurityManager();
	mgr.checkPermission(new BasicPermission("stay away") {});
	
	System.out.println("Name:" + name);
}

@Override
public String toString() {
	return name;
}

}
