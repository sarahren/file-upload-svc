DROP TABLE IF EXISTS files;

CREATE TABLE files (
  id IDENTITY NOT NULL  PRIMARY KEY,
  file_name VARCHAR(250) NOT NULL,
  file_size INT NOT NULL,
  processed_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  uploaded_by VARCHAR(250) NOT NULL
);

INSERT INTO files (file_name, file_size, uploaded_by) VALUES
  ('image.jpg', '12345', 'Brent');