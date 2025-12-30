package day01_basics;

public class MultiDimenArrayDemo {
	public static void main(String[] args) {
		int[][] arr1 = {{2,3,2},{12,2,4,3,4},{1,4,43,43,3,5,53,2}};
		
		System.out.println("number at row 2 & Col 3: "+arr1[1][2]);
		
		arr1[1][2] = 5;
		
		System.out.println("number at row 2 & Col 3: "+arr1[1][2]);
		
		System.out.println("length of rows "+arr1.length);
		System.out.println("length of first row: " +arr1[0].length);
		System.out.println("length of second row: "+arr1[1].length);
		System.out.println("length of third row: " +arr1[2].length);
		
		/*for(int row=0;row<arr1.length;row++) {
			for(int col=0;col<arr1[row].length;col++) {
				System.out.println("arr1 [ "+ row+" ] ["+col+" ]  =  "+arr1[row][col]);
			}*/
		for(int[] row : arr1) {
			for (int num:row) {
				System.out.println(num);
			}
			
		}
		
	}
		
}
