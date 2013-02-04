
/* A trivial console applet that reads two
   numbers and prints their product.
*/
// dummy change by Hans-Peter Hoellwirth

public class PrintProduct extends ConsoleApplet {

   public void program() {

      double x,y;   // Numbers input by the user.
      double prod;  // The product, x*y.

      console.put("What is your first number?  ");
      x = console.getlnDouble();
      console.put("What is your second number? ");
      y = console.getlnDouble();

      prod = x * y;
      console.putln();
      console.put("The product is ");
      console.putln(prod);

   } // end program()

} // end class PrintProduct
