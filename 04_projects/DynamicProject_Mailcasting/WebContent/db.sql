CREATE TABLE MAILCASTINGUSER
  (ID INT AUTO_INCREMENT, 
  EMAIL VARCHAR(45),
  PASSWORD VARCHAR(45),
  NAME VARCHAR(45),
  GENDER VARCHAR(45),
  MNAME VARCHAR(45), 
  COUNTRY VARCHAR(45),
	 CONSTRAINT MAILCASTINGUSER PRIMARY KEY (ID)    
  );
  
CREATE TABLE INBOX6
(ID INT,
RECIEVER VARCHAR(45),
SENDER VARCHAR(45),
MESSAGE VARCHAR(45),
DATE_OF_RECEIVING DATE,
CONSTRAINT INBOX6 PRIMARY KEY (ID)    
);
