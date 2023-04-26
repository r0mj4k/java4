public class Student {

  private String Name;
  private String Sername;
  private int Age;
  private String Street;
  private String Birth;

  public Student(String name, String sername, int age, String street, String birth) {
    Name = name;
    Sername = sername;
    Age = age;
    Street = street;
    Birth = birth;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSername() {return Sername;}

  public String ToString() {
    return Name + " " + Sername + " " + Integer.toString(Age) + " " + Street + " " + Birth;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 5) 
      return new Student("Parse Error", "", -1, "","");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3], data[4]);
  }
}