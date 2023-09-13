package j.pkg1.s.p0008;

import java.util.Scanner;
import java.util.Map;

public class Controll {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your comment: ");
        String userInput = scanner.nextLine();
        scanner.close();

        Count analyzer = new Count(userInput);

        Map<String, Integer> wordCountMap = analyzer.countWords();
        // Gọi phương thức countWords để đếm từ và lưu kết quả trong map.
        System.out.println(formatMap(wordCountMap));

        Map<Character, Integer> letterCountMap = analyzer.countLetters();
        //Gọi phương thức countLetters để đếm chữ cái và lưu kết quả trong map.
        System.out.println(formatMap(letterCountMap));
    }

    private static <K, V> String formatMap(Map<K, V> map) {
        StringBuilder builder = new StringBuilder("{ ");
        //Tạo một đối tượng StringBuilder để xây dựng chuỗi kết quả.
        // Duyệt qua map và thêm chúng vào chuỗi kết quả.
        for (Map.Entry<K, V> entry : map.entrySet()) {
            builder.append(entry.getKey()).append(" = ").append(entry.getValue()).append(", ");
        }
        builder.setLength(builder.length() - 2); 
        // Loại bỏ ký tự ", " cuối cùng.
        builder.append(" }");
        // Đóng chuỗi kết quả với " }"
        return builder.toString();
        // Trả về chuỗi kết quả đã định dạng.
    }
}  