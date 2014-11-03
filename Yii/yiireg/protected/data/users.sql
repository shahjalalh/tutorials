CREATE TABLE users (
         id int(10) unsigned NOT NULL AUTO_INCREMENT,
         username varchar(20) NOT NULL,
         pwd_hash char(34) NOT NULL,
         fname varchar(64) NOT NULL,
         lname varchar(64) NOT NULL,
         email varchar(225) NOT NULL,
         country varchar(100) NOT NULL,
         address varchar(100) NOT NULL,
         gender varchar(20) NOT NULL,
         PRIMARY KEY (id),
         UNIQUE KEY username (username)
       ) ENGINE=InnoDB;
