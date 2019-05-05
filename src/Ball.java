public class  Ball extends Object {

    //member variables
    private double velocity;
    private double acceleration;

    //constructor
    public Ball(){
        velocity = 0;
        frictionCoefficient = 0;
        height = 0;
        mass = 0;
        numSides = 0;
        sideLength =  0;
        angle =  0;
        x = y = 0;
    }

    //overridden abstract methods
    @Override
    public double kineticEnergy() {
        return ((mass * (Math.pow(velocity,2)))/2);
    }

    @Override
    public double potentialEnergy() {
        return (mass * Environment.gravity * height);
    }

    //class methods
    public double totalEnergy(){
        return potentialEnergy() + kineticEnergy();
    }

    public double verticalAcceleration(){
        return Math.sin(acceleration);
    }
    public double horizontalAcceleration(){
        return Math.cos(acceleration);
    }
}
