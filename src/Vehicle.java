public class Vehicle {
    double speed;
    int power;
    void brake(){
        this.speed=0;
    }
    void speedDown(int d) {
        speed = speed - d;
    }
    void setPower(int p){
        power=p;
    }
int getPower(){
        return power;
}
double getSpeed(){
        return speed;
}
}
