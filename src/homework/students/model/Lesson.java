package homework.students.model;

public class Lesson {
    private String name;
    private String teachername;
    private int duration;
    private double price;

    public Lesson(String name, String teachername, int duration, double price) {
        this.name = name;
        this.teachername = teachername;
        this.duration = duration;
        this.price = price;
    }

    public Lesson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "name='" + name + '\'' +
                ", teachername='" + teachername + '\'' +
                ", duration=" + duration +
                ", price=" + price +
                '}';
    }
}
