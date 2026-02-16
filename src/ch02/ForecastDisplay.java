
package ch02;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		System.out.print("기상예보 ");
		if (currentPressure > lastPressure) {
			System.out.println("날씨가 좋아짐");
		} else if (currentPressure == lastPressure) {
			System.out.println("똑같음");
		} else if (currentPressure < lastPressure) {
			System.out.println("춥거나 비옴");
		}
	}
}
