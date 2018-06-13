CREATE TABLE `babyapp`.`baby` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `DOB` DATE NULL,
  `Bio` TEXT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `babyapp`.`growth_records` (
  `id` BIGINT NOT NULL,
  `Date` DATE NULL,
  `Weight` DECIMAL NULL,
  `head_size` DECIMAL NULL,
  `length` DECIMAL NULL,
  `note` MEDIUMTEXT NULL,
  PRIMARY KEY (`id`));
