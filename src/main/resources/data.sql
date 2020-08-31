DROP TABLE IF EXISTS files;

CREATE TABLE files (
  id IDENTITY NOT NULL  PRIMARY KEY,
  file_name VARCHAR(250) NOT NULL,
  file_size INT NOT NULL,
  processed_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  uploaded_by VARCHAR(250) NOT NULL
);

drop table if exists customer;

CREATE TABLE customer (
  id IDENTITY NOT NULL  PRIMARY KEY,
  user_name VARCHAR(250) NOT NULL,
  create_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  create_by VARCHAR(250) NOT NULL,
  update_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  update_by VARCHAR(250) NOT NULL,
  phone_number VARCHAR(250) NOT NULL
);

INSERT INTO files (file_name, file_size, uploaded_by) VALUES
  ('image.jpg', '12345', 'Brent');

INSERT INTO customer (user_name, phone_number, create_by, update_by) VALUES
  ('bserin', '7325555555', 'Brent', 'Brent');