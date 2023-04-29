import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04ReadingCharacters {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter a character:");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char c=(char)br.read();
        System.out.println(c);
    }
}
