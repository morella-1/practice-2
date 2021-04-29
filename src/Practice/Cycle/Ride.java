package Practice.Cycle;

public class Ride {
    public static void ride(Cycle cycle){
        cycle.play();
    }
    public static void main(String[] args){
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        ride(unicycle);
        ride(bicycle);
        ride(tricycle);
           }
}


