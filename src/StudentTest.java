public class StudentTest {

    public static void main(String[] args) {
        Student studentLee = new Student(100, "이순신");
        studentLee.studentName = "이순신";
        studentLee.studentID = 100;
        studentLee.address = "서울시 영등포구 여의도동";

        Student studentKim = new Student(101, "김유신");
        studentKim.studentName = "김유신";
        studentKim.studentID = 101;
        studentKim.address = "미국 센프란시스코";

        studentLee.showStudentInfor();
        studentKim.showStudentInfor();

        System.out.println(studentLee);
        System.out.println(studentKim);
    }
}
