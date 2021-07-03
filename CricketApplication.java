
package CricketApplication;


public class CricketApplication {
    
      public static void main(String[] args) {
        RightHand righthand1=new RightHand();
        righthand1.useHand();
        System.out.println(righthand1.noofFingers);
        LeftHand lefthand1=new LeftHand();
        lefthand1.useHand();
        System.out.println(lefthand1.noofFingers);
        
        Bowler bowler=new Bowler();
        bowler.bowl();
        
        BatsMan batsman=new BatsMan();
        batsman.bats();
    }
}
