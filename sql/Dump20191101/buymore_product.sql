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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `product` (
  `productid` varchar(10) NOT NULL,
  `productname` varchar(20) DEFAULT NULL,
  `productcompanyname` varchar(100) DEFAULT NULL,
  `productunitprice` double(10,2) DEFAULT NULL,
  `productnormalprice` double(10,2) DEFAULT NULL,
  `productqty` int(5) DEFAULT NULL,
  PRIMARY KEY (`productid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES ('100','abc','Inco(PVT)LTD',10.00,15.00,65),('101','abc','Inco(PVT)LTD',10.00,100.00,47),('102','abc','Inco(PVT)LTD',10.00,100.00,79),('103','abc','buymore(PVT)LTD',10.00,15.00,69),('104','abc','Total Group company(PVT)LTD',10.00,100.00,101),('105','abc','buymore(PVT)LTD',10.00,100.00,88),('106','abc','buymore(PVT)LTD',10.50,20.50,64),('107','Pliers','St. Anthony\'s Hardware (Pvt) Ltd',5.00,7.00,482),('108','Vernier Calipers','Xiongyihua Plastic Limited',50.00,65.00,473),('109','Spirit Level','Xiongyihua Plastic Limited',120.00,135.00,731),('110','Allen Key','Granding Technoligy Co.,Ltd',210.00,260.00,145),('111','Ball Peen Hammer','St. Anthony\'s Hardware (Pvt) Ltd',350.00,410.00,192),('112','Rubber Head Hammer','Xiongyihua Plastic Limited',355.00,435.00,176),('113','Cutting Wheel','Smlpretty Technology Co., Limited',60.00,85.00,490),('114','Long Nose Pliers','Shenzhen YLI Electric Lock Co. Ltd',250.00,310.00,147),('115','Wire Stripper Pliers','Smlpretty Technology Co., Limited',256.00,302.00,492),('116','Mini Cordless ','Jiangsu Yasheng Metal Products Co.,Ltd',2500.00,3100.00,43),('117','Pipe Wrench','St. Anthony\'s Hardware (Pvt) Ltd',1200.00,1520.00,65),('118','Handle Sharp Shovel','Inco(PVT)LTD',700.00,950.00,292),('119','Handle Sharp Shovel','Inco(PVT)LTD',7.22,950.00,293);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-01 10:01:27
