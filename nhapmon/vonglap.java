import java.util.Scanner;
public class vonglap{
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);

        // Nhập số nguyên từ bàn phím
        System.out.print("Nhập một số nguyên: ");
        int userNumber = scanner.nextInt();

        // In ra số nguyên đã nhập
        System.out.println("Số nguyên bạn vừa nhập là: " + userNumber);

        // Đóng đối tượng Scanner sau khi sử dụng
        System.out.println("In ra các số từ 1 đến " + userNumber + " trong vòng lặp:");
        for (int i = 1; i <= userNumber; i++) {
            System.out.println("vong lap lan thu "+i);
        }
        //////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////

        Scanner nhapkytu = new Scanner(System.in);
        System.out.print("Nhap vao  ky tu bat ky: ");

    }
}