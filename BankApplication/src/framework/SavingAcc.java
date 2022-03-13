package framework;

public  abstract class SavingAcc extends BankAcc {
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal,isSalaried);
	}
	@Override
	public void withdraw(float wd) {
		super.withdraw(wd);
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
