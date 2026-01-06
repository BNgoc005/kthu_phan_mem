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


---
<br><br>
# Bài 1: Nguyên tắc của kiểm thử
- Nguyên tắc kiểm thử phần mềm để đảm bảo chất lượng sản phẩm. Việc áp dụng các nguyên tắc này sẽ giúp phát hiện và sửa chữa lỗi kịp thời, từ đó nâng cao sự hài lòng của người dùng.
- **7 Nguyên tắc kiểm thử phần mềm (ISTQB)**
    - **Kiểm thử đưa ra bằng chứng về sự hiện diện của lỗi**: Kiểm thử chỉ có thể chứng minh phần mềm có lỗi, chứ không thể khẳng định phần mềm không còn lỗi 100%.
    - **Kiểm thử kiệt xuất là không thể**: Không thể kiểm thử mọi sự kết hợp của dữ liệu và điều kiện. Thay vào đó, tập trung vào các rủi ro và mức độ ưu tiên.
    - **Kiểm thử càng sớm càng tốt (Early Testing)**: Nên bắt đầu kiểm thử ngay từ khi có yêu cầu (requirements). Lỗi phát hiện càng sớm thì chi phí khắc phục càng rẻ.
    - **Sự tập trung của lỗi (Defect Clustering)**: Thông thường, phần lớn các lỗi nghiêm trọng chỉ nằm tập trung ở một vài module cốt lõi của hệ thống.
    - **Nghịch lý thuốc trừ sâu (Pesticide Paradox)**: Nếu một bộ test case cứ lặp đi lặp lại mãi, nó sẽ không còn khả năng tìm thấy lỗi mới. Bạn cần cập nhật kịch bản kiểm thử thường xuyên.
    - **Kiểm thử phụ thuộc vào ngữ cảnh**: Kiểm thử một ứng dụng ngân hàng (độ an toàn cao) sẽ khác hoàn toàn với kiểm thử một trang web tin tức (tốc độ cập nhật).
    - **Sự sai lầm về việc "không có lỗi"**: Một hệ thống chạy ổn định nhưng không đáp ứng đúng nhu cầu của người dùng thì vẫn bị coi là một sản phẩm thất bại.

### 1\. Tổng quan về Kiểm thử (Slide 1-2)
#### 1.1 Tầm quan trọng của Kiểm thử phần mềm
- Kiểm thử là giúp phát hiện lỗi đảm bảo phần mềm đáp ứng được yêu cầu của người dùng.
* **Phát hiện lỗi sớm:** Xác định các sai sót trước khi sản phẩm đến tay người dùng.
* **Đảm bảo yêu cầu:** Xác nhận phần mềm đáp ứng đúng nhu cầu thực tế của khách hàng.
* **Cải thiện chất lượng:** Giúp sản phẩm ổn định và đáng tin cậy hơn.
#### **Ví dụ thực tế:**
1. **Kiểm thử chức năng (Functional Testing):** Kiểm tra xem nút "Đăng nhập" có thực hiện đúng nhiệm vụ của nó không.
2. **Kiểm thử hồi quy (Regression Testing):** Sau khi sửa lỗi A, ta kiểm tra lại toàn bộ hệ thống để đảm bảo việc sửa lỗi đó không làm hỏng chức năng B vốn đang chạy bình thường.


### 2. Tiêu chuẩn và Thuật ngữ (BS 7925-1) (Slide 3)
**Vai trò của BS 7925-1:** * Cung cấp một **từ điển thuật ngữ kiểm thử** chuẩn hóa.
    * Tập trung đặc biệt vào **Kiểm thử thành phần (Component Testing)**.
    * Được phát triển bởi BCS SIGIST và đã được tổ chức **ISEB/ISTQB** chính thức công nhận.
    
##### Các cấp độ kiểm thử:

* **Kiểm thử thành phần (Component Testing):** Kiểm tra từng đơn vị nhỏ nhất của mã nguồn.
* **Kiểm thử tích hợp (Integration Testing):** Kiểm tra sự tương tác giữa các thành phần sau khi kết hợp.
* **Kiểm thử hệ thống (System Testing):** Kiểm tra toàn bộ hệ thống đã hoàn thiện để đảm bảo đáp ứng yêu cầu.

