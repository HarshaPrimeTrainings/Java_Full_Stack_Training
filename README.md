# Java_Full_Stack_Training

# Stored Procedure to insert records
```
DELIMITER $$
CREATE PROCEDURE insertrecords()
BEGIN
insert into java_fullstack.products values(6,'SmartWatch',20,5);
insert into java_fullstack.products values(7,'WaterBottle',5,2);
insert into java_fullstack.products values(8,'Desktop',150,7);
END $$
DELIMITER ;
```

# Roles for Oath2
```
insert into roles values(1,'ROLE_ADMIN');
insert into roles values(2,'ROLE_USERS');
```
