public class U2 extends Rocket{

    public U2(){
        super(120, 18, 29, 0.04, 0.08);
    }

    public boolean land(){
        //System.out.println("U2 / land()");
        if(Math.random() > super.getProb()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean launch(){
        //System.out.println("U2 / launch()");
        if(Math.random() > super.getProb()){
            return true;
        }
        else{
            return false;
        }
    }
}
