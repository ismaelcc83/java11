package jeps_314;

public class test {
	
	// VM Arguments: -XX:AllocateHeapAt=E: -Xms512M -Xmx512M -Duser.language=es -Duser.country=ES -Duser.timezone=Europe/Madrid
	public static void main(String args[]) throws Exception {
		try {
			var i = 1;
			while (true) {
				Thread.sleep(5000); // wait 5 seconds
				System.out.println("Checking heap memory in iteration " + i);
				++i;
			}
		} catch (Exception e) {
			System.out.println("Exception in main");
		}
	}
}