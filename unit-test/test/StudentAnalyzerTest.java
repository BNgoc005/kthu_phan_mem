import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentAnalyzerTest {

    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // --- TEST CHO HÀM countExcellentStudents ---

    @Test
    public void testCountExcellentStudents_NormalCase() {
        // Danh sách có điểm giỏi, khá, và điểm không hợp lệ
        List<Double> scores = Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0, 5.0);
        // Kỳ vọng: 9.0 và 8.5 là giỏi (2 người). 11.0 và -1.0 bị bỏ qua.
        assertEquals(2, analyzer.countExcellentStudents(scores), "Phải đếm đúng số lượng học sinh giỏi bỏ qua điểm sai");
    }

    @Test
    public void testCountExcellentStudents_EmptyList() {
        // Trường hợp biên: Danh sách rỗng
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()), "Danh sách rỗng phải trả về 0");
    }

    @Test
    public void testCountExcellentStudents_AllInvalid() {
        // Trường hợp ngoại lệ: Tất cả điểm đều sai
        List<Double> scores = Arrays.asList(-5.0, 10.1, 100.0);
        assertEquals(0, analyzer.countExcellentStudents(scores), "Không có điểm hợp lệ nào thì kết quả là 0");
    }

    @Test
    public void testCountExcellentStudents_Boundary() {
        // Trường hợp biên: Điểm ngay ngưỡng 8.0 và 10.0
        List<Double> scores = Arrays.asList(8.0, 10.0, 7.99);
        // 8.0 và 10.0 là giỏi. 7.99 không phải.
        assertEquals(2, analyzer.countExcellentStudents(scores), "Điểm 8.0 và 10.0 phải được tính là giỏi");
    }

    // --- TEST CHO HÀM calculateValidAverage ---

    @Test
    public void testCalculateValidAverage_NormalCase() {
        // Các điểm hợp lệ: 9.0, 8.0, 7.0. Tổng = 24. Trung bình = 8.0
        // Điểm -1.0 và 20.0 bị loại.
        List<Double> scores = Arrays.asList(9.0, 8.0, 7.0, -1.0, 20.0);
        assertEquals(8.0, analyzer.calculateValidAverage(scores), 0.001, "Tính trung bình phải bỏ qua điểm sai");
    }

    @Test
    public void testCalculateValidAverage_EmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.001, "Danh sách rỗng trả về 0.0");
    }

    @Test
    public void testCalculateValidAverage_OnlyInvalidScores() {
        // Danh sách có phần tử nhưng toàn bộ không hợp lệ -> Coi như rỗng
        List<Double> scores = Arrays.asList(-10.0, 15.0);
        assertEquals(0.0, analyzer.calculateValidAverage(scores), 0.001, "Chỉ có điểm sai thì trung bình là 0.0");
    }

    @Test
    public void testCalculateValidAverage_Rounding() {
        // Test độ chính xác số thực
        // 10 + 9 + 8 = 27 / 3 = 9.0
        List<Double> scores = Arrays.asList(10.0, 9.0, 8.0);
        assertEquals(9.0, analyzer.calculateValidAverage(scores), 0.001);
    }
}