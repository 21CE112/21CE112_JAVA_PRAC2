//This program is Created by Aryaa Rabara 21CE112
//https://github.com/21CE112/21CE112_JAVA_PRAC2.git
/*devlop a program that illustratemethod overloading concept */
class overloading
{
  void sum (int a, int b)
  {
    System.out.println("sum is"+(a+b)) ;
  }
  void sum (double a, float b)
  {
    System.out.println("sum is"+(a+b));
  }
  public static void main (String[] args)
  {
    overloading  cal = new overloading();
    cal.sum (8,5);      //sum(int a, int b) is method is called.
    cal.sum (4.6d, 3.8f); //sum(double a, float b) is called.
    System.out.println("This program is Created by Aryaa Rabara 21CE112");
}
}

