CREATE DATABASE food_delivery;

USE food_delivery;

CREATE TABLE drivers (
    id INT PRIMARY KEY,
    available_time INT DEFAULT 0
);

CREATE TABLE customers (
    id INT PRIMARY KEY,
    order_time INT,
    travel_time INT
);

CREATE TABLE assignments (
    customer_id INT,
    driver_id INT,
    status VARCHAR(50),
    PRIMARY KEY (customer_id),
    FOREIGN KEY (customer_id) REFERENCES customers(id),
    FOREIGN KEY (driver_id) REFERENCES drivers(id)
);