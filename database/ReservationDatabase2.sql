
-- -----------------------------------------------------
-- Table `reservatoon,`.`ListeReservations`
-- -----------------------------------------------------
CREATE TABLE ListeReservations (
  `idListeReservations` INT NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NULL,
  `prenom` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `telephone` VARCHAR(45) NULL,
  `region` VARCHAR(45) NULL,
  `parking` VARCHAR(45) NULL,
  `animal` VARCHAR(45) NULL,
  `fumeur` VARCHAR(45) NULL,
  `nbrePersonnes` INT(11) NULL,
  `jourArrivee` VARCHAR(45) NULL,
  `nuitees` INT(11) NULL,
  PRIMARY KEY (`idListeReservations`));
