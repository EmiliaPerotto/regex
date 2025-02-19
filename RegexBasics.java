import java.io.*;
import java.util.*;
import java.util.regex.*;
public class RegexBasics{
  public static void main(String[] args)throws IOException{
    Scanner in = new Scanner(System.in);
    System.out.println("Input filename (hex): ");
    String filename = in.nextLine();
    Scanner fin = new Scanner(new File(filename));
    ArrayList<String> hexlist = new ArrayList<String>();
    int count = 0;
    Pattern pattern = Pattern.compile("[0-9, A-F] {6}");
      while(fin.hasNextLine()){
        hexlist.add(fin.nextLine());
        count++;
      }
      System.out.println(count);
      boolean matchFound = false;
      for(int i = 0; i < count; i++){
        matchFound = pattern.matcher(hexlist.get(i)).find();
      if(matchFound){
        System.out.println("90");
      }
      else{
        System.out.println("no");
      }

      }


    // System.out.println("Input filename (phone): ");
    // String filename = in.nextLine();
    // Scanner fin = new Scanner(new File(filename));
    // ArrayList<Integer> phonelist = new ArrayList<Integer>();
    // for (int i = 0; i < lines; i++) {
    //   while(fin.hasNextInt()){
    //     phonelist.add(fin.nextInt());
    //   }
    // }
    // Pattern pattern = Pattern.compile(yourRegexPattern);



    // System.out.println("Input filename (email): ");
    // String filename = in.nextLine();
    // Scanner fin = new Scanner(new File(filename));
    // ArrayList<Integer> emaillist = new ArrayList<Integer>();
    // for (int i = 0; i < lines; i++) {
    //   while(fin.hasNextInt()){
    //     emaillist.add(fin.nextInt());
    //   }
    // }
    // Pattern pattern = Pattern.compile(yourRegexPattern);
  }

    }