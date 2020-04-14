package abstraction;

abstract class Animal {
    public int age;
    public String gender;

    public boolean isMammal(){
        return true;
    }
    public void mate(){
        System.out.println("mate");
    }
}
