import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String usarName,password;
        System.out.print("Kullanıcı Adınız :");
        usarName=scanner.nextLine();
        System.out.print("Kullanıcı Şifreniz :");
        password=scanner.nextLine();
        if (usarName.equals("natsu") && password.equals("123654")){
            System.out.println(".........................");
            System.out.println("Başarılı bir şekilde giriş yapıldı.");
        }else {
            System.out.println("Kullanıcı Bilgileri Yanlış!\nLütfen Tekrar Deneyiniz.");
        }
    }
}