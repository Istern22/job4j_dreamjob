CREATE TABLE post (
                      id SERIAL PRIMARY KEY,
                      name TEXT
);

CREATE TABLE candidate (
                      id SERIAL PRIMARY KEY,
                      name TEXT
);
CREATE TABLE photo (
                      id SERIAL PRIMARY KEY,
                      name TEXT
);
ALTER TABLE candidate ADD COLUMN photoId INTEGER REFERENCES photo (id) ON DELETE CASCADE;