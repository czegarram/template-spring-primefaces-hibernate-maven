SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

DROP SCHEMA IF EXISTS `template` ;
CREATE SCHEMA IF NOT EXISTS `template` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `template` ;

-- -----------------------------------------------------
-- Table `template`.`User`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `template`.`User` ;

CREATE  TABLE IF NOT EXISTS `template`.`User` (
  `id` INT NOT NULL AUTO_INCREMENT ,
  `name` VARCHAR(45) NOT NULL ,
  `surname` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB;

INSERT INTO `template`.`User`
(`name`,
`surname`)
VALUES
(
"czegarram",
"Cesar"
);

INSERT INTO `template`.`User`
(`name`,
`surname`)
VALUES
(
"hark",
"Alex"
);

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
