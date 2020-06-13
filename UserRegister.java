package bookMarketSystem;

import bookMarket.SystemUserRegister;

public class UserRegister implements SystemUserRegister{
	public String regUser(String name,String password, String address, Integer phoneNum) {
		if(phoneNum == null)
			return "Please input phone number";
		return UserManager.regUser(name, password, address, phoneNum);
	}
}
