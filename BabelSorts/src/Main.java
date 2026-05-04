import java.util.Scanner;

public  class Main {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        BabelSort bs=new BabelSort();

        int []arr=new int[5];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=scanner.nextInt();

        }
        bs.babelSort(arr);
        bs.print(arr);
        scanner.close();






    }
}