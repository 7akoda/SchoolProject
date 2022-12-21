import java.util.ArrayList;

 class School {
     //creating array lists for teachers, students, and courses
     //basically just 3 individual collections of values
   ArrayList<Teacher> Teachers = new ArrayList<>();
   ArrayList<Student> Students = new ArrayList<>();
   ArrayList<Student> Courses = new ArrayList<>();

   //setting variables for school constructor
   private String name;
   private String city;
   private String district;

     /*overriding toString function so it doesnt show stored memory value when i print out values
   from arraylist
   */
     public String toString() {
         return name + city + district;
     }

     //constructor for school, it has a name, city, and school district
     School(String name, String city, int district){
         this.name = "School: " + name + "," + " ";
         this.city = "City: " + city + "," + " ";
         this.district = "District: " + district;
     }

    public ArrayList<Teacher> getTeachers() {
      return Teachers;
   }
    public ArrayList setTeachers(ArrayList<Teacher> teachers) {
       Teachers = teachers;
       return teachers;
    }
   public ArrayList<Student> getStudents() {
      return Students;
   }
   public ArrayList setStudents(ArrayList<Student> students) {
      Students = students;
      return students;
   }
   public ArrayList<Student> getCourses() {
      return Courses;
   }
   public ArrayList setCourses(ArrayList<Student> courses) {
      Courses = courses;
      return courses;
   }
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getCity() {
      return city;
   }
   public void setCity(String city) {
      this.city = city;
   }
   public String getDistrict() {
      return district;
   }
   public void setDistrict(String district) {
      this.district = district;
   }

   }




