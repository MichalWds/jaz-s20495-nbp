CREATE TABLE gold
(
    id             BIGINT      NOT NULL AUTO_INCREMENT,
    currency_name  VARCHAR(20) NOT NULL,
    start_date     DATE        NOT NULL,
    end_date       DATE        NOT NULL,
    avg_currency   FLOAT       NOT NULL,
    start_req_date DATE        NOT NULL,
    start_req_time TIME        NOT NULL,
    PRIMARY KEY (id)
);