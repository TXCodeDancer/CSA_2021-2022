class Application {

  // write a field here
  String AppName;
  // write a constructor here
  public Application(String appName)
  {
    AppName = appName;
 }

  public void run(String[] args) {
    // implement a method
    System.out.println(AppName);
    for(int i = 0; i < args.length; i++)
    {
      System.out.println(args[i]);
    }
  }
}