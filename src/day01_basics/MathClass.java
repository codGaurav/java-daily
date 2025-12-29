package day01_basics;

public class MathClass {
		public static void main(String[] args) {
			System.out.println(Math.max(72.2, 22.1));
			System.out.println(Math.min(563.32, 232.21));
			System.out.println(Math.sqrt(64));
			System.out.println(Math.abs(-44.99));
			System.out.println(Math.pow(3, 2));
			System.out.println(Math.round(663.34));
			System.out.println(Math.round(55.56));
			System.out.println(Math.ceil(11.1));
			System.out.println(Math.floor(11.1));
			
			//how to get OTP using Math.random() 
			double otp = Math.random();
			
			System.out.println(otp);
			
			String otpStr = Double.toString(otp); 
			
			String midSix = otpStr.substring(2, 8);
			System.out.println("OTP: "+midSix);
			
			//we can use this approch also
			int randomNum = (int)(Math.random() * 1000000);  // 0 to 100

			System.out.println(randomNum);
			
			System.out.println("----------check Person is eligible for voting");
			
}}
