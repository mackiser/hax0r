import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
 
class hax0r {
  public static void main(String[] args) {
    Runtime rs = Runtime.getRuntime();
    
    int i = 0;
 
    try {
    	
    	while (i < 1)
    	{
    		
      // opens notepad
      rs.exec("notepad");
      
      // opens an dialog box
      JOptionPane.showMessageDialog(null, "Sar...");
      
      // opens command prompt
      String path = "c:\\";
      Runtime.getRuntime().exec(new String[] { "cmd.exe", "/C", "\"start; cd "+path+"\"" });
      
    	}
    	
    }
    catch (IOException e) {
      System.out.println(e);
    }   
  }
}
