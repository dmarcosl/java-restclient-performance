CREATE TABLE model
(
    item_id     BIGINT PRIMARY KEY AUTO_INCREMENT,
    name        VARCHAR(255),
    description TEXT,
    price       DOUBLE,
    quantity    INT,
    stock       INT,
    category    VARCHAR(255),
    url         VARCHAR(255),
    image_url   VARCHAR(255),
    is_active   BOOLEAN
);
