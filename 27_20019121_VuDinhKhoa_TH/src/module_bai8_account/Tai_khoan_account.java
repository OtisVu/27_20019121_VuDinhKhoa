package module_bai8_account;
import java.text.NumberFormat;
import java.util.Locale;
public class Tai_khoan_account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double RATE = 0.035;

	public Tai_khoan_account() {
		this("chưa xác định",999999, 500000);
	}
	
	public Tai_khoan_account(String name, long accountNumber) {
		this(name, accountNumber,50000);
	}

	public Tai_khoan_account(String name, long accountNumber, double balance) {
		setAccountNumber(accountNumber);
		setName(name);
		setBalance(balance);
	}
	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		if (accountNumber > 0)
			this.accountNumber = accountNumber;
		else
			this.accountNumber = 9999999;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.isEmpty() == false)
			this.name = name;
		else
			this.name = "Không xác định";
	}

	public double getBalance() {
		return balance;
	}

		public void setBalance(double balance) {
		if (balance >= 50000)
			this.balance = balance;
		else
			this.balance = 50000;
	}


	public boolean deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			return true;
		}
		return false;
	}

	public boolean withdraw(double amount, double fee) {
		if (amount > 0 || amount + fee <= balance) {
			this.balance -= (fee + amount);
			return true;
		}
		return false;
	}

	public void addInterest() {
		this.balance = this.balance + this.balance * RATE;
	}

	public boolean transfer(Tai_khoan_account acc2, double amount) {
		if (withdraw(amount, 0) == true) {
			acc2.deposit(amount);
			return true;
		}
		return false;
	}

	public String dinhDangTienTe() {
		Locale local = new Locale("VI", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(local);
		String str1 = nf.format(balance);
		return str1;
	}
	
	public String toString() {
		return String.format("%-20s %-15d %-10s", this.name,this.accountNumber,dinhDangTienTe());
	}	
	public String getBang() {
		return String.format("%-20s %-15s %-10s", "Name","AccountNumber","Balance");
	}
	public static void main(String[] args) {
		Tai_khoan_account acc1 = new Tai_khoan_account("Ted Murphy",72354, 100000);
		Tai_khoan_account acc2 = new Tai_khoan_account( "Jane Smith",69713, 40000);
		Tai_khoan_account acc3 = new Tai_khoan_account( "Edward Demsey",93757, 700000);
		System.out.println("số tiển ban đầu:");
		System.out.println(acc1.getBang());
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());
		acc1.deposit(250000);
		acc2.deposit(500000);
		acc2.withdraw(430000, 2000);
		acc3.addInterest();
		System.out.println("\n\n Kiểm lại kết quả:");
		System.out.println(acc1.getBang());
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());
		System.out.println(acc3.toString());
		acc2.transfer(acc1, 100000);
		System.out.println("\n\n Kiểm lại kết quả:");
		System.out.println(acc1.getBang());
		System.out.println(acc1.toString());
		System.out.println(acc2.toString());

	}
	
}
