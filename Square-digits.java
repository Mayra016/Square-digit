public class SquareDigit {

  static int squareDigits(int n) {
        String nString = Integer.toString(n);
        Integer numLength = nString.length() - 1;
        Integer i = 0;
        Integer result = 0;
        String resultString ="";
    
        while (i <= numLength) {
            
            char number = Integer.toString(n).charAt(i);
            i = i + 1;
            int num = Integer.parseInt(String.valueOf(number));  
            Integer resultSquare = num * num;
            //numbers[].append(result);
            String resultSquareString = Integer.toString(resultSquare);
            resultString = resultString + resultSquareString;
            
            //numbers[] = addNumber(numLength, numbers, result);
            System.out.println(result);
        }
        
        result = Integer.parseInt(resultString);
        return result;
   }
}
