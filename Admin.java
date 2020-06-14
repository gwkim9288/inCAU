package bookMarketSystem;

public class Admin extends Human {

	Admin() {
		super("admin", "sssss");
	}

	@Override
	boolean changeActive() {
		return false;
	}

	@Override
	boolean getActivation() {
		return true;
	}

}
