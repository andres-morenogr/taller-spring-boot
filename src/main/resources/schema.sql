CREATE TABLE task (
    id   INTEGER      NOT NULL,
    title VARCHAR(128) ,
    description VARCHAR(128) NOT NULL,
    done BOOLEAN DEFAULT false,
    PRIMARY KEY (id)
);