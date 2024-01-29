import javax.swing.JTextField;

public class BankAccount {

    private double balance;

    // Constructor to initialize the balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Function to deposit money into the account
    public String deposit(JTextField textField) {
    	String str = textField.getText();
    	
    	try {
    		double amount = Double.parseDouble(str);
	        if (amount > 0) {
	            balance += amount;
	            return "Deposited $" + amount +" Successfully..";
	        } else {
	           return "Invalid deposit amount";
	        }
    	}
    	catch(Exception e) {
    		return "Enter Numeric values only";
    	}
    }

    // Function to withdraw money from the account
    public String withdraw(JTextField textField) {
    	String str = textField.getText();
    	
    	try {
    		double amount = Double.parseDouble(str);
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	           return "Withdrawn: $" + amount+"  "+" Successfully";
	        } else {
	            return "Invalid withdrawal amount or insufficient funds";
	        }
    	}
    	catch(Exception e) {
    		return "Enter Numeric values only";
    	}
    }

    // Function to get the current balance
    public String getBalance() {
        return "Available balance is:  $"+balance;
    }

  
}
