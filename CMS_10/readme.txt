后台管理demo
1.create table t_user(
	id int auto_increment primary key,
	username varchar(50),
	
	password varchar(50)
);

insert into t_user(username,password) values('admin','admin');


*创建channel表
 create table t_channel(
 	id varchar(40) primary key ,
 	channelname varchar(40),
 	description longtext
 );


*创建article的表 
create table t_article(
	id int primary key auto_increment,
	title varchar(200),
	source varchar(200),
	author varchar(200), 
	content longtext,
	create_time datetime,
	update_time datetime,
	publish_time datetime,
	channel_id varchar(40),
	is_header_line char(1),
	is_recommend char(1),
	click_score int,
	msg_count int
)
 
 这是验证码
 massage
 
 create table t_massage(
 	id int primary key auto_increment,
 	publisher varchar(40),
 	content longtext,
 	article_id int
 );
 
 
 
 
 