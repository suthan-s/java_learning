package abstractionExercise;

public abstract class HPLaptop implements TouchScreenLaptop{
    public void scroll(){
        System.out.println("Scroll method from HPLaptop");
    }
    public abstract void click();
}
