package peaksoft;
import java.util.Arrays;
import java.util.Objects;

public class ServiceImpl implements Service {
    private Student[] students = new Student[10];
    private Long id;
    private String name;
    private String lastName;
    private int yearOfBirth;
    public ServiceImpl(Long id, String name, String lastName, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    @Override
    public String toString() {
        return "ServiceImpl{" +
                "students=" + Arrays.toString(students) +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
    public ServiceImpl(Student[] students) {
        this.students = students;
    }
    @Override
    public boolean updateStudent(Long id, String name, String lastName) {
        for (Student student : students) {
            for (int i = 0; i < student.getId(); i++) {
                if (Objects.equals(student.getId(), id)) {
                    student.setName(student.getName());
                    student.setLastName(student.getLastName());
                } else {
                    System.out.println(" Мындай студент жок ! ");
                }
               return true;
            }
        }
      return false;
    }
    @Override
    public Student getStudentById(Long id) {
        for (Student student : students) {
            if (Objects.equals(student.getId(), id)) {
                student.setId(id);
            }else {
                System.out.println(" Мындай студент жок ! ");
            }
            return student;
        }
        return null;
    }
    @Override
    public Boolean getName(String name) {
        for (Student student : students) {
            System.out.println(Objects.equals(student.getName(), name));
            return true;
        }
        return false;
    }
    @Override
    public int getCountAge(int age) {
        for (Student student : students) {
            if (student.getAge() == age) {
                student.setAge(student.getAge());
                return student.getAge();
            }
        }
        return 0;
    }
    @Override
    public Student[] getAllStudents() {
        for (Student student : students) {
            System.out.print(student + " ");
        }
        return new Student[0];
    }
}
