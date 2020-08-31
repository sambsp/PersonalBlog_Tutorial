package DefaultMain.Utility;

        import java.text.SimpleDateFormat;
        import java.util.Date;

public class Utility {

    public static String getNowTime() {
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyyMMddHHMMss+08");
        return ft.format(date);
    }
}
