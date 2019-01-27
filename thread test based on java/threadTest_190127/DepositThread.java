//190127 Sun
//created by nani

package threadTest_190127;

public class DepositThread extends Thread{
	Account account;
	int money;
	
	public DepositThread(String name,Account account, int money){
		super(name);
		this.account = account;
		this.money = money;
	}
	
	@Override
	public void run() {
		try{
			Thread.sleep(1000 * 5);
		} catch(InterruptedException e){
			e.printStackTrace();
		}
		account.deposit(money);
	}
}
