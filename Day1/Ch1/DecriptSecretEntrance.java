package Day1.Ch1;

import java.util.HashMap;
import java.util.Map;

/*this class need the file name (or the path of the input file) and the starting dialvalue*/


public class DecriptSecretEntrance{
    private String filename;
    private Integer dialValue;
    private Integer zeroCounter=0;
    private String directionFromFile;
    private String numberFromFile;

    public DecriptSecretEntrance(String filename,Integer dialValue){
        this.filename = filename;
        this.dialValue = dialValue;
    }

    public void decriptLines(){
        ReadInputFile file = new ReadInputFile(filename);
        Map<Integer,String> map = new HashMap<>(file.scanFile());
        Integer index = 0;
        while (map.containsKey(index)){
            this.decript(map.get(index));
            this.countZeros();
            index=index+1;
            
        }
    }

    private void decript(String line){
        this.directionFromFile = line.substring(0, 1);  
        this.numberFromFile  = line.substring(1);
    
        if (this.directionFromFile.equals("L")){
            this.moveLeft();
        }else if (directionFromFile.equals("R")){
            this.moveRight();
        }
        this.zeroCounter+=Integer.parseInt(this.numberFromFile)/100;
    }

    private void moveRight(){
        this.dialValue = this.dialValue + (Integer.parseInt(this.numberFromFile) % 100);
        if (this.dialValue ==100){
            this.zeroCounter--;
        }
        if(this.dialValue > 99){
            this.dialValue-=100;
            this.zeroCounter++;
        }
    }

    private void moveLeft(){
        this.dialValue=this.dialValue-(Integer.parseInt(this.numberFromFile)%100);
        if (this.dialValue==-100 || this.dialValue==-Integer.parseInt(this.numberFromFile)%100){
            this.zeroCounter--;
        } 
        if (this.dialValue<0){
            this.dialValue+=100;
            this.zeroCounter++;
        }
    }
    private void countZeros(){
        if (this.dialValue.equals(0)){
            this.zeroCounter++;
        }
    }

    public Integer getZeroCounter(){
        return this.zeroCounter;
    }
     
    
}