> #### => Tiêu chuẩn **BS 7925-1** không đơn thuần là từ vựng, mà là **nền tảng chung** giúp:
> 1. Nâng cao hiệu quả giao tiếp trong dự án.
> 2. Tránh hiểu lầm về quy trình và nhiệm vụ.
> 3. Đảm bảo tính đồng nhất và chất lượng cho sản phẩm cuối cùng.


### 3. Bug, Độ tin cậy và Hệ quả của lỗi phần mềm (Slide 4-8)
#### 3.1 Phân biệt Error - Fault - Failure
**"Bug"** được chia thành 3 giai đoạn để xác định đúng nguồn gốc và biểu hiện của vấn đề:
- **Lỗi (Error/Mistake)**: Là hành động sai sót của con người trong quá trình viết mã hoặc thiết kế.
- **Khuyết điểm (Fault/Bug/Defect)**: Là sự hiện diện của lỗi trong mã nguồn; một vấn đề tiềm ẩn có thể không được phát hiện ngay.
- **Thất bại (Failure)**: Là sự sai lệch thực tế của phần mềm so với kết quả mong đợi khi vận hành (phần mềm không hoạt động đúng như mong đợi).
> => **Chuỗi logic**: Con người mắc **Error** $\rightarrow$ Tạo ra **Fault** trong mã $\rightarrow$ Khi thực thi dẫn đến **Failure**.

#### 3.2 Độ tin cậy của phần mềm (Software Reliability)
- Là khả năng phần mềm không gây ra sự cố cho hệ thống trong một khoảng thời gian nhất định dưới các điều kiện quy định.
```
NOTE: Độ tin cậy KHÔNG ĐỒNG NGHĨA với việc không có lỗi. Một hệ thống có thể chứa lỗi nhỏ nhưng vẫn được coi là tin cậy nếu nó xử lý các chức năng quan trọng (như giao dịch ngân hàng) chính xác và an toàn.
```

#### 3.3 Nguyên nhân gây ra lỗi phần mềm
Lỗi là điều bình thường vì phần mềm được viết bởi con người. Các nguyên nhân chính bao gồm:
- **Yếu tố con người**: Dù có kỹ năng nhưng con người không hoàn hảo và vẫn có thể mắc sai sót.
- **Áp lực thời gian**: Thời hạn bàn giao sản phẩm quá ngắn làm tăng khả năng bỏ qua các bước kiểm thử quan trọng.
- **Thiếu sót trong kiểm tra**: Không kiểm tra kỹ các điều kiện biên hoặc giả định sai lệch.

#### 3.4 Hệ quả và Thiệt hại của lỗi phần mềm
Lỗi phần mềm có thể gây ra những thiệt hại từ mức độ bất tiện nhỏ đến tổn thất tài chính khổng lồ: 

| Tên dự án | Thiệt hại (USD) | Mức độ ảnh hưởng |
| :--- | :---: | :--- |
| **Tên lửa Ariane 5** | 7 Tỷ | Thất bại hoàn toàn trong quá trình phóng. |
| **Tàu thăm dò Mariner** | 250 Triệu | Lỗi phần mềm khi bay đến sao Kim. |
| **American Airlines** | 50 Triệu | Gây tổn thất lớn về vận hành và tài chính. |


### 4. Hệ thống an toàn, Tầm quan trọng và Mức độ kiểm thử (Sl 9-14)
#### 4.1 Hệ thống an toàn quan trọng (Safety-Critical Systems)
Đây là những hệ thống mà lỗi phần mềm có thể dẫn đến hậu quả thảm khốc về người và tài sản.
- **Định nghĩa**: Hệ thống mà sự thất bại có thể gây tử vong hoặc thương tích nghiêm trọng.
- **Các ví dụ điển hình về hậu quả**:
    - **Y tế (Therac-25)**: Lỗi phần mềm điều trị bức xạ gây tử vong cho nhiều bệnh nhân.
    - **Giao thông**: Tai nạn tàu hỏa và máy bay (Airbus, Korean Airlines) do lỗi hệ thống điều khiển.
    - **Tâm lý**: Lỗi hệ thống thấu chi ngân hàng gây áp lực tâm lý nặng nề, dẫn đến tự tử.
 
