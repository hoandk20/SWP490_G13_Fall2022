-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: tnet_pro
-- ------------------------------------------------------
-- Server version	8.0.30

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
-- Table structure for table `accounttransaction`
--

DROP TABLE IF EXISTS `accounttransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accounttransaction` (
  `TransactionID` varchar(50) NOT NULL,
  `UserID` varchar(50) DEFAULT NULL,
  `DriverID` varchar(50) DEFAULT NULL,
  `AgentID` int DEFAULT NULL,
  `TransactionDate` date NOT NULL,
  `TransferDate` date DEFAULT NULL,
  `Amount` double NOT NULL DEFAULT '0',
  `Discount` double NOT NULL DEFAULT '0',
  `balance` double NOT NULL DEFAULT '0',
  `PromotionBalance` double NOT NULL DEFAULT '0',
  `reason` varchar(500) DEFAULT NULL,
  `Payer` varchar(100) DEFAULT NULL,
  `Type` varchar(4) NOT NULL,
  `PaymentType` varchar(4) NOT NULL,
  `PartnerInvoiceNo` varchar(50) DEFAULT NULL,
  `PartnerPaymentNo` varchar(50) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `TripID` varchar(50) DEFAULT NULL,
  `Status` varchar(4) DEFAULT NULL,
  `ReasonCode` varchar(35) DEFAULT NULL,
  `Promotion1` double(17,4) NOT NULL DEFAULT '0.0000',
  `PromotionBalance1` double NOT NULL DEFAULT '0',
  `programCode` varchar(30) DEFAULT NULL,
  `companyCode` varchar(11) DEFAULT NULL,
  `PromotionTripId` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`TransactionID`),
  KEY `FK_i0dupg72vxu4msv0sn9p9pup5` (`UserID`),
  KEY `FK_e7fpybktcmq0tn6sat8v3rckg` (`DriverID`),
  KEY `FK_ewedj1d9vsi3xifknllyqcnos` (`AgentID`),
  KEY `FK_f2yb4m5fusu03ieurmhx19dgt` (`PartnerInvoiceNo`),
  KEY `FK_e4bsjepapgpqu5rtl3okhy8sy` (`PartnerPaymentNo`),
  KEY `FK_pki92xgtyvwojfr5modle5cvt` (`TripID`),
  KEY `programCode` (`programCode`,`companyCode`),
  KEY `FK_promotion_trip_id_PromotionTrip` (`PromotionTripId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accounttransaction`
--

LOCK TABLES `accounttransaction` WRITE;
/*!40000 ALTER TABLE `accounttransaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `accounttransaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `address` (
  `AddressID` varchar(50) NOT NULL,
  `CityID` int DEFAULT NULL,
  `CountryID` varchar(4) NOT NULL,
  `DistrictID` int DEFAULT NULL,
  `AddressDetail` varchar(150) DEFAULT NULL,
  `PostalCode` varchar(6) DEFAULT NULL,
  `Latitude` double DEFAULT NULL,
  `Longitude` double DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`AddressID`),
  KEY `FK_k4ecb4fix0nxidumq3x28x01i` (`CityID`),
  KEY `FK_cu2dilwrxmhe6u4clt4e7ie85` (`DistrictID`),
  KEY `FK_2gw6nk7gdvfvm2vsyej7lkn2i` (`CountryID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agent`
--

DROP TABLE IF EXISTS `agent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agent` (
  `AgentID` int NOT NULL AUTO_INCREMENT,
  `CityID` int NOT NULL,
  `HomeAddressID` varchar(50) DEFAULT NULL,
  `OfficeAddressId` varchar(50) DEFAULT NULL,
  `AgentCode` varchar(50) NOT NULL,
  `AgentName` varchar(100) NOT NULL,
  `ShareRate` float NOT NULL DEFAULT '0',
  `Balance` double NOT NULL DEFAULT '0',
  `MobileNo` varchar(12) DEFAULT NULL,
  `VATNumber` varchar(20) DEFAULT NULL,
  `PromotionCode` varchar(20) DEFAULT NULL,
  `ParentID` varchar(50) DEFAULT NULL,
  `EffectiveDate` date DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) DEFAULT NULL,
  `LastModifiedDate` datetime NOT NULL,
  `Status` varchar(2) NOT NULL,
  `BankNo` varchar(20) DEFAULT NULL,
  `BankID` int DEFAULT NULL,
  `BranchID` int DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `UrlLogo` varchar(100) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`AgentID`),
  KEY `FK_jc152rdh4kvt9nc8dlky0iwea` (`CityID`),
  KEY `FK_b2hqph1ese989fm8f39dvsljt` (`HomeAddressID`),
  KEY `FK_b60928501v3lv79d2jn0s76bl` (`OfficeAddressId`),
  KEY `FK_l84biiak26altmudb4tl845at` (`BankID`),
  KEY `FK6ts31tug1hkub3mu0xa4d2ei` (`BranchID`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agent`
--

LOCK TABLES `agent` WRITE;
/*!40000 ALTER TABLE `agent` DISABLE KEYS */;
/*!40000 ALTER TABLE `agent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agentaddress`
--

DROP TABLE IF EXISTS `agentaddress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agentaddress` (
  `AgentAddressId` int NOT NULL AUTO_INCREMENT,
  `AddressId` varchar(50) NOT NULL,
  `AgentId` int DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  PRIMARY KEY (`AgentAddressId`),
  KEY `FK_87cd8p0797mpl7h194fwmdr3t` (`AddressId`),
  KEY `FK_pmjqs7k5g2lp2q5vr19im9t5d` (`AgentId`)
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agentaddress`
--

LOCK TABLES `agentaddress` WRITE;
/*!40000 ALTER TABLE `agentaddress` DISABLE KEYS */;
/*!40000 ALTER TABLE `agentaddress` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agentimg`
--

DROP TABLE IF EXISTS `agentimg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agentimg` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `AgentId` int NOT NULL,
  `PathImg` varchar(150) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`Id`),
  KEY `agentimgforeignkeyagent_idx` (`AgentId`)
) ENGINE=InnoDB AUTO_INCREMENT=189 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agentimg`
--

LOCK TABLES `agentimg` WRITE;
/*!40000 ALTER TABLE `agentimg` DISABLE KEYS */;
/*!40000 ALTER TABLE `agentimg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agentinvoice`
--

DROP TABLE IF EXISTS `agentinvoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agentinvoice` (
  `InvoiceNumber` varchar(50) NOT NULL,
  `AgentID` int NOT NULL,
  `VATRate` float NOT NULL DEFAULT '0',
  `VAT` double NOT NULL DEFAULT '0',
  `Total` double NOT NULL DEFAULT '0',
  `ActualPayment` double NOT NULL DEFAULT '0',
  `InvoiceDate` date NOT NULL,
  `FromDate` date NOT NULL,
  `ToDate` date NOT NULL,
  `Currency` varchar(10) NOT NULL,
  `PaymentType` varchar(3) NOT NULL,
  `Category` varchar(3) NOT NULL,
  `Receiver` varchar(100) NOT NULL,
  `Status` varchar(3) NOT NULL,
  `Note` varchar(200) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`InvoiceNumber`),
  KEY `FK_lme5v6so2r38ig5g2pj7ked1` (`AgentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agentinvoice`
--

LOCK TABLES `agentinvoice` WRITE;
/*!40000 ALTER TABLE `agentinvoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `agentinvoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agentpayment`
--

DROP TABLE IF EXISTS `agentpayment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agentpayment` (
  `PaymentNumber` varchar(50) NOT NULL,
  `AgentID` int NOT NULL,
  `BankID` int DEFAULT NULL,
  `ReceiverNI` varchar(15) DEFAULT NULL,
  `Total` double NOT NULL DEFAULT '0',
  `ActualPayment` double NOT NULL DEFAULT '0',
  `PaymentDate` date NOT NULL,
  `Currency` varchar(10) NOT NULL,
  `PaymentMethod` varchar(3) NOT NULL,
  `BankAccount` varchar(15) DEFAULT NULL,
  `Receiver` varchar(100) NOT NULL,
  `Status` varchar(3) NOT NULL,
  `Category` varchar(3) NOT NULL,
  `Note` varchar(200) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Title` varchar(200) DEFAULT NULL,
  `Reason` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`PaymentNumber`),
  KEY `FK_rtl1tunk7i6tw9pr8mg1anhho` (`AgentID`),
  KEY `FK_dv33lkcddrfp89pi7cjey504y` (`BankID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agentpayment`
--

LOCK TABLES `agentpayment` WRITE;
/*!40000 ALTER TABLE `agentpayment` DISABLE KEYS */;
/*!40000 ALTER TABLE `agentpayment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agentstaff`
--

DROP TABLE IF EXISTS `agentstaff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agentstaff` (
  `AgentStaffID` varchar(50) NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `AgentID` int DEFAULT NULL,
  `LanguageCode` varchar(4) NOT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `MobileNo` varchar(12) DEFAULT NULL,
  `Image` varchar(255) DEFAULT NULL,
  `FullName` varchar(80) NOT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Individual` bit(1) DEFAULT b'0',
  PRIMARY KEY (`AgentStaffID`),
  KEY `FK_pt2uwlydixcm0cu656ulpuea9` (`AgentID`),
  KEY `FK_ptdo3usldhloqhxrifkgafsn3` (`LanguageCode`),
  KEY `FK_puaw5i3cjw4lsek30qrtw08lh` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agentstaff`
--

LOCK TABLES `agentstaff` WRITE;
/*!40000 ALTER TABLE `agentstaff` DISABLE KEYS */;
/*!40000 ALTER TABLE `agentstaff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `agenttransaction`
--

DROP TABLE IF EXISTS `agenttransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agenttransaction` (
  `AgentTransactionID` varchar(50) NOT NULL,
  `UserID` varchar(50) NOT NULL,
  `AgentID` int DEFAULT NULL,
  `TransactionDate` date NOT NULL,
  `TransferDate` date DEFAULT NULL,
  `Amount` double NOT NULL DEFAULT '0',
  `Discount` double NOT NULL DEFAULT '0',
  `Balance` double NOT NULL DEFAULT '0',
  `Reason` varchar(255) DEFAULT NULL,
  `Payer` varchar(100) DEFAULT NULL,
  `Type` varchar(4) NOT NULL,
  `PaymentType` varchar(4) NOT NULL,
  `AgentInvoiceNo` varchar(50) DEFAULT NULL,
  `AgentPaymentNo` varchar(50) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `AccountTransactionID` varchar(50) DEFAULT NULL,
  `Status` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`AgentTransactionID`),
  KEY `FK_ckg0hg5wyf30n5cj9bquwnas1` (`UserID`),
  KEY `FK_mmgm2vfr2f0lmmax44hjkkhat` (`AgentID`),
  KEY `FK_s77vg4fr4f7bm7lcdwxt98lie` (`AgentInvoiceNo`),
  KEY `FK_s8dwdlg8qicgq28g2d3vmdemt` (`AgentPaymentNo`),
  KEY `FK_bqv5hfsgtnua5ecxl7lmjinbo` (`AccountTransactionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agenttransaction`
--

LOCK TABLES `agenttransaction` WRITE;
/*!40000 ALTER TABLE `agenttransaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `agenttransaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `app_role`
--

DROP TABLE IF EXISTS `app_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `app_role` (
  `role_id` bigint NOT NULL,
  `role_name` varchar(30) NOT NULL,
  PRIMARY KEY (`role_id`),
  UNIQUE KEY `APP_ROLE_UK` (`role_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `app_role`
--

LOCK TABLES `app_role` WRITE;
/*!40000 ALTER TABLE `app_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `app_user`
--

DROP TABLE IF EXISTS `app_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `app_user` (
  `user_id` bigint NOT NULL,
  `enabled` bit(1) NOT NULL,
  `encryted_password` varchar(128) NOT NULL,
  `user_name` varchar(36) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `APP_USER_UK` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `app_user`
--

LOCK TABLES `app_user` WRITE;
/*!40000 ALTER TABLE `app_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `app_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `area`
--

DROP TABLE IF EXISTS `area`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `area` (
  `AreaID` int NOT NULL AUTO_INCREMENT,
  `Lat` double DEFAULT NULL,
  `Lng` double DEFAULT NULL,
  `MaxLat` double DEFAULT NULL,
  `MinLat` double DEFAULT NULL,
  `MaxLng` double DEFAULT NULL,
  `MinLng` double DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `TotalRider` int DEFAULT NULL,
  `TotalDriver` int DEFAULT NULL,
  `TotalActiveRider` int NOT NULL DEFAULT '0',
  `totalNRRequest` int NOT NULL DEFAULT '0',
  `totalSavRequest` int NOT NULL DEFAULT '0',
  `totalEcoRequest` int NOT NULL DEFAULT '0',
  `totalNREcoRequest` int NOT NULL DEFAULT '0',
  `totalEco7Request` int NOT NULL DEFAULT '0',
  `totalNREco7Request` int NOT NULL DEFAULT '0',
  `totalBizRequest` int NOT NULL DEFAULT '0',
  `totalNRBizRequest` int NOT NULL DEFAULT '0',
  `totalBiz7Request` int NOT NULL DEFAULT '0',
  `totalNRBiz7Request` int NOT NULL DEFAULT '0',
  `totalBikRequest` int NOT NULL DEFAULT '0',
  `totalNRBikRequest` int NOT NULL DEFAULT '0',
  `totalDelRequest` int NOT NULL DEFAULT '0',
  `totalNRDelRequest` int NOT NULL DEFAULT '0',
  `address` varchar(150) DEFAULT NULL,
  `savRate` float NOT NULL DEFAULT '0',
  `bikRate` float NOT NULL DEFAULT '0',
  `ecoRate` float NOT NULL DEFAULT '0',
  `eco7Rate` float NOT NULL DEFAULT '0',
  `bizRate` float NOT NULL DEFAULT '0',
  `biz7Rate` float NOT NULL DEFAULT '0',
  `delRate` float NOT NULL DEFAULT '0',
  `countryCode` varchar(4) DEFAULT NULL,
  `JustRate` float NOT NULL DEFAULT '0',
  `TotalJustRequest` int NOT NULL DEFAULT '0',
  `TotalNRJustRequest` int NOT NULL DEFAULT '0',
  `CityId` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`AreaID`),
  KEY `Position_LatLngIndex` (`MaxLat`,`MaxLng`),
  KEY `FK_rdiknh63aq4679o1wveh76v1o` (`countryCode`)
) ENGINE=InnoDB AUTO_INCREMENT=3691 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `area`
--

LOCK TABLES `area` WRITE;
/*!40000 ALTER TABLE `area` DISABLE KEYS */;
/*!40000 ALTER TABLE `area` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bank`
--

DROP TABLE IF EXISTS `bank`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bank` (
  `BankID` int NOT NULL AUTO_INCREMENT,
  `BankName` varchar(100) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ShortName` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`BankID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank`
--

LOCK TABLES `bank` WRITE;
/*!40000 ALTER TABLE `bank` DISABLE KEYS */;
/*!40000 ALTER TABLE `bank` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bankaccount`
--

DROP TABLE IF EXISTS `bankaccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bankaccount` (
  `bankAccountId` varchar(50) NOT NULL,
  `UserID` varchar(50) DEFAULT NULL,
  `BankBranchId` int NOT NULL,
  `AccountNumber` varchar(30) NOT NULL,
  `HolderName` varchar(50) DEFAULT NULL,
  `category` varchar(2) DEFAULT NULL,
  `currency` varchar(4) DEFAULT NULL,
  `HolderEmail` varchar(50) DEFAULT NULL,
  `HolderPhone` varchar(15) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` datetime NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  `verified` bit(1) DEFAULT b'0',
  PRIMARY KEY (`bankAccountId`),
  KEY `FKadv50fume6b043e8yv6pccinr` (`BankBranchId`),
  KEY `FKdyb78xmoki50tn1ffatex3dh` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bankaccount`
--

LOCK TABLES `bankaccount` WRITE;
/*!40000 ALTER TABLE `bankaccount` DISABLE KEYS */;
/*!40000 ALTER TABLE `bankaccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bankbranch`
--

DROP TABLE IF EXISTS `bankbranch`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bankbranch` (
  `BranchId` int NOT NULL AUTO_INCREMENT,
  `BankID` int NOT NULL,
  `BranchName` varchar(100) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CityID` int NOT NULL,
  PRIMARY KEY (`BranchId`),
  KEY `FK_27n1ah30yuxv6cww88rxbevjc` (`BankID`),
  KEY `FK_ikciri21mtdv9a4i6systqsj` (`CityID`)
) ENGINE=InnoDB AUTO_INCREMENT=717 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bankbranch`
--

LOCK TABLES `bankbranch` WRITE;
/*!40000 ALTER TABLE `bankbranch` DISABLE KEYS */;
/*!40000 ALTER TABLE `bankbranch` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bankfee`
--

DROP TABLE IF EXISTS `bankfee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bankfee` (
  `BankFeeID` int NOT NULL,
  `PercentageFee` float NOT NULL,
  `FixedFee` float NOT NULL,
  `StartDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `EndDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Type` varchar(4) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Currency` varchar(4) DEFAULT NULL,
  `HoldRate` float DEFAULT NULL,
  PRIMARY KEY (`BankFeeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bankfee`
--

LOCK TABLES `bankfee` WRITE;
/*!40000 ALTER TABLE `bankfee` DISABLE KEYS */;
/*!40000 ALTER TABLE `bankfee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `banktransaction`
--

DROP TABLE IF EXISTS `banktransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `banktransaction` (
  `OrderCode` varchar(50) NOT NULL,
  `UserId` varchar(50) DEFAULT NULL,
  `TransactionId` varchar(50) DEFAULT NULL,
  `RiderTransactionId` varchar(50) DEFAULT NULL,
  `PaymentId` int DEFAULT NULL,
  `TokenCode` varchar(50) DEFAULT NULL,
  `ResponseCode` varchar(3) DEFAULT NULL,
  `ResponseTransStatus` varchar(2) DEFAULT NULL,
  `Amount` double NOT NULL DEFAULT '0',
  `BankFee` double NOT NULL DEFAULT '0',
  `HoldAmount` double DEFAULT '0',
  `TransactionStatus` varchar(4) DEFAULT NULL,
  `TransactionNLId` varchar(45) DEFAULT NULL,
  `Currency` varchar(12) DEFAULT NULL,
  `Type` varchar(4) DEFAULT NULL,
  `Category` varchar(4) DEFAULT NULL,
  `Note` varchar(255) DEFAULT NULL,
  `ReasonCode` varchar(45) DEFAULT NULL,
  `BuyerMobile` varchar(12) DEFAULT NULL,
  `BuyerEmail` varchar(50) DEFAULT NULL,
  `CreatedBy` varchar(50) DEFAULT NULL,
  `CreatedDate` timestamp NULL DEFAULT NULL,
  `LastModifiedBy` varchar(50) DEFAULT NULL,
  `LastModifiedDate` timestamp NULL DEFAULT NULL,
  `bankAccountId` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`OrderCode`),
  KEY `UserID_idx` (`UserId`),
  KEY `TransactionID_idx` (`TransactionId`),
  KEY `RiderTransactionID_idx` (`RiderTransactionId`),
  KEY `Payment_idx` (`PaymentId`),
  KEY `FK_bank_AccountId_idx` (`bankAccountId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `banktransaction`
--

LOCK TABLES `banktransaction` WRITE;
/*!40000 ALTER TABLE `banktransaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `banktransaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `batchjobstatus`
--

DROP TABLE IF EXISTS `batchjobstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `batchjobstatus` (
  `BacthJobStatusId` int NOT NULL AUTO_INCREMENT,
  `JobName` varchar(100) NOT NULL,
  `Type` varchar(3) NOT NULL,
  `Status` varchar(3) DEFAULT NULL,
  `TimeZone` varchar(50) NOT NULL,
  `JobClassName` varchar(100) NOT NULL,
  `CalculatedDate` date NOT NULL,
  `LastExecutedDate` datetime NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Note` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`BacthJobStatusId`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `batchjobstatus`
--

LOCK TABLES `batchjobstatus` WRITE;
/*!40000 ALTER TABLE `batchjobstatus` DISABLE KEYS */;
/*!40000 ALTER TABLE `batchjobstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `businessunitsummary`
--

DROP TABLE IF EXISTS `businessunitsummary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `businessunitsummary` (
  `BUSINESSUNITSUMMARYID` int NOT NULL AUTO_INCREMENT,
  `BUSINESSUNITID` int DEFAULT NULL,
  `CITYID` int DEFAULT NULL,
  `COUNTRYID` varchar(255) DEFAULT NULL,
  `Level` int NOT NULL,
  `CREATEDBY` varchar(255) DEFAULT NULL,
  `CREATEDDATE` datetime DEFAULT NULL,
  `LASTMODIFIEDBY` varchar(255) DEFAULT NULL,
  `LASTMODIFIEDDATE` datetime DEFAULT NULL,
  `MONTHCOMPANYSUMMARYID` int DEFAULT NULL,
  `FinancialYear` int NOT NULL,
  `MONTH` int DEFAULT NULL,
  `NUMBERTRIPSCOMPLETED` float DEFAULT NULL,
  `NUMBEROFTRIPREQUEST` float DEFAULT NULL,
  `TOTALFEETRIPS` double DEFAULT NULL,
  `TOTALCREDITFEE` double DEFAULT NULL,
  `NODRIVERCANCELLEDTRIPS` double DEFAULT NULL,
  `ADJUSTAMOUNT` double DEFAULT NULL,
  `PROMOTIONAMOUNT` double DEFAULT NULL,
  `PROMOTIONCREDITAMOUNT` double DEFAULT NULL,
  `ADJUSTCREDITFARE` double DEFAULT NULL,
  `DRIVERFEE` double DEFAULT NULL,
  `NODRIVERHASTRIPS` double DEFAULT NULL,
  `NODRIVERACTIVE` double DEFAULT NULL,
  `NONEWBIEDRIVER` double DEFAULT NULL,
  `NUMBEROFREJECTEDTRIPS` double DEFAULT NULL,
  `CHARGEDAMOUNT` double DEFAULT NULL,
  `CANCELFEE` double DEFAULT NULL,
  `CREDITTRIPS` double DEFAULT NULL,
  `ACTUALPAYMENT` double DEFAULT NULL,
  `TotallPaid` double DEFAULT '0',
  `NoTripDRNoResponse` double DEFAULT '0',
  `NoTripRDCancel` double DEFAULT '0',
  `NoDriverAcNoHasTrips` double DEFAULT '0',
  `DriverPromotion` double DEFAULT '0',
  `TotalDRBalance` double DEFAULT '0',
  `TotalDRDebt` double DEFAULT '0',
  PRIMARY KEY (`BUSINESSUNITSUMMARYID`),
  KEY `FK_hqfmsg7je4082skveigio6hsc` (`FinancialYear`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `businessunitsummary`
--

LOCK TABLES `businessunitsummary` WRITE;
/*!40000 ALTER TABLE `businessunitsummary` DISABLE KEYS */;
/*!40000 ALTER TABLE `businessunitsummary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bussinessunit`
--

DROP TABLE IF EXISTS `bussinessunit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bussinessunit` (
  `BusinessUnitID` int NOT NULL AUTO_INCREMENT,
  `CityID` int DEFAULT NULL,
  `AddressID` varchar(50) DEFAULT NULL,
  `StaffID` varchar(50) DEFAULT NULL,
  `CountryID` varchar(4) NOT NULL,
  `ParentID` int DEFAULT NULL,
  `Level` int NOT NULL,
  `BusinessUnitName` longtext,
  `Email` varchar(50) DEFAULT NULL,
  `PhoneNumber` varchar(20) DEFAULT NULL,
  `Status` varchar(15) NOT NULL,
  `Category` varchar(15) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `StartDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`BusinessUnitID`),
  KEY `FK_42s0yhv1eb332c94cge48xhdv` (`CityID`),
  KEY `FK_th1t01xdlrtfqefeptilb0gk4` (`AddressID`),
  KEY `FK_delmm1ymmygmonht3qptytn8j` (`StaffID`),
  KEY `FK_s0u4bh5oaxcdf7sf33qnsakol` (`ParentID`),
  KEY `FK_hw6lsmmun608g35j4vl2o8g90` (`CountryID`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bussinessunit`
--

LOCK TABLES `bussinessunit` WRITE;
/*!40000 ALTER TABLE `bussinessunit` DISABLE KEYS */;
/*!40000 ALTER TABLE `bussinessunit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `carmaker`
--

DROP TABLE IF EXISTS `carmaker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carmaker` (
  `CarMakerID` int NOT NULL AUTO_INCREMENT,
  `CarMaker` varchar(20) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`CarMakerID`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carmaker`
--

LOCK TABLES `carmaker` WRITE;
/*!40000 ALTER TABLE `carmaker` DISABLE KEYS */;
/*!40000 ALTER TABLE `carmaker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cartype`
--

DROP TABLE IF EXISTS `cartype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cartype` (
  `CarTypeID` int NOT NULL AUTO_INCREMENT,
  `CarMakerID` int NOT NULL,
  `CarTitle` varchar(30) NOT NULL,
  `Level` varchar(4) DEFAULT NULL,
  `Status` varchar(2) DEFAULT NULL,
  `Capacity` int NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`CarTypeID`),
  KEY `FK_dan7q8g0rqhdyp6xbj5n5rijk` (`CarMakerID`)
) ENGINE=InnoDB AUTO_INCREMENT=311 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cartype`
--

LOCK TABLES `cartype` WRITE;
/*!40000 ALTER TABLE `cartype` DISABLE KEYS */;
/*!40000 ALTER TABLE `cartype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chatobject`
--

DROP TABLE IF EXISTS `chatobject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chatobject` (
  `msgId` varchar(50) NOT NULL,
  `date` bigint DEFAULT NULL,
  `message` varchar(500) DEFAULT NULL,
  `receiveId` varchar(50) DEFAULT NULL,
  `senderId` varchar(50) DEFAULT NULL,
  `senderType` varchar(4) DEFAULT NULL,
  `status` varchar(4) DEFAULT NULL,
  `tripId` varchar(70) DEFAULT NULL,
  `MessageType` tinyint NOT NULL,
  `fileName` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`msgId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chatobject`
--

LOCK TABLES `chatobject` WRITE;
/*!40000 ALTER TABLE `chatobject` DISABLE KEYS */;
/*!40000 ALTER TABLE `chatobject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `city`
--

DROP TABLE IF EXISTS `city`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `city` (
  `CityID` int NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `CityCode` varchar(4) NOT NULL,
  `TimeZone` varchar(50) NOT NULL,
  `ZoneOffset` int NOT NULL,
  `Latitute` double NOT NULL,
  `Longtitude` double NOT NULL,
  `VATRate` float NOT NULL,
  `Eco` bit(1) NOT NULL DEFAULT b'0',
  `EcoHuge` bit(1) NOT NULL DEFAULT b'0',
  `Biz` bit(1) NOT NULL DEFAULT b'0',
  `BizHuge` bit(1) NOT NULL DEFAULT b'0',
  `Lux` bit(1) NOT NULL DEFAULT b'0',
  `LuxHuge` bit(1) NOT NULL DEFAULT b'0',
  `Saving` bit(1) NOT NULL DEFAULT b'0',
  `SuperSav` bit(1) NOT NULL DEFAULT b'0',
  `Bike` bit(1) NOT NULL DEFAULT b'0',
  `Operating` bit(1) NOT NULL DEFAULT b'0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DriverMinRate` float DEFAULT '0',
  `MaxCancelRate` float NOT NULL,
  `RequestDistance` float NOT NULL DEFAULT '0',
  `WaitingTime` smallint NOT NULL DEFAULT '0',
  `Delivery` bit(1) NOT NULL DEFAULT b'0',
  `pickup` bit(1) NOT NULL DEFAULT b'0',
  `Bus` bit(1) NOT NULL DEFAULT b'0',
  `address` varchar(150) DEFAULT NULL,
  `TimeOutLimit` smallint NOT NULL DEFAULT '5',
  `CalExtraFare` bit(1) NOT NULL DEFAULT b'0',
  `MinBalance` double NOT NULL DEFAULT '0',
  `MaxNoRequestDriver` int NOT NULL DEFAULT '3',
  `DisForCalExtraFare` float NOT NULL DEFAULT '0.5',
  PRIMARY KEY (`CityID`),
  KEY `FK_gh39sna0v6iq86drhxp9yd2h6` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `city`
--

LOCK TABLES `city` WRITE;
/*!40000 ALTER TABLE `city` DISABLE KEYS */;
/*!40000 ALTER TABLE `city` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `citylocation`
--

DROP TABLE IF EXISTS `citylocation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `citylocation` (
  `CityLocationID` int NOT NULL AUTO_INCREMENT,
  `Lat` double DEFAULT '0',
  `Lng` double DEFAULT '0',
  `MaxLat` double DEFAULT '0',
  `MinLat` double DEFAULT '0',
  `MaxLng` double DEFAULT '0',
  `MinLng` double DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `address` varchar(150) DEFAULT NULL,
  `countryCode` varchar(4) DEFAULT NULL,
  `CityId` int NOT NULL DEFAULT '0',
  `ColNo` int NOT NULL DEFAULT '0',
  `RowNo` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`CityLocationID`),
  KEY `Position_LatLngIndex` (`MaxLat`,`MaxLng`),
  KEY `FK_cityLocationCountryCode` (`countryCode`)
) ENGINE=InnoDB AUTO_INCREMENT=183700 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citylocation`
--

LOCK TABLES `citylocation` WRITE;
/*!40000 ALTER TABLE `citylocation` DISABLE KEYS */;
/*!40000 ALTER TABLE `citylocation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cityname`
--

DROP TABLE IF EXISTS `cityname`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cityname` (
  `CityID` int NOT NULL,
  `LanguageCode` varchar(4) NOT NULL,
  `CityName` varchar(30) NOT NULL,
  `GoogleName` varchar(60) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`CityID`,`LanguageCode`),
  KEY `IDX_CityName` (`CityName`),
  KEY `FK_7x9ewa0xtheoa7vfrtcj6qbg2` (`LanguageCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cityname`
--

LOCK TABLES `cityname` WRITE;
/*!40000 ALTER TABLE `cityname` DISABLE KEYS */;
INSERT INTO `cityname` VALUES (1,'vi','An Giang',NULL,'adminadmin','2022-11-27 07:17:12','adminadmin','2022-11-24 15:18:01'),(2,'vi','Bà Rịa-Vũng Tàu',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(3,'vi','Bạc Liêu',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(4,'vi','Bắc Kạn',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(5,'vi','Bắc Giang',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(6,'vi','Bắc Ninh',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(7,'vi','Bến Tre',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(8,'vi','Bình Dương',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(9,'vi','Bình Định',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(10,'vi','Bình Phước',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(11,'vi','Bình Thuận',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(12,'vi','Cà Mau',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(13,'vi','Cao Bằng',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(14,'vi','Cần Thơ (TP)',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(15,'vi','Đà Nẵng (TP)',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(16,'vi','Đắk Lắk',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(17,'vi','Đắk Nông',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(18,'vi','Điện Biên',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(19,'vi','Đồng Nai',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(20,'vi','Đồng Tháp',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(21,'vi','Gia Lai',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(22,'vi','Hà Giang',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(23,'vi','Hà Nam',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(24,'vi','Hà Nội (TP)',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(25,'vi','Hà Tây',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(26,'vi','Hà Tĩnh',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(27,'vi','Hải Dương',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(28,'vi','Hải Phòng (TP)',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(29,'vi','Hòa Bình',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(30,'vi','Hồ Chí Minh (TP)',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(31,'vi','Hậu Giang',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(32,'vi','Hưng Yên',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(33,'vi','Khánh Hòa',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(34,'vi','Kiên Giang',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(35,'vi','Kon Tum',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(36,'vi','Lai Châu',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(37,'vi','Lào Cai',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(38,'vi','Lạng Sơn',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(39,'vi','Lâm Đồng',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(40,'vi','Long An',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(41,'vi','Nam Định',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(42,'vi','Nghệ An',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(43,'vi','Ninh Bình',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(44,'vi','Ninh Thuận',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(45,'vi','Phú Thọ',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(46,'vi','Phú Yên',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(47,'vi','Quảng Bình',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(48,'vi','Quảng Nam',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(49,'vi','Quảng Ngãi',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(50,'vi','Quảng Ninh',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(51,'vi','Quảng Trị',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(52,'vi','Sóc Trăng',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(53,'vi','Sơn La',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(54,'vi','Tây Ninh',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(55,'vi','Thái Bình',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(56,'vi','Thái Nguyên',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(57,'vi','Thanh Hóa',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(58,'vi','Thừa Thiên – Huế',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(59,'vi','Tiền Giang',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(60,'vi','Trà Vinh',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(61,'vi','Tuyên Quang',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(62,'vi','Vĩnh Long',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(63,'vi','Vĩnh Phúc',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01'),(64,'vi','Yên Bái',NULL,'admin','2022-11-27 07:17:12','admin','2022-11-24 15:18:01');
/*!40000 ALTER TABLE `cityname` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `citypromotionprogram`
--

DROP TABLE IF EXISTS `citypromotionprogram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `citypromotionprogram` (
  `CityID` int NOT NULL,
  `ProgramCode` varchar(30) NOT NULL,
  `CompanyCode` varchar(15) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`CityID`,`ProgramCode`,`CompanyCode`),
  KEY `FK_pa598k2u9eed34hl34jrw76k2` (`ProgramCode`,`CompanyCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `citypromotionprogram`
--

LOCK TABLES `citypromotionprogram` WRITE;
/*!40000 ALTER TABLE `citypromotionprogram` DISABLE KEYS */;
/*!40000 ALTER TABLE `citypromotionprogram` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collectedemail`
--

DROP TABLE IF EXISTS `collectedemail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `collectedemail` (
  `Email` varchar(50) NOT NULL,
  `Target` varchar(4) DEFAULT NULL,
  `Status` varchar(4) DEFAULT NULL,
  `Exist` bit(1) NOT NULL DEFAULT b'0',
  `IsVerified` bit(1) NOT NULL DEFAULT b'0',
  `note` varchar(100) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Language` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`Email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collectedemail`
--

LOCK TABLES `collectedemail` WRITE;
/*!40000 ALTER TABLE `collectedemail` DISABLE KEYS */;
/*!40000 ALTER TABLE `collectedemail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collectedphone`
--

DROP TABLE IF EXISTS `collectedphone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `collectedphone` (
  `CountryCode` varchar(4) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `AreaCode` varchar(4) DEFAULT NULL,
  `Target` varchar(4) DEFAULT NULL,
  `Status` varchar(4) DEFAULT NULL,
  `Exist` bit(1) NOT NULL DEFAULT b'0',
  `IsVerified` bit(1) NOT NULL DEFAULT b'0',
  `VerifyCode` varchar(10) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `note` varchar(400) DEFAULT NULL,
  `PushStatus` varchar(4) DEFAULT NULL,
  `RiderRegStatus` bit(1) NOT NULL DEFAULT b'0',
  `DriverRegStatus` bit(1) NOT NULL DEFAULT b'0',
  `UserInputVCode` varchar(10) DEFAULT NULL,
  `ContactTimes` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`CountryCode`,`Phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collectedphone`
--

LOCK TABLES `collectedphone` WRITE;
/*!40000 ALTER TABLE `collectedphone` DISABLE KEYS */;
/*!40000 ALTER TABLE `collectedphone` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company`
--

DROP TABLE IF EXISTS `company`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `company` (
  `CompanyID` int NOT NULL AUTO_INCREMENT,
  `CityID` int NOT NULL,
  `OperatingLisence` int DEFAULT NULL,
  `BusinessRegistration` int DEFAULT NULL,
  `OtherDocument` int DEFAULT NULL,
  `ContractDocument` int DEFAULT NULL,
  `AddressID` varchar(50) DEFAULT NULL,
  `Name` varchar(100) NOT NULL,
  `BusinessType` varchar(10) NOT NULL,
  `Balance` double NOT NULL DEFAULT '0',
  `RequiredBalance` double NOT NULL DEFAULT '0',
  `RequiredProBalance` double NOT NULL DEFAULT '0',
  `VATNumber` varchar(20) DEFAULT NULL,
  `PhoneNo` varchar(15) DEFAULT NULL,
  `PostalCode` varchar(6) DEFAULT NULL,
  `StartServiceDate` date DEFAULT NULL,
  `Status` varchar(2) NOT NULL,
  `BankNo` varchar(20) DEFAULT NULL,
  `BankID` int DEFAULT NULL,
  `CurrentPromotionCode` varchar(20) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `SelfControlled` bit(1) DEFAULT b'0',
  `CompanyLogo` varchar(120) DEFAULT NULL,
  `Note` varchar(250) DEFAULT NULL,
  `IncludedTolls` bit(1) DEFAULT b'0',
  `ChargeBankFee` bit(1) DEFAULT b'0',
  `CompanyGroupId` int DEFAULT NULL,
  `BranchId` int DEFAULT NULL,
  `AccountHolder` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`CompanyID`),
  KEY `FK_9fa9odkdcfi6jymarol3trspc` (`CityID`),
  KEY `FK_jpx541942nu6vbok37057401i` (`OperatingLisence`),
  KEY `FK_j7h1htuhek7be072dbfbhcn2v` (`BusinessRegistration`),
  KEY `FK_bco1cpywb85dftdnhfxk87nt7` (`OtherDocument`),
  KEY `FK_qundvd60pe51wjwx3dyx5lqhe` (`ContractDocument`),
  KEY `FK_a0bxot7064qvemssocpi94bex` (`AddressID`),
  KEY `FK_qpv9dhdn8ukfkc676hv1tlc94` (`CompanyGroupId`),
  KEY `FK_3ix2fth5rulym6nq1o86kfxpr` (`BranchId`),
  KEY `INDEX_company_created_date_time` (`CreatedDate`)
) ENGINE=InnoDB AUTO_INCREMENT=2635 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company`
--

LOCK TABLES `company` WRITE;
/*!40000 ALTER TABLE `company` DISABLE KEYS */;
/*!40000 ALTER TABLE `company` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `companygroup`
--

DROP TABLE IF EXISTS `companygroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `companygroup` (
  `CompanyGroupID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `Logo` varchar(120) DEFAULT NULL,
  `Status` varchar(2) NOT NULL,
  `SelfControl` bit(1) DEFAULT b'0',
  `AddressID` varchar(50) DEFAULT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Eco` bit(1) NOT NULL DEFAULT b'1',
  `EcoHuge` bit(1) NOT NULL DEFAULT b'1',
  `Biz` bit(1) NOT NULL DEFAULT b'0',
  `BizHuge` bit(1) NOT NULL DEFAULT b'0',
  `Lux` bit(1) NOT NULL DEFAULT b'0',
  `LuxHuge` bit(1) NOT NULL DEFAULT b'0',
  `Saving` bit(1) NOT NULL DEFAULT b'1',
  `SuperSav` bit(1) NOT NULL DEFAULT b'0',
  `Bike` bit(1) NOT NULL DEFAULT b'0',
  `Delivery` bit(1) NOT NULL DEFAULT b'0',
  `pickup` bit(1) NOT NULL DEFAULT b'0',
  `Bus` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`CompanyGroupID`),
  KEY `FK_qeu1j7wx19kfivyllf30666dk` (`AddressID`),
  KEY `FK_djiqa2tbqm6hhff1ior22x2qx` (`CountryCode`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `companygroup`
--

LOCK TABLES `companygroup` WRITE;
/*!40000 ALTER TABLE `companygroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `companygroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `companyparkarea`
--

DROP TABLE IF EXISTS `companyparkarea`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `companyparkarea` (
  `ParkAreaID` int NOT NULL AUTO_INCREMENT,
  `CompanyID` int NOT NULL,
  `Latitute` double NOT NULL,
  `Longtitude` double NOT NULL,
  `Name` varchar(50) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ParkAreaID`),
  KEY `FK_3ot43224a6igkkqgt5tej04vw` (`CompanyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `companyparkarea`
--

LOCK TABLES `companyparkarea` WRITE;
/*!40000 ALTER TABLE `companyparkarea` DISABLE KEYS */;
/*!40000 ALTER TABLE `companyparkarea` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `country` (
  `Code` varchar(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Operate` tinyint NOT NULL DEFAULT '0',
  `PostalCode` varchar(5) NOT NULL,
  `DistanceUnit` varchar(7) NOT NULL,
  `RequestInvoice` tinyint NOT NULL DEFAULT '0',
  `Currency` varchar(12) DEFAULT NULL,
  `RoundValue` int DEFAULT NULL,
  `RoundUnit` varchar(5) DEFAULT NULL,
  `NumberFormat` varchar(15) DEFAULT NULL,
  `CurrencyFormat` varchar(5) DEFAULT NULL,
  `InternationalCode` varchar(9) NOT NULL,
  `RiderPromotion` varchar(75) DEFAULT NULL,
  `DriverPromotion` varchar(75) DEFAULT NULL,
  `AgentPromotion` varchar(75) DEFAULT NULL,
  `RiderInvitation` varchar(75) DEFAULT NULL,
  `DriverInvitation` varchar(75) DEFAULT NULL,
  `AgentInvitation` varchar(75) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `IncludedTolls` bit(1) DEFAULT b'0',
  `ChargeBankFee` bit(1) DEFAULT b'1',
  `RiderMinRate` float DEFAULT '0',
  `SupportEmail` varchar(50) DEFAULT NULL,
  `MinDriverBalance` double NOT NULL DEFAULT '0',
  `MinWithdrawal` double DEFAULT '0',
  `MinChargeAmount` double NOT NULL DEFAULT '0',
  `completeTripTimeOut` tinyint NOT NULL DEFAULT '10',
  `MobileRegex` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`Code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `countrybankfee`
--

DROP TABLE IF EXISTS `countrybankfee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `countrybankfee` (
  `BankFeeID` int NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `StartDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `FeeValue` float NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`BankFeeID`,`CountryCode`,`StartDate`),
  KEY `FK_el16nlsb2k82m2kyeu866h5n0` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countrybankfee`
--

LOCK TABLES `countrybankfee` WRITE;
/*!40000 ALTER TABLE `countrybankfee` DISABLE KEYS */;
/*!40000 ALTER TABLE `countrybankfee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `countryname`
--

DROP TABLE IF EXISTS `countryname`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `countryname` (
  `Code` varchar(4) NOT NULL,
  `LanguageCode` varchar(4) NOT NULL,
  `CountryName` varchar(30) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`Code`,`LanguageCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countryname`
--

LOCK TABLES `countryname` WRITE;
/*!40000 ALTER TABLE `countryname` DISABLE KEYS */;
/*!40000 ALTER TABLE `countryname` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `currentstatus`
--

DROP TABLE IF EXISTS `currentstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `currentstatus` (
  `DriverID` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CurrentLatitude` double NOT NULL,
  `CurrentLongtitude` double NOT NULL,
  `CurrentStatus` varchar(2) NOT NULL,
  `Level` varchar(4) DEFAULT NULL,
  `Level2` varchar(4) DEFAULT NULL,
  `Level3` varchar(4) DEFAULT NULL,
  `CurrentTripId` varchar(50) DEFAULT NULL,
  `NoWeekTrips` smallint NOT NULL DEFAULT '0',
  `NoDayTrips` smallint NOT NULL DEFAULT '0',
  `NoReponseDayTrips` smallint NOT NULL DEFAULT '0',
  `NoCancelledDayTrips` smallint NOT NULL DEFAULT '0',
  `NoCancelledWTrips` smallint NOT NULL DEFAULT '0',
  `NoReponseWTrips` smallint NOT NULL DEFAULT '0',
  `NoRequiredTripInWeek` smallint NOT NULL DEFAULT '0',
  `WeekStartDate` timestamp NULL DEFAULT NULL,
  `SelfControlled` bit(1) DEFAULT b'0',
  `CompanyID` int NOT NULL,
  `CompanyGroupID` int DEFAULT NULL,
  `LanguageCode` varchar(4) DEFAULT NULL,
  `AutoOnline` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`DriverID`),
  KEY `FK_eixv2jj00cigalegmyekmsgjk` (`CompanyGroupID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currentstatus`
--

LOCK TABLES `currentstatus` WRITE;
/*!40000 ALTER TABLE `currentstatus` DISABLE KEYS */;
/*!40000 ALTER TABLE `currentstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dailydriversummary`
--

DROP TABLE IF EXISTS `dailydriversummary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dailydriversummary` (
  `DailyDriverSummaryID` bigint NOT NULL AUTO_INCREMENT,
  `DriverID` varchar(50) NOT NULL,
  `ProcessedDate` datetime DEFAULT NULL,
  `DriverFee` double NOT NULL DEFAULT '0',
  `NoCreditPaidTrips` smallint NOT NULL DEFAULT '0',
  `NumberOfRejectedTrips` smallint NOT NULL DEFAULT '0',
  `NumberOfNoResponseTrips` smallint NOT NULL DEFAULT '0',
  `NumberReceivedTrips` smallint NOT NULL DEFAULT '0',
  `NumberDriverCancelledTrips` smallint NOT NULL DEFAULT '0',
  `NumberRiderCancelledTrips` smallint NOT NULL DEFAULT '0',
  `Distance` double NOT NULL DEFAULT '0',
  `AdjustCreditFare` double NOT NULL DEFAULT '0',
  `Rate` float NOT NULL DEFAULT '0',
  `InvoiceStatus` varchar(3) NOT NULL,
  `WeekNo` smallint DEFAULT NULL,
  `NoTrips` smallint NOT NULL DEFAULT '0',
  `CompanyID` int DEFAULT NULL,
  `PartnerInvoiceNo` varchar(255) DEFAULT NULL,
  `TotalFare` double NOT NULL DEFAULT '0',
  `AdjustAmount` double NOT NULL DEFAULT '0',
  `PromotionAmount` double NOT NULL DEFAULT '0',
  `Promotion1` double NOT NULL DEFAULT '0',
  `Promotion2` double NOT NULL DEFAULT '0',
  `Payment` double NOT NULL DEFAULT '0',
  `DriverBankFee` double NOT NULL DEFAULT '0',
  `RiderBankFee` double NOT NULL DEFAULT '0',
  `cancelFee` double NOT NULL DEFAULT '0',
  `Tolls` double NOT NULL DEFAULT '0',
  `WeekNumberID` bigint DEFAULT NULL,
  `ActualPayment` double NOT NULL DEFAULT '0',
  `TotalFeeRDCredit` double NOT NULL DEFAULT '0',
  `TotalTollsTripsCredit` double NOT NULL DEFAULT '0',
  `TotalPromotionRDCash` double NOT NULL DEFAULT '0',
  `TotalPromotionRDCredit` double NOT NULL DEFAULT '0',
  `DriverDeponsitAccount` double NOT NULL DEFAULT '0',
  `TotalFareRDCancelTrips` double NOT NULL DEFAULT '0',
  `DriverFeeRDCredit` double NOT NULL DEFAULT '0',
  `CreatedBy` varchar(255) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Date` date NOT NULL,
  `CompletedTrips` smallint NOT NULL DEFAULT '0',
  `DriverPoint` bigint NOT NULL DEFAULT '0',
  PRIMARY KEY (`DailyDriverSummaryID`),
  KEY `FK_4sy5il608ap1kixj1st7ooj6l` (`WeekNumberID`),
  KEY `FK_e0hxeclnq86a1bykrpqysu63x` (`CompanyID`),
  KEY `FK_acv5wlxiq0apj8n2c3tiwes3b` (`PartnerInvoiceNo`),
  KEY `FK_sv3tliuq6hqrtkvukcr2mdrro` (`DriverID`)
) ENGINE=InnoDB AUTO_INCREMENT=508923 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dailydriversummary`
--

LOCK TABLES `dailydriversummary` WRITE;
/*!40000 ALTER TABLE `dailydriversummary` DISABLE KEYS */;
/*!40000 ALTER TABLE `dailydriversummary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `district`
--

DROP TABLE IF EXISTS `district`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `district` (
  `DistrictID` int NOT NULL AUTO_INCREMENT,
  `CityID` int NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`DistrictID`),
  KEY `FK_oa0gr3y2a8xa5vqt15yfs4gqx` (`CityID`)
) ENGINE=InnoDB AUTO_INCREMENT=1048 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `district`
--

LOCK TABLES `district` WRITE;
/*!40000 ALTER TABLE `district` DISABLE KEYS */;
/*!40000 ALTER TABLE `district` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `districtname`
--

DROP TABLE IF EXISTS `districtname`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `districtname` (
  `DistrictID` int NOT NULL,
  `LanguageCode` varchar(4) NOT NULL,
  `DistrictName` varchar(50) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`DistrictID`,`LanguageCode`),
  KEY `FK_dpteta6m5d5q04gxsmc2sqxso` (`LanguageCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `districtname`
--

LOCK TABLES `districtname` WRITE;
/*!40000 ALTER TABLE `districtname` DISABLE KEYS */;
/*!40000 ALTER TABLE `districtname` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `document`
--

DROP TABLE IF EXISTS `document`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `document` (
  `DocumentID` int NOT NULL AUTO_INCREMENT,
  `FileName` varchar(255) NOT NULL,
  `Link` varchar(255) NOT NULL,
  `ExpiredMonth` varchar(2) NOT NULL,
  `ExpiredYear` varchar(4) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `Status` varchar(20) NOT NULL,
  `EffectiveDate` datetime DEFAULT NULL,
  `ExpiredDate` datetime DEFAULT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`DocumentID`)
) ENGINE=InnoDB AUTO_INCREMENT=131119 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `document`
--

LOCK TABLES `document` WRITE;
/*!40000 ALTER TABLE `document` DISABLE KEYS */;
/*!40000 ALTER TABLE `document` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driver`
--

DROP TABLE IF EXISTS `driver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driver` (
  `DriverID` varchar(50) NOT NULL,
  `DriverLisense` int DEFAULT NULL,
  `CurrentVehicle` int DEFAULT NULL,
  `Rate` float NOT NULL DEFAULT '0',
  `PromotionBalance` double NOT NULL DEFAULT '0',
  `CompanyID` int DEFAULT NULL,
  `AddressID` varchar(50) DEFAULT NULL,
  `VATCode` varchar(15) DEFAULT NULL,
  `BankAccount` varchar(15) DEFAULT NULL,
  `BankID` int DEFAULT NULL,
  `DriveExperience` int DEFAULT NULL,
  `FirstName` varchar(30) NOT NULL,
  `Status` varchar(4) NOT NULL,
  `Position` varchar(3) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `FullName` varchar(81) NOT NULL,
  `MobileNo` varchar(12) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Balance` double NOT NULL DEFAULT '0',
  `CancelRate` float NOT NULL DEFAULT '0',
  `DriverCode` varchar(16) NOT NULL,
  `InvitationCode` varchar(20) DEFAULT NULL,
  `MobileDiviceID` varchar(200) DEFAULT NULL,
  `DeviceType` varchar(3) DEFAULT NULL,
  `DeactivatedDate` datetime DEFAULT NULL,
  `ActivatedDate` datetime DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CompanyName` varchar(100) NOT NULL,
  `Image` varchar(255) DEFAULT NULL,
  `LanguageCode` varchar(4) NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `RegistrationOption` varchar(255) NOT NULL,
  `KnownSource` varchar(3) NOT NULL,
  `RegistrationStep` int DEFAULT '0',
  `TotalTrips` int NOT NULL DEFAULT '0',
  `ProBalance1` double NOT NULL DEFAULT '0',
  `PromotionBalance1` float NOT NULL DEFAULT '0',
  `version` varchar(255) DEFAULT NULL,
  `MobileDeviceID2` varchar(200) DEFAULT NULL,
  `Note` varchar(300) DEFAULT NULL,
  `Internal` tinyint(1) NOT NULL DEFAULT '0',
  `Point` int NOT NULL DEFAULT '0',
  `ContactTimes` tinyint DEFAULT '0',
  `BranchId` int DEFAULT NULL,
  `BranchCityId` int DEFAULT NULL,
  `AccountHolder` varchar(80) DEFAULT NULL,
  `CheckContract` bit(1) DEFAULT b'0',
  `VoIPToken` longtext,
  `KeyValue` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`DriverID`),
  KEY `FK_o84pv5dgas60fva8haxsgbjf9` (`DriverLisense`),
  KEY `FK_mr828b6axpeb2u1fjn9giqoub` (`CurrentVehicle`),
  KEY `FK_bmc64xpcfbtyam3x625s4txyu` (`AddressID`),
  KEY `FK_5d9y7iht55w38s8im7bxghyct` (`BankID`),
  KEY `FK_bh1xsrq7vixaekjvn55mkn7ty` (`DriveExperience`),
  KEY `FK_5lvuj2ws97lny0uxe4swweehi` (`LanguageCode`),
  KEY `FK_cnxvnhialuvns4w7i2xroc5lb` (`CountryCode`),
  KEY `FK_df0iwx4ki0oghy4802skyqx56` (`BranchId`),
  KEY `INDEX_driver_email` (`Email`),
  KEY `INDEX_driver_mobile_no` (`MobileNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driver`
--

LOCK TABLES `driver` WRITE;
/*!40000 ALTER TABLE `driver` DISABLE KEYS */;
/*!40000 ALTER TABLE `driver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverfarepointschema`
--

DROP TABLE IF EXISTS `driverfarepointschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverfarepointschema` (
  `DriverFarePointSchemaID` int NOT NULL AUTO_INCREMENT,
  `CountryCode` varchar(4) NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `Fare` float DEFAULT '0',
  `Point` tinyint NOT NULL DEFAULT '1',
  `VehicleType` varchar(4) DEFAULT NULL,
  `Note` varchar(200) DEFAULT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  PRIMARY KEY (`DriverFarePointSchemaID`),
  KEY `FK_driverfarepointschema_country_code` (`CountryCode`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverfarepointschema`
--

LOCK TABLES `driverfarepointschema` WRITE;
/*!40000 ALTER TABLE `driverfarepointschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `driverfarepointschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverfee`
--

DROP TABLE IF EXISTS `driverfee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverfee` (
  `DriverFeeID` int NOT NULL AUTO_INCREMENT,
  `DriverFeeTableID` int NOT NULL,
  `CompanyID` int NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifyDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifyBy` varchar(50) NOT NULL,
  PRIMARY KEY (`DriverFeeID`),
  KEY `FK_o2vhcs4o31j1f7la4yhpambhb` (`DriverFeeTableID`),
  KEY `FK_fobv031lkym0x2q82ju0eo1dx` (`CompanyID`)
) ENGINE=InnoDB AUTO_INCREMENT=3943 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverfee`
--

LOCK TABLES `driverfee` WRITE;
/*!40000 ALTER TABLE `driverfee` DISABLE KEYS */;
/*!40000 ALTER TABLE `driverfee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverfeetable`
--

DROP TABLE IF EXISTS `driverfeetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverfeetable` (
  `DriverFeeTableID` int NOT NULL AUTO_INCREMENT,
  `VehicleLevel` varchar(4) DEFAULT NULL,
  `Type` varchar(4) NOT NULL,
  `Title` varchar(150) NOT NULL,
  `Status` varchar(4) NOT NULL,
  `Fee` float DEFAULT '0',
  `Unit` varchar(10) DEFAULT NULL,
  `Note` varchar(250) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `EndDate` date DEFAULT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifyDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifyBy` varchar(50) NOT NULL,
  PRIMARY KEY (`DriverFeeTableID`),
  KEY `FK_8fw3umwrxpuf5bgcn0b1rgx25` (`CountryCode`)
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverfeetable`
--

LOCK TABLES `driverfeetable` WRITE;
/*!40000 ALTER TABLE `driverfeetable` DISABLE KEYS */;
/*!40000 ALTER TABLE `driverfeetable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverfeetabledetail`
--

DROP TABLE IF EXISTS `driverfeetabledetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverfeetabledetail` (
  `DriverFeeTableDetailID` int NOT NULL AUTO_INCREMENT,
  `DriverFeeTableID` int NOT NULL,
  `FromKM` float NOT NULL DEFAULT '0',
  `ToKM` float NOT NULL,
  `Fee` float NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifyDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifyBy` varchar(50) NOT NULL,
  PRIMARY KEY (`DriverFeeTableDetailID`),
  KEY `FK_qk4p21qcf8g0a169mt51s83br` (`DriverFeeTableID`)
) ENGINE=InnoDB AUTO_INCREMENT=88 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverfeetabledetail`
--

LOCK TABLES `driverfeetabledetail` WRITE;
/*!40000 ALTER TABLE `driverfeetabledetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `driverfeetabledetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drivergroupfieldpermission`
--

DROP TABLE IF EXISTS `drivergroupfieldpermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drivergroupfieldpermission` (
  `GroupFieldPermissionId` int NOT NULL AUTO_INCREMENT,
  `ScreenID` int NOT NULL,
  `UserGroup` varchar(10) NOT NULL,
  `GroupFieldCode` varchar(30) NOT NULL,
  `CompanyID` int DEFAULT NULL,
  `BUType` varchar(10) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`GroupFieldPermissionId`),
  KEY `FK_lob2a1jjevwcprrhkvp03v1be` (`ScreenID`),
  KEY `FK_93dy576hnw481qdlniqk1h6e5` (`CompanyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drivergroupfieldpermission`
--

LOCK TABLES `drivergroupfieldpermission` WRITE;
/*!40000 ALTER TABLE `drivergroupfieldpermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `drivergroupfieldpermission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driveronlinetime`
--

DROP TABLE IF EXISTS `driveronlinetime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driveronlinetime` (
  `DriverID` varchar(50) NOT NULL,
  `date` date NOT NULL,
  `OnlineTime` int NOT NULL,
  `LastOnlineTime` datetime DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `lastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastOnlineRecord` bit(1) NOT NULL DEFAULT b'0',
  PRIMARY KEY (`DriverID`,`date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driveronlinetime`
--

LOCK TABLES `driveronlinetime` WRITE;
/*!40000 ALTER TABLE `driveronlinetime` DISABLE KEYS */;
/*!40000 ALTER TABLE `driveronlinetime` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driveronlinetimedetail`
--

DROP TABLE IF EXISTS `driveronlinetimedetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driveronlinetimedetail` (
  `DriverID` varchar(50) NOT NULL,
  `OnlineTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `OfflineTime` timestamp NULL DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `OnlineLat` double NOT NULL DEFAULT '0',
  `OnlineLng` double NOT NULL DEFAULT '0',
  `OfflineLat` double NOT NULL DEFAULT '0',
  `OfflineLng` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`DriverID`,`OnlineTime`,`OfflineLat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driveronlinetimedetail`
--

LOCK TABLES `driveronlinetimedetail` WRITE;
/*!40000 ALTER TABLE `driveronlinetimedetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `driveronlinetimedetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverpromotioncode`
--

DROP TABLE IF EXISTS `driverpromotioncode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverpromotioncode` (
  `DriverID` varchar(50) NOT NULL,
  `Code` varchar(20) NOT NULL,
  `ProgramCode` varchar(30) NOT NULL,
  `CompanyCode` varchar(10) NOT NULL,
  `ObjectType` varchar(2) NOT NULL,
  `Status` varchar(2) DEFAULT NULL,
  `AppliedDate` date DEFAULT NULL,
  `ExpireDate` date DEFAULT NULL,
  `NumberOfTrip` smallint DEFAULT NULL,
  `AcualNumberOfTrip` smallint DEFAULT NULL,
  `ActualNumberInvitee` smallint DEFAULT NULL,
  `ActualValue` double DEFAULT NULL,
  `InviterId` varchar(50) DEFAULT NULL,
  `PromoCount` smallint DEFAULT NULL,
  `InviterCalculated` bit(1) DEFAULT NULL,
  `InviteeCalculated` bit(1) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `noInvitee` smallint NOT NULL DEFAULT '0',
  `CalculatedValue` double NOT NULL DEFAULT '0',
  `AccountTransactionID` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`DriverID`,`Code`,`ProgramCode`,`CompanyCode`),
  KEY `FK_24eq02ddcrj3b3eugeqro0anp` (`Code`,`ProgramCode`,`CompanyCode`),
  KEY `FK_6tpd6s0rh5oln74p0869ub9pi` (`InviterId`),
  KEY `Fk_AccountTransactionId1234` (`AccountTransactionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverpromotioncode`
--

LOCK TABLES `driverpromotioncode` WRITE;
/*!40000 ALTER TABLE `driverpromotioncode` DISABLE KEYS */;
/*!40000 ALTER TABLE `driverpromotioncode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverratingpointschema`
--

DROP TABLE IF EXISTS `driverratingpointschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverratingpointschema` (
  `DriverRatingPointSchemaID` int NOT NULL AUTO_INCREMENT,
  `FiveStarRatio` float DEFAULT '0',
  `FourStarRatio` float DEFAULT '0',
  `ThreeStarRatio` float DEFAULT '0',
  `LessTwoStarRatio` float DEFAULT '0',
  `NoRatingRatio` float DEFAULT '0',
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  PRIMARY KEY (`DriverRatingPointSchemaID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverratingpointschema`
--

LOCK TABLES `driverratingpointschema` WRITE;
/*!40000 ALTER TABLE `driverratingpointschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `driverratingpointschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverrewardschema`
--

DROP TABLE IF EXISTS `driverrewardschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverrewardschema` (
  `RewardSchemaId` int NOT NULL AUTO_INCREMENT,
  `ProgramCode` varchar(30) NOT NULL,
  `CompanyCode` varchar(15) NOT NULL,
  `FareFrom` double NOT NULL DEFAULT '0',
  `NoTrip` smallint NOT NULL DEFAULT '0',
  `DistanceFrom` float NOT NULL DEFAULT '0',
  `Reward` double NOT NULL DEFAULT '0',
  `FareTo` double NOT NULL DEFAULT '0',
  `DistanceTo` float DEFAULT '0',
  `PointFrom` smallint NOT NULL DEFAULT '0',
  `PointTo` smallint NOT NULL DEFAULT '0',
  PRIMARY KEY (`RewardSchemaId`),
  KEY `FK_promotionprigramdriverrewardschema` (`ProgramCode`,`CompanyCode`)
) ENGINE=InnoDB AUTO_INCREMENT=225 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverrewardschema`
--

LOCK TABLES `driverrewardschema` WRITE;
/*!40000 ALTER TABLE `driverrewardschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `driverrewardschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverscreenpermission`
--

DROP TABLE IF EXISTS `driverscreenpermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverscreenpermission` (
  `ScreenPermissionId` int NOT NULL AUTO_INCREMENT,
  `ScreenID` int NOT NULL,
  `UserGroup` varchar(10) NOT NULL,
  `CompanyID` int DEFAULT NULL,
  `BUType` varchar(10) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ScreenPermissionId`),
  KEY `FK_vfrm0ji1xmvsjwjftiu1lror` (`ScreenID`),
  KEY `FK_34vd8tfjqaw6mragdddyutmq5` (`CompanyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverscreenpermission`
--

LOCK TABLES `driverscreenpermission` WRITE;
/*!40000 ALTER TABLE `driverscreenpermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `driverscreenpermission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driversellingtriprateschema`
--

DROP TABLE IF EXISTS `driversellingtriprateschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driversellingtriprateschema` (
  `DriverSellingTripRateSchemaID` int NOT NULL AUTO_INCREMENT,
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `MinFee` float NOT NULL DEFAULT '0',
  `MaxFee` float NOT NULL DEFAULT '0',
  `Rate` float NOT NULL DEFAULT '0',
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CancelFee` float NOT NULL DEFAULT '0',
  `Status` varchar(20) NOT NULL,
  PRIMARY KEY (`DriverSellingTripRateSchemaID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driversellingtriprateschema`
--

LOCK TABLES `driversellingtriprateschema` WRITE;
/*!40000 ALTER TABLE `driversellingtriprateschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `driversellingtriprateschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `driverstatussummary`
--

DROP TABLE IF EXISTS `driverstatussummary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `driverstatussummary` (
  `FinancialYear` int NOT NULL,
  `Month` int NOT NULL,
  `CityID` int NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `CountryID` varchar(4) DEFAULT NULL,
  `NumberNewDrivers` int NOT NULL,
  `noSelfControlPartner` int NOT NULL,
  `NumberActiveDrivers` int NOT NULL,
  `NumberNonCallDrivers` int NOT NULL,
  `NumberRequests` int NOT NULL,
  `NumberTrips` int NOT NULL,
  `numberCancelledRequest` int NOT NULL,
  `NumberDeactiveDrivers` int NOT NULL,
  `AverNoTripPerDriver` float NOT NULL,
  `AverageFarePerTrip` double NOT NULL,
  `AverageDistancePerTrip` float NOT NULL,
  `AverDistancePerDriver` double NOT NULL DEFAULT '0',
  `NumRequestNoDrAccept` double NOT NULL DEFAULT '0',
  `AverTripCancelledByDr` double NOT NULL DEFAULT '0',
  `AverTripCancelledByRd` double NOT NULL DEFAULT '0',
  `NumTripCancelledByDr` int NOT NULL DEFAULT '0',
  `NumTripCancelledByRd` int NOT NULL DEFAULT '0',
  `NumTripCancelledByRdAfDRAccept` int NOT NULL DEFAULT '0',
  `NumTripCancelledByDrAfDRAccept` int NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`FinancialYear`,`Month`,`CityID`,`CountryCode`),
  KEY `FK_ap6j1n85qtnxyay5cmdq69ywo` (`CityID`),
  KEY `FK_rfyug70s7e8t44qwp0kps6jk2` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `driverstatussummary`
--

LOCK TABLES `driverstatussummary` WRITE;
/*!40000 ALTER TABLE `driverstatussummary` DISABLE KEYS */;
/*!40000 ALTER TABLE `driverstatussummary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `drivervehicle`
--

DROP TABLE IF EXISTS `drivervehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `drivervehicle` (
  `DriverVehicleID` int NOT NULL AUTO_INCREMENT,
  `DriverID` varchar(50) NOT NULL,
  `VehicleID` int NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifyDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifyBy` varchar(50) NOT NULL,
  PRIMARY KEY (`DriverVehicleID`),
  KEY `FK_hukce7hate4vt2pd18q3o80h5` (`DriverID`),
  KEY `FK_pgkykhsmo9goofqu5hwiypn0b` (`VehicleID`)
) ENGINE=InnoDB AUTO_INCREMENT=32980 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `drivervehicle`
--

LOCK TABLES `drivervehicle` WRITE;
/*!40000 ALTER TABLE `drivervehicle` DISABLE KEYS */;
/*!40000 ALTER TABLE `drivervehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estimatefareratehourschema`
--

DROP TABLE IF EXISTS `estimatefareratehourschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estimatefareratehourschema` (
  `EstimateFareRateHourSchemaId` int NOT NULL,
  `BeforeToHour` smallint NOT NULL,
  `BeforeFromHour` smallint NOT NULL,
  `Rate` float NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Status` varchar(5) NOT NULL,
  PRIMARY KEY (`EstimateFareRateHourSchemaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estimatefareratehourschema`
--

LOCK TABLES `estimatefareratehourschema` WRITE;
/*!40000 ALTER TABLE `estimatefareratehourschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `estimatefareratehourschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `farerate`
--

DROP TABLE IF EXISTS `farerate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `farerate` (
  `FareRateId` varchar(50) NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `CityID` int NOT NULL,
  `Company` int DEFAULT NULL,
  `Content` double NOT NULL,
  `Latitude` double NOT NULL,
  `Longitude` double NOT NULL,
  `TimeStart` int NOT NULL,
  `TimeEnd` int NOT NULL,
  `dayOfWeeks` varchar(20) DEFAULT NULL,
  `CompanyID` int DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` datetime NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  `MinStart` tinyint NOT NULL DEFAULT '0',
  `MinEnd` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`FareRateId`),
  KEY `FK_b2va1597fvmtx7yx8jem26ey1` (`CityID`),
  KEY `FK_5741tpvf6b0deaucdvyv9badw` (`Company`),
  KEY `FK_qq40r2xuqc4mbqamwbl9rlks4` (`CountryCode`),
  KEY `PositionIndex` (`Latitude`,`Longitude`),
  KEY `FK_fqrsedxnal82mpxw62bs7t2d9` (`CompanyID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `farerate`
--

LOCK TABLES `farerate` WRITE;
/*!40000 ALTER TABLE `farerate` DISABLE KEYS */;
/*!40000 ALTER TABLE `farerate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fareratepanel`
--

DROP TABLE IF EXISTS `fareratepanel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fareratepanel` (
  `FareRatePanelID` int NOT NULL AUTO_INCREMENT,
  `CountryCode` varchar(4) DEFAULT NULL,
  `FirstRiderRange` int NOT NULL DEFAULT '0',
  `FirstRate` double NOT NULL DEFAULT '1',
  `SecondRiderRange` int NOT NULL DEFAULT '0',
  `SecondRate` double NOT NULL DEFAULT '1',
  `ThirdRiderRange` int NOT NULL DEFAULT '0',
  `ThirdRate` double NOT NULL DEFAULT '1',
  `FourthRiderRange` int NOT NULL DEFAULT '0',
  `FourthRate` double NOT NULL DEFAULT '1',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `MinRider` int NOT NULL DEFAULT '0',
  `MaxRider` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`FareRatePanelID`),
  KEY `FK_Country_idx` (`CountryCode`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fareratepanel`
--

LOCK TABLES `fareratepanel` WRITE;
/*!40000 ALTER TABLE `fareratepanel` DISABLE KEYS */;
/*!40000 ALTER TABLE `fareratepanel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favorite`
--

DROP TABLE IF EXISTS `favorite`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `favorite` (
  `RiderID` varchar(50) NOT NULL,
  `DriverID` varchar(50) NOT NULL,
  `Type` varchar(4) NOT NULL,
  `Status` varchar(20) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`RiderID`,`DriverID`,`Type`),
  KEY `FK_3583v6skpjr4pges8ys834tsc` (`DriverID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favorite`
--

LOCK TABLES `favorite` WRITE;
/*!40000 ALTER TABLE `favorite` DISABLE KEYS */;
/*!40000 ALTER TABLE `favorite` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedback`
--

DROP TABLE IF EXISTS `feedback`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedback` (
  `FeedBackID` varchar(50) NOT NULL,
  `UserID` varchar(50) DEFAULT NULL,
  `TripID` varchar(50) DEFAULT NULL,
  `Title` varchar(100) NOT NULL,
  `Date` date NOT NULL,
  `Status` varchar(2) NOT NULL,
  `Content` longtext NOT NULL,
  `Type` varchar(4) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UnRead` tinyint(1) NOT NULL DEFAULT '0',
  `CityId` int NOT NULL DEFAULT '0',
  PRIMARY KEY (`FeedBackID`),
  KEY `FK_4tw0issbron8pcjuh2l57xp3` (`UserID`),
  KEY `FK_nj6e9t9pklvn3dy55jkk5bbwy` (`TripID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedback`
--

LOCK TABLES `feedback` WRITE;
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `feedbacktrace`
--

DROP TABLE IF EXISTS `feedbacktrace`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `feedbacktrace` (
  `FeedBackTraceID` varchar(50) NOT NULL,
  `StaffID` varchar(50) DEFAULT NULL,
  `DriverID` varchar(50) DEFAULT NULL,
  `RiderID` varchar(50) DEFAULT NULL,
  `FeedBackID` varchar(50) NOT NULL,
  `Content` longtext,
  `Date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `AgentStaffID` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`FeedBackTraceID`),
  KEY `FK_ohxksdwcd3thys66kh15w1tux` (`StaffID`),
  KEY `FK_116ielbwyifg2nhj5dbtdne1e` (`DriverID`),
  KEY `FK_i3vscrjxoy9icjp1sjywvlis1` (`RiderID`),
  KEY `FK_oyctb0un2n7x68e89eypr52uf` (`FeedBackID`),
  KEY `FK_feedbacktrace_agentstaff_agentstaffid` (`AgentStaffID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `feedbacktrace`
--

LOCK TABLES `feedbacktrace` WRITE;
/*!40000 ALTER TABLE `feedbacktrace` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedbacktrace` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `financialyear`
--

DROP TABLE IF EXISTS `financialyear`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `financialyear` (
  `FinancialYear` int NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`FinancialYear`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `financialyear`
--

LOCK TABLES `financialyear` WRITE;
/*!40000 ALTER TABLE `financialyear` DISABLE KEYS */;
/*!40000 ALTER TABLE `financialyear` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giftcode`
--

DROP TABLE IF EXISTS `giftcode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giftcode` (
  `Code` varchar(20) NOT NULL,
  `ProgramCode` varchar(30) NOT NULL,
  `CompanyCode` varchar(11) NOT NULL,
  `Value` float NOT NULL,
  `Title` varchar(150) DEFAULT NULL,
  `IssuedDate` datetime NOT NULL,
  `Status` varchar(2) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreadtedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Note` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`Code`,`ProgramCode`,`CompanyCode`),
  KEY `FK_s8x6wqnk6i4lxgcmim6siwm9h` (`ProgramCode`,`CompanyCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giftcode`
--

LOCK TABLES `giftcode` WRITE;
/*!40000 ALTER TABLE `giftcode` DISABLE KEYS */;
/*!40000 ALTER TABLE `giftcode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groupfield`
--

DROP TABLE IF EXISTS `groupfield`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `groupfield` (
  `GroupFieldCode` varchar(50) NOT NULL,
  `ScreenID` int NOT NULL,
  `GroupFieldName` varchar(50) NOT NULL,
  `Module` varchar(10) NOT NULL,
  PRIMARY KEY (`GroupFieldCode`),
  KEY `FK_ssal89lj6op7p1jenuk20o609` (`ScreenID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupfield`
--

LOCK TABLES `groupfield` WRITE;
/*!40000 ALTER TABLE `groupfield` DISABLE KEYS */;
/*!40000 ALTER TABLE `groupfield` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groupfieldpermission`
--

DROP TABLE IF EXISTS `groupfieldpermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `groupfieldpermission` (
  `GroupFieldPermissionId` int NOT NULL AUTO_INCREMENT,
  `ScreenID` int NOT NULL,
  `BuLevel` int NOT NULL,
  `UserGroup` varchar(10) NOT NULL,
  `GroupFieldCode` varchar(30) NOT NULL,
  `BUType` varchar(10) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`GroupFieldPermissionId`),
  KEY `FK_k5ikt57r9hns1m07qpwbnmfmi` (`ScreenID`)
) ENGINE=InnoDB AUTO_INCREMENT=94717 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groupfieldpermission`
--

LOCK TABLES `groupfieldpermission` WRITE;
/*!40000 ALTER TABLE `groupfieldpermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `groupfieldpermission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `holidayfarerateschema`
--

DROP TABLE IF EXISTS `holidayfarerateschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `holidayfarerateschema` (
  `HolidayFareRateSchemaId` smallint NOT NULL,
  `FromHour` tinyint NOT NULL DEFAULT '0',
  `ToHour` tinyint NOT NULL DEFAULT '0',
  `FromDate` date NOT NULL,
  `ToDate` date NOT NULL,
  `Rate` float NOT NULL,
  `Status` varchar(5) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` datetime NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`HolidayFareRateSchemaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `holidayfarerateschema`
--

LOCK TABLES `holidayfarerateschema` WRITE;
/*!40000 ALTER TABLE `holidayfarerateschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `holidayfarerateschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invitationlog`
--

DROP TABLE IF EXISTS `invitationlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invitationlog` (
  `InvitationLogID` varchar(50) NOT NULL,
  `UserID` varchar(50) DEFAULT NULL,
  `InvitationCode` varchar(10) NOT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `Mobile` varchar(12) DEFAULT NULL,
  `InternationCode` varchar(9) DEFAULT NULL,
  `Note` longtext,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`InvitationLogID`),
  KEY `FK_ehd6rxnwwlhtm2j8gi90h9hcq` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invitationlog`
--

LOCK TABLES `invitationlog` WRITE;
/*!40000 ALTER TABLE `invitationlog` DISABLE KEYS */;
/*!40000 ALTER TABLE `invitationlog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `language`
--

DROP TABLE IF EXISTS `language`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `language` (
  `LanguageCode` varchar(4) NOT NULL,
  `Language` varchar(20) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`LanguageCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `language`
--

LOCK TABLES `language` WRITE;
/*!40000 ALTER TABLE `language` DISABLE KEYS */;
/*!40000 ALTER TABLE `language` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `languagename`
--

DROP TABLE IF EXISTS `languagename`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `languagename` (
  `Code` varchar(4) NOT NULL,
  `LanguageCode` varchar(4) NOT NULL,
  `LanguageName` varchar(20) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`Code`,`LanguageCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `languagename`
--

LOCK TABLES `languagename` WRITE;
/*!40000 ALTER TABLE `languagename` DISABLE KEYS */;
/*!40000 ALTER TABLE `languagename` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `memberlevel`
--

DROP TABLE IF EXISTS `memberlevel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `memberlevel` (
  `MemberLevelId` int NOT NULL AUTO_INCREMENT,
  `CountryCode` varchar(4) NOT NULL,
  `Silver` int NOT NULL DEFAULT '0',
  `Gold` int NOT NULL DEFAULT '0',
  `Diamond` int NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  PRIMARY KEY (`MemberLevelId`),
  KEY `FK_asn0lu0f2rfm2eryn7c1rbrdw` (`CountryCode`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `memberlevel`
--

LOCK TABLES `memberlevel` WRITE;
/*!40000 ALTER TABLE `memberlevel` DISABLE KEYS */;
/*!40000 ALTER TABLE `memberlevel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `memberleveldetail`
--

DROP TABLE IF EXISTS `memberleveldetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `memberleveldetail` (
  `MemberLevelDetailId` int NOT NULL AUTO_INCREMENT,
  `Level` int NOT NULL,
  `LanguageCode` varchar(11) NOT NULL,
  `Discription` varchar(300) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`MemberLevelDetailId`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `memberleveldetail`
--

LOCK TABLES `memberleveldetail` WRITE;
/*!40000 ALTER TABLE `memberleveldetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `memberleveldetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mobileoperator`
--

DROP TABLE IF EXISTS `mobileoperator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mobileoperator` (
  `OperatorID` int NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `HeaderCode` varchar(6) NOT NULL,
  `OperatorCode` varchar(4) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `InternalPrice` float DEFAULT NULL,
  `ExternalPrice` float DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Length` int DEFAULT NULL,
  PRIMARY KEY (`OperatorID`),
  KEY `FK_g3p4lu5yq29pr8jmk9tatqdn1` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mobileoperator`
--

LOCK TABLES `mobileoperator` WRITE;
/*!40000 ALTER TABLE `mobileoperator` DISABLE KEYS */;
/*!40000 ALTER TABLE `mobileoperator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthlyagentsummary`
--

DROP TABLE IF EXISTS `monthlyagentsummary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monthlyagentsummary` (
  `MonthlyAgentSummaryId` int NOT NULL AUTO_INCREMENT,
  `NumberOfCharges` smallint NOT NULL DEFAULT '0',
  `FinancialYear` smallint NOT NULL,
  `Month` smallint NOT NULL,
  `CurrentBalance` double NOT NULL DEFAULT '0',
  `LastBalance` double NOT NULL DEFAULT '0',
  `AdjustAmount` double NOT NULL DEFAULT '0',
  `PromotionAmount` double NOT NULL DEFAULT '0',
  `PayableAmount` double NOT NULL DEFAULT '0',
  `ActualPayment` double NOT NULL DEFAULT '0',
  `ChargedAmount` double NOT NULL DEFAULT '0',
  `DiscountedAmount` double NOT NULL DEFAULT '0',
  `DiscountRate` double NOT NULL DEFAULT '0',
  `AgentId` int NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`MonthlyAgentSummaryId`),
  KEY `FK_hwj92x4lpoh1qbpogp7boatsn` (`AgentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthlyagentsummary`
--

LOCK TABLES `monthlyagentsummary` WRITE;
/*!40000 ALTER TABLE `monthlyagentsummary` DISABLE KEYS */;
/*!40000 ALTER TABLE `monthlyagentsummary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthlycompanysummary`
--

DROP TABLE IF EXISTS `monthlycompanysummary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monthlycompanysummary` (
  `MonthCompanySummaryId` int NOT NULL AUTO_INCREMENT,
  `CompanyID` int NOT NULL,
  `CityID` int DEFAULT NULL,
  `Month` int NOT NULL,
  `FinancialYear` int DEFAULT NULL,
  `NumberTripsCompleted` int NOT NULL DEFAULT '0',
  `NumberOfTripRequest` int NOT NULL DEFAULT '0',
  `TotalFeeTrips` double NOT NULL DEFAULT '0',
  `TotalCreditFee` double NOT NULL DEFAULT '0',
  `NumberDriverCancelledTrips` int NOT NULL DEFAULT '0',
  `AdjustAmount` double NOT NULL DEFAULT '0',
  `PromotionAmount` double NOT NULL DEFAULT '0',
  `Promotion1` double NOT NULL DEFAULT '0',
  `Promotion2` double NOT NULL DEFAULT '0',
  `PromotionCreditAmount` double NOT NULL DEFAULT '0',
  `AdjustCreditFare` double NOT NULL DEFAULT '0',
  `DriverFee` double NOT NULL DEFAULT '0',
  `noDriverHasTrips` int NOT NULL DEFAULT '0',
  `NoDriverNoHasTrips` int NOT NULL DEFAULT '0',
  `creditTrips` int NOT NULL DEFAULT '0',
  `NoDriverActive` int NOT NULL DEFAULT '0',
  `NoNewbieDriver` int NOT NULL DEFAULT '0',
  `NumberOfRejectedTrips` int NOT NULL DEFAULT '0',
  `NumberOfNoResponseTrips` int NOT NULL DEFAULT '0',
  `DriverDeponsitAccount` double NOT NULL DEFAULT '0',
  `ChargedAmount` double NOT NULL DEFAULT '0',
  `ActualPayment` double NOT NULL DEFAULT '0',
  `CancelFee` double NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`MonthCompanySummaryId`),
  KEY `FK_hv6wcgufqbm9ihyxcw76s0r1i` (`CompanyID`),
  KEY `FK_1npmj3ghlees1baw5nw8cw2e4` (`FinancialYear`),
  KEY `FK_i8prnxhvoipv0utcd3xu1m4hc` (`CityID`)
) ENGINE=InnoDB AUTO_INCREMENT=5824 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthlycompanysummary`
--

LOCK TABLES `monthlycompanysummary` WRITE;
/*!40000 ALTER TABLE `monthlycompanysummary` DISABLE KEYS */;
/*!40000 ALTER TABLE `monthlycompanysummary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monthlydriversummary`
--

DROP TABLE IF EXISTS `monthlydriversummary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monthlydriversummary` (
  `MonthlyDriverSummaryId` int NOT NULL AUTO_INCREMENT,
  `FinancialYear` int NOT NULL,
  `Month` int NOT NULL,
  `CompletedTrips` smallint DEFAULT NULL,
  `NumberCreditTrips` smallint NOT NULL DEFAULT '0',
  `NUMBEROFREJECTEDTRIPS` smallint NOT NULL DEFAULT '0',
  `NUMBEROFNORESPONSETRIPS` smallint NOT NULL DEFAULT '0',
  `NUMBERRECEIVEDTRIPS` smallint NOT NULL DEFAULT '0',
  `NoDriverCancelledTrips` smallint NOT NULL DEFAULT '0',
  `NoRiderCancelledTrips` smallint NOT NULL DEFAULT '0',
  `TotalFare` double NOT NULL DEFAULT '0',
  `Distance` double NOT NULL,
  `AdjustAmount` double NOT NULL DEFAULT '0',
  `PromotionAmount` double NOT NULL DEFAULT '0',
  `Promotion1` double NOT NULL DEFAULT '0',
  `Promotion2` double NOT NULL DEFAULT '0',
  `PromotionCreditAmount` float DEFAULT '0',
  `Payment` double NOT NULL DEFAULT '0',
  `CreditFare` double NOT NULL DEFAULT '0',
  `CreditFareAdjust` double NOT NULL DEFAULT '0',
  `ActualPayment` double NOT NULL DEFAULT '0',
  `TotalFeeRDCredit` float DEFAULT '0',
  `TotalTollsTripsCredit` float DEFAULT '0',
  `TotalPromotionRDCash` float DEFAULT '0',
  `TotalPromotionRDCredit` float DEFAULT '0',
  `DriverDeponsitAccount` double DEFAULT '0',
  `TotalFareRDCancelTrips` float DEFAULT '0',
  `DriverFeeRDCredit` float DEFAULT '0',
  `ChargedAmount` double NOT NULL DEFAULT '0',
  `DiscountedAmount` double NOT NULL DEFAULT '0',
  `DriverFee` double NOT NULL DEFAULT '0',
  `PrepaidAmount` double NOT NULL DEFAULT '0',
  `CompanyId` int NOT NULL,
  `DriverId` varchar(50) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `DriverBankFee` double NOT NULL DEFAULT '0',
  `RiderBankFee` double NOT NULL DEFAULT '0',
  `Tolls` double NOT NULL DEFAULT '0',
  `CancelFee` double NOT NULL DEFAULT '0',
  `AdjustCreditFare` double NOT NULL DEFAULT '0',
  `NoCreditPaidTrips` smallint NOT NULL DEFAULT '0',
  `NoTrips` smallint NOT NULL DEFAULT '0',
  `NumberDriverCancelledTrips` smallint NOT NULL DEFAULT '0',
  `Rate` float NOT NULL DEFAULT '0',
  `NumberRiderCancelledTrips` smallint NOT NULL DEFAULT '0',
  `TotalDRBalance` double DEFAULT '0',
  `TotalDRDebt` double DEFAULT '0',
  `DriverPoint` bigint NOT NULL DEFAULT '0',
  PRIMARY KEY (`MonthlyDriverSummaryId`),
  KEY `FK_aokxhqttglg2v8vdkbpo74k0l` (`CompanyId`),
  KEY `FK_r4v92c7v1ag0ew6dyr96l1nfu` (`DriverId`)
) ENGINE=InnoDB AUTO_INCREMENT=209935 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monthlydriversummary`
--

LOCK TABLES `monthlydriversummary` WRITE;
/*!40000 ALTER TABLE `monthlydriversummary` DISABLE KEYS */;
/*!40000 ALTER TABLE `monthlydriversummary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `movingdirection`
--

DROP TABLE IF EXISTS `movingdirection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `movingdirection` (
  `MovingDirectionID` varchar(50) NOT NULL,
  `DriverID` varchar(50) DEFAULT NULL,
  `FromAddress` varchar(100) DEFAULT NULL,
  `ToAddress` varchar(100) DEFAULT NULL,
  `FromLatitude` double DEFAULT NULL,
  `FromLongitude` double DEFAULT NULL,
  `ToLatitude` double DEFAULT NULL,
  `ToLongitude` double DEFAULT NULL,
  `Time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Status` varchar(4) DEFAULT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  `EndTime` datetime NOT NULL,
  PRIMARY KEY (`MovingDirectionID`,`LastModifiedDate`),
  KEY `FK_r7uw89ayxgmc9p3mvrcsgurmc` (`DriverID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movingdirection`
--

LOCK TABLES `movingdirection` WRITE;
/*!40000 ALTER TABLE `movingdirection` DISABLE KEYS */;
/*!40000 ALTER TABLE `movingdirection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organization`
--

DROP TABLE IF EXISTS `organization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `organization` (
  `OrganizationId` varchar(50) NOT NULL,
  `Code` varchar(255) DEFAULT NULL,
  `Name` varchar(100) NOT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `CityID` int NOT NULL,
  `RepresentativeName` varchar(50) DEFAULT NULL,
  `Phone` varchar(15) DEFAULT NULL,
  `MobileNo` varchar(15) DEFAULT NULL,
  `VAT` varchar(20) DEFAULT NULL,
  `DocumentId` int DEFAULT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `Email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`OrganizationId`),
  KEY `FK_otyigw0vmquxhotwue7cjywr3` (`CityID`),
  KEY `FK_545oign4hetfv9o8mqyflaix4` (`DocumentId`),
  KEY `FK_2xhtsbatvg9agg4evr6rhmtaw` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organization`
--

LOCK TABLES `organization` WRITE;
/*!40000 ALTER TABLE `organization` DISABLE KEYS */;
/*!40000 ALTER TABLE `organization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `organizationpromotion`
--

DROP TABLE IF EXISTS `organizationpromotion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `organizationpromotion` (
  `OrganizationPromotionNo` varchar(50) NOT NULL,
  `AgentID` int NOT NULL,
  `title` varchar(300) DEFAULT NULL,
  `Point` int NOT NULL DEFAULT '0',
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `Value` float NOT NULL DEFAULT '0',
  `Type` varchar(4) NOT NULL,
  `Status` varchar(4) NOT NULL,
  `Image` varchar(100) DEFAULT NULL,
  `InfoUrl` varchar(150) DEFAULT NULL,
  `FocusInfo` varchar(500) DEFAULT NULL,
  `Rule` varchar(500) DEFAULT NULL,
  `Description` varchar(500) DEFAULT NULL,
  `UrlInfoImage` varchar(150) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` datetime NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  `Priority` bit(1) NOT NULL DEFAULT b'0',
  `valueTnet` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`OrganizationPromotionNo`),
  KEY `FK_abnp7gk61fn80dhq8osafulme` (`AgentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `organizationpromotion`
--

LOCK TABLES `organizationpromotion` WRITE;
/*!40000 ALTER TABLE `organizationpromotion` DISABLE KEYS */;
/*!40000 ALTER TABLE `organizationpromotion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partnerinvoice`
--

DROP TABLE IF EXISTS `partnerinvoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partnerinvoice` (
  `InvoiceNumber` varchar(50) NOT NULL,
  `CompanyID` int NOT NULL,
  `VATRate` float NOT NULL DEFAULT '0',
  `VAT` float NOT NULL DEFAULT '0',
  `Total` double NOT NULL DEFAULT '0',
  `ActualPayment` double NOT NULL DEFAULT '0',
  `InvoiceDate` date NOT NULL,
  `FromDate` date NOT NULL,
  `ToDate` date NOT NULL,
  `Currency` varchar(10) NOT NULL,
  `PaymentType` varchar(3) NOT NULL,
  `Category` varchar(3) NOT NULL,
  `Status` varchar(3) NOT NULL,
  `Note` varchar(200) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `BankAccount` varchar(15) DEFAULT NULL,
  `BankID` int DEFAULT NULL,
  `Reciever` varchar(100) DEFAULT NULL,
  `VATCode` varchar(20) DEFAULT NULL,
  `Receiver` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`InvoiceNumber`),
  KEY `FK_bi7i4yp5okfx3k8fb8h7gp617` (`CompanyID`),
  KEY `FK_62garirggc06ii0c4w09x445v` (`BankID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partnerinvoice`
--

LOCK TABLES `partnerinvoice` WRITE;
/*!40000 ALTER TABLE `partnerinvoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `partnerinvoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `partnerpayment`
--

DROP TABLE IF EXISTS `partnerpayment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `partnerpayment` (
  `PaymentNumber` varchar(50) NOT NULL,
  `CompanyID` int NOT NULL,
  `BankID` int DEFAULT NULL,
  `ReceiverNI` varchar(15) DEFAULT NULL,
  `Total` double NOT NULL DEFAULT '0',
  `ActualPayment` double NOT NULL DEFAULT '0',
  `PaymentDate` date NOT NULL,
  `Currency` varchar(10) NOT NULL,
  `PaymentMethod` varchar(3) NOT NULL,
  `BankAccount` varchar(15) DEFAULT NULL,
  `Receiver` varchar(100) NOT NULL,
  `Status` varchar(3) NOT NULL,
  `Category` varchar(3) NOT NULL,
  `Note` varchar(200) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ApprovedDate` date DEFAULT NULL,
  `BranchId` int DEFAULT NULL,
  `AccountHolder` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`PaymentNumber`),
  KEY `FK_aefwyittpw1tamm7f2dfei4l4` (`CompanyID`),
  KEY `FK_msy4oggnj6wavufgsbinksc7g` (`BankID`),
  KEY `FK_7n3d3da7a8ul0tlj3anphtsy3` (`BranchId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `partnerpayment`
--

LOCK TABLES `partnerpayment` WRITE;
/*!40000 ALTER TABLE `partnerpayment` DISABLE KEYS */;
/*!40000 ALTER TABLE `partnerpayment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `PaymentID` int NOT NULL AUTO_INCREMENT,
  `BankID` int DEFAULT NULL,
  `UserID` varchar(50) NOT NULL,
  `CardNo` varchar(16) DEFAULT NULL,
  `ExpiredYear` varchar(4) DEFAULT NULL,
  `ExpiredMonth` varchar(2) DEFAULT NULL,
  `CVV` varchar(4) DEFAULT NULL,
  `Category` varchar(4) DEFAULT NULL,
  `Type` varchar(2) DEFAULT NULL,
  `Status` varchar(2) DEFAULT NULL,
  `Issuer` varchar(4) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ResponseCode` varchar(3) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `CardHolderName` varchar(50) DEFAULT NULL,
  `BankCode` varchar(30) DEFAULT NULL,
  `CardLinkStatus` varchar(3) DEFAULT NULL,
  `Token` varchar(50) DEFAULT NULL,
  `RemoveCardCode` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`PaymentID`),
  KEY `FK_ln7merl906w1vrjke3tdmdasf` (`BankID`),
  KEY `FK_hdmgwbk48l0vwqhh1y86qlx9i` (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=2253 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persistent_logins`
--

DROP TABLE IF EXISTS `persistent_logins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persistent_logins` (
  `username` varchar(64) NOT NULL,
  `series` varchar(64) NOT NULL,
  `token` varchar(64) NOT NULL,
  `last_used` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persistent_logins`
--

LOCK TABLES `persistent_logins` WRITE;
/*!40000 ALTER TABLE `persistent_logins` DISABLE KEYS */;
/*!40000 ALTER TABLE `persistent_logins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pickupdistanceratioschema`
--

DROP TABLE IF EXISTS `pickupdistanceratioschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pickupdistanceratioschema` (
  `PickupDistanceRatioSchemaId` int NOT NULL AUTO_INCREMENT,
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `Distance` float DEFAULT '0',
  `Ratio` float DEFAULT '0',
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  PRIMARY KEY (`PickupDistanceRatioSchemaId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pickupdistanceratioschema`
--

LOCK TABLES `pickupdistanceratioschema` WRITE;
/*!40000 ALTER TABLE `pickupdistanceratioschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `pickupdistanceratioschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pointtotripschema`
--

DROP TABLE IF EXISTS `pointtotripschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pointtotripschema` (
  `PointToTripSchemaId` int NOT NULL AUTO_INCREMENT,
  `CountryCode` varchar(4) NOT NULL,
  `CityID` int DEFAULT NULL,
  `FirstPoint` int NOT NULL DEFAULT '0',
  `NoTrip1` int NOT NULL DEFAULT '0',
  `FirstReward` double NOT NULL DEFAULT '0',
  `SecondPoint` int NOT NULL DEFAULT '0',
  `NoTrip2` int NOT NULL DEFAULT '0',
  `SecondReward` double NOT NULL DEFAULT '0',
  `ThirdPoint` int NOT NULL DEFAULT '0',
  `NoTrip3` int NOT NULL DEFAULT '0',
  `ThirdReward` double NOT NULL DEFAULT '0',
  `NoTrip4` int NOT NULL DEFAULT '0',
  `FourthPoint` int NOT NULL DEFAULT '0',
  `FourthReward` double NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  PRIMARY KEY (`PointToTripSchemaId`),
  KEY `FK_trqbhpcyjqf5d04vimh5g9aig` (`CountryCode`),
  KEY `FK_s77lyu455sb1sqvlqxcv1kscr` (`CityID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pointtotripschema`
--

LOCK TABLES `pointtotripschema` WRITE;
/*!40000 ALTER TABLE `pointtotripschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `pointtotripschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pricepanel`
--

DROP TABLE IF EXISTS `pricepanel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pricepanel` (
  `PricePanelID` int NOT NULL AUTO_INCREMENT,
  `CompanyID` int DEFAULT NULL,
  `Tittle` varchar(100) DEFAULT NULL,
  `VehicleLevel` varchar(4) DEFAULT NULL,
  `CityID` int DEFAULT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `OpenKM` float NOT NULL DEFAULT '0',
  `OpenPrice` float NOT NULL DEFAULT '0',
  `FirstKM` float NOT NULL DEFAULT '0',
  `FirstKMPrice` float NOT NULL DEFAULT '0',
  `SecondKM` float NOT NULL DEFAULT '0',
  `SecondKMPrice` float NOT NULL DEFAULT '0',
  `ThirdKM` float NOT NULL DEFAULT '0',
  `ThirdKMPrice` float NOT NULL DEFAULT '0',
  `FourthKM` float NOT NULL DEFAULT '0',
  `FourthKMPrice` float NOT NULL DEFAULT '0',
  `WaitingPrice` float NOT NULL,
  `ReturnTripPrice` float NOT NULL,
  `FarePerMin` float NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Status` varchar(20) NOT NULL,
  `FareType` varchar(4) DEFAULT NULL,
  `Note` varchar(500) DEFAULT NULL,
  `MinDistance` float NOT NULL DEFAULT '0',
  `StopFee` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`PricePanelID`),
  KEY `FK_sv5wxc2bjs9lbar3nltohgvvf` (`CompanyID`),
  KEY `FK_lyud1ll0vw794qtk374gkt0rb` (`CityID`)
) ENGINE=InnoDB AUTO_INCREMENT=1930 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pricepanel`
--

LOCK TABLES `pricepanel` WRITE;
/*!40000 ALTER TABLE `pricepanel` DISABLE KEYS */;
/*!40000 ALTER TABLE `pricepanel` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `programdescription`
--

DROP TABLE IF EXISTS `programdescription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `programdescription` (
  `ProgramCode` varchar(30) NOT NULL,
  `CompanyCode` varchar(11) NOT NULL,
  `Language` varchar(4) NOT NULL,
  `Description` varchar(500) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Title` varchar(200) DEFAULT NULL,
  `DescUrl` longtext,
  `ImgUrl` longtext,
  PRIMARY KEY (`ProgramCode`,`CompanyCode`,`Language`),
  KEY `FK_Language_idx` (`Language`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `programdescription`
--

LOCK TABLES `programdescription` WRITE;
/*!40000 ALTER TABLE `programdescription` DISABLE KEYS */;
/*!40000 ALTER TABLE `programdescription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotioncode`
--

DROP TABLE IF EXISTS `promotioncode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotioncode` (
  `Code` varchar(20) NOT NULL,
  `ProgramCode` varchar(30) NOT NULL,
  `CompanyCode` varchar(11) NOT NULL,
  `Value` float NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Note` varchar(150) DEFAULT NULL,
  `WeekNumberId` bigint DEFAULT NULL,
  `Status` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`Code`,`ProgramCode`,`CompanyCode`),
  KEY `FK_ml7yahymo6o16ntrexm1ec4cc` (`ProgramCode`,`CompanyCode`),
  KEY `promotioncode_weeknumberid` (`WeekNumberId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotioncode`
--

LOCK TABLES `promotioncode` WRITE;
/*!40000 ALTER TABLE `promotioncode` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotioncode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotionmessagecity`
--

DROP TABLE IF EXISTS `promotionmessagecity`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotionmessagecity` (
  `CityID` int NOT NULL,
  `promotionMessageId` varchar(50) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`CityID`,`promotionMessageId`),
  KEY `FK_g3tklwan34r7d5lvkq8p8mlw4` (`promotionMessageId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotionmessagecity`
--

LOCK TABLES `promotionmessagecity` WRITE;
/*!40000 ALTER TABLE `promotionmessagecity` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotionmessagecity` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotionmessages`
--

DROP TABLE IF EXISTS `promotionmessages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotionmessages` (
  `PromotionMessageId` varchar(50) NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `CompanyId` int DEFAULT NULL,
  `Description` longtext NOT NULL,
  `Title` varchar(100) NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date NOT NULL,
  `Status` varchar(2) NOT NULL,
  `ContentUrl` longtext NOT NULL,
  `Type` varchar(4) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Display` tinyint NOT NULL DEFAULT '0',
  `HourOfDay` tinyint NOT NULL DEFAULT '0',
  `AutoSend` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`PromotionMessageId`),
  KEY `FK_buaya04fciwql5ojexhfpe8m0` (`CompanyId`),
  KEY `FK_69960mv3duianipar22wl3ayy` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotionmessages`
--

LOCK TABLES `promotionmessages` WRITE;
/*!40000 ALTER TABLE `promotionmessages` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotionmessages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotionmessageslanguage`
--

DROP TABLE IF EXISTS `promotionmessageslanguage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotionmessageslanguage` (
  `PromotionMessageId` varchar(50) NOT NULL,
  `Language` varchar(4) NOT NULL,
  `Title` varchar(200) DEFAULT NULL,
  `Description` varchar(500) NOT NULL,
  `ContentUrl` varchar(300) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`PromotionMessageId`,`Language`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotionmessageslanguage`
--

LOCK TABLES `promotionmessageslanguage` WRITE;
/*!40000 ALTER TABLE `promotionmessageslanguage` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotionmessageslanguage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotionprogram`
--

DROP TABLE IF EXISTS `promotionprogram`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotionprogram` (
  `ProgramCode` varchar(30) NOT NULL,
  `CompanyCode` varchar(15) NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `Title` varchar(200) DEFAULT NULL,
  `StartDate` datetime DEFAULT NULL,
  `EndDate` datetime DEFAULT NULL,
  `ActualEndDate` datetime DEFAULT NULL,
  `StartTime` tinyint DEFAULT NULL,
  `EndTime` tinyint DEFAULT NULL,
  `Type` varchar(4) DEFAULT NULL,
  `Description` varchar(1000) DEFAULT NULL,
  `Category` varchar(4) DEFAULT NULL,
  `TotalValue` double NOT NULL,
  `MinValueForTrip` float NOT NULL,
  `NumberOfInviduals` smallint NOT NULL,
  `NumberOfTrips` smallint NOT NULL,
  `ValuePerTrip` float NOT NULL,
  `MaxValuePerTrip` float NOT NULL,
  `InviterMaxValue` float NOT NULL,
  `ValueForInvitee` float NOT NULL,
  `ValueForInviter` float NOT NULL,
  `RequiredNumberTrips` smallint NOT NULL,
  `MaxInviteeTrips` smallint NOT NULL,
  `MaxInviterTrips` smallint NOT NULL,
  `MaxNumberInvitees` smallint NOT NULL,
  `Status` varchar(2) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ActualNumberOfInviduals` smallint NOT NULL,
  `ActualNumberOfTrips` smallint NOT NULL,
  `ActualValue` double NOT NULL,
  `PromotionMethod` varchar(4) DEFAULT NULL,
  `Unit` varchar(4) DEFAULT NULL,
  `BeforeDate` datetime DEFAULT NULL,
  `VehicleLevel` varchar(4) DEFAULT NULL,
  `FareType` varchar(4) DEFAULT NULL,
  `AdditionType` varchar(5) DEFAULT NULL,
  `CalculatedValue` double NOT NULL DEFAULT '0',
  `CalculatedNoInviduals` smallint NOT NULL DEFAULT '0',
  `NoExpiredDays` smallint NOT NULL DEFAULT '0',
  `MinDistance` float NOT NULL DEFAULT '0',
  `MinOnlineTime` smallint NOT NULL DEFAULT '0',
  `MinAcceptRate` float NOT NULL DEFAULT '0',
  `MinCancelRate` float NOT NULL DEFAULT '0',
  `MinRating` float NOT NULL DEFAULT '0',
  `Timeline` varchar(4) DEFAULT NULL,
  `MaxDistance` float DEFAULT '0',
  `PercentLevelBike` float DEFAULT '0',
  `MaxNumOfNRTrips` tinyint DEFAULT '0',
  `MaxValueForTrip` float NOT NULL DEFAULT '0',
  `MaxPickupDistance` float NOT NULL DEFAULT '0',
  `MaxTripReward` float NOT NULL DEFAULT '0',
  `PaymentType` varchar(4) DEFAULT NULL,
  `NoTripPerDay` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`ProgramCode`,`CompanyCode`),
  KEY `FK_a916fh0u53qvgaa2vc6vqnvt3` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotionprogram`
--

LOCK TABLES `promotionprogram` WRITE;
/*!40000 ALTER TABLE `promotionprogram` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotionprogram` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotiontrip`
--

DROP TABLE IF EXISTS `promotiontrip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotiontrip` (
  `PromotionTripID` varchar(50) NOT NULL,
  `ToCity` int NOT NULL,
  `FromCity` int NOT NULL,
  `VehicleID` int DEFAULT NULL,
  `DriverID` varchar(50) DEFAULT NULL,
  `PaymentID` int DEFAULT NULL,
  `Capacity` int DEFAULT NULL,
  `NumberCapacityRegistered` int DEFAULT NULL,
  `RequestDatetime` datetime DEFAULT NULL,
  `CountryCode` varchar(4) DEFAULT NULL,
  `FromAddress` varchar(255) DEFAULT NULL,
  `ToAddress` varchar(255) DEFAULT NULL,
  `TimeStart` datetime DEFAULT NULL,
  `TimeEnd` datetime DEFAULT NULL,
  `StartLatitude` double DEFAULT NULL,
  `StartLongitude` double DEFAULT NULL,
  `EndLongitude` double DEFAULT NULL,
  `EngLatitude` double DEFAULT NULL,
  `Fee` double DEFAULT NULL,
  `Status` varchar(4) DEFAULT NULL,
  `MaxTimeStart` datetime DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Distance` double DEFAULT '0',
  `Duration` int DEFAULT '0',
  `ProposedFare` double DEFAULT '0',
  `AcceptedFare` double DEFAULT '0',
  `EstDistance` float DEFAULT '0',
  `SellDriverId` varchar(50) DEFAULT NULL,
  `OpenBidTime` datetime DEFAULT NULL,
  `ClosedBidTime` datetime DEFAULT NULL,
  `ReturnTrip` bit(1) NOT NULL DEFAULT b'0',
  `RiderBooked` bit(1) NOT NULL DEFAULT b'0',
  `RiderRate` tinyint NOT NULL DEFAULT '0',
  `BidTime` tinyint NOT NULL DEFAULT '0',
  `Note` longtext,
  `ReasonCode` varchar(4) DEFAULT NULL,
  `EstFare` float NOT NULL DEFAULT '0',
  `FarePerRider` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`PromotionTripID`),
  KEY `FK_bdhxsxcxxsbrqnmctjsgeqdk` (`ToCity`),
  KEY `FK_k09drg4xhrrqf1jjtoas9c0pw` (`FromCity`),
  KEY `FK_33g95mctibpplh72eyu79nley` (`VehicleID`),
  KEY `FK_ihy12l69b3cwb8d6wcjp6vyqq` (`DriverID`),
  KEY `FK_cgr4lt2akgw43g4gmrks0kfry` (`PaymentID`),
  KEY `FK_sell_driverId_driver_idx` (`SellDriverId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotiontrip`
--

LOCK TABLES `promotiontrip` WRITE;
/*!40000 ALTER TABLE `promotiontrip` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotiontrip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotiontripdetail`
--

DROP TABLE IF EXISTS `promotiontripdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotiontripdetail` (
  `PromotionTripDetailID` varchar(50) NOT NULL,
  `PromotionTripID` varchar(50) NOT NULL,
  `OrdinalNumber` int DEFAULT NULL,
  `Latitude` double DEFAULT NULL,
  `Longitude` double DEFAULT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `MaxTimeArrived` datetime NOT NULL,
  `MinTimeArrived` datetime NOT NULL,
  `StopPoint` bit(1) DEFAULT NULL,
  `Address` longtext,
  PRIMARY KEY (`PromotionTripDetailID`),
  KEY `FK_s61hiqv0ppn3stkwmqwhjn17c` (`PromotionTripID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotiontripdetail`
--

LOCK TABLES `promotiontripdetail` WRITE;
/*!40000 ALTER TABLE `promotiontripdetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotiontripdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `promotiontripriders`
--

DROP TABLE IF EXISTS `promotiontripriders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `promotiontripriders` (
  `PromotionTripRiderID` varchar(50) NOT NULL,
  `ToCity` int DEFAULT NULL,
  `FromCity` int DEFAULT NULL,
  `RiderID` varchar(50) DEFAULT NULL,
  `PromotionTripID` varchar(50) NOT NULL,
  `Status` varchar(2) DEFAULT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `StartAddress` varchar(255) DEFAULT NULL,
  `EndAddress` varchar(255) DEFAULT NULL,
  `NumberOfSeats` int DEFAULT NULL,
  `TimeStart` datetime DEFAULT NULL,
  `TimeGap` int DEFAULT NULL,
  `StartLatitude` double DEFAULT NULL,
  `StartLongtitude` double DEFAULT NULL,
  `EndLatitude` double DEFAULT NULL,
  `EndLongtitude` double DEFAULT NULL,
  `Action` tinyint NOT NULL DEFAULT '0',
  `Note` varchar(500) DEFAULT NULL,
  `DriverNote` longtext,
  `DriverAction` tinyint NOT NULL DEFAULT '0',
  `FirstName` varchar(30) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `MobileNo` varchar(12) DEFAULT NULL,
  `Fare` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`PromotionTripRiderID`),
  KEY `FK_mu8u0kdx7y11tg99fe2ieg61v` (`ToCity`),
  KEY `FK_70bij5nl5rka1r3w20degysn0` (`FromCity`),
  KEY `FK_c35iqccfhr0xyxfou12jrgqu4` (`RiderID`),
  KEY `FK_djmlxl7wjib6gg63uadvxpviw` (`PromotionTripID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `promotiontripriders`
--

LOCK TABLES `promotiontripriders` WRITE;
/*!40000 ALTER TABLE `promotiontripriders` DISABLE KEYS */;
/*!40000 ALTER TABLE `promotiontripriders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proposedfarehourrateschema`
--

DROP TABLE IF EXISTS `proposedfarehourrateschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proposedfarehourrateschema` (
  `ProposedFareHourRateSchemaId` int NOT NULL,
  `BeforeToHour` smallint NOT NULL,
  `BeforeFromHour` smallint NOT NULL,
  `Rate` float NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Status` varchar(5) NOT NULL,
  PRIMARY KEY (`ProposedFareHourRateSchemaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proposedfarehourrateschema`
--

LOCK TABLES `proposedfarehourrateschema` WRITE;
/*!40000 ALTER TABLE `proposedfarehourrateschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `proposedfarehourrateschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proposedfaresateschema`
--

DROP TABLE IF EXISTS `proposedfaresateschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proposedfaresateschema` (
  `ProposedFareRateSchemaId` int NOT NULL,
  `FareTo` double NOT NULL,
  `FareFrom` double NOT NULL,
  `Rate` float NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Status` varchar(5) NOT NULL,
  PRIMARY KEY (`ProposedFareRateSchemaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proposedfaresateschema`
--

LOCK TABLES `proposedfaresateschema` WRITE;
/*!40000 ALTER TABLE `proposedfaresateschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `proposedfaresateschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proposedtripfarehistory`
--

DROP TABLE IF EXISTS `proposedtripfarehistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proposedtripfarehistory` (
  `ProposedTripFareHistoryID` int NOT NULL,
  `PromotionTripID` varchar(50) NOT NULL,
  `ProposedFare` float NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ProposedTripFareHistoryID`),
  KEY `FK4vb2itta2abgpwwjsqp3vgw7i` (`PromotionTripID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proposedtripfarehistory`
--

LOCK TABLES `proposedtripfarehistory` WRITE;
/*!40000 ALTER TABLE `proposedtripfarehistory` DISABLE KEYS */;
/*!40000 ALTER TABLE `proposedtripfarehistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `referencedata`
--

DROP TABLE IF EXISTS `referencedata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `referencedata` (
  `GroupCode` varchar(20) NOT NULL,
  `Code` varchar(8) NOT NULL,
  `LanguageCode` varchar(4) NOT NULL,
  `Description` varchar(50) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`GroupCode`,`Code`,`LanguageCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `referencedata`
--

LOCK TABLES `referencedata` WRITE;
/*!40000 ALTER TABLE `referencedata` DISABLE KEYS */;
/*!40000 ALTER TABLE `referencedata` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `relative`
--

DROP TABLE IF EXISTS `relative`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `relative` (
  `Avatar` varchar(300) NOT NULL,
  `RiderID` varchar(50) NOT NULL,
  `FNameRelative` varchar(50) DEFAULT NULL,
  `LNameRelative` varchar(50) DEFAULT NULL,
  `MobileRelative` varchar(20) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CountryCode` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`Avatar`),
  KEY `relative_rider foreignkey_idx` (`RiderID`),
  KEY `FK_naqnpw6vbhr1gtce2dc0erxwm` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `relative`
--

LOCK TABLES `relative` WRITE;
/*!40000 ALTER TABLE `relative` DISABLE KEYS */;
/*!40000 ALTER TABLE `relative` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rentvehiclefaretables`
--

DROP TABLE IF EXISTS `rentvehiclefaretables`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rentvehiclefaretables` (
  `FareRentID` varchar(50) NOT NULL,
  `CityID` int NOT NULL,
  `CarTypeID` int NOT NULL,
  `CarMakerID` int NOT NULL,
  `CarLevel` varchar(255) NOT NULL,
  `Status` varchar(4) NOT NULL,
  `WorkingDayFeeAutoGear` float NOT NULL DEFAULT '0',
  `WorkingDayFeeManualGear` float NOT NULL DEFAULT '0',
  `WeekendDayFeeManualGear` float NOT NULL DEFAULT '0',
  `WeekendDayFeeAutoGear` float NOT NULL DEFAULT '0',
  `OverKMFee` float NOT NULL,
  `OverTimeFee` float NOT NULL,
  `StartDate` datetime NOT NULL,
  `LimitedTimeFrom` tinyint NOT NULL,
  `LimitedTimeTo` tinyint NOT NULL,
  `LimitedKM` float NOT NULL,
  `RateOfCost` float NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` datetime NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  PRIMARY KEY (`FareRentID`),
  KEY `FK_bbs7rt2pe2sk2xnsprekniyug` (`CityID`),
  KEY `FK_f1i79jdb2lybbywo689w6ivqv` (`CarTypeID`),
  KEY `FK_scxoicfbt1ap9cla211wgvx1q` (`CarMakerID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rentvehiclefaretables`
--

LOCK TABLES `rentvehiclefaretables` WRITE;
/*!40000 ALTER TABLE `rentvehiclefaretables` DISABLE KEYS */;
/*!40000 ALTER TABLE `rentvehiclefaretables` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `resetpassword`
--

DROP TABLE IF EXISTS `resetpassword`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `resetpassword` (
  `ActiveToken` varchar(200) NOT NULL,
  `UserID` varchar(50) NOT NULL,
  `ExpiredDate` date NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastMofifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ActiveToken`),
  KEY `FK_ktdofuqn4sw4vubtpfs2xxcfh` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `resetpassword`
--

LOCK TABLES `resetpassword` WRITE;
/*!40000 ALTER TABLE `resetpassword` DISABLE KEYS */;
/*!40000 ALTER TABLE `resetpassword` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rider`
--

DROP TABLE IF EXISTS `rider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rider` (
  `RiderID` varchar(50) NOT NULL,
  `HomeAddressID` varchar(50) DEFAULT NULL,
  `OfficeAddressID` varchar(50) DEFAULT NULL,
  `InternationalCode` varchar(4) DEFAULT NULL,
  `LanguageCode` varchar(4) NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `CityID` int DEFAULT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `FullName` varchar(81) NOT NULL,
  `PromotionBalance` float NOT NULL DEFAULT '0',
  `CancelRate` float NOT NULL DEFAULT '0',
  `AccumulatedPoints` int NOT NULL DEFAULT '0',
  `TotalCanelledTrips` smallint NOT NULL DEFAULT '0',
  `TotalTrips` smallint NOT NULL DEFAULT '0',
  `TotalRequests` smallint NOT NULL DEFAULT '0',
  `Image` varchar(100) DEFAULT NULL,
  `MobileNo` varchar(12) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `MobileDeviceID` longtext,
  `DeviceType` varchar(30) DEFAULT NULL,
  `PromotionCode` varchar(40) DEFAULT NULL,
  `ActiveCode` varchar(40) DEFAULT NULL,
  `Status` varchar(4) NOT NULL,
  `CurrentTripId` varchar(50) DEFAULT NULL,
  `Balance` float NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Rate` float NOT NULL DEFAULT '5',
  `FBAccount` bit(1) DEFAULT NULL,
  `PostalCode` varchar(6) DEFAULT NULL,
  `FacebookID` varchar(50) DEFAULT NULL,
  `InvitationCode` varchar(20) DEFAULT NULL,
  `ActiveDate` datetime DEFAULT NULL,
  `DeactiveDate` datetime DEFAULT NULL,
  `LastResentCode` datetime DEFAULT NULL,
  `ResentCount` tinyint NOT NULL,
  `totalTripAdjustment` double NOT NULL DEFAULT '0',
  `Version` varchar(10) DEFAULT NULL,
  `MobileDeviceID2` varchar(200) DEFAULT NULL,
  `PromoStatus` tinyint NOT NULL DEFAULT '0',
  `RewardedTrips` smallint NOT NULL DEFAULT '0',
  `NationalIdentifier` varchar(15) DEFAULT NULL,
  `BankID` int DEFAULT NULL,
  `BankAccount` varchar(15) DEFAULT NULL,
  `totalPoint` int NOT NULL DEFAULT '0',
  `VoIPToken` longtext,
  `KeyValue` varchar(100) DEFAULT NULL,
  `AccountHolder` varchar(100) DEFAULT NULL,
  `BranchId` int DEFAULT NULL,
  PRIMARY KEY (`RiderID`),
  KEY `FK_iwu2ca7iuoud1oy4kaoki9f9f` (`HomeAddressID`),
  KEY `FK_nvubskrrs08drxhb1djt0v3en` (`OfficeAddressID`),
  KEY `FK_h78bd5houdjo4vekudopc4b8f` (`LanguageCode`),
  KEY `FK_2y7wkhb4ewgpggxobmqpjucwc` (`InternationalCode`),
  KEY `FK_iniae2q5rg6q98fdcob58x95` (`CountryCode`),
  KEY `Idex_mobileno` (`MobileNo`),
  KEY `Index_email` (`Email`),
  KEY `Index_facebookid` (`FacebookID`),
  KEY `FK_dx08mh4k5153y0s01a1tos103` (`BankID`),
  KEY `FR_bank_branch_id_idx` (`BranchId`),
  KEY `INDEX_mobile_no` (`MobileNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rider`
--

LOCK TABLES `rider` WRITE;
/*!40000 ALTER TABLE `rider` DISABLE KEYS */;
/*!40000 ALTER TABLE `rider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ridercities`
--

DROP TABLE IF EXISTS `ridercities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ridercities` (
  `CityID` int NOT NULL,
  `RiderID` varchar(50) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`CityID`,`RiderID`),
  KEY `FK_a4h9dgbu1u9apwfw19eomv0aa` (`RiderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ridercities`
--

LOCK TABLES `ridercities` WRITE;
/*!40000 ALTER TABLE `ridercities` DISABLE KEYS */;
/*!40000 ALTER TABLE `ridercities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ridergiftcode`
--

DROP TABLE IF EXISTS `ridergiftcode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ridergiftcode` (
  `RiderID` varchar(50) NOT NULL,
  `GiftCode` varchar(20) NOT NULL,
  `ProgramCode` varchar(30) NOT NULL,
  `CompanyCode` varchar(11) NOT NULL,
  `Status` varchar(2) DEFAULT NULL,
  `AppliedDate` date DEFAULT NULL,
  `ExpireDate` date DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`RiderID`,`GiftCode`,`ProgramCode`,`CompanyCode`),
  KEY `FK_ta172lb1ces2qqraquyjn0u5w` (`GiftCode`,`ProgramCode`,`CompanyCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ridergiftcode`
--

LOCK TABLES `ridergiftcode` WRITE;
/*!40000 ALTER TABLE `ridergiftcode` DISABLE KEYS */;
/*!40000 ALTER TABLE `ridergiftcode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderlogintime`
--

DROP TABLE IF EXISTS `riderlogintime`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riderlogintime` (
  `RiderLoginTimeID` varchar(50) NOT NULL,
  `RiderID` varchar(50) NOT NULL,
  `LoginTime` timestamp NULL DEFAULT NULL,
  `Lat` double NOT NULL,
  `Lng` double NOT NULL,
  `IsFirstCreated` bit(1) DEFAULT b'0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `lastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`RiderLoginTimeID`),
  KEY `FK_Rider_idx` (`RiderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderlogintime`
--

LOCK TABLES `riderlogintime` WRITE;
/*!40000 ALTER TABLE `riderlogintime` DISABLE KEYS */;
/*!40000 ALTER TABLE `riderlogintime` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderlogintimedetail`
--

DROP TABLE IF EXISTS `riderlogintimedetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riderlogintimedetail` (
  `RiderLoginTimeDetailID` varchar(50) NOT NULL,
  `RiderLoginTimeID` varchar(50) NOT NULL,
  `CompanyID` int DEFAULT NULL,
  `CompanyGroupID` int DEFAULT NULL,
  `CompanyGroupName` varchar(50) NOT NULL,
  `Level` varchar(6) NOT NULL,
  `NumberOfCars` int NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`RiderLoginTimeDetailID`),
  KEY `FK_Company_idx` (`CompanyID`),
  KEY `FK_CompanyGroup_idx` (`CompanyGroupID`),
  KEY `FK_ouv2nqphiwqwqys7uytdinuij` (`RiderLoginTimeID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderlogintimedetail`
--

LOCK TABLES `riderlogintimedetail` WRITE;
/*!40000 ALTER TABLE `riderlogintimedetail` DISABLE KEYS */;
/*!40000 ALTER TABLE `riderlogintimedetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderlogintimetracking`
--

DROP TABLE IF EXISTS `riderlogintimetracking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riderlogintimetracking` (
  `RiderLoginTimeTrackingID` varchar(50) NOT NULL,
  `RiderID` varchar(50) NOT NULL,
  `LoginTime` timestamp NULL DEFAULT NULL,
  `Lat` double NOT NULL,
  `Lng` double NOT NULL,
  PRIMARY KEY (`RiderLoginTimeTrackingID`),
  KEY `FK_Rider_idx` (`RiderID`),
  KEY `Index_LoginTime` (`LoginTime`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderlogintimetracking`
--

LOCK TABLES `riderlogintimetracking` WRITE;
/*!40000 ALTER TABLE `riderlogintimetracking` DISABLE KEYS */;
/*!40000 ALTER TABLE `riderlogintimetracking` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderorder`
--

DROP TABLE IF EXISTS `riderorder`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riderorder` (
  `OrderNumber` varchar(50) NOT NULL,
  `RiderID` varchar(50) NOT NULL,
  `Point` int NOT NULL DEFAULT '0',
  `OrganizationPromotionNo` varchar(50) DEFAULT NULL,
  `Status` varchar(4) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` datetime NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  `PaymentNumber` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`OrderNumber`),
  KEY `FK_swlj6bffd2ltr5kx27560ddrw` (`RiderID`),
  KEY `FK_cc1686p7u6uus0bwbgnsprfoa` (`OrganizationPromotionNo`),
  KEY `FK_rwd3s17ywgugk2f6an3iru3v2` (`PaymentNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderorder`
--

LOCK TABLES `riderorder` WRITE;
/*!40000 ALTER TABLE `riderorder` DISABLE KEYS */;
/*!40000 ALTER TABLE `riderorder` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderorganization`
--

DROP TABLE IF EXISTS `riderorganization`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riderorganization` (
  `riderOrganizationId` varchar(50) NOT NULL,
  `OrganizationID` varchar(50) NOT NULL,
  `RiderID` varchar(50) NOT NULL,
  `StartDate` datetime DEFAULT NULL,
  `EndDate` datetime DEFAULT NULL,
  `Position` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`riderOrganizationId`),
  KEY `FK_m3qqv4uhas3wamts1wwi7npq8` (`OrganizationID`),
  KEY `FK_19iru4xkex1ect7d8irwx8edr` (`RiderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderorganization`
--

LOCK TABLES `riderorganization` WRITE;
/*!40000 ALTER TABLE `riderorganization` DISABLE KEYS */;
/*!40000 ALTER TABLE `riderorganization` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderpointhistory`
--

DROP TABLE IF EXISTS `riderpointhistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riderpointhistory` (
  `RiderPointHistoryId` varchar(50) NOT NULL,
  `RiderID` varchar(50) NOT NULL,
  `Point` int NOT NULL DEFAULT '0',
  `CurrentPoint` int NOT NULL DEFAULT '0',
  `Type` varchar(4) NOT NULL,
  `OrderNumber` varchar(50) DEFAULT NULL,
  `TripID` varchar(50) DEFAULT NULL,
  `Note` varchar(150) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` datetime NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  `VehicleLevel` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`RiderPointHistoryId`),
  KEY `FK_r2tvibdkckgmydbbsklaj7juy` (`RiderID`),
  KEY `FK_qit3wiq6bt4xig55m6i4uu7gf` (`TripID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderpointhistory`
--

LOCK TABLES `riderpointhistory` WRITE;
/*!40000 ALTER TABLE `riderpointhistory` DISABLE KEYS */;
/*!40000 ALTER TABLE `riderpointhistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderpointschema`
--

DROP TABLE IF EXISTS `riderpointschema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riderpointschema` (
  `RiderPointSchemaID` int NOT NULL AUTO_INCREMENT,
  `Title` varchar(100) DEFAULT NULL,
  `StartDate` date NOT NULL,
  `EndDate` timestamp NULL DEFAULT NULL,
  `FirstFare` float DEFAULT NULL,
  `FirstPoint` float DEFAULT NULL,
  `SecondFare` float DEFAULT '0',
  `SecondPoint` float DEFAULT '0',
  `ThirdFare` float DEFAULT '0',
  `ThirdPoint` float DEFAULT '0',
  `FourthFare` float DEFAULT '0',
  `FourthPoint` float DEFAULT '0',
  `CancelledPoint` float DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CountryCode` varchar(4) NOT NULL,
  `Status` varchar(4) DEFAULT NULL,
  `CancelFee` float NOT NULL DEFAULT '0',
  `FifthPoint` float NOT NULL DEFAULT '0',
  `Level` varchar(4) DEFAULT NULL,
  `RatioPointTnet` float DEFAULT '0',
  `RatioPointCar` float DEFAULT '0',
  `RatioPointBike` float DEFAULT '0',
  PRIMARY KEY (`RiderPointSchemaID`),
  KEY `FK_os8f8j06knc2yx2iqqxkjybem` (`CountryCode`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderpointschema`
--

LOCK TABLES `riderpointschema` WRITE;
/*!40000 ALTER TABLE `riderpointschema` DISABLE KEYS */;
/*!40000 ALTER TABLE `riderpointschema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderpromotioncode`
--

DROP TABLE IF EXISTS `riderpromotioncode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riderpromotioncode` (
  `RiderID` varchar(50) NOT NULL,
  `ProgramCode` varchar(30) NOT NULL,
  `Code` varchar(20) NOT NULL,
  `CompanyCode` varchar(11) NOT NULL,
  `ObjectType` varchar(2) DEFAULT NULL,
  `Status` varchar(2) DEFAULT NULL,
  `AppliedDate` date DEFAULT NULL,
  `ExpireDate` date DEFAULT NULL,
  `NumberOfTrip` smallint NOT NULL,
  `AcualNumberOfTrip` smallint NOT NULL,
  `ActualNumberInvitee` smallint NOT NULL,
  `InviterID` varchar(50) DEFAULT NULL,
  `PromoCount` smallint NOT NULL,
  `InviterCalculated` bit(1) DEFAULT NULL,
  `InviteeCalculated` bit(1) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `noInvitee` smallint NOT NULL DEFAULT '0',
  `ActualValue` float NOT NULL DEFAULT '0',
  `CalculatedValue` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`RiderID`,`ProgramCode`,`Code`,`CompanyCode`),
  KEY `FK_l4e0bnktw3usfn248p6n8uioi` (`Code`,`ProgramCode`,`CompanyCode`),
  KEY `FK_rs2ntm5nug58p9ofis6qch2iu` (`InviterID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderpromotioncode`
--

LOCK TABLES `riderpromotioncode` WRITE;
/*!40000 ALTER TABLE `riderpromotioncode` DISABLE KEYS */;
/*!40000 ALTER TABLE `riderpromotioncode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `riderstatussummary`
--

DROP TABLE IF EXISTS `riderstatussummary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riderstatussummary` (
  `FinancialYear` int NOT NULL,
  `Month` int NOT NULL,
  `CityID` int NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `NumberNewRiders` int NOT NULL,
  `NumberActiveRiders` int NOT NULL,
  `NumbernonCallRiders` int NOT NULL,
  `NumberDeactiveRiders` int NOT NULL,
  `NumberRequests` int NOT NULL,
  `NumberTrips` int NOT NULL,
  `numberCancelledRequest` int NOT NULL,
  `AverNoTripPerRider` double NOT NULL,
  `AverageFarePerTrip` double NOT NULL,
  `AverageFarePerRider` double NOT NULL,
  `AverageDistancePerTrip` double NOT NULL,
  `UnverifiedRiderNumber` int DEFAULT '0',
  `FailedVerificationNumber` int DEFAULT '0',
  `RiderWithoutPhoneNumber` int DEFAULT '0',
  `AverageTripByCancelledRider` double NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`FinancialYear`,`Month`,`CityID`,`CountryCode`),
  KEY `FK_8h9gox5wdwlotyt2ey8tsjpf0` (`CityID`),
  KEY `FK_n8tdrsk86t3q25gl2blfbanab` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riderstatussummary`
--

LOCK TABLES `riderstatussummary` WRITE;
/*!40000 ALTER TABLE `riderstatussummary` DISABLE KEYS */;
/*!40000 ALTER TABLE `riderstatussummary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ridertransaction`
--

DROP TABLE IF EXISTS `ridertransaction`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ridertransaction` (
  `RiderTransactionID` varchar(50) NOT NULL,
  `UserID` varchar(50) NOT NULL,
  `AgentID` int DEFAULT NULL,
  `TransactionDate` date NOT NULL,
  `TransferDate` date DEFAULT NULL,
  `Amount` double NOT NULL DEFAULT '0',
  `Discount` double NOT NULL DEFAULT '0',
  `balance` double NOT NULL DEFAULT '0',
  `Reason` varchar(255) DEFAULT NULL,
  `Payer` varchar(100) DEFAULT NULL,
  `Type` varchar(4) NOT NULL,
  `PaymentType` varchar(4) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `TripID` varchar(50) DEFAULT NULL,
  `AccountTransactionID` varchar(50) DEFAULT NULL,
  `RiderID` varchar(50) NOT NULL,
  `ReasonCode` varchar(35) DEFAULT NULL,
  `promoBalance` double NOT NULL DEFAULT '0',
  `Status` varchar(4) DEFAULT NULL,
  `Currency` varchar(12) DEFAULT NULL,
  `ConnectTransaction` varchar(50) DEFAULT NULL,
  `BankAccountId` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`RiderTransactionID`),
  KEY `FK_3chnhc4ckv61whfsls6chcwmn` (`UserID`),
  KEY `FK_s2cryp9blt990c87o0djehucc` (`AgentID`),
  KEY `FK_cxa54vb18egpwpqjbc4shcqqg` (`TripID`),
  KEY `FK_6ryqibeys82kktkke1l03gtrm` (`AccountTransactionID`),
  KEY `FK_br774ls2iolac4t3mnf6qhksg` (`RiderID`),
  KEY `FK_ridertransaction_bank_AccountId` (`BankAccountId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ridertransaction`
--

LOCK TABLES `ridertransaction` WRITE;
/*!40000 ALTER TABLE `ridertransaction` DISABLE KEYS */;
/*!40000 ALTER TABLE `ridertransaction` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ROLE_DRIVER'),(2,'ROLE_PASSENGER'),(3,'ROLE_COMPANY'),(4,'ROLE_ADMIN');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `screen`
--

DROP TABLE IF EXISTS `screen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `screen` (
  `ScreenID` int NOT NULL,
  `ScreenName` varchar(50) NOT NULL,
  `ActionPath` varchar(100) NOT NULL,
  `IsMenuItem` int NOT NULL,
  `GroupId` int NOT NULL,
  `ParentId` int DEFAULT NULL,
  `Module` varchar(10) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ScreenID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `screen`
--

LOCK TABLES `screen` WRITE;
/*!40000 ALTER TABLE `screen` DISABLE KEYS */;
/*!40000 ALTER TABLE `screen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `screengroup`
--

DROP TABLE IF EXISTS `screengroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `screengroup` (
  `GroupID` int NOT NULL,
  `GroupName` varchar(50) NOT NULL,
  PRIMARY KEY (`GroupID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `screengroup`
--

LOCK TABLES `screengroup` WRITE;
/*!40000 ALTER TABLE `screengroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `screengroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `screenpermission`
--

DROP TABLE IF EXISTS `screenpermission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `screenpermission` (
  `ScreenPermissionId` int NOT NULL AUTO_INCREMENT,
  `ScreenID` int NOT NULL,
  `BuLevel` int NOT NULL,
  `UserGroup` varchar(10) NOT NULL,
  `BUType` varchar(10) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ScreenPermissionId`),
  KEY `FK_cwg165rflts6cuum6q1smui1j` (`ScreenID`)
) ENGINE=InnoDB AUTO_INCREMENT=116216 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `screenpermission`
--

LOCK TABLES `screenpermission` WRITE;
/*!40000 ALTER TABLE `screenpermission` DISABLE KEYS */;
/*!40000 ALTER TABLE `screenpermission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servicerating`
--

DROP TABLE IF EXISTS `servicerating`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicerating` (
  `DerviceRatingID` varchar(50) NOT NULL,
  `UserID` varchar(50) NOT NULL,
  `AppRating` int DEFAULT NULL,
  `ServiceRating` int DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`DerviceRatingID`),
  KEY `FK_rbglkmcrhrds33kav275g703t` (`UserID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicerating`
--

LOCK TABLES `servicerating` WRITE;
/*!40000 ALTER TABLE `servicerating` DISABLE KEYS */;
/*!40000 ALTER TABLE `servicerating` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `smshistory`
--

DROP TABLE IF EXISTS `smshistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `smshistory` (
  `SMSHistoryID` int NOT NULL AUTO_INCREMENT,
  `CountryCode` varchar(4) DEFAULT NULL,
  `RiderID` varchar(50) DEFAULT NULL,
  `MobileNo` varchar(20) NOT NULL,
  `Operator` varchar(30) NOT NULL,
  `Time` datetime NOT NULL,
  `Status` varchar(2) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `Internal` bit(1) DEFAULT NULL,
  `errorCode` int DEFAULT NULL,
  `errorDetail` varchar(500) DEFAULT NULL,
  `App` varchar(20) DEFAULT NULL,
  `SentCode` varchar(10) DEFAULT NULL,
  `InputCode` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`SMSHistoryID`),
  KEY `FK_o4odiativyiugmr1j4g4ot2w7` (`RiderID`),
  KEY `FK_p51c16nb6r7b6sebhptcwsday` (`CountryCode`)
) ENGINE=InnoDB AUTO_INCREMENT=703622 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `smshistory`
--

LOCK TABLES `smshistory` WRITE;
/*!40000 ALTER TABLE `smshistory` DISABLE KEYS */;
/*!40000 ALTER TABLE `smshistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `StaffID` varchar(50) NOT NULL,
  `AddressID` varchar(50) DEFAULT NULL,
  `Code` varchar(10) DEFAULT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `ImagePath` varchar(100) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `NationalIdentification` varchar(30) DEFAULT NULL,
  `MobileNo` varchar(12) DEFAULT NULL,
  `StaffType` varchar(2) NOT NULL,
  `Status` varchar(4) NOT NULL,
  `Position` varchar(3) NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LanguageCode` varchar(4) NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `CityID` int DEFAULT NULL,
  PRIMARY KEY (`StaffID`),
  KEY `FK_72kntwd11wm2uwn26lho5gamt` (`AddressID`),
  KEY `FK_7fnnn584qs8a53rbnhtrlvkxm` (`LanguageCode`),
  KEY `FK_1vuix50bnnvknw867uufks8w2` (`CountryCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staffbusinessunit`
--

DROP TABLE IF EXISTS `staffbusinessunit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staffbusinessunit` (
  `StaffBusinessUnitID` varchar(50) NOT NULL,
  `StaffID` varchar(50) NOT NULL,
  `BusinessUnitID` int NOT NULL,
  `StartDate` date NOT NULL,
  `EndDate` date DEFAULT NULL,
  `Position` varchar(5) DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`StaffBusinessUnitID`),
  KEY `FK_t9woqrgy5tu0mep9ockeooijo` (`StaffID`),
  KEY `FK_83b78i948bc1apr5cn5qgiwvg` (`BusinessUnitID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staffbusinessunit`
--

LOCK TABLES `staffbusinessunit` WRITE;
/*!40000 ALTER TABLE `staffbusinessunit` DISABLE KEYS */;
/*!40000 ALTER TABLE `staffbusinessunit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stoppoints`
--

DROP TABLE IF EXISTS `stoppoints`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stoppoints` (
  `StopPointId` varchar(50) NOT NULL,
  `TripId` varchar(50) NOT NULL,
  `Address` varchar(500) DEFAULT NULL,
  `Distance` float NOT NULL DEFAULT '0',
  `Time` smallint NOT NULL DEFAULT '0',
  `Lat` double NOT NULL DEFAULT '0',
  `Lng` double NOT NULL DEFAULT '0',
  `StopDuration` smallint NOT NULL DEFAULT '0',
  `ActualStopLng` double NOT NULL DEFAULT '0',
  `ActualStopLat` double NOT NULL DEFAULT '0',
  `OrderNo` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`StopPointId`),
  KEY `stoppoints_foreignkey_trip_idx` (`TripId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stoppoints`
--

LOCK TABLES `stoppoints` WRITE;
/*!40000 ALTER TABLE `stoppoints` DISABLE KEYS */;
/*!40000 ALTER TABLE `stoppoints` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppostnote`
--

DROP TABLE IF EXISTS `suppostnote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suppostnote` (
  `NoteId` int NOT NULL AUTO_INCREMENT,
  `MobileNo` varchar(12) NOT NULL,
  `CountryCode` varchar(4) NOT NULL,
  `UserId` varchar(50) NOT NULL,
  `Note` varchar(300) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`NoteId`)
) ENGINE=InnoDB AUTO_INCREMENT=7037 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppostnote`
--

LOCK TABLES `suppostnote` WRITE;
/*!40000 ALTER TABLE `suppostnote` DISABLE KEYS */;
/*!40000 ALTER TABLE `suppostnote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taxinetusers`
--

DROP TABLE IF EXISTS `taxinetusers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taxinetusers` (
  `UserID` varchar(50) NOT NULL,
  `GroupCode` varchar(3) NOT NULL,
  `KnownSource` varchar(3) DEFAULT NULL,
  `CompanyID` int DEFAULT NULL,
  `AgentID` int DEFAULT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `DeactivatedDate` date DEFAULT NULL,
  `ChangePasswordTime` datetime DEFAULT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`UserID`),
  UNIQUE KEY `UK_9hxp7mnbvs4g6c515m9nnru3r` (`Username`),
  KEY `FK_9yv40rapl5usdbn137xq132u1` (`GroupCode`),
  KEY `FK_8fy8oehlorh1vxu7p9565r4t1` (`CompanyID`),
  KEY `FK_f1crbthg1s7es70t6xfah62cy` (`AgentID`),
  KEY `INDEX_user_name` (`Username`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taxinetusers`
--

LOCK TABLES `taxinetusers` WRITE;
/*!40000 ALTER TABLE `taxinetusers` DISABLE KEYS */;
/*!40000 ALTER TABLE `taxinetusers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_blob_triggers`
--

DROP TABLE IF EXISTS `tn_blob_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_blob_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `BLOB_DATA` blob,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_blob_triggers`
--

LOCK TABLES `tn_blob_triggers` WRITE;
/*!40000 ALTER TABLE `tn_blob_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_blob_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_calendars`
--

DROP TABLE IF EXISTS `tn_calendars`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_calendars` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `CALENDAR_NAME` varchar(200) NOT NULL,
  `CALENDAR` blob NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`CALENDAR_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_calendars`
--

LOCK TABLES `tn_calendars` WRITE;
/*!40000 ALTER TABLE `tn_calendars` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_calendars` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_cron_triggers`
--

DROP TABLE IF EXISTS `tn_cron_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_cron_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `CRON_EXPRESSION` varchar(200) NOT NULL,
  `TIME_ZONE_ID` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_cron_triggers`
--

LOCK TABLES `tn_cron_triggers` WRITE;
/*!40000 ALTER TABLE `tn_cron_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_cron_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_fired_triggers`
--

DROP TABLE IF EXISTS `tn_fired_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_fired_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `ENTRY_ID` varchar(95) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `INSTANCE_NAME` varchar(200) NOT NULL,
  `FIRED_TIME` bigint NOT NULL,
  `SCHED_TIME` bigint NOT NULL,
  `PRIORITY` int NOT NULL,
  `STATE` varchar(16) NOT NULL,
  `JOB_NAME` varchar(200) DEFAULT NULL,
  `JOB_GROUP` varchar(200) DEFAULT NULL,
  `IS_NONCONCURRENT` varchar(1) DEFAULT NULL,
  `REQUESTS_RECOVERY` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`,`ENTRY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_fired_triggers`
--

LOCK TABLES `tn_fired_triggers` WRITE;
/*!40000 ALTER TABLE `tn_fired_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_fired_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_job_details`
--

DROP TABLE IF EXISTS `tn_job_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_job_details` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `JOB_NAME` varchar(200) NOT NULL,
  `JOB_GROUP` varchar(200) NOT NULL,
  `DESCRIPTION` varchar(250) DEFAULT NULL,
  `JOB_CLASS_NAME` varchar(250) NOT NULL,
  `IS_DURABLE` varchar(1) NOT NULL,
  `IS_NONCONCURRENT` varchar(1) NOT NULL,
  `IS_UPDATE_DATA` varchar(1) NOT NULL,
  `REQUESTS_RECOVERY` varchar(1) NOT NULL,
  `JOB_DATA` blob,
  PRIMARY KEY (`SCHED_NAME`,`JOB_NAME`,`JOB_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_job_details`
--

LOCK TABLES `tn_job_details` WRITE;
/*!40000 ALTER TABLE `tn_job_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_job_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_locks`
--

DROP TABLE IF EXISTS `tn_locks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_locks` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `LOCK_NAME` varchar(40) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`LOCK_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_locks`
--

LOCK TABLES `tn_locks` WRITE;
/*!40000 ALTER TABLE `tn_locks` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_locks` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_paused_trigger_grps`
--

DROP TABLE IF EXISTS `tn_paused_trigger_grps`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_paused_trigger_grps` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_paused_trigger_grps`
--

LOCK TABLES `tn_paused_trigger_grps` WRITE;
/*!40000 ALTER TABLE `tn_paused_trigger_grps` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_paused_trigger_grps` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_scheduler_state`
--

DROP TABLE IF EXISTS `tn_scheduler_state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_scheduler_state` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `INSTANCE_NAME` varchar(200) NOT NULL,
  `LAST_CHECKIN_TIME` bigint NOT NULL,
  `CHECKIN_INTERVAL` bigint NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`INSTANCE_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_scheduler_state`
--

LOCK TABLES `tn_scheduler_state` WRITE;
/*!40000 ALTER TABLE `tn_scheduler_state` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_scheduler_state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_simple_triggers`
--

DROP TABLE IF EXISTS `tn_simple_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_simple_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `REPEAT_COUNT` bigint NOT NULL,
  `REPEAT_INTERVAL` bigint NOT NULL,
  `TIMES_TRIGGERED` bigint NOT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_simple_triggers`
--

LOCK TABLES `tn_simple_triggers` WRITE;
/*!40000 ALTER TABLE `tn_simple_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_simple_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_simprop_triggers`
--

DROP TABLE IF EXISTS `tn_simprop_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_simprop_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `STR_PROP_1` varchar(512) DEFAULT NULL,
  `STR_PROP_2` varchar(512) DEFAULT NULL,
  `STR_PROP_3` varchar(512) DEFAULT NULL,
  `INT_PROP_1` int DEFAULT NULL,
  `INT_PROP_2` int DEFAULT NULL,
  `LONG_PROP_1` bigint DEFAULT NULL,
  `LONG_PROP_2` bigint DEFAULT NULL,
  `DEC_PROP_1` decimal(13,4) DEFAULT NULL,
  `DEC_PROP_2` decimal(13,4) DEFAULT NULL,
  `BOOL_PROP_1` varchar(1) DEFAULT NULL,
  `BOOL_PROP_2` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_simprop_triggers`
--

LOCK TABLES `tn_simprop_triggers` WRITE;
/*!40000 ALTER TABLE `tn_simprop_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_simprop_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tn_triggers`
--

DROP TABLE IF EXISTS `tn_triggers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tn_triggers` (
  `SCHED_NAME` varchar(120) NOT NULL,
  `TRIGGER_NAME` varchar(200) NOT NULL,
  `TRIGGER_GROUP` varchar(200) NOT NULL,
  `JOB_NAME` varchar(200) NOT NULL,
  `JOB_GROUP` varchar(200) NOT NULL,
  `DESCRIPTION` varchar(250) DEFAULT NULL,
  `NEXT_FIRE_TIME` bigint DEFAULT NULL,
  `PREV_FIRE_TIME` bigint DEFAULT NULL,
  `PRIORITY` int DEFAULT NULL,
  `TRIGGER_STATE` varchar(16) NOT NULL,
  `TRIGGER_TYPE` varchar(8) NOT NULL,
  `START_TIME` bigint NOT NULL,
  `END_TIME` bigint DEFAULT NULL,
  `CALENDAR_NAME` varchar(200) DEFAULT NULL,
  `MISFIRE_INSTR` smallint DEFAULT NULL,
  `JOB_DATA` blob,
  PRIMARY KEY (`SCHED_NAME`,`TRIGGER_NAME`,`TRIGGER_GROUP`),
  KEY `SCHED_NAME` (`SCHED_NAME`,`JOB_NAME`,`JOB_GROUP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tn_triggers`
--

LOCK TABLES `tn_triggers` WRITE;
/*!40000 ALTER TABLE `tn_triggers` DISABLE KEYS */;
/*!40000 ALTER TABLE `tn_triggers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `transactionnote`
--

DROP TABLE IF EXISTS `transactionnote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `transactionnote` (
  `TransactionNoteId` int NOT NULL AUTO_INCREMENT,
  `PaymentNumber` varchar(50) DEFAULT NULL,
  `UserId` varchar(50) DEFAULT NULL,
  `Note` varchar(500) DEFAULT 'null',
  `Action` varchar(4) DEFAULT 'null',
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`TransactionNoteId`),
  KEY `transactionNote-partnerpayment20180504_idx` (`PaymentNumber`),
  KEY `transactionnote-taxinetusers20180504_idx` (`UserId`)
) ENGINE=InnoDB AUTO_INCREMENT=6516 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `transactionnote`
--

LOCK TABLES `transactionnote` WRITE;
/*!40000 ALTER TABLE `transactionnote` DISABLE KEYS */;
/*!40000 ALTER TABLE `transactionnote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trip`
--

DROP TABLE IF EXISTS `trip`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trip` (
  `RequestID` varchar(50) NOT NULL,
  `ToCity` int DEFAULT NULL,
  `FromCity` int DEFAULT NULL,
  `CompanyID` int DEFAULT NULL,
  `DriverID` varchar(50) DEFAULT NULL,
  `RiderID` varchar(50) NOT NULL,
  `VehicleID` int DEFAULT NULL,
  `PricePanelID` int DEFAULT NULL,
  `PaymentID` int DEFAULT NULL,
  `Code` varchar(20) DEFAULT NULL,
  `ProgramCode` varchar(30) DEFAULT NULL,
  `CompanyCode` varchar(11) DEFAULT NULL,
  `RequestDatetime` datetime NOT NULL,
  `CountryID` varchar(4) DEFAULT NULL,
  `FromAddress` varchar(255) DEFAULT NULL,
  `ToAddress` varchar(255) DEFAULT NULL,
  `TimeStart` datetime DEFAULT NULL,
  `TimeEnd` datetime DEFAULT NULL,
  `OpenPrice` float NOT NULL DEFAULT '0',
  `StartLatitude` double NOT NULL DEFAULT '0',
  `StartLongtitude` double NOT NULL DEFAULT '0',
  `EndLatitude` double NOT NULL DEFAULT '0',
  `EndLongtitude` double NOT NULL DEFAULT '0',
  `Status` varchar(4) NOT NULL,
  `Distance` float NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` bigint NOT NULL,
  `FromCityName` varchar(100) DEFAULT NULL,
  `ToCityName` varchar(100) DEFAULT NULL,
  `Currency` varchar(10) DEFAULT NULL,
  `CardNo` varchar(70) DEFAULT NULL,
  `PaymentType` varchar(3) DEFAULT NULL,
  `CancelReasonCode` varchar(4) DEFAULT NULL,
  `Reason` varchar(100) DEFAULT NULL,
  `adjustAmount` float NOT NULL DEFAULT '0',
  `CancelLatitude` double NOT NULL DEFAULT '0',
  `CancelLongtitude` double NOT NULL DEFAULT '0',
  `VehicleLevel` varchar(3) DEFAULT NULL,
  `DriverFee` double NOT NULL DEFAULT '0',
  `FareRate` double NOT NULL DEFAULT '0',
  `Fee` double NOT NULL DEFAULT '0',
  `Paid` double NOT NULL DEFAULT '0',
  `Promotion` double NOT NULL DEFAULT '0',
  `DriverCalPromotion` float NOT NULL DEFAULT '0',
  `EstPaid` float NOT NULL DEFAULT '0',
  `Tolls` double NOT NULL DEFAULT '0',
  `DistanceFee` double NOT NULL DEFAULT '0',
  `TimeFee` double NOT NULL DEFAULT '0',
  `InvoiceNumber` varchar(30) DEFAULT NULL,
  `Issuer` varchar(4) DEFAULT NULL,
  `DistanceUnit` varchar(4) DEFAULT NULL,
  `RiderBankFee` float NOT NULL DEFAULT '0',
  `DriverBankFee` float NOT NULL DEFAULT '0',
  `DriverWaitingTime` smallint NOT NULL DEFAULT '0',
  `RiderWaitingTime` smallint NOT NULL DEFAULT '0',
  `DriverRating` tinyint NOT NULL DEFAULT '0',
  `RiderRating` tinyint NOT NULL DEFAULT '0',
  `Duration` smallint DEFAULT '0',
  `RequestLatitude` double NOT NULL DEFAULT '0',
  `RequestLongitude` double NOT NULL DEFAULT '0',
  `AcceptLatitude` double NOT NULL DEFAULT '0',
  `AcceptLongitude` double NOT NULL DEFAULT '0',
  `SelectedToAddress` varchar(255) DEFAULT NULL,
  `SelectedEndLatitude` double NOT NULL DEFAULT '0',
  `SelectedEndLongtitude` double NOT NULL DEFAULT '0',
  `PromotionEstimate` float NOT NULL DEFAULT '0',
  `DurationEstimate` double NOT NULL DEFAULT '0',
  `DistanceEstimate` double NOT NULL DEFAULT '0',
  `FareEstimate` double NOT NULL DEFAULT '0',
  `FixedFare` tinyint(1) NOT NULL DEFAULT '0',
  `SelectedFromAddress` varchar(255) DEFAULT NULL,
  `SelectedStartLatitude` double NOT NULL DEFAULT '0',
  `SelectedStartLongtitude` double NOT NULL DEFAULT '0',
  `SelectedPaymentType` varchar(3) DEFAULT NULL,
  `IsReturn` bit(1) DEFAULT b'0',
  `Cash` float NOT NULL DEFAULT '0',
  `Note` varchar(150) DEFAULT NULL,
  `ReturnFare` float NOT NULL DEFAULT '0',
  `EstReturnFare` float NOT NULL DEFAULT '0',
  `MobileRelative` varchar(50) DEFAULT NULL,
  `ExtraDistance` float NOT NULL DEFAULT '0',
  `DriverSelectedExtra` bit(1) NOT NULL DEFAULT b'0',
  `calExtraFare` bit(1) DEFAULT b'0',
  `StopFare` double NOT NULL DEFAULT '0',
  `ExtraFare` double NOT NULL DEFAULT '0',
  `ExtraStopFare` double NOT NULL DEFAULT '0',
  `ExtraStopDuration` smallint DEFAULT '0',
  `ExtraTravelTime` smallint NOT NULL DEFAULT '0',
  `DebtFare` double NOT NULL DEFAULT '0',
  `DisForCalExtraFare` float NOT NULL DEFAULT '0',
  `DisCompleteToSelectedEnd` float NOT NULL DEFAULT '0',
  `StopTimeLimitted` smallint NOT NULL DEFAULT '0',
  `TripNote` varchar(150) DEFAULT '0',
  `TripCode` varchar(50) DEFAULT NULL,
  `OrganizationId` varchar(50) DEFAULT NULL,
  `RiderVersion` varchar(10) DEFAULT NULL,
  `DriverVersion` varchar(10) DEFAULT NULL,
  `RiderDeviceType` varchar(10) DEFAULT NULL,
  `DriverDeviceType` varchar(10) DEFAULT NULL,
  `RecipientName` varchar(80) DEFAULT NULL,
  `RecipientMobile` varchar(20) DEFAULT NULL,
  `RecipientLocation` varchar(150) DEFAULT NULL,
  `ProgPayMethod` varchar(4) DEFAULT NULL,
  `GroupId` int NOT NULL DEFAULT '0',
  `DriverPoint` smallint NOT NULL DEFAULT '0',
  PRIMARY KEY (`RequestID`),
  KEY `FK_o144h304fgdk4k82f9rh0ljrx` (`ToCity`),
  KEY `FK_4vkmdwg303roejkj3w90t68n4` (`FromCity`),
  KEY `FK_bml4hbhb3ahcm27172avxmkbh` (`CompanyID`),
  KEY `FK_qp021ca8usef1y2g68cfoxyhh` (`DriverID`),
  KEY `FK_go9fj6qwoyl3ru1be4q09ls2l` (`RiderID`),
  KEY `FK_hrgl2j0f63nyio81k4q84m1fx` (`VehicleID`),
  KEY `FK_o7tip03jex9ar3ycpsavsj79n` (`PricePanelID`),
  KEY `FK_9369yv2verqmd6k7pdg8pe0uk` (`PaymentID`),
  KEY `FK_e5wlkuwmo61nofsjmkmm0l9ma` (`Code`,`ProgramCode`,`CompanyCode`),
  KEY `Index_CreatedDateTime` (`CreatedDate`),
  KEY `FK_jwqxro64weh01h1itt4wmbt2d` (`OrganizationId`),
  KEY `INDEX_trip_request_date_time` (`RequestDatetime`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trip`
--

LOCK TABLES `trip` WRITE;
/*!40000 ALTER TABLE `trip` DISABLE KEYS */;
/*!40000 ALTER TABLE `trip` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tripadjust`
--

DROP TABLE IF EXISTS `tripadjust`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tripadjust` (
  `TripadjustID` int NOT NULL AUTO_INCREMENT,
  `Type` varchar(4) NOT NULL,
  `RiderTransactionID` varchar(45) DEFAULT NULL,
  `AccountTransactionID` varchar(45) DEFAULT NULL,
  `Amount` double NOT NULL DEFAULT '0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `AdjustAmount` double NOT NULL DEFAULT '0',
  `TripId` varchar(45) DEFAULT 'NULL',
  PRIMARY KEY (`TripadjustID`),
  KEY `tripAdjustForReignkeysridertrransaction_idx` (`RiderTransactionID`),
  KEY `tripAdjustForReignkeysaccounttransaction_idx` (`AccountTransactionID`),
  KEY `FK2i7pcy4nf8wvb47svnicwygyy` (`TripId`)
) ENGINE=InnoDB AUTO_INCREMENT=792 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tripadjust`
--

LOCK TABLES `tripadjust` WRITE;
/*!40000 ALTER TABLE `tripadjust` DISABLE KEYS */;
/*!40000 ALTER TABLE `tripadjust` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tripbiddingconfiguration`
--

DROP TABLE IF EXISTS `tripbiddingconfiguration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tripbiddingconfiguration` (
  `TripBiddingConfigurationID` int NOT NULL,
  `Value` smallint NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `Status` varchar(5) NOT NULL,
  `Code` varchar(30) NOT NULL,
  PRIMARY KEY (`TripBiddingConfigurationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tripbiddingconfiguration`
--

LOCK TABLES `tripbiddingconfiguration` WRITE;
/*!40000 ALTER TABLE `tripbiddingconfiguration` DISABLE KEYS */;
/*!40000 ALTER TABLE `tripbiddingconfiguration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tripbiddinghistory`
--

DROP TABLE IF EXISTS `tripbiddinghistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tripbiddinghistory` (
  `TripBiddingHistoryId` varchar(50) NOT NULL,
  `PromotionTripID` varchar(50) NOT NULL,
  `BidFare` float DEFAULT NULL,
  `DriverID` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedBy` varchar(50) NOT NULL,
  `Cancelled` bit(1) DEFAULT NULL,
  `BidTime` tinyint NOT NULL DEFAULT '0',
  `Note` varchar(500) DEFAULT NULL,
  `ReasonCode` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`TripBiddingHistoryId`),
  KEY `FK_TripBiddingHistory_PromotionTripId_PromotionTrip` (`PromotionTripID`),
  KEY `FK_TripBiddingHistory_DriverId_Driver` (`DriverID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tripbiddinghistory`
--

LOCK TABLES `tripbiddinghistory` WRITE;
/*!40000 ALTER TABLE `tripbiddinghistory` DISABLE KEYS */;
/*!40000 ALTER TABLE `tripbiddinghistory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tripdetails`
--

DROP TABLE IF EXISTS `tripdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tripdetails` (
  `TripID` varchar(50) NOT NULL,
  `LatLng` longtext NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` bigint NOT NULL,
  `OriginalLatLng` longtext NOT NULL,
  PRIMARY KEY (`TripID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tripdetails`
--

LOCK TABLES `tripdetails` WRITE;
/*!40000 ALTER TABLE `tripdetails` DISABLE KEYS */;
/*!40000 ALTER TABLE `tripdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tripdriver`
--

DROP TABLE IF EXISTS `tripdriver`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tripdriver` (
  `TripDriverId` varchar(50) NOT NULL,
  `TripID` varchar(50) NOT NULL,
  `DriverID` varchar(50) NOT NULL,
  `Status` varchar(5) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` bigint NOT NULL,
  `Lat` double NOT NULL DEFAULT '0',
  `Lng` double NOT NULL DEFAULT '0',
  PRIMARY KEY (`TripDriverId`),
  KEY `FK_fmcn6ayfbhujn5li4pa62l0hq` (`TripID`),
  KEY `FK_sv056kxawhj6prkbnx2nixpn6` (`DriverID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tripdriver`
--

LOCK TABLES `tripdriver` WRITE;
/*!40000 ALTER TABLE `tripdriver` DISABLE KEYS */;
/*!40000 ALTER TABLE `tripdriver` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tripinvoice`
--

DROP TABLE IF EXISTS `tripinvoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tripinvoice` (
  `InvoiceNumber` varchar(50) NOT NULL,
  `CompanyID` int NOT NULL,
  `DriverID` varchar(50) NOT NULL,
  `RiderID` varchar(50) NOT NULL,
  `TripID` varchar(50) NOT NULL,
  `VATRate` double NOT NULL DEFAULT '0',
  `VAT` double DEFAULT '0',
  `Promotion` double DEFAULT '0',
  `Fee` double DEFAULT NULL,
  `Paid` double DEFAULT '0',
  `InvoiceDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `Currency` varchar(10) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`InvoiceNumber`),
  KEY `FK_nyekuvv5mkaqlvar5n3syb5mk` (`CompanyID`),
  KEY `FK_3g0cxuf6u5fp3fvyrglg6ybys` (`DriverID`),
  KEY `FK_t2mhdd5y7853uxw1kdvoqqxxc` (`RiderID`),
  KEY `FK_mvty916lamt41tm96p5fh54i7` (`TripID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tripinvoice`
--

LOCK TABLES `tripinvoice` WRITE;
/*!40000 ALTER TABLE `tripinvoice` DISABLE KEYS */;
/*!40000 ALTER TABLE `tripinvoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ob8kqyqqgmefl0aco34akdtpe` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=217 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (198,'admin','$2a$10$pV/dyfr.XLkyQyrFHLDQCOcxiIKNPiYHh7VQ1gfaLQ4XQ9RKajtGm');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `role_id` bigint NOT NULL,
  `user_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ob8kqyqqgmeflesco34akdtpe` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=194 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (153,4,175),(175,4,198);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userbankaccount`
--

DROP TABLE IF EXISTS `userbankaccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userbankaccount` (
  `userBankAccountId` varchar(50) NOT NULL,
  `UserID` varchar(50) NOT NULL,
  `BankAccountId` varchar(50) NOT NULL,
  `IsOwner` bit(1) DEFAULT b'0',
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` datetime NOT NULL,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` datetime NOT NULL,
  `IsUsed` bit(1) DEFAULT b'0',
  PRIMARY KEY (`userBankAccountId`),
  KEY `FK_userbankaccount_taxinet_user_idx` (`UserID`),
  KEY `FK_userbankaccount_bankaccount_id_idx` (`BankAccountId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userbankaccount`
--

LOCK TABLES `userbankaccount` WRITE;
/*!40000 ALTER TABLE `userbankaccount` DISABLE KEYS */;
/*!40000 ALTER TABLE `userbankaccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userconnection`
--

DROP TABLE IF EXISTS `userconnection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userconnection` (
  `userId` varchar(255) NOT NULL,
  `providerId` varchar(255) NOT NULL,
  `providerUserId` varchar(255) NOT NULL,
  `rank` int NOT NULL,
  `displayName` varchar(255) DEFAULT NULL,
  `profileUrl` varchar(512) DEFAULT NULL,
  `imageUrl` varchar(512) DEFAULT NULL,
  `accessToken` varchar(255) NOT NULL,
  `secret` varchar(255) DEFAULT NULL,
  `refreshToken` varchar(255) DEFAULT NULL,
  `expireTime` bigint DEFAULT NULL,
  PRIMARY KEY (`userId`,`providerId`,`providerUserId`),
  UNIQUE KEY `UserConnectionRank` (`userId`,`providerId`,`rank`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userconnection`
--

LOCK TABLES `userconnection` WRITE;
/*!40000 ALTER TABLE `userconnection` DISABLE KEYS */;
/*!40000 ALTER TABLE `userconnection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usergroup`
--

DROP TABLE IF EXISTS `usergroup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usergroup` (
  `GroupCode` varchar(3) NOT NULL,
  `GroupName` varchar(30) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`GroupCode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usergroup`
--

LOCK TABLES `usergroup` WRITE;
/*!40000 ALTER TABLE `usergroup` DISABLE KEYS */;
/*!40000 ALTER TABLE `usergroup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle` (
  `VehicleID` int NOT NULL AUTO_INCREMENT,
  `InsuranceCertificate` int DEFAULT NULL,
  `CompanyID` int DEFAULT NULL,
  `RegistrationStamp` int DEFAULT NULL,
  `CarTypeID` int NOT NULL,
  `Plate` varchar(20) NOT NULL,
  `InteriorColor` varchar(20) DEFAULT NULL,
  `ExteriorColor` varchar(20) DEFAULT NULL,
  `ProduceYear` varchar(4) DEFAULT NULL,
  `LisencePlatCountry` varchar(4) DEFAULT NULL,
  `LisencePlatState` varchar(20) DEFAULT NULL,
  `Level` varchar(4) DEFAULT NULL,
  `Level2` varchar(4) DEFAULT NULL,
  `Level3` varchar(4) DEFAULT NULL,
  `Status` varchar(2) NOT NULL,
  `CreatedBy` varchar(50) NOT NULL,
  `CreatedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LastModifiedBy` varchar(50) NOT NULL,
  `LastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`VehicleID`),
  UNIQUE KEY `UK_eusnlkawb6ddsvx30ro5vjf75` (`Plate`),
  KEY `FK_3b35ogm0mo31vjxvgs6taxqou` (`InsuranceCertificate`),
  KEY `FK_bjo8tumeu9q4x4rsgemu14yf6` (`CompanyID`),
  KEY `FK_9oh8dr8mg9v6ddu88p27v3hw` (`RegistrationStamp`),
  KEY `FK_5n1sgoc92agx9601a5eoshy5a` (`CarTypeID`)
) ENGINE=InnoDB AUTO_INCREMENT=30663 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicledocument`
--

DROP TABLE IF EXISTS `vehicledocument`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicledocument` (
  `documentid` int NOT NULL,
  `vehicleid` int NOT NULL,
  `id` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `documentid` (`documentid`),
  KEY `vehicleid` (`vehicleid`),
  CONSTRAINT `vehicledocument_ibfk_1` FOREIGN KEY (`documentid`) REFERENCES `document` (`DocumentID`),
  CONSTRAINT `vehicledocument_ibfk_2` FOREIGN KEY (`vehicleid`) REFERENCES `vehicle` (`VehicleID`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicledocument`
--

LOCK TABLES `vehicledocument` WRITE;
/*!40000 ALTER TABLE `vehicledocument` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehicledocument` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `verificationcount`
--

DROP TABLE IF EXISTS `verificationcount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `verificationcount` (
  `VerificationCountID` int NOT NULL AUTO_INCREMENT,
  `deviceId` varchar(400) DEFAULT NULL,
  `sentDate` date DEFAULT NULL,
  `sentCount` tinyint NOT NULL DEFAULT '0',
  `totalSentCount` tinyint NOT NULL DEFAULT '0',
  `createdBy` varchar(50) NOT NULL,
  `createdDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `lastModifiedBy` varchar(45) NOT NULL,
  `lastModifiedDate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`VerificationCountID`)
) ENGINE=InnoDB AUTO_INCREMENT=291730 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `verificationcount`
--

LOCK TABLES `verificationcount` WRITE;
/*!40000 ALTER TABLE `verificationcount` DISABLE KEYS */;
/*!40000 ALTER TABLE `verificationcount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `verifyaccount`
--

DROP TABLE IF EXISTS `verifyaccount`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `verifyaccount` (
  `id` int NOT NULL AUTO_INCREMENT,
  `userid` int NOT NULL,
  `expiredate` timestamp NULL DEFAULT NULL,
  `verificode` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=120 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `verifyaccount`
--

LOCK TABLES `verifyaccount` WRITE;
/*!40000 ALTER TABLE `verifyaccount` DISABLE KEYS */;
INSERT INTO `verifyaccount` VALUES (109,200,'2022-12-21 15:05:48','487068','4'),(110,201,'2022-12-21 14:56:19','229444','3'),(111,202,'2022-12-21 14:40:00','746478','0'),(112,203,'2022-12-21 14:44:32','477759','4'),(113,204,'2022-12-21 15:04:50','190772','1'),(114,207,'2022-12-21 15:26:05','954609','4'),(115,208,'2022-12-21 15:26:11','741489','4'),(116,210,'2022-12-21 15:32:37','387444','0'),(117,212,'2022-12-22 07:22:48','547040','4'),(118,213,'2022-12-22 11:20:43','429191','1'),(119,216,'2022-12-23 04:18:58','378732','1');
/*!40000 ALTER TABLE `verifyaccount` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `version`
--

DROP TABLE IF EXISTS `version`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `version` (
  `VersionId` int NOT NULL AUTO_INCREMENT,
  `AndroidRider` smallint NOT NULL DEFAULT '0',
  `AndroidDriver` smallint NOT NULL DEFAULT '0',
  `IosRider` float NOT NULL DEFAULT '0',
  `IosDriver` float NOT NULL DEFAULT '0',
  `Current` smallint NOT NULL DEFAULT '0',
  `AndroidRiderName` varchar(45) DEFAULT NULL,
  `AndroidDriverName` varchar(45) DEFAULT NULL,
  `IosRiderName` varchar(45) DEFAULT NULL,
  `IosDriverName` varchar(45) DEFAULT NULL,
  `AndroidRiderRequired` int NOT NULL DEFAULT '0',
  `AndroidDriverRequired` int NOT NULL DEFAULT '0',
  `IosRiderRequired` float NOT NULL DEFAULT '0',
  `IosDriverRequired` float NOT NULL DEFAULT '0',
  PRIMARY KEY (`VersionId`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `version`
--

LOCK TABLES `version` WRITE;
/*!40000 ALTER TABLE `version` DISABLE KEYS */;
/*!40000 ALTER TABLE `version` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `waypoint`
--

DROP TABLE IF EXISTS `waypoint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `waypoint` (
  `WayPointId` varchar(50) NOT NULL,
  `MovingDirectionID` varchar(50) DEFAULT NULL,
  `Latitude` double DEFAULT NULL,
  `Longitude` double DEFAULT NULL,
  `OrderNumber` smallint NOT NULL DEFAULT '0',
  PRIMARY KEY (`WayPointId`),
  KEY `FK_gqndts1xraioty2j2nyq7oojm` (`MovingDirectionID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `waypoint`
--

LOCK TABLES `waypoint` WRITE;
/*!40000 ALTER TABLE `waypoint` DISABLE KEYS */;
/*!40000 ALTER TABLE `waypoint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weeklydriversummary`
--

DROP TABLE IF EXISTS `weeklydriversummary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `weeklydriversummary` (
  `WEEKLYDRIVERSUMMARYID` bigint NOT NULL AUTO_INCREMENT,
  `DRIVERID` varchar(50) NOT NULL,
  `PROCESSEDDATE` date DEFAULT NULL,
  `SHAREDFARE` float NOT NULL,
  `INVOICESTATUS` varchar(5) NOT NULL,
  `WEEKNO` smallint NOT NULL,
  `NUMBERTRIPS` smallint NOT NULL DEFAULT '0',
  `NUMBEROFREJECTEDTRIPS` smallint NOT NULL DEFAULT '0',
  `NUMBEROFNORESPONSETRIPS` smallint NOT NULL DEFAULT '0',
  `NUMBERRECEIVEDTRIPS` smallint NOT NULL DEFAULT '0',
  `NUMBERDRIVERCANCELLEDTRIPS` smallint NOT NULL,
  `NUMBERRIDERCANCELLEDTRIPS` smallint NOT NULL,
  `COMPANYID` int NOT NULL,
  `TOTALFARE` double NOT NULL,
  `DISTANCE` double NOT NULL,
  `ADJUSTAMOUNT` double NOT NULL,
  `PROMOTIONAMOUNT` double NOT NULL,
  `Promotion1` double NOT NULL DEFAULT '0',
  `Promotion2` double NOT NULL DEFAULT '0',
  `PAYMENT` double NOT NULL,
  `DriverBankFee` double NOT NULL DEFAULT '0',
  `RiderBankFee` double NOT NULL DEFAULT '0',
  `cancelFee` double NOT NULL DEFAULT '0',
  `Tolls` double NOT NULL DEFAULT '0',
  `PAYMENTDATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `WEEKNUMBERID` bigint NOT NULL,
  `ACTUALPAYMENT` float NOT NULL,
  `TotalFeeRDCredit` float DEFAULT '0',
  `TotalTollsTripsCredit` float DEFAULT '0',
  `TotalPromotionRDCash` float DEFAULT '0',
  `TotalPromotionRDCredit` float DEFAULT '0',
  `DriverDeponsitAccount` double DEFAULT '0',
  `TotalFareRDCancelTrips` float DEFAULT '0',
  `DriverFeeRDCredit` float DEFAULT '0',
  `AdjustCreditFare` double DEFAULT '0',
  `driverFee` double DEFAULT '0',
  `rate` double DEFAULT '0',
  `noCreditPaidTrips` double DEFAULT '0',
  `CHARGEDAMOUNT` float NOT NULL,
  `DISCOUNTEDAMOUNT` float NOT NULL,
  `CREATEDBY` varchar(50) NOT NULL,
  `CREATEDDATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LASTMODIFIEDBY` varchar(50) NOT NULL,
  `LASTMODIFIEDDATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `NoTrips` smallint NOT NULL,
  `CompletedTrips` smallint NOT NULL DEFAULT '0',
  `TotalDRBalance` double DEFAULT '0',
  `TotalDRDebt` double DEFAULT '0',
  `DriverPoint` bigint NOT NULL DEFAULT '0',
  PRIMARY KEY (`WEEKLYDRIVERSUMMARYID`),
  KEY `FK_4b46o8jbwvx7fvx40t7fuof5j` (`WEEKNUMBERID`),
  KEY `FK_irexa38rr4uf52innm1w0dqvb` (`COMPANYID`),
  KEY `FK_q6jojyw0i20qg7w4jv6cot94c` (`DRIVERID`)
) ENGINE=InnoDB AUTO_INCREMENT=208696 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weeklydriversummary`
--

LOCK TABLES `weeklydriversummary` WRITE;
/*!40000 ALTER TABLE `weeklydriversummary` DISABLE KEYS */;
/*!40000 ALTER TABLE `weeklydriversummary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weeknumber`
--

DROP TABLE IF EXISTS `weeknumber`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `weeknumber` (
  `WEEKNUMBERID` bigint NOT NULL AUTO_INCREMENT,
  `WEEKNUMBER` int DEFAULT NULL,
  `FINANCIALYEAR` int DEFAULT NULL,
  `WEEKSTARTDATE` datetime NOT NULL,
  `WEEKENDDATE` datetime NOT NULL,
  `CREATEDBY` varchar(50) NOT NULL,
  `CREATEDDATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `LASTMODIFIEDBY` varchar(50) NOT NULL,
  `LASTMODIFIEDDATE` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`WEEKNUMBERID`)
) ENGINE=InnoDB AUTO_INCREMENT=263 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weeknumber`
--

LOCK TABLES `weeknumber` WRITE;
/*!40000 ALTER TABLE `weeknumber` DISABLE KEYS */;
/*!40000 ALTER TABLE `weeknumber` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-23 11:18:22
