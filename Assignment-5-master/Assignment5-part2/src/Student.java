public class Student {

    private String name;
    private String id;
    private int attendance;
    private GradesDB database;


    public String getName() {
        return name;
    }

    public void setName (String n) {
        name = n;
    }

    public String getId() {
        return id;
    }

    public void setId(String i) {
        id = i;
    }

    public Student(String n, String i, int j) {
        name = n;
        id = i;
        attendance = j;
    }
    public Student (String n, String i, GradesDB db)
    {
        name = n;
        id = i;
        database = db;

    }
    public Student (String n, String i, int j, GradesDB db)
    {
        name = n;
        id = i;
        attendance = j;
        database = db;

    }
    public int getAttendance()
    {
        return attendance;
    }
    public void setAttendance(int att)
    {
        attendance = att;
    }
    public GradesDB getDatabase()
    {
        return database;
    }

    public void  setDatabase(GradesDB db)
    {
        database = db;
    }

    public void Display() {
        System.out.println("Student Name: \t" + getName());
        System.out.println("Student ID: \t" + getId());
    }

    public static void main (String [] args) {

        //Testing constructor
        //Student ns2 = new Student("John Doe", "1234", 3);
        //ns2.Display();
    }
}