drop table if exists `chapter`;
create table `chapter`(
                          `id` char(8) not null comment 'ID',
                          `course_id` char(8) comment '�γ�id',
                          `name` varchar(50) comment '����',
                          primary key (`id`)
) engine=innodb default charset=utf8mb4 comment ='����';


insert into `chapter` (id, course_id, name) values ('00000001', '00000000', '���Դ���01');
insert into `chapter` (id, course_id, name) values ('00000002', '00000000', '���Դ���02');
insert into `chapter` (id, course_id, name) values ('00000003', '00000000', '���Դ���03');
insert into `chapter` (id, course_id, name) values ('00000004', '00000000', '���Դ���04');
insert into `chapter` (id, course_id, name) values ('00000005', '00000000', '���Դ���05');
insert into `chapter` (id, course_id, name) values ('00000006', '00000000', '���Դ���06');
insert into `chapter` (id, course_id, name) values ('00000007', '00000000', '���Դ���07');
insert into `chapter` (id, course_id, name) values ('00000008', '00000000', '���Դ���08');
insert into `chapter` (id, course_id, name) values ('00000009', '00000000', '���Դ���09');
insert into `chapter` (id, course_id, name) values ('00000010', '00000000', '���Դ���10');
insert into `chapter` (id, course_id, name) values ('00000011', '00000000', '���Դ���11');
insert into `chapter` (id, course_id, name) values ('00000012', '00000000', '���Դ���12');
insert into `chapter` (id, course_id, name) values ('00000013', '00000000', '���Դ���13');
insert into `chapter` (id, course_id, name) values ('00000014', '00000000', '���Դ���14');



