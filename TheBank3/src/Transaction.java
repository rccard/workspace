
public class Transaction {
	private double amount;
	private String descr;
	private int type;
	
	public static final int WITHDRAWAL = 2;
	public static final int DEPOSIT = 1;
	public static final int TRANSFER = 3;
	public static final int OTHER = 4;
	
	public Transaction(double amt, String descr, int type) {
		this.amount = amt;
		this.descr = descr;
		this.type = type;
	}
	public String getStringType() {
		switch(this.type) {
			case Transaction.DEPOSIT: return "deposit"; //break;
			case Transaction.WITHDRAWAL: return "withdrawal"; //break;
			case Transaction.TRANSFER: return "transfer"; //break;
			default: return "undefined";
		}
	}
	
	public String toString() {
		return this.getStringType() +" $"+this.amount +" "+this.descr;
		//return ""+this.amount;
	}
	
	public static void main(String[] args) {
		Transaction t1 = new Transaction(300, "Dentist appt", 2);
		System.out.println(t1);
		Transaction t2 = new Transaction(200, "gift", 1);
		System.out.println(t2);
	}
}
