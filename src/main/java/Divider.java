/**
 * Класс, реализующий деление
 */
public class Divider extends Operation {

    /**
     * Метод, реализующий деление
     *
     * @param v1 - делимое
     * @param v2 - делитель
     * @return - возвращает частное от деления v1 на v2
     */
    @Override
    public double execute(double v1, double v2) {
        double quotient = v1 / v2;
        return quotient;
    }
}
