package Day4.Ch2;

import java.util.ArrayList;

public class AvailableRolls {
    String filename;
    Integer ValidrollsCounter=0;
    ReadInputFile file;
    ArrayList<String> diagram;

    public AvailableRolls(String filename){
        this.filename = filename;
    }
    public Integer control(){
        file = new ReadInputFile(filename);
        diagram = new  ArrayList<String>(file.scanFile());
        Integer older=0;
        this.controlRolls();
        while (older<ValidrollsCounter){
            older=ValidrollsCounter;
            controlRolls();
            
        };
        return ValidrollsCounter;

    }
    public void controlRolls(){

        for (int i=0;i<diagram.size();i++){
            if (diagram.get(i).equals("@")){
                if (this.nearlyRollsCheck(i)){
                    this.ValidrollsCounter++;
                    this.diagram.set(i,".");
                }
            }
            
        }   
    }       
    private boolean nearlyRollsCheck(int position) {
        int counter=0;
        for (int x=-136;x<137;x=x+136){
            for (int y=-1;y<2;y++){

                if(position+x+y>=0 && position+x+y<=diagram.size()-1){
                    if(position%136==0 && y==-1){
                        
                    }else{
                        if(position%136==135 && y==1){

                        }else{
                            if (diagram.get(position+x+y).equals("@")){
                                counter++;
                            }
                        }
                    }
                }
            }
        }
        counter--;
        if (counter<4){
            return true;
        }
        return false;
    }
}
