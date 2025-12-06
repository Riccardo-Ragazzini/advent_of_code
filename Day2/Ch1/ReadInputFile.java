package Day2.Ch1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadInputFile{
    private File inputFile;

    public ReadInputFile(String fileName){
        inputFile = new File(fileName);    
    }

    public ArrayList<String[]> scanFile(){
        try (Scanner reader=new Scanner(this.inputFile)){
            ArrayList<String[]>  values =new ArrayList<String[]>(mapFileToListOfRange(reader));
            return values;
        }catch (FileNotFoundException e ){
            System.out.print(e);
            return null;
        }
    }

    private ArrayList<String[]> mapFileToListOfRange(Scanner file){
        ArrayList<String[]> array = new ArrayList<String[]>();
        
        while (file.hasNextLine()){
            String[] line=(file.nextLine().split(","));
            for (String i :line){
                array.add(i.split("-"));
            }
        }
        return array;
    }

}