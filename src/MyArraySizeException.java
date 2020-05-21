public class MyArraySizeException extends RuntimeException {
   int a = 4; // количество строк
   int b = 4; // количество столбцов

    public MyArraySizeException(String message) {
        super(message);

    }



}

