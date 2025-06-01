use db_appmakanan;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
);

CREATE TABLE admin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL
);

select * from admin;
CREATE TABLE customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    balance DECIMAL(12, 2) DEFAULT 0
);

-- CREATE TABLE carts (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     customer_id INT UNIQUE,
--     FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE
-- );

-- CREATE TABLE menu_items (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     name VARCHAR(100),
--     price DECIMAL(10,2)
-- );

-- CREATE TABLE cart_items (
--     cart_id INT,
--     menu_item_id INT,
--     quantity INT DEFAULT 1,
--     PRIMARY KEY (cart_id, menu_item_id),
--     FOREIGN KEY (cart_id) REFERENCES carts(id) ON DELETE CASCADE,
--     FOREIGN KEY (menu_item_id) REFERENCES menu_items(id)
-- );


-- CREATE TABLE orders (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     customer_id INT,
--     total_amount DECIMAL(10,2),
--     FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE
-- );

-- CREATE TABLE order_items (
--     order_id INT,
--     menu_item_id INT,
--     quantity INT DEFAULT 1,
--     PRIMARY KEY (order_id, menu_item_id),
--     FOREIGN KEY (order_id) REFERENCES orders(id) ON DELETE CASCADE,
--     FOREIGN KEY (menu_item_id) REFERENCES menu_items(id)
-- );

-- CREATE TABLE restaurants (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     name VARCHAR(100)
-- );

-- CREATE TABLE restaurant_menu (
--     restaurant_id INT,
--     menu_item_id INT,
--     PRIMARY KEY (restaurant_id, menu_item_id),
--     FOREIGN KEY (restaurant_id) REFERENCES restaurants(id) ON DELETE CASCADE,
--     FOREIGN KEY (menu_item_id) REFERENCES menu_items(id)
-- );

-- CREATE TABLE payment_methods (
--     id INT AUTO_INCREMENT PRIMARY KEY,
--     order_id INT,
--     method_type ENUM('Cash', 'EWallet'),
--     FOREIGN KEY (order_id) REFERENCES orders(id) ON DELETE CASCADE
-- );

-- CREATE TABLE cash_payments (
--     payment_id INT PRIMARY KEY,
--     FOREIGN KEY (payment_id) REFERENCES payment_methods(id) ON DELETE CASCADE
-- );

-- CREATE TABLE ewallet_payments (
--     payment_id INT PRIMARY KEY,
--     customer_id INT,
--     wallet_name VARCHAR(100),
--     FOREIGN KEY (payment_id) REFERENCES payment_methods(id) ON DELETE CASCADE,
--     FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE CASCADE
-- );
