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

    //acceleration components
    public double verticalAcceleration(){
        return Math.sin(acceleration);
    }
    public double horizontalAcceleration(){
        return Math.cos(acceleration);
    }

    //dropping simulation
    public void drop(){
        if(height == 0){
            System.out.println("Ball has reached the ground: 0s.");
        }
        else{
            double velocity = 0;
            while(height != 0){
                velocity += Environment.time * Environment.gravity;
                height -= velocity;
                Environment.time++;
            }
            System.out.println("Ball has reached the ground: " + Environment.time + "s.");
            velocity = 0;
            Environment.time = 0;
        }
    }

    public void roll(double angle, double length){
        double horizontalAcc = Environment.gravity * Math.cos(angle);   //horizontal acceleration
        double normal = Environment.gravity * Math.sin(angle);          //normal force
        this.height = Math.sin(angle) * length;                         //height of object

        //force loss due to friction
        double frictionLoss = -(normal * frictionCoefficient);

        //f = ma


        while(height > 0 ){
            velocity += horizontalAcc;
        }
    }
}
