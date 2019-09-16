public class Building {
    private double height;
    private double width;
    private double length;
    private int numberOfRooms;

    public Building() {
    }

    public Building(double height, double width, double length, int numberOfRooms) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.numberOfRooms = numberOfRooms;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public void printNumberOfRooms(){
        System.out.println("This prints out the number of rooms which is: " + getNumberOfRooms());

    }
}
