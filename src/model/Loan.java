package model;

public class Loan extends Transaction {
    @Override
    public void printDetail(){
        System.out.println(
            "======Loan information======"+
            "\nAmount: "+Utilities.convertFormat(getAmount())+
            "\nDescription: "+getDescription()+
            "\nDate: "+getDate()+
            "\ntype: "+getType()
        );
    }
}
