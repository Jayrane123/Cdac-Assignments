package Assignment4;

import java.util.Scanner;



public class ElectricityBill {
	
	private String customerName;
	private double unitsConsumed, billAmount;
	
	ElectricityBill(String customerName,double unitsConsumed){
		this.customerName=customerName;
		this.unitsConsumed=unitsConsumed;
	}
	 void calculateBillAmount() { 
		 if(unitsConsumed<=100) {
			 billAmount = 5 *unitsConsumed;
		 }
		 else if(unitsConsumed<=200) {
			 billAmount=5 *100;
			 billAmount += (7 *(unitsConsumed-100));
		 }else {
			 billAmount=5 *100;
			 billAmount += (7 *200);
			 billAmount += (10 *(unitsConsumed-300));
		 }
		 System.out.println(customerName+" your "+unitsConsumed +" and "+billAmount);
		
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter CustomerName : ");
		String ab=sc.nextLine();
		System.out.println("Enter UnitConsumed :");
		
		double a=sc.nextDouble();
		ElectricityBill e= new ElectricityBill(ab,a);
		e.calculateBillAmount();

	}

}
