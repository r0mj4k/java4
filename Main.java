/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("0  -  wyjdź");
    System.out.println("1  -  dodaj studenta");
    System.out.println("2  -  wypisz studentów");

    int choice = scanner.nextInt();
    boolean isCon = true;

      switch(choice){
        case 0 -> {
          break;
        }
        case 1 -> {
          
          System.out.println("Podaj imie: ");
          String name = scanner.next();
          System.out.println("Podaj wiek: ");
          int age = scanner.nextInt();

          Student student = new Student(name, age);
          Service service = new Service();
          try {
          service.addStudent(student);
          } catch (IOException e) {
            
          }
        }
        case 2 -> {
          try {
            Service service = new Service();
            var students = service.getStudents();
            for(Student current : students) {
              System.out.println(current.ToString());
          }
        } catch (IOException e) {
    
        }
        }
        default -> {
          break;
        }
      }
    
  }
}