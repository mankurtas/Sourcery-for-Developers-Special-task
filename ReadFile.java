import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadFile {
  public static void main(String[] args){
    try {
       File myFile = new File("input.txt");
    Scanner myReader = new Scanner(myFile);

      while(myReader.hasNextLine()){
        String data = myReader.nextLine();
        
          for (int i = 0; i < data.length() -1 ; i++) {
                
          if(Character.isDigit(data.charAt(i)) && Character.isDigit(data.charAt(i+1)))  {
          char ch = data.charAt(i);
          String chToSt = String.valueOf(ch);
          int strToint = Integer.parseInt(chToSt);
              if(strToint > 0) {
              System.out.println(data);
              break;
              }  
          }
        }   
    }
    myReader.close();    
    } catch (Exception e) {      
      System.out.println("An error occurred.");
      e.printStackTrace();
    }  
  }
  }

