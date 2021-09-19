public class Main {
   public static void main(String[] args) {
      String s1 = "Java is Fun!";
      String s2 = "Java is Fun!";
      String s3 = new String("Java is Fun!");
      String s4 = new String("Java is fun!");

      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
      System.out.println(s1.equals(s4));
      System.out.println(s1.equalsIgnoreCase(s4));

   }
}