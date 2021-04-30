package think.polymorphism.music3;

 class Instrument {
    public void play(Note n){
        System.out.println("Instrument.play()");
    }
     String what() {
         return "Instrument";
     }
     void adjust(){
         System.out.println("Adjusting Instrument");
     }
     @Override

     public String toString(){
         return what();
     }
}
