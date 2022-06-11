package state;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student1 = new Student("student 1");
        Student student2 = new Student("student 2");
        student2.addPrivate(onlineCourse);

        onlineCourse.addStudent(student1);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("hello", student1);

        onlineCourse.addStudent(student2);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getStudents());
    }
}
