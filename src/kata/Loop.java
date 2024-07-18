package kata;

import static java.lang.System.out;

public class Loop {

    public static void main(String[] args){
        int i = 0;
        char tab[] = {'R','a', 'y'};

        //While loop
        while(i < 10){
            out.println(i++);
        }

        //Do loop
        do{
            out.println(i--);
        }while(i >= 0);

        //For loop
        for( i = 0; i < 10; i++){
            out.println(i);
        }

        for (char lettre: tab) {
            out.print(lettre);
        }


    }
}