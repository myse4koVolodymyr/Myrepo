
public class Main {
    public static void main(String[] args)  {
     double x = 0.335;
     double y = 0.025;

     double s = 1 + x + x*x / 2 + x*x*x / 6 + x*x*x*x / 24;
     double f = x * (Math.sin(x*x*x) + Math.pow(Math.cos(y),2));

     System.out.println("S = " + s);
     System.out.println("F = " + f);
    }
}
