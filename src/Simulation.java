import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Simulation {

    private ArrayList<Item> item_array = new ArrayList<Item>();

    public ArrayList<Item> loadItems(String fileName){

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

            habitat=3000
            colony=5000
            food=5000
            habitat=3000
            colony=5000
            food=3000
            colony=5000
            food=3000
         */

        try {

            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;

            Item item = new Item();
            String [] line_array;

            while((line = bufferedReader.readLine()) != null) {
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

    public ArrayList<Rocket> loadU1(ArrayList<Item> item_array){

        ArrayList<Rocket> arrayList = new ArrayList();
        U1 U1_unit = new U1();

        for(Item i: item_array){
            if(U1_unit.canCarry(i)){
                U1_unit.carry(i);
            }
            else{
                arrayList.add(U1_unit);
                U1_unit = new U1();
            }
        }
        return arrayList;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> item_array){
        ArrayList<Rocket> arrayList = new ArrayList<>();
        U2 U2_unit = new U2();
        //U2 has access to U2 methods and Rocket methods.
        //Rocket u2 = new U2();
        //Rocket thus only has access to Rocket methods, not subclasses.

        for(Item i: item_array){
            if(U2_unit.canCarry(i)){
                U2_unit.carry(i);
            }
            else{
                arrayList.add(U2_unit);
                U2_unit = new U2();
            }
        }
        return arrayList;
    }

    public double runSimulation(ArrayList<Rocket> rocket_list){

        double total_budget = 0;

        for(int i=0; i<rocket_list.size(); i++){
            Rocket r = rocket_list.get(i);
            total_budget += r.getCost();
            if(!r.launch() || !r.land()){
                i--;
            }

        }
        return total_budget;
    }

}
