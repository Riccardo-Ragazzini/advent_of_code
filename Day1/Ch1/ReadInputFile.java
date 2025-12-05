package Day1.Ch1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReadInputFile{
    private File inputFile;

    public ReadInputFile(String fileName){
        inputFile = new File(fileName);    
    }

    public Map<Integer,String> scanFile(){
        try (Scanner reader=new Scanner(this.inputFile)){
            Map<Integer,String>  values =new HashMap<>(mapFileLineByIndex(reader));
            return values;
        }catch (FileNotFoundException e ){
            System.out.print(e);
            return null;
        }
    }

    private Map<Integer,String> mapFileLineByIndex(Scanner file){
        Integer i = 0;
        Map<Integer,String> map = new HashMap<>();
        while (file.hasNextLine()){
            map.put(i, file.nextLine());
            i++;
        }
        return map;
    }

}