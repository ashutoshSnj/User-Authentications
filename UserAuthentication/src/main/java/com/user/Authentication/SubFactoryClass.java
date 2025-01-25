package com.user.Authentication;

public class SubFactoryClass {
	 public interface_for_data getobject(String obj) {
   	  if (obj.equalsIgnoreCase("mysql")){
   		  return new mysqldb();
   	  }
   	  else if(obj.equalsIgnoreCase("File")){
   		  return new Filedata();
   	  }
   	  else {
   		  return new DefaultDataStore();
   	  }
     }

}
