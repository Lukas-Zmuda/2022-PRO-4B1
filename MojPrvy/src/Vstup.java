import java.util.Scanner;

public class Vstup {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String meno = "";
		
		System.out.println("Ako sa volas?");
		meno = sc.nextLine();
		
		System.out.println("Ahoj " + meno + "! V ktorom roku si sa narodil?");
		
		int rok = sc.nextInt();
		System.out.println("Mas " + (2022 - rok) + " rokov.");
		

	}

}
