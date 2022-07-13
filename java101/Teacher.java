public class Teacher {
    String name, mpno, branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    public void print() {
        System.out.println("Name: " + this.name + " Mpno: " + this.mpno + " Branch: " + this.branch);
    }
}
