package basics;

public class Schleife2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// vor der Schleife
		System.out.println("vor");
		// während der Schleife
		for (int i = 0; i < 3; i++) {
			System.out.println("während");
		}
		// nach der Schleife
		System.out.println("nach");
		//
		// innere und äußeren Schleifen
		for (int i = 0; i < 3; i++) {
			System.out.println("wie oft hier vor?" + i);
			//
			for (int x = 0; x < 4; x++) {
				System.out.println("wie oft?" + (x + i));
			}
			//
			System.out.println("wie oft hier nach?" + i);
		}
	}
}
