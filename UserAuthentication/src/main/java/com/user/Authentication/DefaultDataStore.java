package Com.User.Authentication;

public class DefaultDataStore implements interface_for_data {
	//This class is designed to handle scenarios where the input file
	//doesn't match the expected format
	// or is not found. It ensures that the system doesn't 
	//break when encountering file-related issues.
	
	
	@Override
	public boolean verifydata(User ref) {
		return false;
	}

	@Override
	public boolean storeData(User ref) {
		// TODO Auto-generated method stub
		return false;
	}

}
