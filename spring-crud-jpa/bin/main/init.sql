-- dept_dw table 
CREATE TABLE dept_dw(
  class_num int(5) AUTO_INCREMENT PRIMARY KEY comment '과정 번호',
	class_name varchar(50) comment '과정명',
	start_dat varchar(50) comment '시작 날짜',
	end_date varchar(50) comment '끝나는 날짜',
  teacher varchar(50) comment "선생님 성함"
)