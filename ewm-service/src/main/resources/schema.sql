CREATE TABLE IF NOT EXISTS users (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT NULL,
  email VARCHAR(255),
  name VARCHAR(512)
);

CREATE TABLE IF NOT EXISTS category (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT NULL,
  name VARCHAR(512)
);

CREATE TABLE IF NOT EXISTS location (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT NULL,
  lat float,
  lon float
);


CREATE TABLE IF NOT EXISTS events (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT NULL,
  annotation VARCHAR(2000),
  category BIGINT REFERENCES category (id),
  confirmed_requests INTEGER,
  created TIMESTAMP WITHOUT TIME ZONE,
  description VARCHAR(7000),
  event_date TIMESTAMP WITHOUT TIME ZONE,
  initiator BIGINT REFERENCES users (id),
  location BIGINT REFERENCES location (id),
  paid BOOLEAN,
  participant_limit INTEGER,
  published_on TIMESTAMP WITHOUT TIME ZONE,
  request_moderation BOOLEAN,
  state VARCHAR,
  title VARCHAR(120)
);

CREATE TABLE IF NOT EXISTS compilation (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT NULL,
  pinned BOOLEAN,
  title VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS request (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT NULL,
  created TIMESTAMP WITHOUT TIME ZONE,
  event_id BIGINT REFERENCES events (id),
  requester_id BIGINT REFERENCES users (id),
  status VARCHAR
);

CREATE TABLE IF NOT EXISTS compilation_events (
    compilation_id BIGINT REFERENCES compilation (id),
    event_id BIGINT REFERENCES events (id)

);