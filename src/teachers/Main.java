package teachers;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Снежана", "Петровна");
        Teacher t2 = new Teacher("Мария", "Николаевна");
        Teacher t3 = new Teacher("Петр", "Альбертович");
        Teacher t4 = new Teacher("Татьяна", "Ивановна");
        Teacher t5 = new Teacher("Татьяна", "Николаевна");
        Teacher t6 = new Teacher("Снежана", "Николаевна");
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        teachers.add(t5);
        teachers.add(t6);

        System.out.println("Самый лучший учитель - " + teachers.indexOf(t1));
        System.out.println("Самый худший учитель - " + teachers.indexOf(t2));
        System.out.println(teachers);
    }
}
