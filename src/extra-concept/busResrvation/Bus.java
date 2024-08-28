package extra;

public class Bus {
   private int busno;
   private boolean AC;
   private boolean sleeper;
   private int capacity;

    public int getBusno() {
        return busno;
    }

    public void setBusno(int busno) {
        this.busno = busno;
    }

    public boolean isAC() {
        return AC;
    }

    public void setAC(boolean AC) {
        this.AC = AC;
    }

    public boolean isSleeper() {
        return sleeper;
    }

    public void setSleeper(boolean sleeper) {
        this.sleeper = sleeper;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    Bus(int no, boolean AC, boolean sleeper, int capacity){
        this.busno = no;
        this.AC = AC;
        this.sleeper = sleeper;
        this.capacity = capacity;
    }
    public void isDisplayBusDetails(){
        System.out.println("Bus NO: "+busno +" AC " +AC +" Sleeper " +sleeper +" Capacity is " +capacity);
    }

}
