public class Main {
   public static void main(String[] args) {
      String s1 = "Java is Fun!";
      String s2 = "Java is Fun!";
      String s3 = new String("Java is Fun!");
      String s4 = new String("Java is fun!");

      System.out.println();
      System.out.println("Using equals() method:");
      System.out.println(s1.equals(s2));
      System.out.println(s1.equals(s3));
      System.out.println(s1.equals(s4));
      System.out.println(s1.equalsIgnoreCase(s4));

      System.out.println();
      System.out.println("Using == operator:");
      System.out.println(s1 == s2);
      System.out.println(s1 == s3);
      System.out.println(s1 == s4);

      String f1 = "Issac";
      String f2 = "Zeke";
      String f3 = "Isabella";
      String f4 = "Issac";

      System.out.println();
      System.out.println("Using compareTo() method:");
      SortNames(f1, f2);
      SortNames(f1, f3);
      SortNames(f1, f4);


   }

   private static void SortNames(String name1, String name2)
   {
      // Use compareTo() to print our friend's names in lexicographical order.
      int order = name1.compareTo(name2);
      if(order < 0)
         System.out.println(name1 + " is before " + name2 + ".");
      else if (order > 0)
         System.out.println(name2 + " is before " + name1 + ".");
      else
         System.out.println("Ours friends have the same name.");
   }
}