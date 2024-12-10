public class Example2 {
   
   public static void main(String[] args) {
      int a = 20;
      int b = 16;
      int c = minFunction(a, b);
      System.out.println("Minimum Value = " + c);
   }

   @Override
public String toString() {
	return "Example2 [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
			+ "]";
}

/** returns the minimum of two numbers */
   public static int minFunction(int n1, int n2) {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min; 
   }
}
