public class U1 extends Rocket{

    public U1(){
        super(100, 10, 18, 0.05, 0.01);
    }

    public boolean land(){
        if(Math.random() > super.getProb()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean launch(){
        if(Math.random() > super.getProb()){
            return true;
        }
        else{
            return false;
        }
    }

    public void carry(Item item){
        super.carry(item);
    }

    public boolean canCarry(Item item){
        return super.canCarry(item);
    }

    public void u1specific(){

    }
}
