package Day1.Ch1;

public class SecretEntrance {

    public static void main(String[] args){

        DecriptSecretEntrance decoded = new DecriptSecretEntrance("/home/riccardo/Advent_of_code/Day1/Ch1/resources/input", 50);
        decoded.decriptLines();
        System.out.println(decoded.getZeroCounter());
    }
    
}
