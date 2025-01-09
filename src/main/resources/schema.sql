-- schema.sql

CREATE TABLE movies (
    movie_id INT AUTO_INCREMENT PRIMARY KEY,
    movie_title VARCHAR(255) NOT NULL,
    movie_description TEXT,
    movie_language VARCHAR(50),
    movie_release_date DATE,
    movie_url VARCHAR(255)
);
