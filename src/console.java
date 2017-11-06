import java.util.Scanner;

public class console {
		public String print(String msg) {
			System.out.println(msg);
			return new Scanner(System.in).next();
		}
		public int printInt(String msg) {
			System.out.println(msg);
			return new Scanner(System.in).nextInt();
		}
		public void escreve(String msg) {
			System.out.println(msg);
		}
	
	
	
	
	
}
