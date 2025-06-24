package forecasting;

public class FinancialForecast {

    public static double forecastRecursive(double initialAmount, double growthRate, int periods) {
        if (periods == 0) {
            return initialAmount;
        }
        return forecastRecursive(initialAmount, growthRate, periods - 1) * (1 + growthRate);
    }

    public static double forecastIterative(double initialAmount, double growthRate, int periods) {
        double result = initialAmount;
        for (int i = 0; i < periods; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }
}
