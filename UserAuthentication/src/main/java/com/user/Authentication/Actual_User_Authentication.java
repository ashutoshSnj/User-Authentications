package Com.User.Authentication;

import org.mindrot.jbcrypt.BCrypt;

// Business logic layer
public class Actual_User_Authentication {
	
  public boolean Verification(User ref) {
	  FactoryClass dataobj=new FactoryClass();
	  interface_for_data obj= dataobj.getDataObject();
	  return obj.verifydata(ref); 
  }
  public boolean ragisteruser(User ref) {
	 String pass=ref.getPassword();
	 String Hashdpass=BCrypt.hashpw(pass, BCrypt.gensalt());
	 System.out.println(Hashdpass);
	 FactoryClass dataobj=new FactoryClass();
	     ref.setPassword(Hashdpass);
	  interface_for_data obj= dataobj.getDataObject();
	  
	  return obj.storeData(ref);
  }
}
