USE takeo; 
DROP TABLE authors, books, book_loans;
CREATE TABLE IF NOT EXISTS authors (
  id INT NOT NULL,
  author_name VARCHAR(20),
  author_code VARCHAR(5),
  PRIMARY KEY (id)
);
CREATE TABLE IF NOT EXISTS books (
  id INT NOT NULL,
  book_name VARCHAR(50),
  title VARCHAR(20),
  author_id INT NOT NULL,
  publication_year BIGINT (5),
  PRIMARY KEY (id),
  FOREIGN KEY (author_id)
	REFERENCES authors(id)
);

CREATE TABLE IF NOT EXISTS book_loans (
  loan_id INT NOT NULL,
  student_name VARCHAR(20),
  loan_date VARCHAR(20),
  due_date VARCHAR(20),
  author_id INT NOT NULL,
  book_id INT NOT NULL,
  PRIMARY KEY (loan_id),
  FOREIGN KEY (author_id)
	REFERENCES authors(id),
  FOREIGN KEY (book_id)
	REFERENCES books(id)
);
  
INSERT INTO authors
VALUES
  (1, "J. K. Rowling", "A01"),
  (2, "J. R. R. Tolkien", "A02"),
  (3, "Pierce Brown", "A03"),
  (4, "Orson Scott", "A04"),
  (5, "Stephen King", "SK001"),
  (6, "Agatha Christie", "AC001"),
  (7, "Harper Lee", "HL001"),
  (8, "Jane Austen", "JA001"),
  (9, "Ernest Hemingway", "EH001"),
  (10, "Mark Twain", "MT001");
  
INSERT INTO books
VALUES
  (1, "Lord of the Rings", "Fantasy", 2, 1992),
  (2, "Harry Potter", "Fantasy", 1, 1996),
  (3, "Red Rising", "Fantasy", 3, 2016),
  (4, "Ender's Game", "Fiction", 4, 2002),
  (5, "The Shining", "Horror", 5, 1977),
  (6, "Murder on the Orient Express", "Mystery", 6, 1934),
  (7, "To Kill a Mockingbird", "Classic", 7, 1960),
  (8, "Pride and Prejudice", "Romace", 8, 1813),
  (9, "The Old Man and the Sea", "Adventure", 9, 1952),
  (10, "The Adventures of Huckleberry Finn", "Hictorical Fiction", 10, 1884);
  
INSERT INTO book_loans
VALUES
  (1, "Walter White", "2023-08-11", "09-11-2023", 3, 3),
  (2, "Jesse Pinkman", "2023-07-11", "10-11-2023", 1, 2),
  (3, "Hank Schrader", "2023-08-11", "20-08-2023", 2, 1),
  (4, "William Brown", "2023-08-04", "2023-08-18", 4, 4),
  (5, "Ava Jones", "2023-08-05", "2023-08-19", 5, 5),
  (6, "Liam Davis", "2023-08-06", "2023-08-20", 6, 6),
  (7, "Sophia Martinez", "2023-08-07", "2023-08-21", 7, 7),
  (8, "Noah Taylor", "2023-08-08", "2023-08-22", 8, 8),
  (9, "Isabella Brown", "2023-08-09", "2023-08-23", 9, 9),
  (10, "Ethan Wilson", "2023-08-10", "2023-08-24", 10, 10);
  
#1
SELECT * FROM authors;
#2
SELECT * FROM authors 
WHERE author_name LIKE('A%') OR author_name LIKE ('N%');
#3
SELECT book_name, title, publication_year FROM books;
#4
SELECT * FROM books 
WHERE publication_year BETWEEN 1993 AND 2023;
#5
SELECT * FROM books
WHERE author_id = 1;
#6
SELECT * FROM book_loans;
#7
SELECT * FROM book_loans
WHERE loan_date IN (
  SELECT loan_date FROM book_loans
  GROUP BY loan_date
    HAVING COUNT(*) > 1);
    