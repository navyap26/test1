
public class RubberBall implements Comparable<RubberBall> {
  private String color;
  private int diameter;

  public RubberBall(String color, int diameter) {
    this.color = color;
    this.diameter = diameter;
  }

  @Override
  public int compareTo(RubberBall ball) {

    return (ball.diameter - this.diameter);

  }
  
  public static boolean testCompareTo () {
    RubberBall b1 = new RubberBall("red", 3);
    RubberBall b2 = new RubberBall("orange", 5);
   
    if (b1.compareTo(b2) < 0 || b1.compareTo(b2) == 0 || b2.compareTo(b1) > 0) {
      return false;
    }
    
    return true;
    
  }
  
  public static void main(String[] args) {
    System.out.println(testCompareTo());
  }
}
