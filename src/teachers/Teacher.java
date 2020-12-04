package teachers;

public class Teacher {
    String name;
    String familyName;

    public Teacher(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                '}';
    }
}
