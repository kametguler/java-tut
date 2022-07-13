public class Student {
    Course course1, course2, course3;
    String name, stuNo, classes;
    double average;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    public void printNotes() {
        System.out.println(course1.name + " Notu: " + course1.note + "\n" + course2.name + " Notu: " + course2.note
                + "\n" + course3.name + " Notu: " + course3.note + "\n");
    }

    public void addBulkExamNotes(int note1, int note2, int note3) {
        if ((note1 <= 100 && note1 >= 0) && (note2 <= 100 && note2 >= 0) && (note3 <= 100 && note3 >= 0)) {
            course1.note = note1;
            course2.note = note2;
            course3.note = note3;
        } else {
            System.out.println("Lütfen geçerli bir sınav notu giriniz!");
        }
    }

    public void calcAverage() {
        this.average = (course1.note + course2.note + course3.note) / 3;
        if (this.average >= 55) {
            this.isPass = true;
        }
    }

    public void isPass() {
        this.calcAverage();
        if (this.isPass == true) {
            System.out.println("Öğrenci sınıfı başarıyla geçmiştir.");
        } else {
            System.out.println("Öğrenci sınıfta kalmıştır.");
        }
    }
}