package kata;

public class Kata {


    public static void main(String[] args) {
       /* String phrase = "abracadabra";
        String phraseVowel = "This website is for losers LOL!";
        System.out.println(getCount(phrase));
        System.out.println(removeVowel(phraseVowel));

        System.out.println(sum(new int[]{1,2,3,4,5}));
        System.out.println(reverseString("world")); */

        String strList = "-1 -1";
        System.out.println(highAndLow(strList));
    }

    public static String highAndLow(String numbers) {

        String[] newStringNumber = numbers.split(" ");

        int[] intListNumber = new int[newStringNumber.length];

        int max = 0;
        for(int i = 0; i < newStringNumber.length; i++){
            intListNumber[i] = Integer.valueOf(newStringNumber[i]);

            if(i == 0){
                max = intListNumber[i];
            };

            if( intListNumber[i] > max){
                max = intListNumber[i];
            }
        }

        int min = max;
        for(int i = 0; i < newStringNumber.length; i++){

            if(intListNumber[i] <= min){
                min = intListNumber[i];
            }
        }

        return max + " " + min;
    }

    public static String reverseString(String str) {
        String result = "";
        for(int i = str.length() - 1 ; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }
    public static int getCount(String str) {
        char[] vowel = new char[]{'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for(char lettre: vowel) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == lettre) {
                    count++;
                }
            }
        }
        return count;
    }

    public static String removeVowel(String str) {
        return str.replaceAll("(?i)[aeiou]","");
    }

    public static int sum(int[] arr){
        int sum = 0;

        for(int number : arr){
            sum += number >= 0 ? number : 0;
        }
        return sum;
    }


}




