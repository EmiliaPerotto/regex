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
    Pattern pattern = Pattern.compile("^[0-9A-F]{6}$");
      while(fin.hasNextLine()){
        String line = fin.nextLine().trim();
        if (!line.isEmpty()) { // Avoid adding empty lines
          hexlist.add(line);
          count++;
        }
      }
      System.out.println(count);
      boolean matchFound = false;
      for(int i = 0; i < count; i++){
        matchFound = pattern.matcher(hexlist.get(i)).matches();
      if(matchFound){
        System.out.println(hexlist.get(i) + " is a valid hex color code");
      }
      else{
        System.out.println(hexlist.get(i) + " is not a valid hex color code");
      }

      }

    System.out.println("Input filename (phone): ");
    String filename1 = in.nextLine();
    Scanner fin1 = new Scanner(new File(filename1));
    ArrayList<String> phonelist = new ArrayList<String>();
    int count1 = 0;
    Pattern pattern1 = Pattern.compile("\\(?[0-9]{3}(\\) | |-)?[0-9]{3}-?[0-9]{4}");
      while(fin1.hasNextLine()){
        String line1 = fin1.nextLine().trim();
        if (!line1.isEmpty()) { // Avoid adding empty lines
          phonelist.add(line1);
          count1++;
        }
      }
      System.out.println(count1);
      boolean matchFound1 = false;
      for(int i = 0; i < count1; i++){
        matchFound1 = pattern1.matcher(phonelist.get(i)).matches();
      if(matchFound1){
        System.out.println(phonelist.get(i) + " is a valid phone number");
      }
      else{
        System.out.println(phonelist.get(i) + " is not a valid phone number");
      }

      }

    System.out.println("Input filename (email): ");
    String filename2 = in.nextLine();
    Scanner fin2 = new Scanner(new File(filename2));
    ArrayList<String> emaillist = new ArrayList<String>();
    int count2 = 0;
    Pattern pattern2 = Pattern.compile("^[a-z\\.\\-_]+@[a-z\\-]+\\.[a-z]{2,4}$", Pattern.CASE_INSENSITIVE);
      while(fin2.hasNextLine()){
        String line2 = fin2.nextLine().trim();
        if (!line2.isEmpty()) { // Avoid adding empty lines
          emaillist.add(line2);
          count2++;
        }
      }
      System.out.println(count2);
      boolean matchFound2 = false;
      for(int i = 0; i < count2; i++){
        matchFound2 = pattern2.matcher(emaillist.get(i)).matches();
      if(matchFound2){
        System.out.println(emaillist.get(i) + " is a valid email address");
      }
      else{
        System.out.println(emaillist.get(i) + " is not a valid email address");
      }

      }
}

    }