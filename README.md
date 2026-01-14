### Buổi 1: Làm Quen với Kiểm Thử & ISTQB
- **Ngày học:** 05/01/2026
- **Mục tiêu:** Nắm vững các khái niệm cơ bản về kiểm thử và nền tảng ISTQB.

#### 1\. Nội dung đã học

- [x] Truy cập và tìm hiểu cách học với Trợ giảng AI.
- [x] Tìm hiểu Nền Tảng Kiểm Thử Phần Mềm ISTQB (International Software Testing Qualifications Board).
    - **Key Takeaways:**
        - ISTQB là chứng chỉ được công nhận toàn cầu cho các chuyên gia kiểm thử.
        - Nó chia thành các cấp độ: Foundation, Advanced, Expert.
        - Các nguyên tắc kiểm thử cơ bản (ví dụ: kiểm thử cho thấy sự hiện diện của lỗi, không phải sự vắng mặt của lỗi).

#### 2\. Thực hành & Bài tập

- [x] Làm bài tập về [cantunsee.space/](https://cantunsee.space/).
    - Đây là một công cụ giúp rèn luyện khả năng phát hiện lỗi giao diện người dùng (UI bugs).

#### 3\. Minh chứng (Kết quả bài tập cantunsee.space/)
![cantunsee](https://github.com/user-attachments/assets/3bd1f970-41f6-47bc-8f5c-a43600f39b46)

<br>

# Bài tập tuần 2: Phân tích điểm số học sinh (Student Analyzer)

Dự án này là bài tập thực hành về Kiểm thử phần mềm (Software Testing), tập trung vào việc viết Unit Test cho mã nguồn Java sử dụng thư viện **JUnit**.

## Mô tả bài toán

Chương trình cung cấp lớp `StudentAnalyzer` để xử lý danh sách điểm số của học sinh với các chức năng chính:

1.  **Đếm số học sinh Giỏi:**
    * Input: Danh sách điểm số (List<Double>).
    * Logic: Đếm các điểm `>= 8.0`. Bỏ qua các điểm không hợp lệ (nhỏ hơn 0 hoặc lớn hơn 10).
    * Output: Số lượng học sinh giỏi.
2.  **Tính điểm trung bình hợp lệ:**
    * Input: Danh sách điểm số (List<Double>).
    * Logic: Tính trung bình cộng các điểm nằm trong khoảng `[0, 10]`. Bỏ qua các điểm sai.
    * Output: Điểm trung bình (trả về 0 nếu danh sách rỗng hoặc không có điểm hợp lệ).

## Công nghệ sử dụng

* **Ngôn ngữ:** Java (JDK 17+)
* **Công cụ kiểm thử:** JUnit 5 (Jupiter)
* **IDE:** IntelliJ IDEA / VS Code

## Cấu trúc thư mục

```text
unit-test/
├── src/
│   └── StudentAnalyzer.java      # Mã nguồn chính (Source code)
├── test/
│   └── StudentAnalyzerTest.java  # Mã nguồn kiểm thử (Unit Tests)
├── README.md                     # Tài liệu hướng dẫn























