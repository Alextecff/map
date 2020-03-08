public class Car implements Comparable<Car> {
    String mark;
    int year;
    int price;

    public Car(String mark, int year, int price) {
        this.mark = mark;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }
}
