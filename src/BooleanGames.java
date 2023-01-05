import java.util.ArrayList;

public class BooleanGames {
    private int number;

    public BooleanGames(int number)
    {
        this.number = number;
    }

    /* Returns true if the instance variable, number, is negative;
       returns false otherwise
     */
    public boolean isNegative()
    {
        return (number < 0);
    }

    /* Returns true if the instance variable, number, is greater than num
     */
    public boolean exceeds(int num)
    {
        return number > num;
    }

    /* Returns true if the instance variable, number, is even;
       returns false otherwise
     */
    public boolean isEven()
    {
        return number%2 == 0;
    }

    /* Returns true if the instance variable, number, is odd; returns false
       otherwise; needs to be able to handle case when number is negative
     */
    public boolean isOdd()
    {
        return number%2 != 0;
    }

    /* Returns true if the instance variable, number, is a multiple of x;
       returns false otherwise
     */
    public boolean isMultipleOf(int x)
    {
        return number%x == 0;
    }

    /* Returns true if the ones digit of the instance variable, number, is equal
       to num; e.g. if number is 437, then isOnesDigit(7) would return true and
       isOnesDigit(5) would return false; needs to be able to handle case when
       number is negative, so if the number is -123, then isOnesDigit(3) should
       return true.

       PRECONDITION:  num >= 0
     */
    public boolean isOnesDigit(int num)
    {
        return Math.abs(number%10) == num;
    }

    public boolean isFirstDigit(int num){
        int numberTemp = Math.abs(number);
        String s = Integer.toString(numberTemp);
        ArrayList<String> numberDigits = new ArrayList<>();
        for(int i = 0;i < s.length();i++){
            numberDigits.add(s.substring(i,i+1));
        }
        String firstDigitString = numberDigits.get(0);
        int firstDigit = Math.abs(Integer.parseInt(firstDigitString));
        return firstDigit == num;
    }


}
