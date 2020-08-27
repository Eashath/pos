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
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `company` (
  `companyname` varchar(50) DEFAULT NULL,
  `companyphonenumber` int(10) DEFAULT NULL,
  `companyemail` varchar(35) DEFAULT NULL,
  `companyaddres` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
INSERT INTO `company` VALUES ('Inco(PVT)LTD',265456892,'inco@info.com','colombo 04,\nmainstreet.\nSrilanka.'),('buymore(PVT)LTD',26123644,'buymore@info.com','Trincomalee,\nmainstreet.\nSrilanka.'),('Total Group company(PVT)LTD',222235621,'Toatal@gmail.com','colombo 02,\nmalihawata.\n\n'),('Green Solar Tech Co., Ltd',265456892,'green@info.com','colombo 04,\nmainstreet.\nSrilanka.'),('Smlpretty Technology Co., Limited',26123644,'Smlpretty@info.com','kandy,\nmainstreet.\nSrilanka.'),('Jiangsu Yasheng Metal Products Co.,Ltd',222235621,'JiangsuYasheng@gmail.com','colombo 0,\nmalihawata.\n\n'),('Xiongyihua Plastic Limited',265456892,'Xiongyihua@info.com','colombo 05,\nmainstreet.\nSrilanka.'),('Shenzhen YLI Electric Lock Co. Ltd',26123644,'YLI Electric @info.com','gallee,\nmainstreet.\nSrilanka.'),('Granding Technoligy Co.,Ltd',265456892,'Granding @info.com','gurunagale,\nmainstreet.\nSrilanka.'),('Mascons (Pvt) Limited',112325561,'Mascons @info.com','175 Sri Sumanatissa Mawatha,\n Colombo'),('St. Anthony\'s Hardware (Pvt) Ltd',115225200,'St. Anthony\'s@stanthonys.lk','No. 524, Sri Sangaraja Mawatha,\nColombo 10.'),('msePVT)LTD',265456892,'inco@info.com','colombo 04,\nmainstreet.\nSrilanka.');
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
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
