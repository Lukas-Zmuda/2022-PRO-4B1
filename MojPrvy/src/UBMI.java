import java.util.Scanner;

public class UBMI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Zadaj hmotnost[kg]: ");
		int hmotnost = sc.nextInt();
		System.out.println("Zadaj vysku[cm]: ");
		int vyska = sc.nextInt();
		
		double v = vyska / 100.0;
		double bmi = hmotnost / (v * v);
		System.out.println("BMI: " + bmi);
		

	}

}
