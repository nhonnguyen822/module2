package ss19.thuc_hanh.thuc_hanh_1;

import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocDanhSachBaiHat {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://v11.nhaccuatui.com/chu-de/nhac-viet.wrdastbhw.html");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream(), StandardCharsets.UTF_8));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+", "");
            Pattern pattern=Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher= pattern.matcher(content);
            while (matcher.find()){
                System.out.println(matcher.group(1));
            }
        } catch (Exception E) {
            System.out.println(E.getMessage());
        }
    }

}
///<a href="https://v11.nhaccuatui.com/playlist/v-pop-thinh-hanh-va.2JtgoYqhvgHL.html" l="off" onclick="NCTNowPlaying.playSong(4); return false;" title="Nghe bài hát Dù Cho Tận Thế - ERIK ở cửa sổ mới" class="name_song">Dù Cho Tận Thế</a>