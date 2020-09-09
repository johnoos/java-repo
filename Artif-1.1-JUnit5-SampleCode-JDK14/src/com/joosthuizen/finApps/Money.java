package com.joosthuizen.finApps;

public class Money {
	protected String sCurrency;
	protected double dAmount;
	public Money(String sCurrency, double dAmount) {
		this.sCurrency = sCurrency;
		this.dAmount = dAmount;	
	}
	public Money() {
		sCurrency=null;
		dAmount=0;
	}
	public boolean equals(Money m) {
		if (this.sCurrency != m.sCurrency)
			return false;
		if (this.dAmount != m.dAmount)
			return false;
		return true;
	}
	public Money add(Money mMoney) throws Exception {
		if (this.sCurrency != mMoney.sCurrency) {
			throw new Exception("Different currencies");
		}
		return new Money(this.sCurrency, this.dAmount+mMoney.dAmount);
	}	
}