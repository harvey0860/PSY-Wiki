drop table if exists
create table `test` {
    `id` bigint not null comment `id`,
    `name` varchar(50) comment `name`,
    primary key (`id`),
} engine=innodb default charset=utf8mb4 comment=`test`;