public class MyArrayDataException extends Exception {
    int c;
    int d;

    public MyArrayDataException(int c, int d) {
        super(String.format("Неверные данные находятся в ячейке [%d, %d]\n", c, d));

    }
}
