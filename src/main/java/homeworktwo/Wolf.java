package homeworktwo;

public class Wolf extends Canine {

    //constructor
    public Wolf(){
    }
    public Wolf(String name, int legs, boolean fur, boolean tail, int paws, boolean sharpTeeth){
        super(name, legs, fur, tail, paws, sharpTeeth);
    }
    //methods
    public String taste(){
        return getName() + " We have an acute sense of taste. ";
    }
    public String smell(){
        return getName() + " We have a great sense of smell. ";
    }
    public String eat(){
        return getName() + " We eat deer, moose, reindeer and more! ";
    }
    public String run(){
        return getName() + " We can run between 31 and 37 mph. ";
    }
    public String sleep(){
        return getName() + " We need up to 8 hours of sleep a day. ";
    }
    public String howler(){
        return getName() + " We howl at the moon! ";
    }
}
