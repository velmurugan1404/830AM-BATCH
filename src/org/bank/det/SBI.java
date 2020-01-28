package org.bank.det;

public class SBI extends RBI{
	private void accNo() {
		System.out.println("ACC no is 67895366");

	}
	private void pinNo() {
		System.out.println("PIN no is 1234");
		
	}
	public static void main(String[] args) {
		SBI S =new SBI ();
		S.accNo();
		S.pinNo();
		S.adharCarddetail();
		S.panCarddetails();
	}

	}

