package test;

import data.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String personText;
		//
		Person p1; // Variablen Definiton
		p1 = new Person(); // Instanzierung
		//
		p1.setVorname("Hans");
		p1.setNachname("Huber");
		//
		System.out.println(p1);

	}

}
