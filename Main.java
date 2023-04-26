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
import java.util.InputMismatchException;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isContinued = true;
    while(isContinued) {
      System.out.println("0  -  wyjdź");
      System.out.println("1  -  dodaj studenta");
      System.out.println("2  -  wypisz studentów");

      int choice = scanner.nextInt();
   
        switch(choice){
          case 0 -> {
            isContinued = false;
          }
          case 1 -> {
            
            System.out.println("Podaj imie: ");
            String name = scanner.next();
            
            System.out.println("Podaj nazwisko: ");
            String sername = scanner.next();
            
            System.out.println("Podaj wiek: ");
            int age = scanner.nextInt();
  
            
            System.out.println("Podaj ulice: ");
            String street = scanner.next();
  
            Student student = new Student(name,sername,age,street);
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
            System.out.println();
          }
          default -> {
            System.out.println("Wybierz poprawną opcję!");
          }
        }
      }
  }
}