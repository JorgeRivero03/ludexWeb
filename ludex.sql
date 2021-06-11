CREATE DATABASE  IF NOT EXISTS `ludex` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ludex`;
-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: localhost    Database: ludex
-- ------------------------------------------------------
-- Server version	8.0.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cadiccion`
--

DROP TABLE IF EXISTS `cadiccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cadiccion` (
  `id_adiccion` int NOT NULL AUTO_INCREMENT,
  `nom_adiccion` varchar(45) NOT NULL,
  `desc_adiccion` varchar(45) NOT NULL,
  KEY `fk_CAdiccion_MAdiccion_Usuario1_idx` (`id_adiccion`),
  CONSTRAINT `fk_CAdiccion_MAdiccion_Usuario1` FOREIGN KEY (`id_adiccion`) REFERENCES `madiccion_usuario` (`id_adiccion`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cadiccion`
--

LOCK TABLES `cadiccion` WRITE;
/*!40000 ALTER TABLE `cadiccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `cadiccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dconsumo`
--

DROP TABLE IF EXISTS `dconsumo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dconsumo` (
  `id_consumo` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `id_adiccion` int NOT NULL,
  `fecha_consumo` date NOT NULL,
  `cant_consumo` float NOT NULL,
  `gasto_consumo` float NOT NULL,
  PRIMARY KEY (`id_consumo`),
  KEY `fk_DConsumo_MUsuario1_idx` (`id_usuario`),
  KEY `fk_DConsumo_MAdiccion_Usuario1_idx` (`id_adiccion`),
  CONSTRAINT `fk_DConsumo_MAdiccion_Usuario1` FOREIGN KEY (`id_adiccion`) REFERENCES `madiccion_usuario` (`id_adiccion`) ON UPDATE CASCADE,
  CONSTRAINT `fk_DConsumo_MUsuario1` FOREIGN KEY (`id_usuario`) REFERENCES `musuario` (`id_usuario`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dconsumo`
--

LOCK TABLES `dconsumo` WRITE;
/*!40000 ALTER TABLE `dconsumo` DISABLE KEYS */;
/*!40000 ALTER TABLE `dconsumo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `madiccion_usuario`
--

DROP TABLE IF EXISTS `madiccion_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `madiccion_usuario` (
  `id_adiccion` int NOT NULL,
  `fecha_adiccion` date NOT NULL,
  `consumo_historico` float NOT NULL,
  `gasto_historico` float NOT NULL,
  `id_usuario` int NOT NULL,
  PRIMARY KEY (`id_adiccion`),
  KEY `fk_MAdiccion_Usuario_MUsuario1_idx` (`id_usuario`),
  CONSTRAINT `fk_MAdiccion_Usuario_MUsuario1` FOREIGN KEY (`id_usuario`) REFERENCES `musuario` (`id_usuario`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `madiccion_usuario`
--

LOCK TABLES `madiccion_usuario` WRITE;
/*!40000 ALTER TABLE `madiccion_usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `madiccion_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `musuario`
--

DROP TABLE IF EXISTS `musuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `musuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nom_usuario` varchar(45) NOT NULL,
  `app_usuario` varchar(45) NOT NULL,
  `sex_usuario` varchar(45) NOT NULL,
  `id_registro` int NOT NULL,
  `correo_usuario` varchar(45) NOT NULL,
  `pass_usuario` varchar(45) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `musuario`
--

LOCK TABLES `musuario` WRITE;
/*!40000 ALTER TABLE `musuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `musuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-10 20:40:07
