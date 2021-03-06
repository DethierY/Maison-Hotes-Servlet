-- MySQL Script generated by MySQL Workbench
-- Tue Dec 12 17:28:00 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`ListeReservations`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ListeReservations` (
  `idListeReservations` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NULL,
  `prenom` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `telephone` VARCHAR(45) NULL,
  `region` VARCHAR(45) NULL,
  `parking` VARCHAR(3) NULL,
  `animal` VARCHAR(3) NULL,
  `fumeur` VARCHAR(10) NULL,
  `nbrePersonnes` VARCHAR(2) NULL,
  `jourArrivee` VARCHAR(8) NULL,
  `nuitees` VARCHAR(2) NULL,
  `dateResa` VARCHAR(8) NULL,
  `ListeReservationscol` VARCHAR(45) NULL,
  PRIMARY KEY (`idListeReservations`))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
