package homeworktwo;

public abstract class Robot {

    private boolean wires;
    private boolean controls;
    private String name;
    //constructor
    public Robot(){
    }
    public Robot(String name, boolean wires, boolean controls){
        this.name = name;
        this.wires = wires;
        this.controls = controls;
    }
    //methods
    public abstract String manual();
    public abstract String job();
    //getters
    public boolean getWires(){
        return this.wires;
    }
    public boolean getControls(){
        return this.controls;
    }
    public String getName(){
        return this.name;
    }
    //setters
    public void setName(String name){
        this.name = name;
    }
    public void setWires(boolean wires){
        this.wires = wires;
    }
    public void setControls(boolean controls){
        this.controls = controls;
    }
}
