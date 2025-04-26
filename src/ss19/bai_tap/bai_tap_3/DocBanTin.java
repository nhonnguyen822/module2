package ss19.bai_tap.bai_tap_3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocBanTin {
    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi/ong-trump-tuyen-bo-da-dat-duoc-200-thoa-thuan-thuong-mai-20250426084718961.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+", "");
            Pattern pattern = Pattern.compile("<p>(.*?)</p>");
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