#### 4.2 Tại sao cần kiểm thử phần mềm?
Kiểm thử không chỉ là tìm lỗi mà còn là bảo hiểm cho doanh nghiệp:
- **Phát hiện lỗi tiềm ẩn**: Tránh mất dữ liệu hoặc hỏng hóc hệ thống sau khi phát hành.
- **Tăng cường độ tin cậy**: Bảo vệ danh tiếng và vị thế cạnh tranh của công ty.
- **Tối ưu chi phí**: Việc sửa lỗi sau khi phát hành luôn tốn kém hơn nhiều so với kiểm thử sớm.

#### 4.3 Phương pháp tiếp cận có hệ thống
Chúng ta không thể "kiểm thử mọi thứ" một cách ngẫu nhiên vì con số có thể quá lớn.

- **Ví dụ về sự bùng nổ tổ hợp**: Một hệ thống nhỏ với 20 màn hình và các trường nhập liệu có thể tạo ra tới **480,000 bài kiểm tra**. Nếu mỗi bài mất 1 giây, bạn cần tới **17.7 ngày** để chạy hết (chưa tính thời gian sửa lỗi).
- **Giải pháp**: Cần một kế hoạch kiểm thử tổ chức tốt để tiết kiệm thời gian và nguồn lực.

#### 4.4 Kiểm thử bao nhiêu là đủ?
Mức độ kiểm thử phụ thuộc vào **Rủi ro** của từng hệ thống.
| Tiêu chí | Mô tả chi tiết |
| :---: | :--- |
| **Dựa trên kế hoạch** | Khi đã thực hiện xong tất cả các kịch bản dự định. |
| **Dựa trên sự hài lòng** | Khi khách hàng hoặc hệ thống đáp ứng đủ các yêu cầu cần thiết. |
| **Dựa trên sự tự tin** | Khi đội ngũ phát triển đủ tin tin để phát hành sản phẩm. |
| **Dựa trên rủi ro** | Tùy thuộc vào mức độ nguy hiểm nếu hệ thống gặp sự cố. |

#### 4.5 Rủi ro khi kiểm thử không đầy đủ
Việc định lượng mức độ kiểm thử dựa trên rủi ro giúp tránh:
- **Mất uy tín**: Khách hàng mất lòng tin vào sản phẩm kém chất lượng.
- **Chi phí thất bại**: Chi phí khắc phục sự cố ngoài thực tế cao hơn gấp nhiều lần chi phí kiểm thử.
- **Bỏ sót lỗi nghiêm trọng**: Dẫn đến trải nghiệm người dùng tồi tệ hoặc gây nguy hiểm.


### 5. Chiến lược Kiểm thử dựa trên Rủi ro và Tiêu chuẩn Ngành (Sl 15-18)
#### 5.1 Kiểm thử dựa trên Rủi ro (Risk-Based Testing)
- **Tại sao cần phân tích rủi ro?**
    - Quyết định nên kiểm thử cái gì trước và tập trung vào đâu nhất.
    - Xác định mức độ chi tiết cần thiết cho từng hạng mục.
    - Loại bỏ những hạng mục không quan trọng để tối ưu nguồn lực.
- **Hệ quả của việc bỏ qua rủi ro**
    - **Bỏ sót lỗi nghiêm trọng**: Dẫn đến trải nghiệm người dùng kém.
    - **Tổn thất tài chính**: Chi phí sửa lỗi sau phát hành cao hơn nhiều lần so với kiểm thử trước đó.
    - **Mất uy tín**: Ảnh hưởng trực tiếp đến lòng tin khách hàng và thị phần doanh nghiệp.

#### 5.2 Nguyên tắc ưu tiên (Prioritization)
Mục tiêu là thực hiện các case **có giá trị cao nhất** trong thời gian cho phép.
- **Cách tiếp cận**: Tập trung vào các tính năng quan trọng nhất (ví dụ: Thanh toán, Bảo mật, Đăng nhập) trước khi kiểm thử các phần phụ như giao diện.
- **Giá trị mang lại**: Đảm bảo rằng khi dừng kiểm thử, bạn đã hoàn thành những kiểm thử tốt nhất có thể, giảm thiểu các rủi ro lớn nhất cho sản phẩm.

