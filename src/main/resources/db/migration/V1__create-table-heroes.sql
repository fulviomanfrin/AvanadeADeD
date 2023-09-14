CREATE TABLE heroes (
                           id SERIAL PRIMARY KEY NOT NULL ,
                           name VARCHAR(255) NOT NULL,
                           health_points INT NOT NULL,
                           strength INT NOT NULL,
                           agility INT NOT NULL,
                           dice_quantity INT NOT NULL,
                           dice_type VARCHAR(255) NOT NULL
);
