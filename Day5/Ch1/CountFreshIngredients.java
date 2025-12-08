package Day5.Ch1;

import java.util.ArrayList;

public class CountFreshIngredients {
    String filename;
    Integer freshProductCounter=0;
    ReadInputFile file;
    ArrayList<String> rangeList;
    ArrayList<String> productList;


    public CountFreshIngredients(String filename){
        this.filename = filename;
    }

    public Integer countFresh(){
        file = new ReadInputFile(filename);
        rangeList = new  ArrayList<String>(file.scanFile());
        productList = new  ArrayList<String>(file.listOfNumber());
        for(String e:productList){
            if(isInRange(e)){
                freshProductCounter++;
            }
        }
        return freshProductCounter;
    }

    private boolean isInRange(String e){
        for (int i=0;i<rangeList.size();i+=2){
            if ((Long.parseLong(rangeList.get(i))<=Long.parseLong(e)) && (Long.parseLong(e)<=Long.parseLong(rangeList.get(i+1)))){
                return true;
            }
        }
        return false;

    }
      
}
