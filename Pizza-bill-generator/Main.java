public class Main{
    public static void main(String[] args){
        
        Pizza basePizza = new Pizza(false);
        // basePizza.addExtraToppling();
        // basePizza.getBill();
        DeluxPizza dp = new DeluxPizza(false);
        dp.takeAway();
        dp.getBill();
    }
}
