package com.Throw;

public class BalanceWithdraw {

	public static void main(String[] args) throws ServerDown {
		double bal=20000;double wd=15000;String pin="1234";boolean server=false;
		if(pin.equals("1234")) {
			if(server) {
				if(wd<=bal) {
					System.out.println("transaction completed");
				}else {
					throw new InsufficintBal("/please eneter the sufficient balance ");
				}
			}else {
				throw new ServerDown("/please try after some time");
			}
		}else{
			throw new IncorrectPin("/ please provide correct pin");
		}

	}

}
