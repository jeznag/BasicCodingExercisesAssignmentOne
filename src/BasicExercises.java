import java.util.ArrayList;

/**
 * Assignment 2 from TWU part 1
 **/

public class BasicExercises {

    public static void main(String[] args){

    }

    public void easiestExerciseEver(){
        System.out.println("*");
    }

    public void horizontalLine(int lineLength){
        for (int i = 0; i < lineLength; i++)
            System.out.print("*");
        System.out.print("\n");
    }


    public void verticalLine(int lineLength){
        for (int i = 0; i < lineLength; i++)
            System.out.println("*");
    }


    public void rightTriangle(int height){
        for (int i = 0; i < height; i++) {
            horizontalLine(i + 1);
        }
    }

    public void isoscelesTriangle(int height){
        for (int i = 0; i < height; i++) {
            horizontalLine(1 + (2 * i));
        }
    }

    public void diamond(int height){
        isoscelesTriangle(height);
        for (int i = height - 1; i > 0; i--) {
            horizontalLine((2 * i) - 1);
        }
    }


    public void diamondName(int height, String name){
        isoscelesTriangle(height - 1);
        System.out.println(name);
        for (int i = height - 1; i > 0; i--) {
            horizontalLine((2 * i) - 1);
        }
    }

    public void fizzBuzz(){
        for (int i = 1; i < 101; i++){
            String output = "";
            if (i % 3 == 0)
                output += "Fizz";
            if (i % 5 == 0)
                output += "Buzz";

            System.out.println(output.length() == 0 ? i : output);
        }
    }

    public String getPrimeFactors(int number){

        Object[] primeFactors = getPrimeFactorsArray(number);
        if (primeFactors == null)
            return "";
        String primeFactorString = "";
        for (Object factor : primeFactors){
            primeFactorString += factor + ",";
        }

        String primeFactorStringWithoutTrailingComma = primeFactorString.substring(0, primeFactorString.length() - 1);

        return primeFactorStringWithoutTrailingComma;
    }

    private Object[] getPrimeFactorsArray(int number){
        if (number == 1)
            return null;
        if (number == 2)
            return new Object[] {1,2};

        ArrayList<Integer> preDiscoveredPrimes = new ArrayList<Integer>();

        for (int i = 2; i < number; i++){
            if (number % i != 0)
                continue;

            boolean okToAddPrime = true;

            for (int alreadyDiscoveredPrime : preDiscoveredPrimes) {
                if (i % alreadyDiscoveredPrime == 0) {
                    okToAddPrime = false;
                    break; //has a prime factor. E.g. 4 has 2 as a prime factor so it's not a prime
                }
            }
            if (okToAddPrime)
                preDiscoveredPrimes.add(i);
        }
        return preDiscoveredPrimes.toArray();
    }

}