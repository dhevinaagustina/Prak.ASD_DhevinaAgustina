package Jobsheet10.ScavangerHunt.TugasNo2;

public class Node {
    String question;
    String answer;
    Node nextPoint;
    Node prevPoint;

    public Node(String question, String answer){
        this.question = question;
        this.answer = answer;
        this.nextPoint = null;
        this.prevPoint = null;
    }

    
}
