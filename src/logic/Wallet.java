package logic;
import java.util.ArrayList;
import java.util.HashMap;

import model.Spent;
import model.Transaction;
import model.Actionable;

public class Wallet {
    //private Transaction [] transactions = new Transaction[10];
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction t){
        transactions.add(t);
    }

    public void transactionList(){
        for (Transaction transaction : transactions) {
            transaction.printDetail();
        }
    }

    public void showBalance(){
        float suma = 0;
        for (Transaction transaction : transactions) {
            suma += transaction.getAmount();
        }
        System.out.println("total:"+ suma);
    }

    public HashMap spentGroupings(){
        HashMap<String , Float> spents = new HashMap<>();
        for (Transaction transaction : transactions) {
            if (transaction instanceof Spent){
                Spent spent = (Spent)transaction;
                spents.put(spent.getCategory(), transaction.getAmount());
            }
        }
        return spents;
    }

    public void generateReportTaxes(){
        for (Transaction transaction : transactions) {
            if( transaction instanceof Actionable){
                transaction.printDetail();
                Actionable A = (Actionable)transaction;
                System.out.println("the tax for this transaction is: "+ A.calculateTax());
            }
        }
    }
}
