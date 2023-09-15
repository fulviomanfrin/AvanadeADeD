CREATE TABLE encounters
(
    id          SERIAL PRIMARY KEY NOT NULL ,
    hero_id     BIGINT NOT NULL,
    monster_id  BIGINT NOT NULL,
    winner_name VARCHAR(255)
);

CREATE TABLE turns
(
    id           SERIAL PRIMARY KEY NOT NULL ,
    attacker_id  BIGINT NOT NULL,
    defender_id  BIGINT NOT NULL,
    encounter_id BIGINT NOT NULL
);