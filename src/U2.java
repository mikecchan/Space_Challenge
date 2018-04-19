public class U2 extends Rocket{

    public U2(){
        super(120, 18, 29, 0.04, 0.08);
    }

    @Override
    public boolean land(){

        return true;
    }

    @Override
    public boolean launch(){

        return true;
    }

    public void carry(Item item){
        super.carry(item);
    }

    public boolean canCarry(Item item){
        return super.canCarry(item);
    }
}
