package Numbers;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {
		int a = 1, b = 1, c = 1;
        findRoots(a, b, c);
	}
	
	static void findRoots(int a, int b, int c)
    {
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }
 
        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));
 
        if (d > 0) {
            System.out.println("Roots are real and different ");
           
            double root1 = (double)(-b + sqrt_val) / (2 * a);
            double root2 = (double)(-b - sqrt_val) / (2 * a);
            System.out.println(root1 + " "+root2);
            }
        else if (d == 0) {
            System.out.println("Roots are real and same ");
            double root1 = -(double)b / (2 * a);
            double root2 = -(double)b / (2 * a);
            System.out.println(root1 + "\n"+root2);
        }
        else // d < 0
        {
            System.out.println("Roots are complex ");
 
            System.out.println(-(double)b / (2 * a) + " + i"+ (sqrt_val)/(2*a) + "\n"+
                               -(double)b / (2 * a) + " - i" + (sqrt_val)/(2*a));
        }
    }

}
