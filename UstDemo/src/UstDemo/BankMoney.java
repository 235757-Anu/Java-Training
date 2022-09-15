package UstDemo;

class Bank{
	int getBalance()
	{
		return 0;
	}
}

class BankA extends Bank
{
	int getBalance()
	{
		System.out.println("$1000");
		return 0;
	}
}

class BankB extends Bank
{
	int getBalance()
	{
		System.out.println("$1500");
		return 0;
	}
}

class BankC extends Bank
{
	int getBalance()
	{
		System.out.println("$2000");
		return 0;
	}
}

public class BankMoney {

	public static void main(String[] args) {
		Bank b=new Bank();
		BankA ba=new BankA();
		BankB bb=new BankB();
		BankC bc=new BankC();
		b.getBalance();
		ba.getBalance();
		bb.getBalance();
		bc.getBalance();
	}

}
