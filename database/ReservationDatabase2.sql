
-- -----------------------------------------------------
-- Table `mydb`.`ListeReservations`
-- -----------------------------------------------------
CREATE TABLE ListeReservations (
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
  PRIMARY KEY (`idListeReservations`));
