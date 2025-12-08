package Day5.Ch1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadInputFile{
    private File inputFile;
    ArrayList<String> listOfRanges;
    ArrayList<String> listOfNumber;

    public ReadInputFile(String fileName){
        inputFile = new File(fileName);    
    }

    public ArrayList<String> scanFile(){
        try (Scanner reader=new Scanner(this.inputFile)){
            ArrayList<String>  values =new ArrayList<String>(mapFileToListOfjoltage(reader));
            return values;
        }catch (FileNotFoundException e ){
            System.out.print(e);
            return null;
        }
    }

    private ArrayList<String> mapFileToListOfjoltage(Scanner file){
        listOfRanges= new ArrayList<String>();
        listOfNumber = new ArrayList<String>();
        do{
            listOfRanges.addAll(Arrays.asList(file.nextLine().split("-")));
        }while (listOfRanges.getLast()!="");
        listOfRanges.removeLast();
        while (file.hasNextLine()){
            listOfNumber.add(file.nextLine());
        }
        return listOfRanges;
    }

    public ArrayList<String> listOfNumber(){
        return listOfNumber;
    }
}