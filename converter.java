import java.io.*;
import java.util.*;

public class converter{
  private static final Logger Log = Logger.getLogger(converter.class.getName());
  public static void main(String[] args){
    try{
      //scanner for the mp4 and mp3 file paths
      Scanner sc = new Scanner(System.in);
      String line;
      System.out.print("mp4 path: ")
      String MP4 = sc.nextLine
      System.out.print("mp3 path: ")
      String MP3 = sc.nextLine();
//command line process
      String cmd = "ffmpeg -i " +MP4+ " "+ MP3;
      Process p= Runtime.getRuntime().exec(cmd); //uses the ffmpeg library to convert
      BufferedReader in = new BufferedReader(new InputStreamReader(p.getErrorStream()));
      while((line=in.readLine())!=null)//while loop to make sure conversion occurs successfully
      {
        System.out.println(line);
      }
      p.waitFor();
      System.out.println("Video Converted");
      in.close();
    }
    catch(IOException| InterruptedException e){
      LOG.log(Level.SEVERE, null, e);//;og error that occurs
    }
  }
}
