import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class a {
	transient int tt=3;
	public void run() throws IOException {
		  
       //   System.out.println("fwefwe"+tt);
		//BufferedReader br=new BufferedReader(new FileReader("D:\\Music\\bigbang - blue.mp3"));
		BufferedInputStream r=new BufferedInputStream(new FileInputStream(new File("D:\\Music\\bigbang - blue.mp3")));
      //   FileOutputStream ts=new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\mp3.mp3"));
		//BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\mp13.mp3"));
		BufferedOutputStream bw=new BufferedOutputStream(new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\mp3.mp3")));
         //ts.write(r.read());
         int t=0;
        // byte[] buffer=new byte[1024];
        // r.r
         while((t=r.read())!=-1){
        	 bw.write( t);
         }
     //   r.r
        
	}
	
	
	public static void main(String[] args) throws IOException{
		a as=new a();
		as.run();
		
	}
}
