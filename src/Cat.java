public class Cat {
    private String name;
    private int age;
    private boolean isMale;

    public Cat(String incomingName, int inComingAge, boolean incomingMale) {
        this.name = incomingName;
        this.age = inComingAge;
        this.isMale = incomingMale;
    }

    public Cat(String incomingName, int inComingAge) {
        this.name = incomingName;
        this.age = inComingAge;

    }

    public Cat(String incomingName, int inComingAge, int isMale) {
        this.name = incomingName;
        this.age = inComingAge;
        this.isMale = isMale > 5;
    }

    public Cat() {
    }

    public void sayMyName() {
        System.out.println(this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String incomingName) {
        this.name = incomingName;
    }


}
