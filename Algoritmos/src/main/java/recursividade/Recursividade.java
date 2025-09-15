package recursividade;

public class Recursividade {
    public double fatorial(double num) {
        if (num == 0) {
            return 1;
        }

        double result = num * fatorial(num - 1);
        return result;
    }

    public double fibonacci(double num) {
        if (num <= 2) {
            return 1;
        }

        double result = fibonacci(num - 1) + fibonacci(num - 2);
        return result;
    }
}
