//190127 Sun
//created by nani

package threadTest_190127;

public class BankingClient3 {
	public static void main(String[] args) {
		Account account = new NotiAccount(5000);
		WithdrawThread iBanking = new WithdrawThread("인터넷뱅킹", account,1000);
		WithdrawThread mBanking = new WithdrawThread("모바일뱅킹", account, 1000);
		DepositThread tBanking = new DepositThread("텔레뱅킹", account, 10000);
		iBanking.start();
		mBanking.start();
		tBanking.start();
	}
}
