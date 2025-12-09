package model;

public class Spent extends Transaction implements Actionable{
    private String category;

    public String getCategory(){
        return category;
    }
    public void setCategory(){
        this.category= category;
    }
    @Override
    public void printDetail(){
        System.out.println(
            "======Spent information======"+
            "\nAmount: -"+Utilities.convertFormat(getAmount())+
            "\nDescription: "+getDescription()+
            "\nDate: "+getDate()+
            "\ntype: "+getType()
        );
    }

    public  float  calculateTax(){
        float x = 0.125f;
        float impuesto = getAmount() * x ;
        return impuesto;
    }
}
