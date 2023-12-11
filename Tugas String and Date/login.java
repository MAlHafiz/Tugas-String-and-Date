import java.util.Scanner;

public class login{

    public String Code[] = {"SKA123","SKB123","PBO321"};
    public String capca;
    public int hitung =-1;

    public void login(){
        String id;
        String password;
        System.out.println("SELAMAT DATANG DI ACIAK MART");
        System.out.println("====================================");
        System.out.println("Log in ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Username         : ");
        id = scan.next();
        System.out.print("Password         : ");
        password = scan.next();

        if(id.equalsIgnoreCase("Admin") && password.equals("qwerty123")){
            int random = 0;
            do{
                if(random>0){
                    System.out.println("Captcha Salah !!!");
                }
                random++;
                hitung ++;
                hitung %=3;
                System.out.println("Kode Captcha     : " + Code[hitung]);
                System.out.print("Entry Captcha    : ");
                Scanner kode = new Scanner(System.in);
                capca = kode.next();

            }while(!capca.equals(Code[hitung]));

            System.out.println("Akun Ditemukan");
        }else{
            System.out.println("Akun Tidak Ditemukan");
        }
    }
}