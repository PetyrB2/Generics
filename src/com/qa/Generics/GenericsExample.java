package com.qa.Generics;

public class GenericsExample {

	public static void main(String[] args) {
		
		// Runners Below
		
		// INTEGER Runner
		PrintInteger printerI = new PrintInteger(22234);
		
		printerI.printI();
	
	
		// DOUBLE Runner
		DoublePrinter printerD = new DoublePrinter(222.34567);
				
		printerD.printD();
	
		// STRING Runner
		StringPrinter printerS = new StringPrinter("By Jove. I think he's got it!");
				
		printerS.printS();
	
	}
	
}
