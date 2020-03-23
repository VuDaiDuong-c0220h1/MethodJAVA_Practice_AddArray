import java.util.Scanner;

public class Element {
    public static void main(String[] args) {
        int []array1 = new int[2];
        int []array2 = new int[4];
        int []array3 = new int[6];
        System.out.println("Nhập phẩn tử cho mảng thứ nhất:");
        addElement(array1);
        System.out.println("Nhập phẩn tử cho mảng thứ hai:");
        addElement(array2);
        for (int i=0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length+i] = array2[i];
        }
        for (int value : array3) {
            System.out.print(value + "\t");
        }
    }
    public static void addElement (int[]array){
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ " + (i+1) + ":");
            array[i]= sc.nextInt();
        }
    }
}
