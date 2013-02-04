
/* Simulation of console-I/O program BirthdayProblemDemo,
   using ConsoleApplet as a basis.  See the file
   ConsoleApplet.java for more information.
   
   David Eck
   eck@hws.edu
   
*/

public class BirthdayProblemConsole extends ConsoleApplet {

   protected String getTitle() {
      return "Sample program \"Birthday Problem Demo\"";
   }

   protected void program() {

       /*
          How many random people do you have to select before you find
          a duplicate birthday (that is, two peole who were born on the
          same day of the same month, but not necessarily in the same
          year).  This program simulates the process.  (It ignores the
          possibility of people born on leap day.)
       */
       
       console.putln("This program simulates taking people at random");
       console.putln("until two have been found who were born on the");
       console.putln("same day of the year.\n");
       
       do {
          birthdayProblem();
          console.put("\nAgain? ");
       } while ( console.getlnBoolean() );
       
       console.putln("\n\nOK.  Goodbye.");
       
   }

   void birthdayProblem() {
          // Simulate choosing people at random and checking the
          // day of the year they were born on.  If the birthday
          // is the same as one that was seen previously, stop,
          // and output the number of people who were checked.

      boolean[] used;  // For recording the possible birthdays
                       //   that have been seen so far.  A value
                       //   of true in used[i] means that a person
                       //   whose birthday is the i-th day of the
                       //   year has been found.

      int count;       // The number of people who have been checked.

      used = new boolean[365];  // Initally, all entries are false.
      
      count = 0;

      while (true) {
             // Select a birthday at random, from 0 to 364.
             // If the birthday has already been used, quit.
             // Otherwise, record the birthday as used.
         int birthday;  // The selected birthday.
         birthday = (int)(Math.random()*365);
         count++;
         if ( used[birthday] )
            break;
         used[birthday] = true;
      }

      console.putln("A duplicate birthday was found after " 
                                                + count + " tries.");

   } // end birthdayProblem()
 

}
