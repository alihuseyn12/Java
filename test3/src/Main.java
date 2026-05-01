//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Ali");
        //binary search

        BinarySearch bs= new BinarySearch();
    int searchNum=bs.binarySearch(new int []{11,12,15,16,17,18,19},0,6,55);

    if(searchNum==-1){
        System.out.println("Not found");
    }else System.out.println(searchNum);


        }
    }
