
/* Simulation of console-I/O program ThreeN2,
   using ConsoleApplet as a basis.  See the file
   ConsoleApplet.java for more information.
   
   David Eck
   eck@hws.edu
   
*/

public class ThreeN2Console extends ConsoleApplet {

   protected String getTitle() {
      return "Sample program \"ThreeN2\"";
   }

   protected void program() {

		   /*
		       A program that computes and displays several 3N+1
		       sequences.  Starting values for the sequences are
		       input by the user.  Terms in a sequence are printed
		       in columns, with five terms on each line of output.
		       After a sequence has been displayed, the number of
		       terms in that sequence is reported to the user.
		   */

      console.putln("This program will print out 3N+1 sequences");
      console.putln("for starting values that you specify.");
      console.putln();
      
      int K;   // Starting point for sequence, as specified by the user.
      do {
         console.putln("Enter a starting value;");
         console.put("To end the program, enter 0: ");
         K = console.getInt();   // get starting value from user
         if (K > 0)          // print sequence, but only if K is &gt; 0
            Print3NSequence(K);
      } while (K > 0);       // continue only if K > 0

   } // end main();
   
   
   void Print3NSequence(int startingValue) {

         // Prints a 3N+1 sequence to standard output, using
         // startingValue as the initial value of N.  Terms are
         // printed five to a line.  The subroutine also
         // prints the number of terms in the sequence.
         // The value of startingValue must be a positive integer.

      int N;       // One of the terms in the sequence.
      int count;   // The number of terms found.
      int onLine;  // The number of terms that have been output
                   //     so far on the current line.
      
      N = startingValue;   // Start the sequence with startingValue;
      count = 1;           // We have one term so far.

      console.putln("The 3N+1 sequence starting from " + N);
      console.putln();
      console.put(N, 8);  // Print initial term of sequence, using 8 characters.
      onLine = 1;        // There is now 1 term on the current output line.

      while (N > 1) {
          N = nextN(N);  // compute next term
          count++;   // count this term
          if (onLine == 5) { // if current output line is full
             console.putln();  // then output a carriage return
             onLine = 0;   // and note that there are no terms on the new line
          }
          console.put(N, 8);  // print this term in an 8-character column
          onLine++;   // add 1 to record of number of terms on this line
      }

      console.putln();  // end current line of output
      console.putln();  // and then add a blank line
      console.putln("There were " + count + " terms in the sequence.");

   }  // end of Print3NSequence()
   
   
   int nextN(int currentN) {
          // Computes and returns the next term in a 3N+1 sequence,
          // given that the current term is currentN.
       if (currentN % 2 == 1)
          return 3 * currentN + 1;
       else
          return currentN / 2;
   }  // end of nextN()
   
   
}  // end class ThreeN2Console
