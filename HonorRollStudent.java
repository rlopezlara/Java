package wk9;

public class HonorRollStudent extends Student {
    private String prizes;
    public HonorRollStudent(){}
    public HonorRollStudent(String name, int studentid, double marks, int age, String prizes) {
        super(name, studentid, marks, age);
        if(marks > 80.0) {
            setPrizes(prizes);
        }else{
            throw new IllegalArgumentException("Marks should be greater than or equal to 80.0");
        }
    }
    public String getPrizes() {
        return prizes;
    }
    public void setPrizes(String prizes) {
        this.prizes = prizes;
    }
    @Override
    public void setMarks(double marks) {
        if (marks >= 80) {
            super.setMarks(marks);

        } else {
            System.err.println("Grade lower than 80");
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Prize = " + prizes;
    }
}
