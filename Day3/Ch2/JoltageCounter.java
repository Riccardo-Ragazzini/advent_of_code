package Day3.Ch2;

import java.math.BigInteger;
import java.util.ArrayList;

public class JoltageCounter {
    String filename;
    BigInteger sum = new BigInteger("0");
    String[] joltsArray;
    int max=0;


    public JoltageCounter(String filename){
        this.filename = filename;
    }

    public BigInteger sumJoltage(){
        ReadInputFile file = new ReadInputFile(filename);
        ArrayList<String> banksArray = new  ArrayList<String>(file.scanFile());
        for (String i: banksArray){
            joltsArray= i.split("(?<=\\G.)");
            this.sum=this.sum.add(this.findTheBiggest());
        }
        return this.sum;
    }
    
    private BigInteger findTheBiggest(){
        ArrayList<Integer> joltsValues= new ArrayList<Integer>();
        String jolts="";
        int index=0;
        for (int z=0;z<12;z++){
            for (int j=index;j<=joltsArray.length-12+z;j++){
                if (max<Integer.parseInt(joltsArray[j])){
                    max=Integer.parseInt(joltsArray[j]);
                    index=j;
                }
            }
            index++;
            joltsValues.add(max);
            max=0;
        }
        return new BigInteger (convertToString(jolts,joltsValues));
        
    }

    private String convertToString(String jolts,ArrayList<Integer> joltsValues){
        for (Integer n:joltsValues){
            jolts=jolts+String.valueOf(n);
        }
        return jolts;
    }
}
