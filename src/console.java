import java.util.Scanner;

public class console {
	
	
		public String print(String msg) {
			System.out.println(msg);
			System.out.print(">");
			return new Scanner(System.in).next();
		}
		public int printInt(String msg) {
			System.out.println(msg);
			System.out.print(">");
			return new Scanner(System.in).nextInt();
		}
		public int menu() {
			System.out.println("1|para criar eveno.		\n2|para add participante. "
					+ "\n3|para add palestrante. 		\n4|para impririr.			\n0|para terminar seçao.");
			System.out.print(">");
			return new Scanner(System.in).nextInt();
		}
	
	
	
	
	
}
