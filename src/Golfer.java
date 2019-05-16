import java.util.Scanner;

public class Golfer {
    public String  name;
    public int     age;
    private int    score;
    Club[]         bag;

    public Golfer(){
        score = 0;
    }

    public void setScore(int x){
        this.score = x;
    }

    public void incScore(int x){
        Scanner input = new Scanner(System.in);
        System.out.println("What was your score from the last hole? ");
        this.setScore(this.score + input.nextInt());
        System.out.println("Your current score is: " + this.score);
    }

}
