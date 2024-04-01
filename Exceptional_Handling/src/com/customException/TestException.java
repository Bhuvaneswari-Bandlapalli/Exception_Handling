package com.customException;

public class TestException  {

	public static void main(String[] args)  throws SurverDown  {
		double bal=8907;double wbal=478; String pin="1234";boolean server=true;
		if(pin.equals("123")) {
			if(server) {
				if(bal>=wbal) {
					System.out.println("Transaction completed.");
					
				}else {
					throw new InsufficientBal("/please enter the sufficient balance");
					
				}
				
			}else {
				throw new SurverDown("/try after sometime.");
				
			}
		}else {
			throw new IncurrectPin("/Pease enter the correct pin");
			
		}
		
		

	}

}
