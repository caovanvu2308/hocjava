import java.util.Scanner;
public class vonglap{
    public static void main (String []args){
        Scanner nhap = new Scanner(System.in);
        System.out.print("Hay nhap so ma ban muon lap: ");
        String nhapvao = nhap.nextLine();
        // Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String userInput = scanner.nextLine();
        // Đóng đối tượng Scanner sau khi sử dụng
        scanner.close();
    



        for (int i=1; i<10;i++){
             System.out.println("Xin chao day la 10 vong lap: "+ i);
        }
    
    }
}