package com.qa.Generics;

public class StringPrinter {

	String thingToPrint;
		
		public StringPrinter(String thingToPrint) {
			this.thingToPrint = thingToPrint;
		}
		
		public void printS() {
			System.out.println("");
			System.out.println("String Printer");
			System.out.println("--------------");
			System.out.println("Chosen String: " + thingToPrint);	
		}
}


