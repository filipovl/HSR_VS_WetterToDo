CREATE SEQUENCE place_seq START 1;

CREATE TABLE IF NOT EXISTS place (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    todayTemperature DECIMAL(10, 2),
    tomorrowTemperature DECIMAL(10, 2),
    uvIndex INT
);

INSERT INTO place (id, name, todayTemperature, tomorrowTemperature, uvIndex)
VALUES (1,'Berlin', 20.00, 26.00, 4);

INSERT INTO place (id, name, todayTemperature, tomorrowTemperature, uvIndex)
VALUES (2,'Reutlingen', 22.00, 28.00, 5);

INSERT INTO place (id, name, todayTemperature, tomorrowTemperature, uvIndex)
VALUES (3,'Tuebingen', 23.00, 28.00, 5);

INSERT INTO place (id, name, todayTemperature, tomorrowTemperature, uvIndex)
VALUES (4,'Bochum', 28.00, 29.50, 6);

INSERT INTO place (id, name, todayTemperature, tomorrowTemperature, uvIndex)
VALUES (5,'Frankfurt', 25.50, 26.00, 3);

INSERT INTO place (id, name, todayTemperature, tomorrowTemperature, uvIndex)
VALUES (6,'Hamburg', 28.00, 29.50, 7);

INSERT INTO place (id, name, todayTemperature, tomorrowTemperature, uvIndex)
VALUES (7,'Muenchen', 25.50, 26.00, 6);

INSERT INTO place (id, name, todayTemperature, tomorrowTemperature, uvIndex)
VALUES (8,'Split', 31.00, 34.50, 8);

INSERT INTO place (id, name, todayTemperature, tomorrowTemperature, uvIndex)
VALUES (9,'Barcelona', 31.50, 35.00, 9);

INSERT INTO place (id, name, todayTemperature, tomorrowTemperature, uvIndex)
VALUES (10,'New York', 28.00, 25.50, 5);


