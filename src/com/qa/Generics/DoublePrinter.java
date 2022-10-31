package com.qa.Generics;

public class DoublePrinter {

	Double thingToPrint;
		
		public DoublePrinter(Double thingToPrint) {
			this.thingToPrint = thingToPrint;
		}
		
		public void printD() {
			System.out.println("");
			System.out.println("Double Printer");
			System.out.println("--------------");
			System.out.println("Chosen Double: " + thingToPrint);	
		}
}

