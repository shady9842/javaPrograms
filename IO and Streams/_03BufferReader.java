import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class _03BufferReader {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("file.txt");
        BufferedReader br=new BufferedReader(fr);
        char c[]=new char[20];
        if(br.markSupported()){
            System.out.println("Mark() method is supported");
            br.mark(100);
        }
        br.skip(8);
        if(br.ready()){
            //illustration of readline method
            System.out.println(br.readLine());
            br.read(c);
            for (int i = 0; i < 20; i++) {
                System.out.println(c[i]);
            }
            System.out.println();
            br.reset();
            for (int i = 0; i < 8; i++) {
                System.out.println((char)br.read());
            }
        }
    }
    
}
