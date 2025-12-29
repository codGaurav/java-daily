package day01_basics;

public class StringPractice {
		public static void main(String[] args) {
			String str1 = "Gaurav";
			String str2 = "shiNde";
			
			System.out.println(str1.charAt(5));
			System.out.println(str2.indexOf("d"));
			System.out.println(str2);
			str2 = str2.toLowerCase();
			System.out.println(str2);
			
			String str3 = str2 +" "+ str1;
			
			System.out.println(str3);
			
			System.out.println(str1.length());
			System.out.println(str1.charAt(2));
			//System.out.println(str1.codePointAt(-1));
			System.out.println(str1.contains("Ga"));
			System.out.println(str1.endsWith("av"));
			System.out.println(str1.startsWith("Ga", 0));
			System.out.println(str1.indexOf("u"));
			System.out.println(str3.toUpperCase());
			
			System.out.println("------------------");
			//Comparison of strings
			String str4 = "Hello";
			String str5 = "hello";
			String str6 = "HELLO";
			
			System.out.println(str4.compareTo(str6));
			System.out.println(str4.equals(str6));
			System.out.println(str4.equalsIgnoreCase(str6));
			System.out.println(str4.equals(str5));;
			
			System.out.println("-----------trim()--------");
			
			String str7 = "   GAURAV   ";
			System.out.println("Before trim string7:"+str7);
			System.out.println("After trim string str7:"+str7.trim());
			
			
		}
}
