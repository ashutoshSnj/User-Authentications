package com.user.Authentication;



// Business logic layer
public class Actual_User_Authentication {
	
  public boolean Verification(User ref) {
	  FactoryClass dataobj=new FactoryClass();
	  interface_for_data obj= dataobj.getDataObject();
	  return obj.verifydata(ref);
	 
  }
}
