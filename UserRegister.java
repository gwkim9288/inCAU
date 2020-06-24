package bookMarketSystem;

import bookMarket.SystemUserRegister;

public class UserRegister implements SystemUserRegister{
	public boolean regUser(String name,String password, String address, Integer phoneNum) {
		return UserManager.regUser(name, password, address, phoneNum);
	}
}
