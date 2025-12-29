package day01_basics;

public class NestedForLoop {
	public static void main(String[] args) {
//		1 2 3
//		2 4 6
//		3 6 9
		int table = 0;
		for(int i =1;i<=3;i++) {
			for(int j=1; j<=3; j++) {
			table = i*j;	
			
			System.out.print("\t"+table);
			}
			System.out.println("\n");
		}
	}
}
