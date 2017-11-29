import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 关键字：
 *      被java语言富裕特定含义的单词
 * 关键字特点：
 *      组成关键字的单词全部都是小写
 * 注意：
 *      goto和const作为保留字，目前不是关键字，不过JDK升级后可以回事关键字
 *      想notepad++这样的高级编辑器会对关键字有不同的颜色标记
 */
class KeyWordDemo {
    public static void main(String[] arges) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = dateFormat.format(date);

        System.out.println(format);
    }
}