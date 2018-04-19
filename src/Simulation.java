import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Simulation {

    private ArrayList<Item> item_array = new ArrayList<Item>();

    public ArrayList<Item> loadItems(){
        String fileName = "phase-2.txt";

        /*
        Text has...
            building tools=2000
            building tools=2000
            building tools=2000
            building tools=5000
            building tools=5000
            building tools=2000
            building tools=1000
            building tools=5000
            building tools=6000
            shelter equipment=5000
            construction equipment=5000
            plants=1000
            steel=8000
            books=1000
            water=5000
         */

        try {
            // FileReader reads text files in the default encoding.

            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            Item item = new Item();
            String [] line_array;

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                //TODO: split the string between the item and the weight

                line_array = line.split("=");
                item.setName(line_array[0]);
                item.setWeight(Integer.parseInt(line_array[1]));
                item_array.add(item);
                line_array = null;

            }
            item = null;

            // Always close files.
            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println( "Unable to open file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println( "Error reading file '" + fileName + "'");
        }

        return item_array;
    }

    public ArrayList<Item> loadU1(){

        return ;
    }

    public readFile(){

    }
}
