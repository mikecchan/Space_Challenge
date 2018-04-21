public class U2 extends Rocket{

    public U2(){
        super(120, 18, 29, 0.04, 0.08);
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

    public void thisisu2(){

    }
}
