DROP TABLE USER if EXISTS ;
CREATE TABLE USER (id bigint generated by DEFAULT AS IDENTITY,username VARCHAR (40),name VARCHAR (20),age INT (3),balance DECIMAL (10,2),PRIMARY KEY (id))