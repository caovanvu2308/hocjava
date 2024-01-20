import java.util.Scanner;
public class nhapvao{
    /**
     * @param args
     */
    public static void main (String[] args){
        String ten;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        ten = scanner.nextInt();
        System.out.println("Ten cua ban la : "+ ten);
    }
}