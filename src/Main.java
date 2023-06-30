import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\BaiHoc2\\MD-3-JavaCore\\bai16-Io-file\\thuchanh\\th2-maxNumberFiletext\\src\\test.txt";
        try {
            String content = readFile(filePath);
            int wordCount = countWords(content);
            System.out.println("Số lượng từ trong file: " + wordCount);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }

    public static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }

    public static int countWords(String content) {
        String[] words = content.split("\\s+");
        return words.length;
    }
}