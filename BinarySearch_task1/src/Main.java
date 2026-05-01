import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static  void  main(String[] args){
     BinarySearch bs=new BinarySearch();
     int []arr={25,35,45,55,65,75,85,95,96,97};
     var searchNum=bs.binarySearch(arr,0,arr.length-1,35);
     if(searchNum==-1){
         System.out.println("Number not found");
     }
    }
}