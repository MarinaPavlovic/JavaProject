
package classes;

import java.util.ArrayList;

public class User {
    
    protected int id;
    protected String firstName;
    protected String surname;
    protected int age;
    protected String gender;
    protected ArrayList<User> friends;
    

    public User(int id, String firstName, String surname, int age, String gender, ArrayList<User> friends) {
        this.id = id;
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.friends = friends;
      
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<User> getFriends() {
        return friends;
    }

    

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }

  

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName=" + firstName + ", surname=" + surname + ", age=" + age + ", gender=" + gender + ", friends=" + friends +  '}';
    }

   
    
    
}
