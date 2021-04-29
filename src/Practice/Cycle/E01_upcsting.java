package Practice.Cycle;

public class E01_upcsting {
    public static void ride(Cycle c){
        System.out.println("车轮子数为："+c.wheels());
    }
    public static void main(String[] args){
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        ride(new Cycle());//Upcast
        ride(new Unicycle());//Upcast
        ride(new Bicycle());//Upcast
        ride(new Tricycle());//Upcast
    }
}



