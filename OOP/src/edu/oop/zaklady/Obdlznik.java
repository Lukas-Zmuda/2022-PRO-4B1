package edu.oop.zaklady;

public class Obdlznik {
	
	//instancne premenne
	int dlzka;
	int sirka;
	int x, y;
	String farba;

	//metoda bez navratoveho typu
	void vypisInfo() {
		System.out.println("Obdlznik na suradnici [" + x + ", " + y + "] ");
		System.out.println("Dlzka: " + dlzka);
		System.out.println("Sirka: " + sirka);
		System.out.println("Farba: " + farba);
	}
	
	void kompletInfo() {
		vypisInfo();
		System.out.println("Obvod: " + obvod());
		System.out.println("Obsah: " + obsah());
	}
	
	//metoda s navratovou hodnotou
	int obsah() {
		int o = 0;
		o = dlzka * sirka;
		return o;
	}
	
	int obvod() {
		int obv = 0;
		obv = 2 * (dlzka + sirka);
		return obv;
	}
	
}
