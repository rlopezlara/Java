package wk9;

public class MatureStudent extends HonorRollStudent{
    private String job;

    public MatureStudent(String job, int age) {
        super();
        setJob(job);
        setAge(age);
    }

    public MatureStudent(String name, int studentid, double marks, String prizes, int age, String job) {
        super(name, studentid, marks, age,prizes);

        if(age >=30) {
            setJob(job);
        }else {
           throw new IllegalArgumentException("Age should be greater than or equal to 30");
        }
    }
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

   @Override
    public int getAge() {
       return super.getAge();
   }

    @Override
    public void setAge(int age) {
        if(age >= 30) {
            super.setAge(age);
        }else{
            throw new IllegalArgumentException("Age should be greater than or equal to 30");
        }
    }
    @Override
    public String toString() {
        return super.toString() + ", Job = " + job + "Age = "+ getAge() + " years old.";
    }
}
