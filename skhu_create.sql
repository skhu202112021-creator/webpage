# 스키마 생성
create schema `skhu`;
# 스키마 선택
use skhu;
# members 테이블 생성
create table students (
	/* auto_increment는 행 번호 순서대로 숫자를 자동으로 증가시킨다.
    comment는 주석. primary key는 기본키.*/
	id int auto_increment comment '아이디' primary key,
    # varchar는 문자열 타입. not null: 비어있으면 안됨.
	name varchar(50) not null comment '학생 이름',
    department varchar(50) not null comment '학과',
    login_id varchar(50) not null comment '로그인 아이디',
    login_pw varchar(100) not null comment '로그인 패스워드',
    # 생성 날짜를 기록하는 명령어이다.
    created datetime default current_timestamp() not null comment '생성 일시',
    /* 	constraint: 제약 조건.
		unique: 
        1.중복 금지.
		2.null값 허용.
		3.여러 개 생성 가능.
    */
    constraint students_uk unique (login_id)
) comment '학생';

create table professors (
	id int auto_increment comment '아이디' primary key,
	name varchar(50) not null comment '교수명',
    department varchar(50) not null comment '학과',
    login_id varchar(50) not null comment '로그인 아이디',
    login_pw varchar(100) not null comment '로그인 패스워드',
    created datetime default current_timestamp() not null comment '생성 일시'
) comment '교수';

create table subjects (
	id int auto_increment comment '아이디' primary key,
	name varchar(50) not null comment '과목명',
    department varchar(50) not null comment '학과',
    professor varchar(50) not null comment '담당 교수',
    capacity int not null comment '정원'
) comment '과목';

create table departments (
	id int auto_increment comment '아이디' primary key,
	name varchar(50) not null comment '학과명'
) comment '학과';
    