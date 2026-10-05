public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return double (t1 + t2 + t3 + t4/4.0);
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int) (average + 0.5)
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
         if (average < 65) {
            return false;
         }
            if (average > 65) {}
          return true;
        }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return (shares *= price);
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        if (totalStock < 0) {
            return (int) (totalStock - 0.5);
        }
          if (totalStock < 0) {}
            return (int) (totalStock + 0.5);
          }
         

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        int newNum = (int)Math.round(userDouble * 100);
        int result = 0;
        int place = 1;
        for (int i = 0; i<5; i++) {
            int digit = (newNum % 10);
            newNum /= 10;
            result += ((digit + 1 ) % 10) * place;
            place *= 10;
            return newNum /= 100;
        return 0.0
    

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(12.90));
        //23.01
    }

}
