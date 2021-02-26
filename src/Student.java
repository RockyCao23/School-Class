public class Student {

    private String name;                                         //Fields
    private String lastName;
    private int grade;
    private static int studentNum = 1;                           //Student number (static)
    private int idNum;

    public Student(){                                           //Default Constructor
        this.name = "John";
        this.lastName = "Doe";
        this.grade = 1;
        this.idNum = studentNum;
        studentNum++;


    }
    public Student(String name, String lastName, int Grade){    //Constructor with parameters
        this.name = name;
        this.grade = Grade;
        this.idNum = studentNum;
        studentNum++;
    }
    public String toString(){                                   //Prints out correct format

        return "Name: " + this.name + " Grade: " + this.grade;
    }
                                                                //Getter + Setters

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
    public int getGrade() {

        return grade;
    }
    public void setGrade(int grade) {

        this.grade = grade;
    }
    public int getIdNum() {

        return idNum;
    }
    public void setIdNum(int idNum) {

        this.idNum = idNum;
    }


}
