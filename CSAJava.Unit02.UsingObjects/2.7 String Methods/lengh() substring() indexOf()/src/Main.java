public class Main {
   public static void main(String[] args) {
      String s1 = "Java is awesome at SHHS!";
      String s2 = "Mr. Oseguera is my favorite teacher.";
      String s3 = "Ask me why this is my favorite class.";

      System.out.println(s1.length());
      System.out.println(s2.length());

      System.out.println(s1.substring(0, 15));
      System.out.println(s2.substring(4,12));
      System.out.println(s1.substring(8));

      System.out.println(s1.indexOf("SHHS"));
      System.out.println(s2.indexOf("my"));
      System.out.println(s3.indexOf("is"));
      System.out.println(s1.indexOf("Oseguera"));
   }
}