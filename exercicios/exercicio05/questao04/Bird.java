package questão04;
//Código antigo:
/*
abstract class Bird {
    public abstract void setLocation(double longitude, double latitude);
    public abstract void setAltitude(double altitude);
    public abstract void draw();
    
    public abstract boolean isFlightless(); 


void ArrangeBirdInPattern(Bird aBird) {
    if (aBird.isFlightless()) {
        ArrangeBirdOnGround(aBird);
    } else {
        ArrangeBirdInSky(aBird);
    }
}

void ArrangeBirdOnGround(Bird bird) {
    //
}

void ArrangeBirdInSky(Bird bird) {
    // 
}
}
*/
//Correção

abstract class Bird {
    public abstract void draw();
    public abstract void setLocation(double longitude, double latitude);
}

class FlightfulBird extends Bird {
    private FlightfulBehavior flightfulBehavior;

    public FlightfulBird(FlightfulBehavior flightfulBehavior){
        this.flightfulBehavior = flightfulBehavior;
    }
    @Override
    public void draw() {
        // 
    }

    @Override
    public void setLocation(double longitude, double latitude) {
        // 
    }
    
    public void setAltitude(double altitude) {
        // 
    }
    public void fly(){
        flightfulBehavior.fly();
    }
}


