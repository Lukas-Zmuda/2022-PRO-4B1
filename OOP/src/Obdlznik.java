
public class Obdlznik {
	
	//instancne premenne
	int dlzka;
	int sirka;
	int x, y;
	String farba;

	void vypisInfo() {
		System.out.println("Obdlznik na suradnici [" + x + ", " + y + "] ");
		System.out.println("Dlzka: " + dlzka);
		System.out.println("Sirka: " + sirka);
		System.out.println("Farba: " + farba);
	}
}
