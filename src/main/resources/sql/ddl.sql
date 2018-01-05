-- 用户表
CREATE TABLE sys_user(
id INT auto_increment PRIMARY KEY,
user_no VARCHAR(32),
username VARCHAR(32),
password VARCHAR(128),
email VARCHAR(64),
telephone VARCHAR(16),
photo_url VARCHAR(255),
introduction VARCHAR(128),
status INT,
create_time datetime,
update_time datetime
);

-- 用户角色表（与用户表多对多）
CREATE TABLE sys_role(
id INT auto_increment PRIMARY KEY,
name VARCHAR(32),
ch_name VAR CHAR(32),
introduction VARCHAR(128)
);
CREATE TABLE sys_rf_user_role(
id INT auto_increment PRIMARY KEY,
user_id INT,
role_id INT,
FOREIGN KEY(user_id) REFERENCES sys_user(id),
FOREIGN KEY(role_id) REFERENCES sys_role(id)
);

-- 角色权限表（与角色表多对多）
CREATE TABLE sys_permission(
id INT auto_increment PRIMARY KEY,
name VARCHAR(32),
ch_name VARCHAR(32),
introdution VARCHAR(128)
);
CREATE TABLE sys_rf_role_permission(
id INT auto_increment PRIMARY KEY,
role_id INT,
permission_id INT,
FOREIGN KEY(role_id) REFERENCES sys_role(id),
FOREIGN KEY(permission_id) REFERENCES sys_permission(id)
);

-- 用户修改历史表
CREATE TABLE his_user(
id INT auto_increment PRIMARY KEY,
user_no VARCHAR(32),
username VARCHAR(32),
password VARCHAR(128),
email VARCHAR(64),
telephone VARCHAR(16),
photo_url VARCHAR(255),
introduction VARCHAR(128),
status INT,
create_time datetime,
link_user_id INT,
FOREIGN KEY(link_user_id) REFERENCES sys_user(id)
);
CREATE TABLE his_rf_user_role(
id INT auto_increment PRIMARY KEY,
user_id INT,
role_id INT,
FOREIGN KEY(user_id) REFERENCES his_user(id),
FOREIGN KEY(role_id) REFERENCES sys_role(id)
);

-- 话题表 即 讨论的大分类
CREATE TABLE db_topic(
id INT auto_increment PRIMARY KEY,
name VARCHAR(32),
moderator_id INT,
introduction VARCHAR(128),
detail text,
status INT,
create_date datetime,
update_date datetime,
parent_topic_id INT,
FOREIGN KEY(moderator_id) REFERENCES sys_user(id),
FOREIGN KEY(parent_topic_id) REFERENCES db_topic(id)
);
CREATE TABLE db_rf_topic_user(
id INT auto_increment PRIMARY KEY,
topic_id INT,
user_id INT,
FOREIGN KEY(topic_id) REFERENCES db_topic(id),
FOREIGN KEY(user_id) REFERENCES sys_user(id)
);

-- 话题信息修改历史表
CREATE TABLE his_topic(
id INT auto_increment PRIMARY KEY,
name VARCHAR(32),
moderator_id INT,
introduction VARCHAR(128),
detail text,
status INT,
create_date datetime,
parent_topic_id INT,
link_topic_id INT,
update_user_id INT,
FOREIGN KEY(parent_topic_id) REFERENCES db_topic(id),
FOREIGN KEY(moderator_id) REFERENCES sys_user(id),
FOREIGN KEY(update_user_id) REFERENCES sys_user(id)
);
CREATE TABLE his_rf_topic_user(
id INT auto_increment PRIMARY KEY,
topic_id INT,
user_id INT,
FOREIGN KEY(topic_id) REFERENCES his_topic(id),
FOREIGN KEY(user_id) REFERENCES sys_user(id)
);

-- 话题讨论表 即 话题下面的帖子
CREATE TABLE db_discussion(
id INT auto_increment PRIMARY KEY,
title VARCHAR(64),
content text,
create_time datetime,
status INT,
author_id INT,
topic_id INT,
parent_discussion_id INT,
FOREIGN KEY(author_id) REFERENCES sys_user(id),
FOREIGN KEY(topic_id) REFERENCES db_topic(id),
FOREIGN KEY(parent_discussion_id) REFERENCES db_discussion(id)
);

-- 讨论回复表 即 帖子的回复内容
CREATE TABLE db_discussion_reply(
id INT auto_increment PRIMARY KEY,
content VARCHAR(255),
create_time datetime,
status INT,
author_id INT,
discussion_id INT,
parent_reply_id INT,
FOREIGN KEY(author_id) REFERENCES sys_user(id),
FOREIGN KEY(discussion_id) REFERENCES db_discussion(id),
FOREIGN KEY(parent_reply_id) REFERENCES db_discussion_reply(id)
);


