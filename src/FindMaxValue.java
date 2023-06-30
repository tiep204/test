import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> integers){
        int max = integers.get(0);
        for (int i = 0; i < integers.size(); i++) {
            if (max<integers.get(i)){
                max= integers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        String PATH_NUMBER = "D:\\BaiHoc2\\MD-3-JavaCore\\bai16-Io-file\\thuchanh\\th2-maxNumberFiletext\\src\\test.txt";
        String PATH_RESULT = "D:\\BaiHoc2\\MD-3-JavaCore\\bai16-Io-file\\thuchanh\\th2-maxNumberFiletext\\src\\test.txt";
        List<Integer> integerList = readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMax(integerList);
        readAndWriteFile.wireFile(PATH_RESULT,maxValue);
    }
}
