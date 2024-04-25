interface MobileBanking
{
	int getbalance();
	void setamt(int amountDepo);
	void amountTransf(int amount);
}
class hdfc implements MobileBanking
{
	private int amountBal;
	hdfc(int amountDepo);
	amountBal = amountBal+amountDepo;
}
public int getbalance()
{
	return amountBal;
}
public void setamount(int amountDepo)
{
	this.amountBal = this.amountBal+amountDepo;
}
public void amountTransf(int amount)
{
	if(amount<=amountBal){
		System.out.println("Amount transfer Successfully");
		amountBal = amountBal-amount;
	}
	else{
		System.out.println("Plase enter correct amount");
	}
}
class Exp2
{
	public static void main(String args[])
	{
		Exp2 ex = new Exp2(5000);
		ex.getbalance();
		ex.setamt(5000);
		ex.amountTransf(200);
	}
}
