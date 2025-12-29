package day01_basics;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arr1 = {};
		int arr2[] = {1,2,3,4,5,6};
		int[] arr3 = {5};
		String[] str = new String[4];
		
		str[0] = "Gaurav";
		str[1] = "ram";
		str[2] = "Paul";
		
		System.out.println(str[3]);
		
		System.out.println("length: "+arr1.length);
		System.out.println("length: "+arr2.length);
		System.out.println("length: "+arr3.length);

		for(int x:arr2) {
			System.out.println(x);
		}
		
		String[] cars = {"BMW","AUDI","GT","FERRARI"};
		
		for(String car:cars) {
			System.out.println(car);
		}
	
		System.out.println("-----------------------");
		int[] arrInt = {10,30,20,4,4};
		 
		int sum =0;
		for(int i=0; i<arrInt.length;i++) {
			//System.out.println(arrInt[i]);\
			sum +=arrInt[i];
			
		}
		System.out.println("Sum is "+sum);
	}
}
