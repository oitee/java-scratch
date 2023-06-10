package Section7;

// This class is used by ClassChallenge class
public class Account {
    private String accountNumber;
    private int accountBalance = 0;
    private String customerName;
    private String emailId;
    private String phoneNumber;

    public Account(String accountNumber, String customerName, String emailId, String phoneNumber){
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        System.out.println("Section7.Account created, for " + this.accountNumber);
    }

    public Account(String customerName, String emailId){
        this("12433", customerName, emailId, "Unknown");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Section7.Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void withdrawFunds(int amt){
        if(this.accountBalance - amt < 0) {
            System.out.println("Cannot deposit " + amt + ", due to insufficient balance");
        }
        else if (amt < 0){
            System.out.println("Amount needs to be a valid positive integer: " + amt);
        }
        else{
            this.accountBalance -= amt;
            System.out.println(this.customerName + " Successfully withdrew " + amt + " from Section7.Account " + this.accountNumber + ". Current Balance: " + this.accountBalance);
        }
    }

    public void depositFunds(int amt){
        if(amt < 0){
            System.out.println("Deposit amount needs to be a valid positive number: " + amt);
        }else{
            this.accountBalance+= amt;
            System.out.println(this.customerName + " Successfully deposited " + amt + " from Section7.Account " + this.accountNumber + ". Current Balance: " + this.accountBalance);
        }
    }
}
