public class Teacher {

    private String name;                                            //Fields
    private String lastName;
    private String subject;

    public Teacher(){                                               //Default Constructor
        name = "Bob";
        lastName = "Vance";
        subject = "Science";

    }
    public Teacher(String name, String lastName, String subject){  //Constructor with parameters
        this.name = name;
        this.lastName = lastName;
        this.subject = subject;
    }
    public String toString(){                                       //Override toString method to intended format

        return "Name: " + this.name + " " + this.lastName + " Subject: " + this.subject;
    }

                                                                    //Setter and Getters

    public String getName() {

        return name;
    }
    public void setName(String name) {

        this.name = name;
    }
    public String getLastName() {

        return lastName;
    }
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
    public String getSubject() {

        return subject;
    }
    public void setSubject(String subject) {

        this.subject = subject;
    }


}
