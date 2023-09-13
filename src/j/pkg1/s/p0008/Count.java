package j.pkg1.s.p0008;

import java.util.HashMap;
import java.util.Map;


public class Count {
  private String input;

    public Count(String input) {
        this.input = input;
    }
    //Phương thức để đếm số từ trong chuỗi đầu vào và trả về mot map chứa số lần xuất hiện của từng từ.

    public Map<String, Integer> countWords() {
        String[] words = input.split("\\s+"); // Tách chuỗi đầu vào thành một mảng các từ.
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {  // Vòng lặp này duyệt qua mảng các từ đã tách.
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
     // Trả về bản đồ chứa số lần xuất hiện của từng từ.
        return wordCountMap;
    }
    // Phương thức để đếm số lượng chữ cái trong chuỗi đầu vào và trả về một bản đồ chứa số lần xuất hiện của từng chữ cái.
    public Map<Character, Integer> countLetters() {
        Map<Character, Integer> letterCountMap = new HashMap<>();// Khởi tạo một đối tượng HashMap để lưu trữ đếm chữ cái.
    // Vòng lặp này duyệt qua từng ký tự trong chuỗi đầu vào.
        for (char c : input.toCharArray()) {  
            if (Character.isLetter(c)) {//Chuyển ký tự thành chữ thường để đếm không phân biệt hoa thường.
                char lowercaseChar = Character.toLowerCase(c);
                letterCountMap.put(lowercaseChar, letterCountMap.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

        return letterCountMap;
    }
     private static <K, V> String formatMap(Map<K, V> map) {
        StringBuilder builder = new StringBuilder("{ ");//Tạo một đối tượng StringBuilder để xây dựng chuỗi kết quả.
       // Duyệt qua map và thêm chúng vào chuỗi kết quả.
        for (Map.Entry<K, V> entry : map.entrySet()) {
            builder.append(entry.getKey()).append(" = ").append(entry.getValue()).append(", ");
        }
        builder.setLength(builder.length() - 2);  // Loại bỏ ký tự ", " cuối cùng.
        builder.append(" }");// Đóng chuỗi kết quả với " }"
        return builder.toString();// Trả về chuỗi kết quả đã định dạng.
    }
}