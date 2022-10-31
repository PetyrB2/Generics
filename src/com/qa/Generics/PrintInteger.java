package com.qa.Generics;

public class PrintInteger {

	Integer thingToPrint;
	
	public PrintInteger(Integer thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void printI() {
		System.out.println("");
		System.out.println("Integer Printer");
		System.out.println("--------------");
		System.out.println("Chosen Integer: " + thingToPrint);	
	}
}
