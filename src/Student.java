public class Student {

    int studentID;
    String studentName;
    int grade;
    String address;

    public Student(){}

    public Student(int id, String name){
        studentID = id;
        studentName = name;
    }

    public void showStudentInfor() {
        System.out.println(studentName + "," + address);
    }

   /* public static void main(String[] args) {  // StudentTest Class로 이동

        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "서울시 서초구 서초동";

        studentLee.showStudentInfor();
    }
       */

    public String getStudentName(){     // 클래스에서 메서드 구현
        return studentName;
    }
    public void setStudentName(String name) {
        studentName = name;
    }



}
