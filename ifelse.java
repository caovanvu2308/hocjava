import java.util.Scanner;
public class ifelse {
    public static void main (String[] args){
        int  nhap; 
        Scanner nhapten = new Scanner(System.in);
        System.out.print("Nhap vao ban phim so cua ban: " );
        nhap = nhapten.nextInt();                          // print va println khac nhau
        System.out.println("So ban vua nhap la : "+ nhap);    // print khong xuong dong khi ket thuc chuong trinh
                                                            // println ket thuc khi xuong dong
        if(nhap %2 == 0 ){
            System.out.println( nhap + " la so chan.");
        }
        else 
            System.out.println( nhap + " la so le.");

    }
}
