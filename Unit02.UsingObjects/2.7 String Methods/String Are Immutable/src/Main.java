public class Main {
   public static void main(String[] args) {
      String s1 = "Java";
      System.out.println(s1);
      s1.concat(" is fun!"); // String concatenation method to append at end of string
      System.out.println(s1);
      s1 = s1.concat(" is fun!");
      System.out.println(s1);
   }
}