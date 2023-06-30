import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File khong ton tai: ");
        }
        return number;
    }
    public void wireFile(String flePath, int max){
        try {
            FileWriter writer = new FileWriter(flePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là : "+max);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
