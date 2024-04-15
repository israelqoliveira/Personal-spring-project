CREATE TABLE refund(
     id SERIAL PRIMARY KEY,
     amount DECIMAL(10, 2),
     status VARCHAR(20),
     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);