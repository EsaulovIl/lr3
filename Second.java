import java.util.Scanner;
public class Second {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input;
        int count = 0, num;
        int[] arr = new int[0];
        System.out.println("Введите числа в массив(введите 'quit' для окончания ввода)");
        while (true){
            input = in.nextLine();
            if (input.equals("quit")){
                break;
            }
            else{
                try{
                    num = Integer.parseInt(input);
                    int[] new_arr = new int[arr.length + 1];
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
        System.out.println("Введите число к удалению: ");
        int deleted_number;
        while (true){
            try{
                deleted_number = Integer.parseInt(in.nextLine());
                break;
            }catch (NumberFormatException x){
                System.out.println("Ошибка, массив и число к удалению должны быть целыми");
            }
        }
        int count_of_deleted_number = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == deleted_number){
                count_of_deleted_number++;
            }
        }
        int[] processed_arr = new int[arr.length - count_of_deleted_number];
        int k = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == deleted_number){
                k++;
            }
            else{
                processed_arr[i-k] = arr[i];
            }
        }
        System.out.println("Исходный массив:");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println("Массив после обработки:");
        for (int item : processed_arr) {
            System.out.print(item + " ");
        }
    }
}