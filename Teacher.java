public class Teacher {
    //variables for teacher class
    private String Fname;
    private String Lname;
    private String subject;

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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
/*overriding toString function so it doesnt show stored memory value when i print out values
 from arraylist
 */
    public String toString() {
        return Fname + Lname + subject;
    }
    //constructor for teachers basically they all have a first name, last name, and a subject they teach
    Teacher(String Fname, String Lname, String subject){
        this.Fname = "Name: " + Fname + " ";
        this.Lname = Lname + "," + " ";
        this.subject = "Subject: " + subject ;
    }
    /*override for removing teachers of identical parameters because even if they look identical
    they will have different memory values
     */
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher t = (Teacher) o;
        return t.Fname.equals(Fname) && t.Lname.equals(Lname) && t.subject.equals(subject);
    }
}

