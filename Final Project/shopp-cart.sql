# SQL Manager 2005 Lite for MySQL 3.7.0.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : shopp-cart


SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `shopp-cart`
    CHARACTER SET 'latin1'
    COLLATE 'latin1_swedish_ci';

#
# Structure for the `buys` table : 
#

CREATE TABLE `buys` (
  `id` bigint(20) NOT NULL auto_increment,
  `creditcard` int(11) NOT NULL,
  `product` bigint(20) default NULL,
  `purchasenumber` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `user` bigint(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `products` table : 
#

CREATE TABLE `products` (
  `id_product` int(11) NOT NULL,
  `name` varchar(30) default NULL,
  `total` int(11) default NULL,
  `price` varchar(20) default NULL,
  `category` varchar(30) default NULL,
  PRIMARY KEY  (`id_product`),
  UNIQUE KEY `id_product` (`id_product`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `user` table : 
#

CREATE TABLE `user` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(25) default NULL,
  `userName` varchar(20) default NULL,
  `password` varchar(20) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for the `buys` table  (LIMIT 0,500)
#

INSERT INTO `buys` (`id`, `creditcard`, `product`, `purchasenumber`, `quantity`, `user`) VALUES 
  (1,220,2,1,2,1),
  (2,220,2,1,2,1),
  (3,220,2,1,2,1),
  (4,220,2,1,2,2),
  (5,220,1,1,4,10),
  (6,223,3,6,59,3),
  (7,223,3,6,59,3),
  (8,223,3,6,59,3);

COMMIT;

#
# Data for the `products` table  (LIMIT 0,500)
#

INSERT INTO `products` (`id_product`, `name`, `total`, `price`, `category`) VALUES 
  (1,'Monitor Samsung 19''',10,'$3200.000','Pantallas LED'),
  (2,'Monitor LG 19''',5,'$3000.000','Pantallas LED'),
  (3,'Mousse Genius',80,'$200.000','Perifericos'),
  (4,'Monitor Samsung 19''',8,'3202.000','Pantallas LED');

COMMIT;

#
# Data for the `user` table  (LIMIT 0,500)
#

INSERT INTO `user` (`id`, `name`, `userName`, `password`) VALUES 
  (1,'aa','aa','aaaa'),
  (2,'alber','alber','aber'),
  (3,'fabricio','fabr','aasdf'),
  (4,'fabricio','fabr',NULL),
  (5,'fabricio','fabr',NULL),
  (6,'fabricio','fabrpassword=aasdf',NULL),
  (7,'fabricio','fabrpassword=aasdf',NULL),
  (8,'fabricio','fabrpassword=aasdf',NULL),
  (9,'fabricio','fabrpassword=aasdf',NULL),
  (10,'fabricio','fabr','aasdf'),
  (11,'fabricio',NULL,NULL),
  (12,'fabricio','fabrpassword=aasdf',NULL),
  (13,'Fabricio','fabr89','1234'),
  (14,'juan','juan01','jass'),
  (15,'juan','juan01','jass');

COMMIT;

