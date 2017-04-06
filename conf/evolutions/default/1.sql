# Prefectures schema

# --- !Ups
CREATE TABLE IF NOT EXISTS prefectures (
    id int(11) NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE INDEX index_on_name (name)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

# --- !Downs
DROP TABLE IF EXISTS prefectures;