package Bank.java;
 class bank {
	public static int currentBalance;
	public static String customerName;
	public static int accountNumber; 
	
	//method to deposit
	public static void deposit(int paramAmount)
	{
     currentBalance = currentBalance + paramAmount;
	}
    public static void withdraw(int paramAmount)
    {
     currentBalance = currentBalance - paramAmount;	
    }
    public static void openAccount(String paramName, int paramAccountName)
    {
   
	customerName = paramName;
     accountNumber =paramAccountName;
}
    }