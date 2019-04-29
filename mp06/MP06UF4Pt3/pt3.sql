CREATE DATABASE  IF NOT EXISTS `mp06` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mp06`;
-- MySQL dump 10.13  Distrib 5.7.25, for Linux (x86_64)
--
-- Host: localhost    Database: mp06
-- ------------------------------------------------------
-- Server version	5.7.25-0ubuntu0.18.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pintores`
--

DROP TABLE IF EXISTS `pintores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pintores` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `edad` int(2) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pintores`
--

LOCK TABLES `pintores` WRITE;
/*!40000 ALTER TABLE `pintores` DISABLE KEYS */;
INSERT INTO `pintores` VALUES (1,'Pablo','Picasso',91),(2,'Leonardo','Da Vinci',67),(3,'Vincent','Van Gogh',37),(4,'Salvador','Dali',84),(8,'Claude','Monet',86),(9,'Claude','Monet',86),(10,'Claude','Monet',86),(11,'Claude','Monet',86),(12,'Claude','Monet',86),(13,'Claude','Monet',86),(14,'Claude','Monet',86),(15,'Claude','Monet',86),(16,'Hola','ssss',34),(17,'Hola','ssss',34),(18,'Hola','ssss',34);
/*!40000 ALTER TABLE `pintores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pinturas`
--

DROP TABLE IF EXISTS `pinturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pinturas` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) NOT NULL,
  `epoca` varchar(50) NOT NULL,
  `fecha_creacion` int(4) NOT NULL,
  `id_pintor` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_pintor` (`id_pintor`),
  CONSTRAINT `pinturas_ibfk_1` FOREIGN KEY (`id_pintor`) REFERENCES `pintores` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pinturas`
--

LOCK TABLES `pinturas` WRITE;
/*!40000 ALTER TABLE `pinturas` DISABLE KEYS */;
INSERT INTO `pinturas` VALUES (1,'La Gioconda','Renacimiento',1503,1),(2,'La ultima cena','Renacimiento',1498,1),(3,'La noche estrellada','Posimpresionismo',1889,1),(4,'Guernica','Cubismo',1937,1),(6,'hola','nose',1936,1);
/*!40000 ALTER TABLE `pinturas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-30  0:18:41
