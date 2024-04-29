CREATE TABLE integrations (
    id VARCHAR(50) PRIMARY KEY,
    date_register VARCHAR(100),
    contact VARCHAR(50),
    status VARCHAR(20),
    half_finisher VARCHAR(20),
    error VARCHAR(600),
    responsible VARCHAR(20),
    is_integrated BOOLEAN
);