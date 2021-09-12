package a5ex6;

import java.util.ArrayList;
import java.util.Date;

/**
 * Superclasse que modela Conta
 * @author Yago
 */
public class Account {

    protected String mName;
    protected int mId;
    protected double mBalance;
    protected double mAnnualInterestRate;
    protected Date mDateCreated;
    protected ArrayList<Transaction> mTransactions;

    public Account() {
        mDateCreated = new Date();
        mTransactions = new ArrayList<>();
    }

    public Account(int id, double balance) {
        this();
        mId = id;
        mBalance = balance;
    }

    public Account(String name, int id, double balance) {
        this(id, balance);
        mName = name;

    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public double getBalance() {
        return mBalance;
    }

    public void setBalance(double balance) {
        mBalance = balance;
    }

    public double getAnnualInterestRate() {
        return mAnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        mAnnualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return mDateCreated;
    }

    public double getMonthlyInterestRate() {
        return mBalance * (mAnnualInterestRate / 12) / 100;
    }

    public void withdraw(double amount) {
        mTransactions.add(new Transaction('W', amount, mBalance, "saque"));
        mBalance -= amount;
    }

    public void deposit(double amount) {
        mTransactions.add(new Transaction('D', amount, mBalance, "deposito"));
        mBalance += amount;
    }

    @Override
    public String toString() {
        return "Nome da conta: " + mName + "\n" + "Taxa de juros: " +
                mAnnualInterestRate + "\n" + mTransactions;
    }

    public ArrayList<Transaction> getTransactions() {
        return new ArrayList<>(mTransactions);
    }

}
