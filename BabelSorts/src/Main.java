public class Main {
    public  static void main(String[] args){



        BabelSort bl= new BabelSort();
        int []arr ={5,8,7,4,22};
        bl.babelSort(arr);

        for (int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}