/*
create database for requirement matching system (rms)
*/
DROP DATABASE IF EXISTS rms;

CREATE DATABASE rms;
USE rms;
################################################################
/*START of CPU Table
--table to store cpu data*/ 
CREATE TABLE CPU (
  id INT PRIMARY KEY,
  brand VARCHAR(15),
  manufacturer VARCHAR (15),
  quality INT,
  price DECIMAL(10,2),
  cores INT,
  speedGHZ DECIMAL(10,2)
);

/*populate table with dummy data*/
INSERT INTO CPU
VALUES (
  0, 'intel', 'intel',3, '25000.00',7,2.5
);

/*END of CPU Table*/
################################################################
/*START of HDD Table
--table to store HDD data */
CREATE TABLE HDD (
  id INT PRIMARY KEY,
  brand VARCHAR(15),
  manufacturer VARCHAR (15),
  quality INT,
  price DECIMAL(10,2),
  storageGB DECIMAL(10,2),
  rpm INT, 	
  type VARCHAR(10)
);

/*populate table with dummy data*/
INSERT INTO HDD
VALUES (
  0, 'maxter', 'maxter',3, 25000.00,750,7200,'IDE'
);

/*END of CPU Table*/
################################################################

SELECT * FROM CPU;

