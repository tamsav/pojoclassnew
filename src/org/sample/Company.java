package org.sample;

public class Company {
	
	public static void main(String[] args) {
		Employee a=new Employee();
		a.setUsername("Greens");
        a.setPassword(12345);	
        
        String username=a.getUsername();
        System.out.println(username);
        
        int password=a.getPassword();
        System.out.println(password);
                 
        
	}

}
