package com.dw.springcrudjpa.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentVO extends DeptVO {
  private int student_num; // 학생 번호
  private String student_name; // 학생이름
  private int age; // 학생 나이
  private String phone_num; // 학생 연락처
  private String addr; // 주소
  private int class_num; // 과정 번호

}
