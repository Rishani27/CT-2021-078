package Q_02;

public class Temperature {
    private double fahrenheit;

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return (fahrenheit - 32) * 5 / 9;
    }
}
