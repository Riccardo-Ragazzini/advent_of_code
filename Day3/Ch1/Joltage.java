package Day3.Ch1;


public class Joltage {

    public static void main(String[] args){

        JoltageCounter Counter = new JoltageCounter("/home/riccardo/Advent_of_code/Day3/Ch1/resources/input.txt");
        Long total= Counter.sumJoltage();
        System.out.print(total);
        
    }
    
}
