

CREATE TABLE IF NOT EXISTS ANIME(
    ID UUID PRIMARY KEY NOT NULL,
    TITLE VARCHAR(64) NOT NULL,
    EPISODES INTEGER NOT NULL,
    STATUS VARCHAR(256) NOT NULL,
    PREMIRER VARCHAR(64) NOT NULL,
    STUDIO VARCHAR(32) NOT NULL,
    GENRES VARCHAR(256) NOT NULL
);

