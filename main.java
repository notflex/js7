import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str = in.nextLine();
        StringBuffer strBuffer = new StringBuffer(str);
        String[] words = str.split("\\.");
        int count = 0;
        String result = null;
        for(String word : words){
            if (count < 5) {
                int i = Integer.parseInt(word.trim());
                if (i > 255) {
                    System.out.println("Это не ip адрес");
                    break;
                }
                count+=1;
            }
            else{
                System.out.println("Это не ip адрес");
                break;
            }
        }
        if (count == 4){
            System.out.println("Это ip адрес");
        }
        else if(count < 4){
            System.out.println("Это не ip адрес");
        }
    }
}