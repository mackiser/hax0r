import java.util.*;
import java.io.*;
 
class hax0r {
  public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
    
    int i = 0;
 
    try {
    	while (i < 1)
    	{
      rs.exec("notepad");
    	}
    }
    catch (IOException e) {
      System.out.println(e);
    }   
  }
}
