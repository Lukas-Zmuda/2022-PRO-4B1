
public class DatoveTypy {

	public static void main(String[] args) {
		
		//celociselne DT
		//deklaracia premennej
		int cislo;
		
		//inicializacia premennej
		cislo = 14;
		
		int a = 1, b = 2, c = 3;
		
		int bin = 0b10000000;
		int hex = 0xff;
		System.out.println("bin = " + bin);
		System.out.println("hex = " + hex);
		
		System.out.println("cislo = " + cislo);
		
		byte bb = 12;
		
		short ss = bb;
		
		bb = (byte)cislo;
		
		//desatinne cisla
		double dd = 1.245;
		float ff = 1.2f;
		
		
		//znaky
		char zav = '@';
		System.out.println(zav);
		zav = 64;
		
		boolean prsi = false;
		

		String meno = "Lukas";
		
	}

}
