package think.polymorphism.music3;


public class Music {
    public static void tune(Instrument i){ i.play(Note.MIDDLE_C); }
    public static void tuneAll(Instrument e[]){
        for (Instrument i:e) {
            tune(i);
        }
        }
    public static void main(String args[]){
        Instrument orchestar []= {new Instrument(),



        new Instrument(),
                new Wind(),
                new newInstrument()
    };
    tuneAll(orchestar);
}
}