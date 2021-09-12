package a5ex6;

import java.util.Date;

/**
 * Classe que modela uma transação bancária
 * @author Yago
 */
public class Transaction {

    private Date mDate;
    private char mType;

    private double mAmount;
    private double mBalance;
    private String mDescription;

    public Transaction(char type, double amount, double balance,
            String description) {
        mType = type;
        mAmount = amount;
        mBalance = balance;
        mDescription = description;
        mDate = new Date();
    }

    public Date getDate() {
        return mDate;
    }

    public char getType() {
        return mType;
    }

    public double getAmount() {
        return mAmount;
    }

    public double getBalance() {
        return mBalance;
    }

    public String getDescription() {
        return mDescription;
    }

    @Override
    public String toString() {
        return "Tipo: " + mType + " Data: " + mDate + "Descrição: " + mDescription
                + "total: " + mAmount + " Saldo: " + mBalance + "\n";
    }

}
