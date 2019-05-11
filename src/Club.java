import java.util.Scanner;

public class Club {

    //member variables
    private double mass;

    Club(double mass){
        this.mass = mass;
    }

    public double getMass(){return this.mass;}

    public double swingStrength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How fast do you hit the ball (m/s)? ");
        double velocity = sc.nextDouble();
        return velocity * mass;
    }
}
