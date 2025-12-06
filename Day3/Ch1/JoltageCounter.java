package Day3.Ch1;

import java.util.ArrayList;

public class JoltageCounter {
    String filename;
    Long sum=0L;
    Integer findTheMaximum;

    public JoltageCounter(String filename){
        this.filename = filename;
    }

    public Long sumJoltage(){
        ReadInputFile file = new ReadInputFile(filename);
        ArrayList<String> array = new  ArrayList<String>(file.scanFile());
        int n1;
        int n2;
        int index1=0;

        for (String i: array){
            String[] numberArray= i.split("(?<=\\G.)");
            n1=0;
            
            n2=0;
            for (int j=0;j<=numberArray.length-2;j++){
                if (n1<Integer.parseInt(numberArray[j])){
                    n1=Integer.parseInt(numberArray[j]);
                    index1=j;
                }
            }
            index1++;
            for (int j=index1;j<=numberArray.length-1;j++){
                if (n2<Integer.parseInt(numberArray[j])){
                    n2=Integer.parseInt(numberArray[j]);
                }
            }
            sum=sum+Long.parseLong(String.valueOf(n1)+String.valueOf(n2));
        }
        return this.sum;
    }       
    
}
