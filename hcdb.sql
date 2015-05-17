hcdb-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema hcdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hcdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hcdb` DEFAULT CHARACTER SET utf8 ;
USE `hcdb` ;

-- -----------------------------------------------------
-- Table `hcdb`.`area`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hcdb`.`area` (
  `idArea` INT(11) NOT NULL AUTO_INCREMENT,
  `nombreArea` VARCHAR(45) NOT NULL,
  `descripcionArea` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idArea`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hcdb`.`categoriadeconsulta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hcdb`.`categoriadeconsulta` (
  `idCategoriaDeConsulta` INT(11) NOT NULL AUTO_INCREMENT,
  `nombreCategoriaDeConsulta` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoriaDeConsulta`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hcdb`.`especialidad`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hcdb`.`especialidad` (
  `idEspecialidad` INT(11) NOT NULL AUTO_INCREMENT,
  `idArea` INT(11) NOT NULL,
  `nombreEspecialidad` VARCHAR(45) NOT NULL,
  `descripcionEspecialidad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEspecialidad`, `idArea`),
  INDEX `fk_especialidad_area1_idx` (`idArea` ASC),
  CONSTRAINT `fk_especialidad_area1`
    FOREIGN KEY (`idArea`)
    REFERENCES `hcdb`.`area` (`idArea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hcdb`.`profesional`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hcdb`.`profesional` (
  `idProfesional` INT(11) NOT NULL AUTO_INCREMENT,
  `idEspecialidad` INT(11) NOT NULL,
  `matriculaProfesional` INT(11) NOT NULL,
  `activoProfesional` TINYINT(1) NOT NULL,
  PRIMARY KEY (`idProfesional`, `idEspecialidad`),
  UNIQUE INDEX `idProfesional_UNIQUE` (`idProfesional` ASC),
  INDEX `idEspecialidad_idx` (`idEspecialidad` ASC),
  CONSTRAINT `idEspecialidad`
    FOREIGN KEY (`idEspecialidad`)
    REFERENCES `hcdb`.`especialidad` (`idEspecialidad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hcdb`.`paciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hcdb`.`paciente` (
  `idPaciente` INT(11) NOT NULL AUTO_INCREMENT,
  `nombrePaciente` VARCHAR(45) NOT NULL,
  `apellidoPaciente` VARCHAR(45) NOT NULL,
  `activoPaciente` TINYINT(1) NOT NULL,
  `dniPaciente` INT(11) NOT NULL,
  PRIMARY KEY (`idPaciente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hcdb`.`consulta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hcdb`.`consulta` (
  `idConsulta` INT(11) NOT NULL AUTO_INCREMENT,
  `idPaciente` INT(11) NOT NULL,
  `idProfesional` INT(11) NOT NULL,
  `idCategoriaDeConsulta` INT(11) NOT NULL,
  `fechaDeAtencion` DATETIME NOT NULL,
  `diagnostico` VARCHAR(800) NOT NULL,
  PRIMARY KEY (`idConsulta`, `idCategoriaDeConsulta`, `idProfesional`, `idPaciente`),
  INDEX `fk_informacionPorConsulta_paciente1_idx` (`idPaciente` ASC),
  INDEX `fk_consulta_profesional1_idx` (`idProfesional` ASC),
  INDEX `fk_consulta_categoriaDeConsulta1_idx` (`idCategoriaDeConsulta` ASC),
  CONSTRAINT `fk_consulta_categoriaDeConsulta1`
    FOREIGN KEY (`idCategoriaDeConsulta`)
    REFERENCES `hcdb`.`categoriadeconsulta` (`idCategoriaDeConsulta`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_consulta_profesional1`
    FOREIGN KEY (`idProfesional`)
    REFERENCES `hcdb`.`profesional` (`idProfesional`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_informacionPorConsulta_paciente1`
    FOREIGN KEY (`idPaciente`)
    REFERENCES `hcdb`.`paciente` (`idPaciente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hcdb`.`contactopaciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hcdb`.`contactopaciente` (
  `idPaciente` INT(11) NOT NULL,
  `telefonoPaciente` VARCHAR(45) NULL DEFAULT NULL,
  `direccionPaciente` VARCHAR(45) NOT NULL,
  `mailPaciente` VARCHAR(45) NULL DEFAULT NULL,
  `fechaDeNacimientoPaciente` DATETIME NOT NULL,
  `nacionalidadPaciente` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idPaciente`),
  INDEX `fk_ContactoXPaciente_Paciente1_idx` (`idPaciente` ASC),
  CONSTRAINT `fk_ContactoXPaciente_Paciente1`
    FOREIGN KEY (`idPaciente`)
    REFERENCES `hcdb`.`paciente` (`idPaciente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hcdb`.`contactoprofesional`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hcdb`.`contactoprofesional` (
  `idProfesional` INT(11) NOT NULL,
  `telefonoProfesional` VARCHAR(45) NOT NULL,
  `direccionProfesional` VARCHAR(45) NOT NULL,
  `mailProfesional` VARCHAR(45) NOT NULL,
  `fechaDeNacimiento` DATETIME NOT NULL,
  PRIMARY KEY (`idProfesional`),
  UNIQUE INDEX `idProfesional_UNIQUE` (`idProfesional` ASC),
  CONSTRAINT `fk_contactoXProfesional_profesional1`
    FOREIGN KEY (`idProfesional`)
    REFERENCES `hcdb`.`profesional` (`idProfesional`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hcdb`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hcdb`.`login` (
  `idLogin` INT(11) NOT NULL AUTO_INCREMENT,
  `usuarioLogin` INT(11) NOT NULL,
  `claveLogin` VARCHAR(10) NOT NULL,
  `ultimoIngresoLogin` DATETIME NOT NULL,
  `ultimoCambioClaveLogin` VARCHAR(45) NOT NULL,
  `tipoUsuario` INT(11) NOT NULL,
  `activoLogin` TINYINT(1) NOT NULL,
  PRIMARY KEY (`idLogin`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hcdb`.`usuario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hcdb`.`usuario` (
  `idUsuario` INT(11) NOT NULL AUTO_INCREMENT,
  `idLogin` INT(11) NOT NULL,
  `nombreUsuario` VARCHAR(45) NOT NULL,
  `apellidoUsuario` VARCHAR(45) NOT NULL,
  `dniUsuario` INT(11) NOT NULL,
  `idProfesional` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE INDEX `idLogin_UNIQUE` (`idLogin` ASC),
  INDEX `fk_usuario_login1_idx` (`idLogin` ASC),
  INDEX `fk_usuario_profesional1_idx` (`idProfesional` ASC),
  CONSTRAINT `fk_usuario_login1`
    FOREIGN KEY (`idLogin`)
    REFERENCES `hcdb`.`login` (`idLogin`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_usuario_profesional1`
    FOREIGN KEY (`idProfesional`)
    REFERENCES `hcdb`.`profesional` (`idProfesional`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
