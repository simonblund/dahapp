DROP TABLE IF EXISTS 'users'

CREATE TABLE 'users'(
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `firstName` varchar(45) NOT NULL,
    `lastName` varchar(45) NOT NULL,
    `email` varchar(75) NOT NULL,
    `telephone` varchar(45),
    `passwordHash` varchar(255) NOT NULL,
    `passwordResetToken` varchar(255),
    `oauth_token` varchar(255),
    `admin` boolean default=false,
    `enabled` boolean default=false,
    PRIMARY KEY (`id`);
)