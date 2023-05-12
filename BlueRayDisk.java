public class BlueRayDisk {
    public String title;
    public String director;
    public int year;
    public double cost;

    public BlueRayDisk() {}
    public BlueRayDisk (String title, String director, int year, double cost) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.cost = cost;
    }

    @Override
    public String toString () {
        return "$" +cost+ " " +year+ " " +title+ ", " +director;
    }
}
