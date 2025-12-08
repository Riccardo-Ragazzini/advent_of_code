package Day4.Ch2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ReadInputFile{
    private File inputFile;
    private int lineLength;

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
        ArrayList<String> array = new ArrayList<String>();
        while (file.hasNextLine()){

            array.addAll(Arrays.asList(file.nextLine().split("")));
        }
        return array;
    }
    public int getLineLength(){
        return lineLength;
    }
}