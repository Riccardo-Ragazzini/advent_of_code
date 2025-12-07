package Day3.Ch2;

import java.math.BigInteger;

public class Joltage {

    public static void main(String[] args){

        JoltageCounter Counter = new JoltageCounter("/home/riccardo/Advent_of_code/Day3/Ch1/resources/input.txt");
        BigInteger total= Counter.sumJoltage();
        System.out.print(total);
        
    }
    
}
