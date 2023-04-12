public class Student {

  private String Name;
  private String Sername;
  private int Age;

  public Student(String name, String sername, int age) {
    Name = name;
    Sername = sername;
    Age = age;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSername() {return Sername;}

  public String ToString() {
    return Name + " " + Sername + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", "", -1);
    return new Student(data[0], data[1], Integer.parseInt(data[2]));
  }
}