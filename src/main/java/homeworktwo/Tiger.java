package homeworktwo;

public class Tiger extends Feline {

    private boolean sripes;
    //constructors
    public Tiger(){
    }
    public Tiger(String name, int legs, boolean tail, boolean fur, boolean carnivore, boolean spots, boolean stripes){
        super(name, legs, tail, fur, carnivore, spots);
        this.sripes = stripes;
    }
    //methods
    public String pur(){
        return getName() + " We pur when we are content. ";
    }
    public String howl(){
        return getName() + " We howl when we are in conflict. ";
    }
    public String eat(){
        return getName() + " We eat moose, deer, cattle, and more! ";
    }
    public String run(){
        return getName() + " We can run between 30 and 40 mph! ";
    }
    public String sleep(){
        return getName() + " We sleep 18 to 20 hours a day. ";
    }
}
