SET CHARSET UTF8;
CREATE DATABASE IF NOT EXISTS sample;

create table IF not EXISTS member(
  member_id INT(20) unsigned AUTO_INCREMENT PRIMARY KEY,
  member_name varchar(100),
  member_rank CHAR(6)
);

create table IF not EXISTS companies(
  company_name varchar(100),
  company_alias varchar(100)
);

create table IF not EXISTS project(
  project_name varchar(100),
  period_form DATE,
  period_to DATE
);

INSERT INTO member VALUES (1,'山田太郎','A'),(2,'鈴木次郎','B'),(3,'田中花子','B');

INSERT INTO companies VALUES ('XXX株式会社','X'),('YYY.Inc','YYY'),('ZZZグループ','ZG');

INSERT INTO project VALUES
  ('A案件','2022-07-01','2022-07-31'),
  ('B案件','2022-07-01','2022-09-20'),
  ('C案件','2022-08-10','2022-09-30');