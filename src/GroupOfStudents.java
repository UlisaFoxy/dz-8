import java.util.List;

public class GroupOfStudents {
    private Student head;
    private List<Student> students;
    private List<String> tasks;


    public GroupOfStudents(Student head, List<Student> students, List<String> tasks) {
        this.head = head;
        this.students = students;
        this.tasks = tasks;
    }


    public Student getHead() {
        return head;
    }


    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public void assignHeadIfAbsent() {
        if (head != null) {
            return;
        }
        if (students.isEmpty()) {

            System.out.println("Усе логічно: немає студентів, немає і старости!");
            return;
        }

        Student newHead = students.get(0);
        head = newHead;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void renameStudent(Student student, String newFirstName, String newLastName) {
        student.setFirstName(newFirstName);
        student.setLastName(newLastName);
    }

    public void assignTasksToGroup() {
        for (Student student : students) {
            student.setTasks(tasks);
        }
    }

    public void markTaskAsCompleted(int studentId, String taskName) {
        for (Student student : students) {
            if (student.getId() == studentId) {
                student.markTaskAsCompleted(taskName);
                return;
            }
        }

    }


}
