public class Rocket implements SpaceShip{

    private int cost;
    private int weight;
    private int max_weight;
    private double explosion_prob;
    private double crash_prob;

    public Rocket(int cost, int weight, int max_weight, double explosion_prob, double crash_prob) {
        this.cost = cost;
        this.weight = weight;
        this.max_weight = max_weight;
        this.explosion_prob = explosion_prob;
        this.crash_prob = crash_prob;
    }

    public double getProb(){
        return this.explosion_prob * (this.weight/this.max_weight);
    }

    public boolean launch(){
        return true;
    }

    public boolean land(){
        return true;
    }

    public boolean canCarry(Item item){
        if(item.getWeight() < this.max_weight){
            return true;
        }
        else{
            return false;
        }
    }

    public void carry(Item item){
        this.weight += item.getWeight();
    }

    public double getCost(){
        return this.cost;
    }
}
