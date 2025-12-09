package model;

public class Income extends Transaction implements Actionable{
    @Override
    public void printDetail(){
        System.out.println(
            "======Income information======"+
            "\nAmount: +"+Utilities.convertFormat(getAmount())+
            "\nDescription: "+getDescription()+
            "\nDate: "+getDate()+
            "\ntype: "+getType()
        );
    }

    public float calculateTax(){
        float x = 0.125f;
        float impuesto = getAmount() * x ;
        return impuesto;
    }
}
