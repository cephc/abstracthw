package homeworktwo;

public class Hippo extends Animal {

    private boolean swim;
    //constructors
    public Hippo(){
    }
    public Hippo(String name, int legs, boolean tail, boolean fur, boolean swim){
        super(name, legs, tail, fur);
        this.swim = swim;
    }
    //methods
    public String eat(){
        return getName() + " We eat vegetation, we love to eat short grass! ";
    }
    public String run(){
        return getName() + " We can eun up to 19 mph. ";
    }
    public String sleep(){
        return getName() + " We can sleep up to 16 hours a day. ";
    }
}
