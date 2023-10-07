//Demonstrate  multiple catch statements .

class MultiCatch {
    public static void main (String args[]){
      try{

   		int a = args.length;
   		System.out.println("No Of Arguments = " +  a);
   		int b =  42 / 2;//Could generate Divide by Zero exception.

   		int c[ ] = { 1 }; //array initialized with size 1
   		c[42] = 99;//Generate Array Out Of Bound exception.

      }
      catch (ArithmeticException e){
          System.out.println("Divide by 0 exception." );

      }
      catch (RuntimeException e){
           System.out.println("Array index is out of bounds exception.");

      }
      finally {
          System.out.println("close db");
      }


   }

}



