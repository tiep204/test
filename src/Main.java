import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\BaiHoc2\\MD-3-JavaCore\\bai16-Io-file\\thuchanh\\th2-maxNumberFiletext\\src\\test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            String[] words = content.toString().split("\\s+");
            int wordCount = words.length;
            System.out.println("Số lượng từ trong file: " + wordCount);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }
}

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class WordCount {
//    public static void main(String[] args) {
//        String filePath = "duong_dan_file.txt";
//
//        try {
//            int wordCount = countWordsInFile(filePath);
//            System.out.println("Số lượng từ trong file: " + wordCount);
//        } catch (IOException e) {
//            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
//        }
//    }
//
//    public static int countWordsInFile(String filePath) throws IOException {
//        StringBuilder content = new StringBuilder();
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                content.append(line).append("\n");
//            }
//        }
//
//        String[] words = content.toString().split("\\s+");
//        return words.length;
//    }
//}