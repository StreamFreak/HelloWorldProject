package Rekursion;

public class rekursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 rekursiv(1);}
	public static void rekursiv(int zahl) {
			if (zahl>1000000)
				return;
			int ergebnis = zahl * 5;
			System.out.println(ergebnis);
			 
			rekursiv (ergebnis);
		}
  }


