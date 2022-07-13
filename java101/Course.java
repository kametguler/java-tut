public class Course {
    Teacher teacher;
    String name, prefix, code;
    int note;

    public Course(String name, String prefix, String code) {
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.note = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher.branch == this.prefix) {
            this.teacher = teacher;
        } else {
            System.out.println("Farklı dersin öğretmeni bu derse atanamaz!");
        }

    }

    public void teacherInfo() {
        if (this.teacher != null) {
            this.teacher.print();
        } else {
            System.out.println("Bu derse henüz öğretmen atanmadı!");
        }
    }
}
