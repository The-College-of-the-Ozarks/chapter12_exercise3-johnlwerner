import java.util.Scanner;
class Main {   
   public static void main(String[] args) 
   {  
      final int QUARTS_IN_GALLON = 4;
      int quartsNeeded = 18;
      int gallonsNeeded;
      int extraQuartsNeeded;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter quarts needed >> ");
     while (true){
        
     try
      {
      quartsNeeded = input.nextInt();
      }

     catch(Exception e)
        {
          System.out.println("Exception occurred");
          input.nextLine();
          continue;
        }
        break;
      }
      gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
      extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
      System.out.println("A job that needs " + quartsNeeded +
         " quarts requires " + gallonsNeeded + " gallons plus " +
         extraQuartsNeeded + " quarts.");
   }

  
}