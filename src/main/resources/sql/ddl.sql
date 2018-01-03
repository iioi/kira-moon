CREATE TABLE sys_user(
id INT auto_increment PRIMARY KEY,
username VARCHAR(32),
password VARCHAR(32),
email VARCHAR(64),
telephone VARCHAR(16)
);

insert into sys_user(id,username,password) values(1,'admin','1234');

CREATE TABLE db_discuss_msg(
id INT PRIMARY KEY auto_increment,
content text,
shot_msg VARCHAR(255),
user_id INT,
parent_msg_id INT,
FOREIGN KEY(user_id) REFERENCES sys_user(id),
FOREIGN KEY(parent_msg_id) REFERENCES db_discuss_msg(id)
);

ALTER TABLE sys_user ADD (photo_url VARCHAR(255),introduction VARCHAR(128));

CREATE INDEX index_parent_msg_id ON db_discuss_msg(parent_msg_id);
