public class U1 extends Rocket{

    public U1(){
        super(100, 10, 18, 0.05, 0.01);
    }

    public boolean land(){
        //System.out.println("U1 / land()");
        if(Math.random() > super.getProb()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean launch(){
        //System.out.println("U1 / launch()");
        if(Math.random() > super.getProb()){
            return true;
        }
        else{
            return false;
        }
    }
}
