
CREATE TABLE author (
	author_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL
);

CREATE TABLE book (
	book_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    author_id INT NOT NULL,
    description LONGTEXT,
    genre SET("Fiction","Non-Fiction"),
    year_released INT NOT NULL,
    FOREIGN KEY (author_id) REFERENCES author(author_id)
);

CREATE TABLE customer (
	customer_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    dob DATE NOT NULL,
    telephone INT 
);

CREATE TABLE rental (
	rental_id INT AUTO_INCREMENT PRIMARY KEY,
	book_id INT NOT NULL,
    customer_id INT NOT NULL,
    date_out DATE NOT NULL,
    date_due DATE NOT NULL,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
	FOREIGN KEY (book_id) REFERENCES book(book_id)
);
