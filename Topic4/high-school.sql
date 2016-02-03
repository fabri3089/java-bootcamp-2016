# SQL Manager 2005 Lite for MySQL 3.7.0.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : high-school


SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `high-school`
    CHARACTER SET 'latin1'
    COLLATE 'latin1_swedish_ci';

#
# Structure for the `teacher` table : 
#

CREATE TABLE `teacher` (
  `firstName` varchar(25) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `dateOfBirth` date default NULL,
  PRIMARY KEY  (`lastName`),
  KEY `firstName` (`firstName`),
  KEY `lastName` (`lastName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `course` table : 
#

CREATE TABLE `course` (
  `name` varchar(20) NOT NULL,
  `asignedTeacher` varchar(20) default NULL,
  `hoursByWeek` double(15,3) NOT NULL,
  PRIMARY KEY  (`name`),
  KEY `asignedTeacher` (`asignedTeacher`),
  CONSTRAINT `course_fk` FOREIGN KEY (`asignedTeacher`) REFERENCES `teacher` (`lastName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `course_scheduletime` table : 
#

CREATE TABLE `course_scheduletime` (
  `courseName` varchar(20) default NULL,
  `scheduleTime` varchar(25) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `student` table : 
#

CREATE TABLE `student` (
  `registrationNumber` int(11) NOT NULL auto_increment,
  `firstName` varchar(25) default NULL,
  `lastName` varchar(25) default NULL,
  `dateOfBirth` date default NULL,
  PRIMARY KEY  (`registrationNumber`),
  UNIQUE KEY `registrationNumber` (`registrationNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `course_student` table : 
#

CREATE TABLE `course_student` (
  `studentRegistrationNumber` int(11) NOT NULL,
  `nameCourse` varchar(20) NOT NULL,
  `parcial1Notes` float(9,3) default NULL,
  `parcial2Notes` float(9,3) default NULL,
  `parcial3Notes` float(9,3) default NULL,
  `finalNotes` int(11) default NULL,
  PRIMARY KEY  (`studentRegistrationNumber`,`nameCourse`),
  KEY `StudentRegistrationNumber` (`studentRegistrationNumber`),
  KEY `nameCourse` (`nameCourse`),
  CONSTRAINT `course_student_fk` FOREIGN KEY (`studentRegistrationNumber`) REFERENCES `student` (`registrationNumber`),
  CONSTRAINT `course_student_fk1` FOREIGN KEY (`nameCourse`) REFERENCES `course` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for the `teacher` table  (LIMIT 0,500)
#

INSERT INTO `teacher` (`firstName`, `lastName`, `dateOfBirth`) VALUES 
  ('Rita','Malano','1975-05-30'),
  ('Adrian','Meca','1985-09-14'),
  ('Dario','Weitz','1958-03-06');

COMMIT;

#
# Data for the `course` table  (LIMIT 0,500)
#

INSERT INTO `course` (`name`, `asignedTeacher`, `hoursByWeek`) VALUES 
  ('Analisis de Sistemas','Malano',4),
  ('Gestion de datos','Meca',5),
  ('Teoria de Control','Weitz',4);

COMMIT;

#
# Data for the `course_scheduletime` table  (LIMIT 0,500)
#

INSERT INTO `course_scheduletime` (`courseName`, `scheduleTime`) VALUES 
  ('Gestion de Datos','Monday 8:00-10:00'),
  ('Teoria de Control','Wednesday 10:00-12:00'),
  ('Gestion de Datos','Friday 7:00-12:00'),
  ('Analisis de Sistemas','Monday 15:00-19:00'),
  ('Teoria de Control','Thursday 16:00-20:00');

COMMIT;

#
# Data for the `student` table  (LIMIT 0,500)
#

INSERT INTO `student` (`registrationNumber`, `firstName`, `lastName`, `dateOfBirth`) VALUES 
  (1,'Fabricio','Montes','1989-12-30'),
  (2,'Favio','Montes','1993-11-12'),
  (3,'Leandro ','Montes','2000-06-26'),
  (4,'Juan','Perez','1988-09-15'),
  (5,'Sofia','Gomez','1987-05-27'),
  (6,'Florencia','Roldan','1990-06-18'),
  (7,'Mariana ','Roldan','1996-01-23'),
  (8,'Damian','Roldan','1986-10-04'),
  (9,'Lautaro','Roldan','2004-07-16'),
  (10,'Maximiliano','Pablo','1990-04-10'),
  (11,'Axel','Pablo','1994-08-02'),
  (12,'Nicolas','Pablo ','1998-02-05'),
  (13,'Erwin','Raniero','1989-07-22'),
  (14,'Mariano','Cuello','1989-08-02'),
  (15,'Lucas','Delgado','1989-10-05'),
  (16,'Lionel','Messi','1987-06-20'),
  (17,'Gonzalo','Higuain','1988-12-03'),
  (18,'Leandro','Romagnoli','1983-04-11'),
  (19,'Luciana','Aymar','1985-09-13'),
  (20,'Sebastian','Torrico','1980-10-01'),
  (21,'Julio','Buffarini','1985-06-04'),
  (22,'Matias','Caruzzo','1981-07-02'),
  (23,'Lucas','Senesi','1995-03-06'),
  (24,'Emanuel','Mas','1989-08-03'),
  (25,'Juan Ignacio','Mercier','1982-03-05'),
  (26,'Nestor','Ortigoza','1981-09-12'),
  (27,'Sebastian','Blanco','1988-12-10'),
  (28,'Hector','Villalba','1992-12-07'),
  (29,'Martin','Cauteruccio','1986-01-09'),
  (30,'Nicolas','Blandi','1988-12-30');

COMMIT;

#
# Data for the `course_student` table  (LIMIT 0,500)
#

INSERT INTO `course_student` (`studentRegistrationNumber`, `nameCourse`, `parcial1Notes`, `parcial2Notes`, `parcial3Notes`, `finalNotes`) VALUES 
  (1,'Teoria de Control',8,5,9,9),
  (2,'Teoria de Control',7,7,4,6),
  (3,'Teoria de Control',10,8,7,9),
  (4,'Teoria de Control',7,7,7,7),
  (5,'Teoria de Control',7,2,5,8),
  (6,'Teoria de Control',5,5,5,5),
  (7,'Teoria de Control',7,8,9,10),
  (8,'Teoria de Control',5,6,8,7),
  (9,'Teoria de Control',3,6,9,5),
  (10,'Teoria de Control',8,8,8,8),
  (11,'Gestion de Datos',8,8,8,7),
  (12,'Gestion de Datos',4,5,7,8),
  (13,'Gestion de Datos',8,9,10,9),
  (14,'Gestion de Datos',7,7,7,7),
  (15,'Gestion de Datos',6,6,5,6),
  (16,'Gestion de Datos',4,5,6,5),
  (17,'Gestion de Datos',9,9,9,9),
  (18,'Gestion de Datos',6,6,8,7),
  (19,'Gestion de Datos',8,9,7,8),
  (20,'Gestion de Datos',5,5,5,5),
  (21,'Analisis de Sistemas',8,8,9,8),
  (22,'Analisis de Sistemas',5,5,5,5),
  (23,'Analisis de Sistemas',9,7,8,7),
  (24,'Analisis de Sistemas',9,9,9,9),
  (25,'Analisis de Sistemas',10,10,10,10),
  (26,'Analisis de Sistemas',4,5,6,5),
  (27,'Analisis de Sistemas',9,7,5,6),
  (28,'Analisis de Sistemas',8,7,7,7),
  (29,'Analisis de Sistemas',8,6,8,7),
  (30,'Analisis de Sistemas',5,6,8,7);

COMMIT;

