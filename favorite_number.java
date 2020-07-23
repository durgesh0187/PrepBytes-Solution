import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    Scanner sc = new Scanner (System.in);
    
    int t=sc.nextInt();
    while(t-->0)
    {
      int c=0;
      String s1=sc.next();
      for(int i=0;i<s1.length();i++)
      {
        if(s1.charAt(i)=='5')
        c++;
      }
      System.out.println(c);
    }
    
  }
}