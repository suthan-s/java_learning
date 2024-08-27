package abstractionExercise;

public abstract class DellLaptop implements TouchScreenLaptop{
    public void scroll(){
        System.out.println("Scroll method from DellLaptop");
    }
    public abstract void click();
}
