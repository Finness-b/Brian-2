import java.util.Scanner;
public class TriangleAreaCalculator {  
  public double ComputeArea(double base, double height){
    double area = 0.5 * base * height;
    return area;  
  }
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.println("Enter the base of the triangle: ");
   double base = input.nextDouble();

   System.out.println("Enter the height of the triangle: ");
   double height = input.nextDouble();


   TriangleAreaCalculator compute = new TriangleAreaCalculator();
   double area = compute.ComputeArea(base, height); 
   System.out.println("The area of the triangle is: " + area);
   }
}
  