drop table if exists `chapter`;
create table `chapter`(
                          `id` char(8) not null comment 'ID',
                          `course_id` char(8) comment '¿Î³Ìid',
                          `name` varchar(50) comment 'Ãû³Æ',
                          primary key (`id`)
) engine=innodb default charset=utf8mb4 comment ='´óÕÂ';


insert into `chapter` (id, course_id, name) values ('00000001', '00000000', '²âÊÔ´óÕÂ01');
insert into `chapter` (id, course_id, name) values ('00000002', '00000000', '²âÊÔ´óÕÂ02');
insert into `chapter` (id, course_id, name) values ('00000003', '00000000', '²âÊÔ´óÕÂ03');
insert into `chapter` (id, course_id, name) values ('00000004', '00000000', '²âÊÔ´óÕÂ04');
insert into `chapter` (id, course_id, name) values ('00000005', '00000000', '²âÊÔ´óÕÂ05');
insert into `chapter` (id, course_id, name) values ('00000006', '00000000', '²âÊÔ´óÕÂ06');
insert into `chapter` (id, course_id, name) values ('00000007', '00000000', '²âÊÔ´óÕÂ07');
insert into `chapter` (id, course_id, name) values ('00000008', '00000000', '²âÊÔ´óÕÂ08');
insert into `chapter` (id, course_id, name) values ('00000009', '00000000', '²âÊÔ´óÕÂ09');
insert into `chapter` (id, course_id, name) values ('00000010', '00000000', '²âÊÔ´óÕÂ10');
insert into `chapter` (id, course_id, name) values ('00000011', '00000000', '²âÊÔ´óÕÂ11');
insert into `chapter` (id, course_id, name) values ('00000012', '00000000', '²âÊÔ´óÕÂ12');
insert into `chapter` (id, course_id, name) values ('00000013', '00000000', '²âÊÔ´óÕÂ13');
insert into `chapter` (id, course_id, name) values ('00000014', '00000000', '²âÊÔ´óÕÂ14');



