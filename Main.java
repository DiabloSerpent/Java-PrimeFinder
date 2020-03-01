import java.util.Scanner;
import java.util.ArrayList;
//It took this program 1 minute & 14 seconds to find
//all primes below 100000000 (print time ignored).


//After testing in a personal repl, I found out it takes
//3-4 minutes to find all primes below 100000000.

//This seems to suggest that the repl.it classroom java
//compiler thingy is for some reason faster than a
//normal repl.

//Another test here ran only 1:16, about the same as the
//original, so maybe connection strength plays into this
//as well. That's kind of annoying.

/*I have now sacrificed this program to the Git gods, to
see if I could make a Github repo for a repl.it project
without having to make a new repl and delete the save
history (on repl.it).
*/

class Main {
  public static void main(String[] args) {
    Scanner noReader = new Scanner(System.in);
    int halfway; boolean isPrime;
    System.out.println("Input the value to search for primes below");
    final int StopAt = noReader.nextInt();
    ArrayList<Integer> primes = new ArrayList<Integer>();

    if(StopAt > 2) primes.add(2);
    for(int testValue = 3; testValue < StopAt; testValue++){
      halfway = (int) Math.sqrt(testValue);
      isPrime = true;
      for(int potFactor : primes){
        if(potFactor > halfway) break;
        if(testValue % potFactor == 0){
          isPrime = false;
          break;
        }
      }
      if(isPrime) primes.add(testValue);
    }

    System.out.println("Done!");
    noReader.close();
    //for(int no : primes) System.out.println(no);
  }
}
