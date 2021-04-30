package think.polymorphism.music3;
public class Wind extends Instrument{
    @Override//重写接口方法
    //Redefine interface method:
    public void play(Note n){
        System.out.println("Wind.play()"+n);
    }
    @Override
    String what(){
        return "Wind";
    }

    void adjust(){
        System.out.println("Adjusting Wind");
    }

}



