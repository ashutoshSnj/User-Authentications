package com.user.Authentication;


import java.io.InputStream;
import java.util.Scanner;


public class FactoryClass {
	
	public interface_for_data getDataObject() {
 InputStream inputStream = getClass().getResourceAsStream("GetDataStoreSystem.txt");
	SubFactoryClass obj=new SubFactoryClass();
	Scanner sc = new Scanner(inputStream);
	while (sc.hasNextLine()) {
		String input=sc.nextLine().trim();
        return obj.getobject(input);   
	}
       return new DefaultDataStore();	
}
	
}


