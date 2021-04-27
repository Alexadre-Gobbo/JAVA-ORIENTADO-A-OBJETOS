package np1;

public class Notas {

    private double np1;
    private double np2;
    private double sub;
    private double exam;

    public Notas(double np1, double np2, double sub, double exam) {
        this.np1 = np1;
        this.np2 = np2;
        this.sub = sub;
        this.exam = exam;
    }

    public double getNp1() {
        return np1;
    }

    public void setNp1(double np1) {
        this.np1 = np1;
    }

    public double getNp2() {
        return np2;
    }

    public void setNp2(double np2) {
        this.np2 = np2;
    }

    public double getSub() {
        return sub;
    }

    public void setSub(double sub) {
        this.sub = sub;
    }

    public double getExam() {
        return exam;
    }

    public void setExam(double exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        String res = "";
        res += " - Np1: " + getNp1() + "\n";
        res += " - Np2: " + getNp2() + "\n";
        res += " - Sub: " + getSub() + "\n";
        res += " - Exame: " + getExam();
        return res;
    }
}
