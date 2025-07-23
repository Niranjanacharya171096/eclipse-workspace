CREATE TABLE FORUMREG 
  (	ID INT, 
	USERNAME VARCHAR(100), 
	USERPASS VARCHAR(100), 
	EMAIL VARCHAR(100), 
	MOBILE INT, 
	ADDRESS VARCHAR(100), 
	 CONSTRAINT FORUMREG_PK PRIMARY KEY (ID) 
  );
/

CREATE OR REPLACE TRIGGER BI_FORUMREG 
 before insert on FORUMREG        
 for each row 
begin  
  select FORUMREG_SEQ.nextval into :NEW.ID from dual; 
end; 

/
ALTER TRIGGER BI_FORUMREG 
/
--------------------------------------------------------------

CREATE TABLE FORUMREP 
  (	ID INT, 
	COUNTRY VARCHAR(100), 
	STATE VARCHAR(100), 
	DISTRICT VARCHAR(100), 
	POLICE_STATION VARCHAR(100), 
	REPORT VARCHAR(100), 
	STATUS VARCHAR(100), 
	IMAGE BLOB, 
	EMAIL VARCHAR(100), 
	POSTEDON DATE, 
	 CONSTRAINT FORUMREP_PK PRIMARY KEY (ID) 
  );
/

CREATE OR REPLACE TRIGGER BI_FORUMREP 
 before insert on FORUMREP        
 for each row 
begin  
  select FORUMREP_SEQ.nextval into :NEW.ID from dual; 
end; 

/
ALTER TRIGGER BI_FORUMREP 
/

--------------------------------------------------------------

CREATE TABLE FORUMADVC 
  (	RID INT, 
	ID INT, 
	CMT VARCHAR(100), 
	EMAIL VARCHAR(100), 
	 CONSTRAINT FORUMADVC_PK PRIMARY KEY (ID) 
  );
/

CREATE OR REPLACE TRIGGER BI_FORUMADVC 
 before insert on FORUMADVC        
 for each row 
begin  
  select FORUMADVC_SEQ.nextval into :NEW.ID from dual; 
end; 

/
ALTER TRIGGER BI_FORUMADVC 
/
----------------------------------------------------------------

CREATE TABLE FORUMTPC 
  (	ID INT, 
	TOPIC VARCHAR(100), 
	EMAIL VARCHAR(100), 
	CREATEDON DATE NOT NULL , 
	 CONSTRAINT FORUMTPC_PK PRIMARY KEY (ID) 
  );
/

CREATE OR REPLACE TRIGGER BI_FORUMTPC 
 before insert on FORUMTPC        
 for each row 
begin  
  select FORUMTPC_SEQ.nextval into :NEW.ID from dual; 
end; 

/
ALTER TRIGGER BI_FORUMTPC 
/
------------------------------------------------------------------

CREATE TABLE FORUMTADVC 
  (	ID INT, 
	TID INT, 
	CMT VARCHAR(100), 
	EMAIL VARCHAR(100), 
	 CONSTRAINT FORUMTADVC_PK PRIMARY KEY (ID) 
  );
/

CREATE OR REPLACE TRIGGER BI_FORUMTADVC 
 before insert on FORUMTADVC        
 for each row 
begin  
  select FORUMTADVC_SEQ.nextval into :NEW.ID from dual; 
end; 

/
ALTER TRIGGER BI_FORUMTADVC 
/