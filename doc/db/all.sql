drop table if exists `chapter`;
create table `chapter`(
                          `id` char(8) not null comment 'ID',
                          `course_id` char(8) comment '�γ�id',
                          `name` varchar(50) comment '����',
                          primary key (`id`)
) engine=innodb default charset=utf8mb4 comment ='����';

insert into `chapter` (id, course_id, name) values ('00000000','00000000','���Դ���һ');
insert into `chapter` (id, course_id, name) values ('00000001','00000000','���Դ��¶�');


