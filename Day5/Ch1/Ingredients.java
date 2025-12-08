package Day5.Ch1;


public class Ingredients {

    public static void main(String[] args){

        CountFreshIngredients Counter = new CountFreshIngredients("/home/riccardo/Advent_of_code/Day5/Ch1/resources/input");
        int total= Counter.countFresh();
        System.out.print(total);
        
    }
    
}
