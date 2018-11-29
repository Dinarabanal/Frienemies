package edu.cnm.deepdive;

 public class Friend {

   private String funLevel;
   private String name;
   private String gender;
   private int age;
   private int phoneNumber;
   private String toy;

   public String getToy() {
     return toy;
   }

   public void setToy(String toy) {
     this.toy = toy;
   }

   public Friend(String funLevel, String name, String gender, int age, int phoneNumber) {
     this.funLevel = funLevel;
     this.name = name;
     this.gender = gender;
     this.age = age;
     this.phoneNumber = phoneNumber;
   }

   public String getFunLevel() {
     return funLevel;
   }

   public void setFunLevel(String funLevel) {
     this.funLevel = funLevel;
   }

   public String getName() {
     return name;
   }

   public void setName(String name) {
     this.name = name;
   }

   public String getGender() {
     return gender;
   }

   public void setGender(String gender) {
     this.gender = gender;
   }

   public int getAge() {
     return age;
   }

   public void setAge(int age) {
     this.age = age;
   }

   public int getPhoneNumber() {
     return phoneNumber;
   }

   public void setPhoneNumber(int phoneNumber) {
     this.phoneNumber = phoneNumber;
   }

   public int birthday(int age) {
     age = this.age + 1;
     return age;

   }

   public void getInfo() {
     if(gender.matches("Female")){
     System.out.println("This friend is "+ getName() + ". Her fun level is "+ getFunLevel() + ". Her age is "+ getAge()+". Her toy is: " + getToy()+    ".\n");
   }else{
       System.out.println("This friend is " + getName() + ". His fun level is "+ getFunLevel() + ". His age is " + getAge()+ ". His toy is: " + getToy()+ ".\n");
     }
     }
 }
