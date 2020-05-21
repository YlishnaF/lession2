
public class Main {
    public static void main(String[] args) {

        String[][] arr = {{"s", "1", "1"},{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "1", "1", "1"}};
        try {
            findEr(4, 4, arr);
        }
        catch (MyArrayDataException e){
            e.printStackTrace();
        }
        catch (MyArraySizeException e){
            e.printStackTrace();
        }
    }


    static void findEr(int a, int b, String[][] arr) throws MyArrayDataException {
        int sum = 0;
        if(arr.length !=a){
            throw new MyArraySizeException("Неверный размер массива, должен быть a*b");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i].length != b){
                    throw new MyArraySizeException("Неверный размер массива, должен быть a*b");
                }

                try {
                    sum +=Integer.parseInt(arr[i][j]);
                }
                catch (Exception e){
                    throw new MyArrayDataException(i,j);
                }

            }

        }
        System.out.println(sum);

    }
}
