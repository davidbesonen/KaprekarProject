package unl.cse.kaprekar;

public class KaprekarDemo {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("Usage: KaprekarDemo n");
			System.exit(1);
		}
		
		int n = Integer.parseInt(args[0]);
		if(KaprekarUtils.isKaprekar(n)) {
			System.out.printf(n + " is a Kaprekar Number!\n");
		} else {
			System.out.printf(n + " is not a Kaprekar Number!\n");
		}		
	}
}
