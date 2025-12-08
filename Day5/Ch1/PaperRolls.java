package Day4.Ch1;


public class PaperRolls {

    public static void main(String[] args){

        AvailableRolls Counter = new AvailableRolls("/home/riccardo/Advent_of_code/Day4/Ch1/resources/input");
        int total= Counter.control();
        System.out.print(total);
        
    }
    
}
