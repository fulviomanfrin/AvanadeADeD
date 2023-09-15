CREATE TABLE characters
(
    id            SERIAL PRIMARY KEY NOT NULL,
    name          VARCHAR(255)       NOT NULL,
    health_points INT                NOT NULL,
    strength      INT                NOT NULL,
    defence       INT                NOT NULL,
    agility       INT                NOT NULL,
    dice_quantity INT                NOT NULL,
    dice_type     VARCHAR(255)       NOT NULL,
    faction       VARCHAR(255)       NOT NULL
);
