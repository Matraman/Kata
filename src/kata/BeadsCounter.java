package kata;

public class BeadsCounter {

    public static void main(String[] args){
        System.out.println(countRedBeads(3));
        System.out.println(Integer.toString(3));
    }
    public static int countRedBeads(final int nBlue) {
        //TODO : Redcolor FF0000
        int count = 0;
        return nBlue <= 1 ? 0 : (nBlue - 1) * 2;
    }


}
