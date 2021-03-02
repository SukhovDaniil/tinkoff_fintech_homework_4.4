/**
 * Класс, реализующий умножение
 */
public class Multiplier extends Operation {

    /**
     * Метод, реализующий умножение
     *
     * @param v1 - первый множитель
     * @param v2 - второй множитель
     * @return - возвращает произведение v1 на v2
     */
    @Override
    public double execute(double v1, double v2) {
        double product = v1 * v2;
        return product;
    }
}
