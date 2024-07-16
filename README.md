# MyApps

-- Database: studentinfo -- 
-- Table structure for table feesconcession -- 
DROP TABLE IF EXISTS feesconcession; 
/!40101 SET @saved_cs_client = @@character_set_client */; 
/!50503 SET character_set_client = utf8mb4 /; 
CREATE TABLE feesconcession ( id int NOT NULL AUTO_INCREMENT, con_code varchar(45) DEFAULT NULL, con_percentage decimal(10,0) DEFAULT NULL, 
start_date varchar(45) DEFAULT NULL, end_date varchar(45) DEFAULT NULL, PRIMARY KEY (id) )
ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci; 
/!40101 SET character_set_client = @saved_cs_client */;

DROP TABLE IF EXISTS studentinfo; 
/!40101 SET @saved_cs_client = @@character_set_client */; 
/!50503 SET character_set_client = utf8mb4 /; 
CREATE TABLE studentinfo ( id int NOT NULL AUTO_INCREMENT, name varchar(100) DEFAULT NULL, 
register_no varchar(20) DEFAULT NULL, mail varchar(250) DEFAULT NULL, fees_amount decimal(10,0) DEFAULT NULL, discount_amount decimal(10,0) DEFAULT NULL,
PRIMARY KEY (id) ) ENGINE=InnoDB AUTO_INCREMENT=8 
DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci; 
/!40101 SET character_set_client = @saved_cs_client */;
