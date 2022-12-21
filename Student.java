public class Student {
    //variables for student class
    private String Fname;
    private String Lname;
    private String Grade;
    private int Pin;

    private static int nextPin = 0;
    /*overriding toString function so it doesnt show stored memory value when i print out values
     from arraylist
     */
    public String toString() {
        return Fname + Lname + Grade + Pin;
    }
    /*override for removing teachers of identical parameters because even if they look identical
    they will have different memory values
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return s.Fname.equals(Fname) && s.Lname.equals(Lname) && s.Grade.equals(Grade);
    }
    /*constructor for students basically they all have a first name, last name,
    grade, and unique identification number that goes up by one for every student. ex. 1234
     */
    Student(String Fname, String Lname, int Grade){
        this.Fname = "Name: " + Fname ;
        this.Lname = " " + Lname +"," + " ";
        this.Grade = "Grade: " + Grade +"," +  " Student Number: ";
        this.Pin = nextPin++;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public int getPin() { return Pin; }

    public void setPin(int pin) { Pin = pin; }
}
