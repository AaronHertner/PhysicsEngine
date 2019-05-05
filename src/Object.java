public abstract class Object {

    //member variables
    protected int numSides;
    protected double sideLength;
    protected float frictionCoefficient;
    protected double mass, height, angle;

    //keep track of the objects position in 2D space
    public int x, y;

    //getters and setters
    public float getFriction(){return frictionCoefficient; }
    public double getMass(){return mass; }
    public double getHeight(){return height; }

    public void setFriction(float x){
        this.frictionCoefficient = x;
    }
    public void setMass(double x){
        this.mass = x;
    }
    public void setHeight (double x){
        if(x >= 0) {
            this.height = x;
        }
    }
    public void setAngle(double x){
        if(x <= 90 && x >= 0) {
            this.angle = x;
        }
    }

    //abstract methods
    public abstract double kineticEnergy();
    public abstract double potentialEnergy();
}
