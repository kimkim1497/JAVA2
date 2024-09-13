package C03;

public class C03Typechange {

	public static void main(String[] args) {
		
		int n1 = 129;		//   00000000  00000000 00000000 10000000
		int n2 = 130;
		byte n3 = (byte)n1;
		byte n4 = (byte)n2; 
		
		System.out.printf("%d\n",n3);
		System.out.printf("%d\n",n4);
		
		

	}

}
