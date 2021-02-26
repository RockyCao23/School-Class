public class Main {

    public static void main(String[] args) {

        //Using Your new Classes
        //Add 10 students to student list
        //add 3 teachers to teacher list
        //display both lists
        //remove 2 students
        //remove 1 teacher
        //display both lists

        School school = new School();
        Teacher t = new Teacher("Bill", "Nye", "Science");
        Student s = new Student("john", "Doe", 7);

        for (int i = 0; i < 10; i++){
            school.addStudent(s);
        }
        for (int i = 0; i < 3; i ++){
            school.addTeacher(t);
        }
        System.out.println(school);
        int x = 0;
        while (x < 2){
            school.removeStudent(s);
            x++;
        }
        school.removeTeacher(t);
        System.out.println(school);
        System.out.println(s.getIdNum());





    }

}
