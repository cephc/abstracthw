package homeworktwo;

public class Agent extends Robot {

    //constructor
    public Agent(){
    }
    public Agent(String name, boolean wires, boolean controls){
        super(name, wires, controls);
    }

    public String manual(){
        return getName() + " I am programmed to follow my manual. Here's a copy of it. ";
    }
    public String job(){
        return getName() + " My job is to spy on people to uncover secret information. ";
    }
}
