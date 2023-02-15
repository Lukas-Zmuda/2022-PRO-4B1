
public class Pole {

	public static void main(String[] args) {
		
		//deklaracia pola
		int[] cisla;
		
		cisla = new int[7];
		
		cisla[0] = 4;
		cisla[1] = cisla[0] + 1;
		cisla[2] = 7;
		cisla[3] = -8;
		cisla[4] = 102;
		
		System.out.println("Prvy prvok v poradi ma hodnotu " + cisla[0]);
		
		for(int i = 0; i < 7; i++) {
			System.out.print(cisla[i] + ", ");
		}
		
		System.out.println();
		
		int suma = 0;
		for(int i = 0; i < 7; i++) {
			suma += cisla[i];
		}
		System.out.println("Suma prvkov pola je " + suma);

		String[] mena4B1 = {"Jan", "Jakub", "David", "Adrian", "Martin", "Jozef", "Michal", "Tomas"};
		
		System.out.println("Pocet ziakov triedy: " + mena4B1.length);
		System.out.println("Ziaci 4B:");
		for(int i = 0; i < mena4B1.length; i++) {
			System.out.println((i + 1) + ". " + mena4B1[i]);
		}
		
	}

}
