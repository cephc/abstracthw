package homeworktwo;

public abstract class Canine extends Animal {

    private int paws;
    private boolean sharpTeeth;
    //constructors
    public Canine(){
    }
    public Canine(String name, int legs, boolean fur, boolean tail, int paws, boolean sharpTeeth){
        super(name, legs, fur, tail);
        this.paws = paws;
        this.sharpTeeth = sharpTeeth;
    }
    //methods
    public String taste(){
        return "We have an acute sense of taste. ";
    }
    public String smell(){
        return "We have a great sense of smell. ";
    }
    public String eat(){
        return "We eat raw meat, bones, and organs. ";
    }
    public String run(){
        return "We can run between 15 and 45 mph. ";
    }
    public String sleep(){
        return "We need about 12 to 14 hours of sleep a day. ";
    }
}
