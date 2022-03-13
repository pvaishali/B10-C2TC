package framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;

	

	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	public void withdraw(float wd) {
		if (accBal >= wd) {
			System.out.println("Amount withdrawn is: "+wd);
		}else {
			System.out.println("INSUFFICIENT BALANCE!!");
		}
	}

	public void deposit(float d) {
		
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
}
