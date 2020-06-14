package bookMarketSystem;

import bookMarket.SystemForLogin;

public class Market implements SystemForLogin{
	Human currentUser;
	public Market(String name, String password) {
		currentUser = UserManager.findUser(name, password);
	}
	
	public Place getPlace() {
		if(currentUser.isAdmin())
			return new AdminPlace(currentUser);
		else
			return new UserPlace(currentUser);
	}

	@Override
	public boolean isAdmin() {
		
		return currentUser.isAdmin();
	}
	
	public UserManager getManager() {
		return new UserManager();
	}

	
}
