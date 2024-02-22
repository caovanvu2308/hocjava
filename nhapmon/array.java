import java.util.Scanner;
public class array{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mang1[] =  new String[10];
        for (int i =0 ; i<10; i++){
            System.out.print("Nhap phan tu cua mang "+ i+": ");
            mang1[i]= scanner.nextLine();
        }
        for(int i =0;i<10;i++){
            System.out.println("------phan tu thu " + i + "cua mang la: "+mang1[i]);
            
        }
    }
}
