public class Pizza{
    private int price;
    private Boolean veg; 
    private int extraCheesePrice=100;
    private int extraTopplingPrice=150;
    private int backPackPrice=20;
    private int basePizzaPrice=0;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraTopplingsAdded=false;
    private boolean isOptedForTakeAway=false;
    public Pizza(Boolean veg){
        this.veg=veg; 
        if(this.veg)
        {
            this.price=300;
        }
        else
        {
            this.price=400;
        }
        basePizzaPrice=this.price;
        System.out.println("Pizza: "+this.price);
    }
    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        this.price += extraCheesePrice;
    }
    public void addExtraToppling(){
        isExtraTopplingsAdded=true;
        this.price += extraTopplingPrice;
    }
    public void takeAway(){
        isOptedForTakeAway=true;
        this.price += backPackPrice;
    }
    public void getBill(){
        String bill = "";
        if(isExtraCheeseAdded){
            bill += "Extra cheese added: "+extraCheesePrice+"\n";
        }
        if(isExtraTopplingsAdded){
            bill +="Extra Topplings added: "+extraTopplingPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill +="Take away: "+backPackPrice+"\n";
        }
        bill += "bill: "+this.price +"\n";
        System.out.println(bill);
    }
}