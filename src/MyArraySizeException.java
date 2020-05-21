public class MyArraySizeException extends RuntimeException {
   int a; // количество строк
   int b; // количество столбцов

    public MyArraySizeException(String message) {
        super(message);

    }



}

