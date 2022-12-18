import java.util.Scanner;
public class Third {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input;
        int count = 0;
        double num;
        double[] arr = new double[0];
        System.out.println("Введите числа в массив(введите 'quit' для окончания ввода)");
        while (true){
            input = in.nextLine();
            if (input.equals("quit")){
                break;
            }
            else{
                try{
                    num = Double.parseDouble(input);
                    double[] new_arr = new double[arr.length + 1];
                    for (int i = 0; i<arr.length; i++){
                        new_arr[i] = arr[i];
                    }
                    new_arr[count] = num;
                    arr = new_arr;
                    count++;
                }catch (NumberFormatException x){
                    System.out.println("Некорректный ввод");
                }
            }
        }
        double maximum = arr[0];
        int count_of_max = 1;
        for (int i = 1; i< arr.length; i++){
            if (maximum < arr[i]){
                maximum = arr[i];
                count_of_max++;
            }
        }
        double[] new_arr = new double[count_of_max];
        new_arr[0] = arr[0];
        int k = 0;
        double max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                new_arr[i-k] = max;
            }
            else{
                k++;
            }
        }
        System.out.println("Исходный массив:");
        for (double item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Массив после обработки:");
        for (double item : new_arr) {
            System.out.print(item + " ");
        }
    }
}
