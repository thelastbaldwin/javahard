class Student {
    String name;
    int credits;
    double gpa;

    Student(String _name, int _credits, double _gpa){
        name = _name;
        credits = _credits;
        gpa = _gpa;
    }
}

public class StudentDatabase {
    public static void main( String[] args){
        Student[] db = new Student[3];

        db[0] = new Student("Esteban", 43, 2.9);
        db[1] = new Student("Dave", 15, 4.0);
        db[2] = new Student("Michelle", 132, 3.72);

        for(int i = 0; i < db.length; i++){
            System.out.println("Name: " + db[i].name);
            System.out.println("\tCredit Hours: " + db[i].credits);
            System.out.println("\tGPA: " + db[i].gpa + "\n");
        }

        int maxLoc = 0;

        for (int i = 1; i < db.length; i++)
            if (db[i].gpa > db[maxLoc].gpa)
                maxLoc = i;
        
        System.out.println(db[maxLoc].name + " has the highest GPA.");
    }
}