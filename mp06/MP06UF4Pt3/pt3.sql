CREATE DATABASE  IF NOT EXISTS `mp03` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `mp03`;
-- MySQL dump 10.13  Distrib 5.7.26, for Linux (x86_64)
--
-- Host: localhost    Database: mp03
-- ------------------------------------------------------
-- Server version	5.7.26-0ubuntu0.18.04.1

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
  `pintor_id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`pintor_id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pintores`
--

LOCK TABLES `pintores` WRITE;
/*!40000 ALTER TABLE `pintores` DISABLE KEYS */;
INSERT INTO `pintores` VALUES (39,'ttrbbtbt','trtrtrtr'),(41,'sss','ssss'),(42,'2222','2222'),(43,'sss','ssss');
/*!40000 ALTER TABLE `pintores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pinturas`
--

DROP TABLE IF EXISTS `pinturas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pinturas` (
  `pintura_id` int(11) NOT NULL AUTO_INCREMENT,
  `picture_name` varchar(100) DEFAULT NULL,
  `picture_date` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`pintura_id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pinturas`
--

LOCK TABLES `pinturas` WRITE;
/*!40000 ALTER TABLE `pinturas` DISABLE KEYS */;
INSERT INTO `pinturas` VALUES (1,'chau','adios'),(2,'como','estás'),(3,'3333','ddff'),(4,'222','2222'),(5,'222','2222'),(6,'ddd','dddd'),(7,'jkyhvjhv','jhgvjgv');
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

-- Dump completed on 2019-04-30 15:37:06
