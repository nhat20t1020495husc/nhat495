import java.util.Scanner;
public class  baichuoi2 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String message = null;
    System.out.println("\n\nNhap chuoi: ");
    message = sc.nextLine();
    char[] charArray = message.toCharArray();
    boolean foundSpace = true;
    for(int i = 0; i < charArray.length; i++) {

      if(Character.isLetter(charArray[i])) {
       
        if(foundSpace) {
         
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
        }
      }
      else {
        foundSpace = true;
      }
    }
 
    message = String.valueOf(charArray);
    System.out.println("Chuoi sau khi bien doi \n" + message);
 
    System.out.println("\n---------------------------------");

  }
}
