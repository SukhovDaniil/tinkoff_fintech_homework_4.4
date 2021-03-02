/**
 * Класс, реализующий вычитание
 */
public class Subtractor extends Operation {
    /**
     * Метод, реализующий вычитание
     *
     * @param v1 - уменьшаемое
     * @param v2 - вычитаемое
     * @return - возвращает разность между v1 и v2
     */
    @Override
    public double execute(double v1, double v2) {
        double difference = v1 - v2;
        return difference;
    }
}
