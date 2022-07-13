public class TestOBS {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Kamet Güler", "555", "TRH");
        Teacher t2 = new Teacher("Nedim Güler", "000", "FZK");
        Teacher t3 = new Teacher("Kaan Güler", "111", "MAT");

        Course tarih = new Course("Tarih", "TRH", "101");
        Course fizik = new Course("Fizik", "FZK", "102");
        Course matematik = new Course("Matematik", "MAT", "103");

        tarih.addTeacher(t1);
        fizik.addTeacher(t2);
        matematik.addTeacher(t3);

        Student s1 = new Student("Erk Güler", "123456", "4", tarih, matematik, fizik);
        s1.addBulkExamNotes(100, 35, 40);
        s1.printNotes();

        s1.isPass();
    }
}
