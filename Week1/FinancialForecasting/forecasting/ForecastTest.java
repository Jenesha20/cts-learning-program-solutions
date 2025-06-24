package forecasting;

public class ForecastTest {
    public static void main(String[] args) {
        double initialAmount = 1000;
        double growthRate = 0.05;  // 5%
        int periods = 5;

        double futureValueRecursive = FinancialForecast.forecastRecursive(initialAmount, growthRate, periods);
        System.out.println("Recursive forecast: Future value after " + periods + " periods is " + futureValueRecursive);

        double futureValueIterative = FinancialForecast.forecastIterative(initialAmount, growthRate, periods);
        System.out.println("Iterative forecast: Future value after " + periods + " periods is " + futureValueIterative);
    }
}
