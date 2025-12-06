package Day2.Ch1;


public class CheckValidIDs {

    public static void main(String[] args){

        IDsChecker iDsChecker = new IDsChecker("/home/riccardo/Advent_of_code/Day2/Ch1/resources/input");
        Long total= iDsChecker.CheckIDs();
        System.out.print(total);
        
    }
    
}
