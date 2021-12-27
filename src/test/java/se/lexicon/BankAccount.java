package se.lexicon;

public class BankAccount {

   private int accountNr;
   private double balance;
   private String customerName;
   private String email;
   private String phoneNr;

    public BankAccount(int accountNr, double balance, String customerName, String email, String phoneNr) {
        this.accountNr = accountNr;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNr = phoneNr;
    }

    public int getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(int accountNr) {
        this.accountNr = accountNr;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }
}

