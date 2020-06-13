package bookMarketSystem;

import bookMarket.SystemForUser;

public class Market{
	Human currentUser;
	UserManager userManager = new UserManager();
	public Market(String name, String password) {
		currentUser = UserManager.findUser(name, password);
	}
	
	public Place getPlace() {
		if(currentUser.isAdmin())
			return new AdminPlace(currentUser);
		else
			return new UserPlace(currentUser);
	}
}
