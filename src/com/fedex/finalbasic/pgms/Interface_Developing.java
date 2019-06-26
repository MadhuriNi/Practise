package com.fedex.finalbasic.pgms;

public class Interface_Developing implements Interface_BankingClient{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface_Developing id=new Interface_Developing();
		Interface_BankingClient ib=new Interface_Developing();
		
		ib.paycreditcard();
		ib.transferbalance();
		ib.checkingbalance();
		id.login();
		
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("pay credit card implemented");
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transfer balance implemented");
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("checking balance implemented");
	}
	
	public void login()
	{
		System.out.println("Login done");
	}

}
