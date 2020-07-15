import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @program: cloud01
 * @description: 测试
 * @author: Hasee
 * @create: 2020-07-15 15:07
 */
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); //默认时区
        System.out.println(zbj); //2020-07-15T15:10:46.401+08:00[Asia/Shanghai]
//        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); //用指定时区获取当前时间
//        System.out.println(zny);

    }
}
