

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Str {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число строк:");
        int countString=Integer.parseInt(reader.readLine()) ;
        String veryShortString=null;
        for (int i=0; i< countString; i++){
            System.out.println("Введите строку номер " + (i+1));
            String currentString = reader.readLine();
            if (veryShortString==null || currentString.length()<veryShortString.length()){
                veryShortString=currentString;
            }
        }
        System.out.println("Самая короткая строка = " + veryShortString);
        System.out.println("Ее длина равна " + veryShortString.length());
    }
}