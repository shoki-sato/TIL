//例外処理のサンプル（try-catch）

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path p = Path.of("text.txta");
        String s;

        try {
            s = Files.readString(p);
        } catch (NoSuchFileException e) {
            System.out.println("ファイルが見つかりません:" + e.getFile());
            return;
        }
            System.out.println(s);
    }
}
