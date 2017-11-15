import java.util.Scanner;

public class console {
	
	
		@SuppressWarnings("resource")
		public String print(String msg) {
			System.out.println(msg);
			System.out.print(">");
			return new Scanner(System.in).next();
		}
		@SuppressWarnings("resource")
		public int printInt(String msg) {
			System.out.println(msg);
			System.out.print(">");
			return new Scanner(System.in).nextInt();
		}
		@SuppressWarnings("resource")
		public int menu() {
			System.out.println("1|para criar sala para palestra.		\n2|para add participante. "
					+ "\n3|para add palestrante. 		\n4|para impririr.			\n0|para terminar seçao.");
			System.out.print(">");
			return new Scanner(System.in).nextInt();
		}
	
	
	
	
	
}
