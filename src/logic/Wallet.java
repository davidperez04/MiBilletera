package logic;
import model.Transaction;

public class Wallet {
    private Transaction [] transactions = new Transaction[10];

    public void addTransaction(Transaction t){
        for (int i = 0; i < transactions.length; i++) {
            if( transactions[i] == null){
                transactions[i]=t;
            }
        }
    }

    public void showBalance(){
        float suma = 0;
        for (Transaction transaction : transactions) {
            suma += transaction.getAmount();
        }
        System.out.println("total:"+ suma);
    }
}
