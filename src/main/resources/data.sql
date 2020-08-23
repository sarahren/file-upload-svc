DROP TABLE IF EXISTS files;

CREATE TABLE files (
  id IDENTITY NOT NULL  PRIMARY KEY,
  file_name VARCHAR(250) NOT NULL,
  file_size INT NOT NULL,
  processed_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO files (file_name, file_size) VALUES
  ('image.jpg', '12345');