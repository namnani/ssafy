//190127 Sun
//created by nani

package threadTest_190127;

public class NotiAccount extends Account {
	public NotiAccount(int balance){
		super(balance);
	}
	
	public synchronized int withdraw(int money){
		String threadName = Thread.currentThread().getName();
		if(balance >= money){
			try{
				Thread.sleep(100);
			} catch (InterruptedException e){
				e.printStackTrace();
			}
			balance -= money;
			System.out.println(threadName + ": 출금. 잔액: " + balance);
		} else{
			System.out.println(threadName+": 잔액 부족 출금 불가로 wait 호출");
			try{
				this.wait();
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
			return balance;
	}
	
	public synchronized int deposit(int money){
		String threadName = Thread.currentThread().getName();
		balance += money;
		this.notifyAll();
		System.out.println(threadName + "입금. 잔액: "+balance);
		return balance;
	}
}
