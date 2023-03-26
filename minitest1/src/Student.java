public class Student {
    private String name;
    private int age;
    private String classId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public Student(String name, int age, String classId) {
        this.name = name;
        this.age = age;
        this.classId = classId;
    }

    public Student() {
    }
    public void printStudent() {
        System.out.printf("Student name: %s - Student age: %d - Class Id: %s", name, age, classId);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Hung");
        student1.setAge(25);
        student1.setClassId("C0223G1");
        student1.printStudent();
    }
}
