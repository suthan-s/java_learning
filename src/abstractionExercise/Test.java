package abstractionExercise;

public class Test {
    public static void main(String[] args) {
        TouchScreenLaptop hplaptop = new HPNoteBook();
        TouchScreenLaptop delllaptop = new DellNoteBook();
        hplaptop.scroll();
        delllaptop.scroll();
        hplaptop.click();
        delllaptop.click();
    }
}
