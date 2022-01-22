package jay.nakum.Singleton;

public class User extends Thread{
	
	private String username;
	
	public User(String username) {
		this.username = username;
	}
	
	private void work() throws InterruptedException {
		
		Arithmetic resource = Arithmetic.getResource();
		if(resource.isOccupied) {
			System.out.println(username + "trying to access\n" + "Resource is already in use.");				
			sleep(5000);
		} else {
			resource.add(username);
			resource.subtract(username);
			sleep(3000);
		}
		
	}
	
	@Override
	public void run() {
		
		try {
			
			int i = 1;
			while(i <= 5) {			
				this.work();			
			}
			
		} catch (InterruptedException e) {
			System.out.println("User is distracted.");
			e.printStackTrace();
		}
		
	}
}
