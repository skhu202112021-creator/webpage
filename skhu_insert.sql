# members 테이블에 학생 계정 추가. (테스트용)
insert into students (name, department, login_id, login_pw)
values ('학생1', '소프트웨어학과', 'student1', 'password1');
insert into professors (name, department, login_id, login_pw)
values ('교수1', '소프트웨어학과', 'professor1', 'password1');
insert into subjects (name, department, professor, capacity)
values ('소프트웨어캡스톤디자인', '소프트웨어학과', 'professor1',100);
insert into departments (name)
values ('소프트웨어학과');
select * from students, professors, subjects, departments;
