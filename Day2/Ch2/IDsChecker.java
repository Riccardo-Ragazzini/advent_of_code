package Day2.Ch2;

import java.util.ArrayList;

public class IDsChecker {
    String filename;
    Long sum=0L;
    Integer repeatIsEqual;

    public IDsChecker(String filename){
        this.filename = filename;
    }

    public Long CheckIDs(){
        ReadInputFile file = new ReadInputFile(filename);
        ArrayList<String[]> array = new  ArrayList<String[]>(file.scanFile());
        
        for (String[] i: array){
            for (Long j=Long.parseLong(i[0]);j <= Long.parseLong(i[1]);j++){
                
                sum=sum+this.controlOnlyOneOccurrency(j);
            }
        }
        return this.sum;
    }

    private Long controlOnlyOneOccurrency(Long j){
        for (Integer z=1;z<=j.toString().length()/2;z++){
            String regex="(?<=\\G"+".".repeat(z)+")";

            String[] splittedData=j.toString().split(regex);
            this.repeatIsEqual=1;
            while ((this.repeatIsEqual<splittedData.length) && splittedData[0].equals(splittedData[this.repeatIsEqual]) ) {
                this.repeatIsEqual++;
                            
            }
            if (this.repeatIsEqual.equals(splittedData.length)){
                return j;
            }
        }
        return 0L;      
    }
        
    
}
