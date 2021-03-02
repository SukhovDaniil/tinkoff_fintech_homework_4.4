/**
 * Класс, реализующий сложение
 */
public class Adder extends Operation {

    /**
     * Метод, реализующий сложение
     *
     * @param v1 - первое слагаемое
     * @param v2 - второе слагаемое
     * @return - возвращает сумму v1 и v2
     */
    @Override
    public double execute(double v1, double v2) {
        double sum = v1 + v2;
        return sum;
    }
}