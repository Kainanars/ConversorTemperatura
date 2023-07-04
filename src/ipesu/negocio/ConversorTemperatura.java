package ipesu.negocio;

public class ConversorTemperatura {
    public double converterParaCelsius(double fahrenheit) {
        return 5.0 / 9.0 * (fahrenheit - 32);
    }
}
