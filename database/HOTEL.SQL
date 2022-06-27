-- MySQL dump 10.13  Distrib 8.0.25, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hotel
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
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `curp` varchar(18) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL,
  `nombres` varchar(45) DEFAULT NULL,
  `apellidos` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `rol` int NOT NULL,
  `activo` char(2) NOT NULL DEFAULT 'Si',
  PRIMARY KEY (`curp`),
  KEY `fk_emp_rol_idx` (`rol`),
  CONSTRAINT `fk_emp_rol` FOREIGN KEY (`rol`) REFERENCES `rol` (`id_rol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES ('------------------','admin','admin','Administrador',NULL,'admin@gmail.com',3,'Si'),('AFADJFLAJF23J4L2JL','angel','angel','Angel Jesus ','Zorrilla','angel@gmail.com',1,'Si');
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitacion`
--

DROP TABLE IF EXISTS `habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habitacion` (
  `id_hab` int NOT NULL,
  `tipo` int NOT NULL,
  `caracteristicas` text,
  `precio` double(3,2) NOT NULL,
  `estado` varchar(10) NOT NULL,
  `numero` char(4) DEFAULT NULL,
  PRIMARY KEY (`id_hab`),
  KEY `fk_tipo_hab_idx` (`tipo`),
  CONSTRAINT `fk_tipo_hab` FOREIGN KEY (`tipo`) REFERENCES `tipo_hab` (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitacion`
--

LOCK TABLES `habitacion` WRITE;
/*!40000 ALTER TABLE `habitacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `limpieza_habitacion`
--

DROP TABLE IF EXISTS `limpieza_habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `limpieza_habitacion` (
  `id_limp_hab` int NOT NULL,
  `curp_empleado` varchar(18) NOT NULL,
  `id_hab` int NOT NULL,
  PRIMARY KEY (`id_limp_hab`),
  KEY `fk_hab_idx` (`id_hab`),
  KEY `fk_emp_idx` (`curp_empleado`),
  CONSTRAINT `fk_emp` FOREIGN KEY (`curp_empleado`) REFERENCES `empleado` (`curp`),
  CONSTRAINT `fk_hab` FOREIGN KEY (`id_hab`) REFERENCES `habitacion` (`id_hab`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `limpieza_habitacion`
--

LOCK TABLES `limpieza_habitacion` WRITE;
/*!40000 ALTER TABLE `limpieza_habitacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `limpieza_habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `renta_habitacion`
--

DROP TABLE IF EXISTS `renta_habitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `renta_habitacion` (
  `id_renta` int NOT NULL,
  `curp_empleado` varchar(18) NOT NULL,
  `id_hab` int NOT NULL,
  PRIMARY KEY (`id_renta`),
  KEY `fk_emp_hab_idx` (`curp_empleado`),
  KEY `fk_renta_hab_idx` (`id_hab`),
  CONSTRAINT `fk_renta_emp` FOREIGN KEY (`curp_empleado`) REFERENCES `empleado` (`curp`),
  CONSTRAINT `fk_renta_hab` FOREIGN KEY (`id_hab`) REFERENCES `habitacion` (`id_hab`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `renta_habitacion`
--

LOCK TABLES `renta_habitacion` WRITE;
/*!40000 ALTER TABLE `renta_habitacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `renta_habitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `id_rol` int NOT NULL,
  `nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`id_rol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
INSERT INTO `rol` VALUES (1,'Recepcionista'),(2,'Limpieza'),(3,'Administrador');
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_hab`
--

DROP TABLE IF EXISTS `tipo_hab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_hab` (
  `id_tipo` int NOT NULL,
  `nombre` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_hab`
--

LOCK TABLES `tipo_hab` WRITE;
/*!40000 ALTER TABLE `tipo_hab` DISABLE KEYS */;
INSERT INTO `tipo_hab` VALUES (1,'Individual'),(2,'Doble'),(3,'Triple'),(4,'Queen');
/*!40000 ALTER TABLE `tipo_hab` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-26 23:00:01
