import java.util.Scanner;

//Kí hiệu bàn cờ: https://en.wikipedia.org/wiki/Algebraic_notation_(chess)#/media/File:SCD_algebraic_notation.svg
//        ## Bài 1
//        Kiểm tra nước đi đúng của quân tượng:
//        - Từ Console yêu cầu nhập vị trí của quân tượng:
//        ví dụ: a1 = [1][1]
//        - Sau đó nhập nước đi:
//        ví dụ: b3 => trả về kết quả FALSE
//        ví dụ: c3 => trả về kết quả TRUE
//        ## Bài 2
//        Số bước đi nhỏ nhất của quân TƯỢNG từ vị trí A đến vị trí B khi có quân cản
//        - Từ Console yêu cầu nhập vị trí A và vị trí B:
//        - Ví dụ:	nhập vào: "a1=>c5"
//        nhập vào quân cản: "c3;d2"
//        => Trả về: a1=>b2=>a3=>c5
public class main {
    public static void main(String[] args) {
        //ý a
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Nhập vị trí hiện tại của con Tịnh:");
        String x = input.nextLine();
        int y = Integer.parseInt(String.valueOf(x.charAt(1)));
        int number = (x.charAt(0) - 96);

        conTinh conTinh1 = new conTinh(number, y);
        System.out.println("Nhập vị trí cần kiểm tra của con Tịnh:");
        String a = input1.nextLine();
        int b = Integer.parseInt(String.valueOf(a.charAt(1)));
        int number1 = (a.charAt(0) - 96);
        conTinh conTinh2 = new conTinh(number1, b);
        boolean check = conTinh1.diChuyen(conTinh1, conTinh2);
        if (check) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }
        //ý b
        System.out.println("Nhập số quân cản: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println();
        }
    }
    public void nhap(){

    }
}
