public class Student {
    private static int studentCount = 0; 
    private String name;
    private int id;
    private double GPA;
    private int gradeCount; 
    private Teacher favoriteTeacher;
    public Student(String name) {
        this.name = name;
        this.id = studentCount;
        this.GPA = 0.0;
        this.gradeCount = 0;
        studentCount++; 
    }

    public static void addStudents(int number) {
    studentCount += number;
    }

    public static int getStudentCount() {
    return studentCount;
    }

    public String getName() {
    return name;
    }

    public int getID() {
    return id;
    }

    public void addGrade(int grade) {
    GPA = (GPA * gradeCount + grade) / (++gradeCount); 
    }

    public double getGPA() {
    return GPA;
    }
    public void setFavoriteTeacher(Teacher favorite) {
    this.favoriteTeacher = favorite;
    }

    public Teacher getFavoriteTeacher() {
    return favoriteTeacher;
    }
}
