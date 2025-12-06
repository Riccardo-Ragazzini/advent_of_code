package Day2.Ch1;

import java.util.ArrayList;

public class IDsChecker {
    String filename;
    Long sum=0L;
    Integer upRange;

    public IDsChecker(String filename){
        this.filename = filename;
    }

    public Long CheckIDs(){
        ReadInputFile file = new ReadInputFile(filename);
        ArrayList<String[]> array = new  ArrayList<String[]>(file.scanFile());
        for (String[] i: array){
            for (Long j=Long.parseLong(i[0]);j <= Long.parseLong(i[1]);j++){
                if (j.toString().substring(0,j.toString().length()/2).equals(j.toString().substring(j.toString().length()/2))){
                    sum=sum+j;
                }
            }
        }
        return this.sum;
    }
    
}
