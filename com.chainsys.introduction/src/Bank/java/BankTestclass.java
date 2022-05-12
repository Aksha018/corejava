package Bank.java;

import com.chainsys.Bank.Bank;

public class BankTestclass {

		public static void testDeposit() {
			System.out.println("Before Balance " + Bank.currentBalance);
			Bank.deposit(20000);
			System.out.println("After Balance " + Bank.currentBalance);
		}

		public static void testWithdraw() {
			System.out.println("Before Balance " + Bank.currentBalance);
			int withdraw = Bank.withdraw(3000);
			System.out.println("total amount is" + withdraw);
			System.out.println("After Balance " + Bank.currentBalance);
		}

		public static void testOpenaccount() {
			Bank.openAccount("aksha",135792468 );
			System.out.println(Bank.customerName);
			System.out.println(Bank.accountNumber);

		}
	}
