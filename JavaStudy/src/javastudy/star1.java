package javastudy;

public class star1 {
	public static void main(String[] args) {
		int space = 5;
		
		for(int i = 0; i < 5; i++) {
			space = space - 1;
			for(int j = 0; j < 5; j++) {
					if(j > space) {
						System.out.println("*");
					} else {
						System.out.println(" ");
					}
				System.out.println();
			}
		}
	}
}
