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
    Pattern pattern1 = Pattern.compile("^(?[0-9]{3})?[- ]?[0-9]{4}[ -]?[0-9]{4}$");
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
  //   System.out.println("Input filename (phone): ");
  //   String filename1 = in.nextLine();
  //   Scanner fin1 = new Scanner(new File(filename));
  //   ArrayList<Integer> phonelist = new ArrayList<Integer>();
  //   for (int i = 0; i < lines; i++) {
  //     while(fin1.hasNextInt()){
  //       phonelist.add(fin1.nextInt());
  //     }
  //   }
  //   Pattern pattern = Pattern.compile(yourRegexPattern);



  //   System.out.println("Input filename (email): ");
  //   String filename = in.nextLine();
  //   Scanner fin = new Scanner(new File(filename));
  //   ArrayList<Integer> emaillist = new ArrayList<Integer>();
  //   for (int i = 0; i < lines; i++) {
  //     while(fin.hasNextInt()){
  //       emaillist.add(fin.nextInt());
  //     }
  //   }
  //   Pattern pattern = Pattern.compile(yourRegexPattern);
}

    }