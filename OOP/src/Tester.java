
public class Tester {

	public static void main(String[] args) {
		
		Obdlznik o = new Obdlznik();
		
		o.dlzka = 10;
		o.sirka = 5;
		o.farba = "cierna";
		o.x = 0;
		o.y = 0;
		
		
		o.vypisInfo();
		Obdlznik o2 = new Obdlznik();
		o2.dlzka = 152;
		o2.sirka = 12;
		o2.farba = "ruzova";
		o2.x = -4;
		o2.y = 1;
		
		
		System.out.println("----------");
		o2.vypisInfo();

	}

}
