package in.co.madhur.observer;

public class StatisticsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }

    public void display() {
        System.out.println("Stats conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
