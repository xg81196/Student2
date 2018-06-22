DROP TABLE IF EXISTS `class`;

CREATE TABLE `class` (
 class_id int(11) NOT NULL AUTO_INCREMENT,
 class_name varchar(20) DEFAULT NULL,
  PRIMARY KEY (class_id)
);

insert  into `class`(`class_id`,`class_name`) values (1,'S1');
 insert  into `class`(`class_id`,`class_name`) values (2,'S2');
 insert  into `class`(`class_id`,`class_name`) values (3,'Y2');


 DROP TABLE IF EXISTS `Student`;

 CREATE TABLE `Student` (
   `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(20) NOT NULL ,
   `s_sex` varchar(10) NOT NULL ,
   `s_birth` varchar(20) NOT NULL,
   `s_class_id` int(11) DEFAULT NULL,
   PRIMARY KEY (`s_id`)
 );

 insert  into `Student`(`s_id`,`s_name`,`s_sex`,`s_birth`,`s_class_id`) values (1,'aaaaaa','nan','1990-01-01',1);
 insert  into `Student`(`s_id`,`s_name`,`s_sex`,`s_birth`,`s_class_id`) values (2,'cccccccc','nan','1990-12-21',2);
 insert  into `Student`(`s_id`,`s_name`,`s_sex`,`s_birth`,`s_class_id`) values (3,'sunfeng','nan','1990-05-20',3);
 insert  into `Student`(`s_id`,`s_name`,`s_sex`,`s_birth`,`s_class_id`) values (4,'liyun','nan','1990-08-06',1);
 insert  into `Student`(`s_id`,`s_name`,`s_sex`,`s_birth`,`s_class_id`) values (5,'zhoumei','nv','1991-12-01',1);
 insert  into `Student`(`s_id`,`s_name`,`s_sex`,`s_birth`,`s_class_id`) values (6,'wulan','nv','1992-03-01',1);
 insert  into `Student`(`s_id`,`s_name`,`s_sex`,`s_birth`,`s_class_id`) values (7,'zhengzhu','nv','1989-07-01',2);
 insert  into `Student`(`s_id`,`s_name`,`s_sex`,`s_birth`,`s_class_id`) values (8,'wangju','nv','1990-01-20',3);
