import java.util.Scanner;
public class giaithua {
    public static void main(String[] args) {
        int giaithua;
        Scanner gt = new Scanner(System.in);
        System.out.print("Nhap vao so cua ban muon tinh giai thua: ");
        giaithua =  gt.nextInt();
        while ( giaithua <= 0 || giaithua >20 ) {
            System.out.print("Vui long nhap lai : ");
            giaithua =  gt.nextInt();
            
        }
        // while (int n == giaithua){
            
        }
        
    }

