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

- [x] Làm bài tập về Can't Unsee
    - Đây là một công cụ giúp rèn luyện khả năng phát hiện lỗi giao diện người dùng (UI bugs).

#### 3\. Minh chứng 
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

```
<br>

# Bài tập 3: KIỂM THỬ TỰ ĐỘNG E2E VỚI CYPRESS

## 1. Tổng quan
Trong bài thực hành này, tôi đã tìm hiểu và triển khai framework kiểm thử tự động **Cypress** để thực hiện kiểm thử End-to-End cho trang web thương mại điện tử mẫu [Saucedemo](https://www.saucedemo.com).

**Mục tiêu đạt được:**
- Cài đặt và thiết lập môi trường Cypress.
- Viết kịch bản kiểm thử (Test Scripts) cho các luồng nghiệp vụ chính.
- Xử lý mã nguồn và đồng bộ hóa với Git/GitHub.

## 2. Các kịch bản kiểm thử đã thực hiện

Tôi đã xây dựng các file kiểm thử (Specs) bao gồm các kịch bản sau:

### A. Chức năng Đăng nhập (`login_spec.cy.js`)
- **TC01 - Đăng nhập thành công:**
  - Nhập username/password hợp lệ.
  - Kiểm tra chuyển hướng thành công đến trang `/inventory.html`.
- **TC02 - Đăng nhập thất bại:**
  - Nhập thông tin sai.
  - Kiểm tra hệ thống hiển thị thông báo lỗi: *"Username and<img width="1918" height="1022" alt="login_spec" src="https://github.com/user-attachments/assets/4d76559a-1357-497f-99a7-ee77a7549bbe" />
 password do not match"*.


### B. Chức năng Giỏ hàng & Thanh toán (`cart_spec.cy.js`)
- **TC03 - Thêm sản phẩm vào giỏ:**
  - Thao tác click "Add to cart".
  - Xác minh biểu tượng giỏ hàng hiển thị số lượng là `1`.
- **TC04 - Xóa sản phẩm khỏi giỏ:**
  - Thêm sản phẩm, sau đó click "Remove".
  - Xác minh biểu tượng số lượng trên giỏ hàng biến mất.
- **TC05 - Sắp xếp sản phẩm:**
  - Chọn bộ lọc "Price (low to high)".
  - Kiểm tra giá sản phẩm đầu tiên hiển thị đúng giá thấp nhất.
- **TC06 - Quy trình Thanh toán (Checkout Flow):**
  - Thực hiện luồng: *Thêm giỏ hàng -> Vào giỏ hàng -> Checkout -> Điền thông tin (Họ tên, Zip) -> Continue*.
  - Xác minh chuyển hướng đến trang xác nhận (`/checkout-step-two.html`).
<img width="1918" height="1017" alt="Cart_spec" src="https://github.com/user-attachments/assets/a21fd700-a68a-434a-b6a0-735eeea302ac" />

## 3. Kiến thức kỹ thuật đã học

### Về Cypress Framework
- **Cấu trúc:** Hiểu cách tổ chức thư mục `cypress/e2e`.
- **Commands:** Sử dụng thành thạo các lệnh:
  - `cy.visit()`: Truy cập trang.
  - `cy.get()`: Lấy phần tử theo Selector (ID, Class).
  - `.type()`, `.click()`, `.select()`: Tương tác với UI.
- **Assertions:** Sử dụng `.should()` để kiểm tra kết quả mong đợi (`have.text`, `include`, `be.visible`).
- **Hooks:** Sử dụng `beforeEach()` để giảm thiểu code lặp lại (ví dụ: đăng nhập trước mỗi test case).

### Về Quản lý mã nguồn (Git)
- **Quy trình làm việc:** Thực hành quy trình `git add` -> `git commit` -> `git push`.
- **Xử lý xung đột (Conflict Handling):**
  - Gặp lỗi khi đẩy code lên Remote (do Remote có dữ liệu mới hơn).
  - **Giải pháp:** Sử dụng `git pull origin main` để đồng bộ code về máy local trước khi push lại.
  - Biết cách xử lý màn hình Merge commit trên Vim (dùng lệnh `:wq` để lưu và thoát).

## 4. Kết quả
- [x] Cài đặt môi trường thành công.
- [x] 100% Test cases chạy thành công (Passed).
- [x] Mã nguồn đã được đẩy lên GitHub Repository.




















