package entities;

public class Person {
   private String name;
   private String dateOfBirth;
   private int age;

   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public void setAge(int age) {
      this.age = age;
   }
   public int getAge() {
      return this.age;
   }

   public void setDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
   }

   public String getDateOfBirth() {
      return this.dateOfBirth;
   }

   public String toString() {
      return "Name: " + name
              + ", date of birth: "
              + dateOfBirth
              + " age: "
              + age;
   }
}
