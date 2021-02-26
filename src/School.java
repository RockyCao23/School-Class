import java.util.ArrayList;

public class School {

    private ArrayList<Teacher> teachers = new ArrayList<>();             //Fields
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<String> course = new ArrayList<>();


    public School(){                                                    //Default Constructor
        this.teachers.add(new Teacher());
        this.students.add(new Student());
        this.course.add("science");
    }
    public School(Teacher name, Student studentName){                    //Constructor with Parameters
        this.teachers.add(name);
        this.students.add(studentName);
    }
                                                                //methods


    public void addTeacher(Teacher name){                               //add teacher

        this.teachers.add(name);
    }
    public void addStudent(Student name){                               //add student

        this.students.add(name);
    }
    public void removeTeacher(Teacher t){                         //removes teacher

        teachers.remove(t);
    }
    public void removeStudent(Student s){                         //removes student
        students.remove(s);
    }
    public String teacherList(){                                  //Lists teachers

        return "Teachers: "  + teachers;
    }
    public String studentList(){                                  //Lists students

        return "Students:" + students;
    }

    public String toString(){                                     //prints both list when using println

        return "Teachers: " + teachers + "\nStudents: " + students;
    }


}
