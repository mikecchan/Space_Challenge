import java.util.ArrayList;

public class Main {

    public static void main(String args[]){

        Simulation simulation = new Simulation();

        System.out.println("Trying with Phase 1");

        ArrayList<Item> items = simulation.loadItems("phase-1.txt");

        ArrayList<Rocket> rockets = simulation.loadU1(items);

        System.out.println("For U1 rockets, it costed: " + simulation.runSimulation(rockets));

        items.clear();

        rockets.clear();

        System.out.println("Trying with Phase 2");

        items = simulation.loadItems("phase-2.txt");

        rockets = simulation.loadU2(items);

        System.out.println("For U2 rockets, it costed: " + simulation.runSimulation(rockets));
    }
}
