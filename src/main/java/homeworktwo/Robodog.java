package homeworktwo;

public class Robodog extends Robot implements IPet {

    private String noise;
    //constructors
    public Robodog(){
    }
    public Robodog(String name, boolean wires, boolean controls, String noise){
        super(name, wires, controls);
        this.noise = noise;
    }
    //methods
    public String manual(){
        return getName() + " I come with a manual on how to use me as a pet dog. ";
    }
    public String job(){
        return getName() + " My job is to act as a real pet dog would, except I'm way cooler. ";
    }
    public String friendly(){
        return getName() + " I am programmed to be friendly to all living things. ";
    }
    public String domesticated(){
        return getName() + " I am programmed to act as a domesticated dog would. ";
    }
    public String interact(){
        return getName() + " I am programmed to interact with all living things to keep them entertained. ";
    }
}