#### 5.3 Mục tiêu và Đối tượng kiểm thử
Kiểm thử không chỉ là tìm lỗi mà còn để cải thiện chất lượng và độ tin cậy.
- **Yếu tố chức năng**: Đảm bảo hệ thống hoạt động chính xác theo yêu cầu (ví dụ: thực hiện giao dịch ngân hàng an toàn).
- **Yếu tố phi chức năng**:
    - **Độ tin cậy & Hiệu năng**: Hoạt động ổn định khi có nhiều người truy cập cùng lúc.
    - **Khả năng sử dụng (Usability)**: Dễ sử dụng cho người dùng.
    - **Khả năng bảo trì & tái sử dụng**: Dễ dàng sửa chữa và nâng cấp về sau.

#### 5.4 Các yếu tố ảnh hưởng đến mức độ kiểm tra
Mức độ kiểm thử cần thiết còn bị chi phối bởi các ràng buộc ngoại cảnh:
| Loại yêu cầu | Ý nghĩa | Ví dụ |
| :--- | :--- | :--- |
| **Yêu cầu Hợp đồng** | Các quy định đã ký kết với khách hàng. | Tiêu chuẩn bàn giao sản phẩm. |
| **Yêu cầu Pháp lý** | Các quy định của luật pháp nước sở tại. | Luật an toàn thông tin, bảo mật dữ liệu. |
| **Yêu cầu theo Ngành** | Các tiêu chuẩn đặc thù của từng lĩnh vực. | Tiêu chuẩn FDA (Dược phẩm), Điều khiển không lưu (Hàng không). |


### 6. Quá trình Kiểm thử cơ bản và Lập kế hoạch (Sl 19-23)
#### 6.1 Quá trình Kiểm thử cơ bản (Fundamental Test Process)
Kiểm thử gồm các loại kiểm thử chính:
- **Kiểm thử chức năng**: Đảm bảo các tính năng hoạt động đúng theo yêu cầu thiết kế.
- **Kiểm thử hồi quy (Regression Testing)**: Xác nhận việc thay đổi hoặc cập nhật mã nguồn không làm hỏng các chức năng cũ đang hoạt động ổn định.

#### 6.2 Các cấp độ Lập kế hoạch kiểm thử
| Cấp độ | Tên gọi | Đặc điểm chính |
| :--- | :--- | :--- |
| **Cấp Công ty** | **Test Policy** | Định hướng và tiêu chuẩn kiểm thử tổng thể cho toàn bộ tổ chức. |
| **Cấp Dự án** | **Test Strategy** | Cách thức thực hiện kiểm thử cụ thể cho dự án đó. |
| **Cấp Quản lý** | **High Level Test Plan** | Mô tả mục tiêu lớn và phương pháp kiểm thử chung. |
| **Cấp Thực thi** | **Detailed Test Plan** | Thông tin chi tiết cho từng giai đoạn kiểm thử cụ thể. |

#### 6.3 Quy trình thực hiện kiểm tra (Test Execution Process)
1. **Đặc tả (Specification)**: Xác định rõ mục tiêu, yêu cầu và tiêu chuẩn của bài kiểm tra.
2. **Thực thi (Execution)**: Tiến hành kiểm thử theo kế hoạch và tuân thủ đúng quy trình.
3. **Ghi lại (Recording)**: Lưu giữ kết quả và quy trình để đánh giá, phân tích sau này.
4. **Kiểm tra hoàn thành (Check Completion)**: Xác nhận mọi bước đã xong và kết quả đáp ứng yêu cầu.

#### 6.4 Nội dung chính của Lập kế hoạch & Thông số kỹ thuật
Cần thực hiện các bước tài liệu hóa chi tiết:
- **Chiến lược & Ngoại lệ**: Xác định cách áp dụng kiểm thử và ghi lại các trường hợp ngoại lệ.
- **Môi trường & Công cụ**: Xác định phần mềm hỗ trợ (stubs, drivers) và thông tin môi trường kiểm thử.
- **Tiêu chí hoàn thành**: Thiết lập các mốc để biết khi nào có thể dừng kiểm thử.
- **Thông số kỹ thuật (Test Specification)**:
    - Xác định các điều kiện kiểm thử (tình huống người dùng gặp phải).
    - Thiết kế các trường hợp kiểm thử (Test Cases) cụ thể.
    - Xây dựng bài kiểm tra thực tế để triển khai.



























