import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        Simulation simulation = new Simulation();

        ArrayList<Item> items = new ArrayList<Item>();

        items = simulation.loadItems("phase-1.txt");

        System.out.println("For U1 rockets, it costed: " + simulation.runSimulation(items));

        items.clear();

        items = simulation.loadItems("phase-2.txt");

        System.out.println("For U2 rockets, it costed: " + simulation.runSimulation(items));
    }
}
