INSERT INTO author (first_name, last_name) VALUES 
	("Agatha", "Christie"),
	("Terry", "Pratchett"),
	("Alexandre", "Dumas");

INSERT INTO book (title, author_id, description, genre, year_released) VALUES
	("The Murder of Roger Ackroyd", 1, "The story introduces us to Dr. James Sheppard, a country physician who becomes embroiled in the investigation of a murder that shakes the small village of King’s Abbot.", 
    "Fiction", 1926),
    ("The Three Musketeers", 3, "'The Three Musketeers' follows d'Artagnan and his friends Athos, Porthos, and Aramis as they face adventure and intrigue in 17th-century France, united by 'One for all, and all for one.'", 
    "Fiction", 1844);

INSERT INTO customer (first_name, last_name, email, dob, telephone) VALUES
	("Scott", "O'Brien", "scott-obrien@gmail.com", "2002-08-05", 0772947021),
    ("Jerry", "Wizzard", "wiz-jer@hotmail.net", "1913-01-04", 0711111111);

INSERT INTO rental (book_id, customer_id, date_out, date_due) VALUES
	(1, 2, "2024-05-02", "2024-06-02");

-- count number of books per author
SELECT a.first_name, a.last_name, COUNT(b.book_id) AS book_count
FROM author a
LEFT JOIN book b ON a.author_id = b.author_id
GROUP BY a.author_id;

-- return all customers who have rented a book
SELECT c.first_name, c.last_name, COUNT(r.rental_id) AS rental_count
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
GROUP BY c.customer_id;

-- return all books rented by specified customer
SELECT b.title, r.date_out, r.date_due
FROM rental r
JOIN book b ON r.book_id = b.book_id
JOIN customer c ON r.customer_id = c.customer_id
WHERE c.first_name = 'Jerry' AND c.last_name = 'Wizzard';

-- list overdue rentals
SELECT r.rental_id, c.first_name, c.last_name, b.title, r.date_due
FROM rental r
JOIN customer c ON r.customer_id = c.customer_id
JOIN book b ON r.book_id = b.book_id
WHERE r.date_due < CURDATE();

-- list all authors who have written a fiction book
SELECT DISTINCT a.first_name, a.last_name
FROM author a
JOIN book b ON a.author_id = b.author_id
WHERE FIND_IN_SET('Fiction', b.genre);

-- list all rentals with a due date in the next week
SELECT r.rental_id, c.first_name, c.last_name, b.title, r.date_due
FROM rental r
JOIN customer c ON r.customer_id = c.customer_id
JOIN book b ON r.book_id = b.book_id
WHERE r.date_due BETWEEN CURDATE() AND CURDATE() + INTERVAL 7 DAY;
