package kata;

public class SquareDigit {

    public static void main(String[] args){
        System.out.println(SquareDigit.squareDigits(456));
    }

    public static int squareDigits(int n) {
        String strN = String.valueOf(n);
        String sumString = "";
        for(int i = 0; i < strN.length(); i++){
            sumString += (int) Math.pow(Character.getNumericValue(strN.charAt(i)), 2) ;
        }

        return Integer.valueOf(sumString);
    }

}
