package bookMarketSystem;

import java.util.ArrayList;
import java.util.List;

import bookMarket.SystemUserManager;

public class UserManager implements SystemUserManager {
	Human recentUser;
	private static ArrayList<Human> listUser = new ArrayList<>();

	
	static Human findUser(String name,String password){
		if(listUser.isEmpty())
			listUser.add(new Admin());
		for(Human i: listUser)
		{
			if(i.matchInfo(name, password))
				return i;
		}
		return null;
	}

	static String regUser(String name, String password, String address, int phoneNum) {
		if(name == null)
			return "Please input your name";
		else if(password == null)
			return "Please input your name";
		else if(address == null)
			return "Please input your name";

		listUser.add(new User(name,password,address,phoneNum));
		return null;
	}
	
	public boolean deleteUser(String name){
			for(Human i : listUser)
			{
				if(i.getName() == name)
				{
					if(i.getActivation())
						return false;
					else {
						listUser.remove(i);
						return true;
					}
				}
			}
			return false;
	}
	
	public boolean changeActive(String name) {
		for(Human i : listUser)
		{
			if(i.getName() == name)
				return i.changeActive();
		}
		return false;
	}
	
	public ArrayList<String> listUser(){
		ArrayList<String> result = new ArrayList<>();
		for(Human i : listUser) {
			if(i.isAdmin() == false)
				result.add(i.toString());
		}
		return result;
	}
}
