package edu.oop.retazce;

public class RetazceDemo {

	public static void main(String[] args) {
		
		String meno = "Lukas";
		
		String meno3 = "   Lukas         ";
		
		String meno2 = new String("Lukas");
		
		System.out.println(meno == meno2);
		
		System.out.println("Pocet znakov mena: " + meno.length());
		
		System.out.println(meno.equals(meno2));
		
		System.out.println(meno.toUpperCase());
		
		System.out.println(meno);
		
		System.out.println(meno.toLowerCase());
		
		System.out.println("Meno zacina na: " + meno.charAt(0));
		
		System.out.println("k je na pozicii v mene: " + meno.indexOf('k'));
		
		System.out.println(meno.substring(2));
		
		System.out.println(meno.substring(1, 4));
		
		System.out.println(meno.startsWith("Lu"));
		
		System.out.println(meno.endsWith("ova"));
		
		System.out.println(meno.equals(meno3));
		
		System.out.println(meno3);
		System.out.println(meno3.trim());
		
		System.out.println(meno.trim().equals(meno3.trim()));
		
		
		

	}

}
