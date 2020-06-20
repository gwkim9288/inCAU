package bookMarketSystem;

import bookMarket.SystemUserRegister;

public class UserRegister implements SystemUserRegister{
	public void regUser(String name,String password, String address, Integer phoneNum) {
		UserManager.regUser(name, password, address, phoneNum);
	}
}
