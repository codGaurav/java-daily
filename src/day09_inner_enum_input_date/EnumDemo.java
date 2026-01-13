package day09_inner_enum_input_date;

import java.util.Scanner;

enum OrderStatus{
	
	PLACED, SHIPPED, DELIVERED, CANCELLED
}
public class EnumDemo {
	public static void main(String[] args) {

		OrderStatus orderStatus = OrderStatus.SHIPPED;
		
		if(orderStatus==orderStatus.SHIPPED) {
            System.out.println("Order is on the way");

		}
	}
}
