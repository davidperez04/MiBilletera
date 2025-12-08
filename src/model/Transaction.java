package model;
public class Transaction {

    private float amount;
    private String description;
    private String date;
    private String type;

    public Transaction(){

    }

    public Transaction(float amount, String description){
        setAmount(amount);
        setDescription(description);
    }

    public Transaction(float amount, String description, String date, String type){
        setAmount(amount);
        setDescription(description);
        setDate(date);
        setType(type);
    }


    public float getAmount(){
        return amount;
    }

    public void setAmount(float amount){
        this.amount=amount;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public String getDate(){
        return date;
    }

    public void setDate(String date){
        this.date=date;
    }
     
    public String getType(){
        return type;
    }

    public void setType( String type){
        this.type=type;
    }

    public void printDetail(){
        System.out.println(
            "======Trasaction information======"+
            "\nAmount: "+Utilities.convertFormat(getAmount())+
            "\nDescription: "+getDescription()+
            "\nDate: "+getDate()+
            "\ntype: "+getType()
        );
    }
}
