package cas.lab6.wt;

public class Money {
	
	private int fAmount;
	private String fCurrency;
	
	public Money(int amount, String currency) {
		this.fAmount = amount;
		this.fCurrency = currency;
	}
	
	public int getAmount() {
		return this.fAmount;
	}
	
	public String getCurrency() {
		return this.fCurrency; 
	}
	
	public Money add(Money m) {
		return new Money(getAmount() + m.getAmount(), getCurrency()); 
	}
	
	public boolean equals (Object anObject) {
		if (anObject instanceof Money) {
			Money diffMoney = (Money)anObject;
			return (diffMoney.getAmount() == this.fAmount) && (diffMoney.getCurrency() == getCurrency()); 
		}
		return false;
	}
}
