package quan.countdowntime;

public class Main {
	static Thread thread = new Thread();
	public static void main(String[] args) {
			
			for (int i = 60; i >= 0; i--) {
				try {
					System.out.println("You only remain " + i + "second");
					thread.sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}

}
