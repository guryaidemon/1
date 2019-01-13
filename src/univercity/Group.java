package univercity;


import java.util.ArrayList;
import java.util.Arrays;

public class Group {
    private int numGroup;
    private Student[] studentGroup;

    //конструктор может принимать номер группы (в этом случае количество студентов = 0)
    public Group(int numGroup) {
        this.numGroup = numGroup;
        this.studentGroup = null;
    }

    //конструктор может принимать номер группы,
    // количество студентов (массив студентов только инициируется, но элементы его - пустые);
    public Group(int numGroup, int kol) {
        this.numGroup = numGroup;
        this.studentGroup = new Student[kol];
    }

    //конструктор может принимать массив студентов;
    public Group(Student[] studentGroup) {
        this.studentGroup = studentGroup;
    }

    //метод получения номера группы;
    public int getNumGroup() {
        return numGroup;
    }

    //метод изменения номера группы;
    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    //метод, возвращающий общее число студентов группы;
    public int countKl(int numGroup) {
        return studentGroup.length;
    }

    //метод, возвращающий ссылку на студента по номеру зачетной книжки;
    public Student getStudentByNumCard(int numCard) {
        Student stud = null;
        for (int i = 0; i < studentGroup.length; i++)
            if (studentGroup[i].getNumZach() == numCard)
                stud = studentGroup[i];
        return stud;
    }

    //метод, возвращающий массив студентов;
    public ArrayList getStudents() {
        ArrayList stud = new ArrayList();
        for (int i = 0; i < studentGroup.length; i++)
            stud.add(studentGroup[i].getStudent());
        return stud;
    }

    // метод сортировки
    public Student[] loosySortStudBySurNames() {
        Student[] sortedStud = Arrays.copyOf(studentGroup, studentGroup.length);
        for (int i = 0; i < sortedStud.length; i++) {
            for (int j = 1; j < sortedStud.length; j++) {
                if (sortedStud[j - 1].getSurnameStud().compareTo(sortedStud[j].getSurnameStud())
                        >= 0) {
                    Student swap = sortedStud[j - 1];
                    sortedStud[j - 1] = sortedStud[j];
                    sortedStud[j] = swap;
                }
            }
        }
        return sortedStud;
    }

    @Override
    public String toString() {
        return "Group{" +
                "numGroup=" + numGroup +
                ", studentGroup=" + Arrays.toString(studentGroup) +
                '}';
    }
}
