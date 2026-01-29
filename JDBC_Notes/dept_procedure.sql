call mydb.dept_pro();
DELIMITER $$
CREATE  DEFINER=`root`@`localhost` PROCEDURE `dept_pro`()
BEGIN

insert into dept values(70,'Travels','delhi');

END$$
DELIMITER ;
