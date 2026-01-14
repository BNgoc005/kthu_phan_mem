describe('Cart and Checkout Test', () => {
  // Hàm chạy trước mỗi test case để đăng nhập
  beforeEach(() => {
    cy.visit('https://www.saucedemo.com');
    cy.get('#user-name').type('standard_user');
    cy.get('#password').type('secret_sauce');
    cy.get('#login-button').click();
  });

  // Kịch bản 3: Thêm sản phẩm vào giỏ hàng
  it('Should add a product to the cart', () => {
    // Click nút Add to cart đầu tiên
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    // Kiểm tra icon giỏ hàng hiển thị số 1
    cy.get('.shopping_cart_badge').should('have.text', '1');
  });

  // Kịch bản 4: Sắp xếp sản phẩm (Price low to high)
  it('Should sort products by price low to high', () => {
    cy.get('.product_sort_container').select('lohi');
    // Kiểm tra giá sản phẩm đầu tiên là $7.99
    cy.get('.inventory_item_price').first().should('have.text', '$7.99');
  });

  // --- BÀI TẬP YÊU CẦU THÊM ---

  // Bài tập A: Kiểm tra chức năng xóa sản phẩm khỏi giỏ hàng
  it('Should remove a product from the cart', () => {
    // 1. Thêm sản phẩm vào giỏ trước
    cy.get('.inventory_item').first().find('.btn_inventory').click();
    cy.get('.shopping_cart_badge').should('have.text', '1');

    // 2. Nhấn nút "Remove" (Nút Add to cart đổi thành Remove sau khi click)
    // Ta click lại vào đúng vị trí nút đó để xóa
    cy.get('.inventory_item').first().find('.btn_inventory').click();

    // 3. Xác minh giỏ hàng không còn hiển thị số lượng (badge biến mất)
    cy.get('.shopping_cart_badge').should('not.exist');
  });

  // Bài tập B: Kiểm tra quy trình thanh toán (Checkout)
  it('Should complete the checkout process', () => {
    // 1. Thêm sản phẩm vào giỏ
    cy.get('.inventory_item').first().find('.btn_inventory').click();

    // 2. Đi đến trang giỏ hàng
    cy.get('.shopping_cart_link').click();
    // Kiểm tra đã vào trang cart
    cy.url().should('include', '/cart.html');

    // 3. Nhấn Checkout
    cy.get('#checkout').click();
    
    // 4. Điền thông tin (First Name: John, Last Name: Doe, Zip Code: 12345)
    cy.get('#first-name').type('John');
    cy.get('#last-name').type('Doe');
    cy.get('#postal-code').type('12345');

    // 5. Nhấn Continue
    cy.get('#continue').click();

    // 6. Xác minh chuyển đến trang xác nhận thanh toán bước 2
    cy.url().should('include', '/checkout-step-two.html');
    
    // (Tuỳ chọn) Kiểm tra xem có nút Finish không để chắc chắn
    cy.get('#finish').should('be.visible');
  });
});