import java.sql.Date;
import java.text.SimpleDateFormat;

public class TestTanggal {
    public static void main(String []args){
        Date HariSekarang = new Date(0);
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd'pada'hh:mm:ss a zzz W F");

        System.out.println("Tanggal dan waktu saat ini : " + ft.format(HariSekarang));
    }
}
