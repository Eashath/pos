-- MySQL dump 10.13  Distrib 8.0.14, for Win64 (x86_64)
--
-- Host: localhost    Database: buymore
-- ------------------------------------------------------
-- Server version	8.0.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `bill`
--

DROP TABLE IF EXISTS `bill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bill` (
  `billno` varchar(10) NOT NULL,
  `date` varchar(15) DEFAULT NULL,
  `time` varchar(16) DEFAULT NULL,
  `customername` varchar(15) DEFAULT NULL,
  `productid` varchar(10) NOT NULL,
  `productname` varchar(35) DEFAULT NULL,
  `productnormalprice` double(10,2) DEFAULT NULL,
  `sellingprice` double(10,2) DEFAULT NULL,
  `quantity` int(5) DEFAULT NULL,
  `subtotal` double(10,2) DEFAULT NULL,
  `billtotal` double(10,2) DEFAULT NULL,
  PRIMARY KEY (`billno`,`productid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bill`
--

LOCK TABLES `bill` WRITE;
/*!40000 ALTER TABLE `bill` DISABLE KEYS */;
INSERT INTO `bill` VALUES ('BM1','2019-11-01','Fri 09:26:52 AM','sathu','100','abc',10.00,15.00,1,15.00,NULL),('BM1','2019-11-01','Fri 09:26:56 AM','sathu','101','abc',10.00,100.00,1,100.00,NULL),('BM1','2019-11-01','Fri 09:26:58 AM','sathu','102','abc',10.00,100.00,2,200.00,NULL),('BM1','2019-11-01','Fri 09:27:01 AM','sathu','103','abc',10.00,15.00,4,60.00,NULL),('BM2','2019-11-01','Fri 09:27:29 AM','kishok','105','abc',10.00,100.00,1,100.00,NULL),('BM2','2019-11-01','Fri 09:27:34 AM','kishok','108','Vernier Calipers',50.00,65.00,5,325.00,NULL),('BM2','2019-11-01','Fri 09:27:44 AM','kishok','109','Spirit Level',120.00,135.00,1,135.00,NULL),('BM2','2019-11-01','Fri 09:27:40 AM','kishok','111','Ball Peen Hammer',350.00,410.00,1,410.00,NULL),('BM3','2019-11-01','Fri 09:28:28 AM','sumanan','115','Wire Stripper Pliers',256.00,302.00,5,1510.00,NULL),('BM3','2019-11-01','Fri 09:28:25 AM','sumanan','117','Pipe Wrench',1200.00,1520.00,1,1520.00,NULL),('BM3','2019-11-01','Fri 09:28:21 AM','sumanan','118','Handle Sharp Shovel',700.00,950.00,1,950.00,NULL),('BM4','2019-11-01','Fri 09:40:40 AM','nufail','104','abc',10.00,100.00,1,100.00,NULL),('BM4','2019-11-01','Fri 09:40:32 AM','nufail','105','abc',10.00,100.00,1,100.00,NULL);
/*!40000 ALTER TABLE `bill` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-01 10:01:28
