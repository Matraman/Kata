package kata;

public class Solution {

    public Solution(){

    }
    public int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }


    public static void main(String[] args){
        Solution s = new Solution();
        int result = s.solution(10);
        System.out.println(result);
    }
}