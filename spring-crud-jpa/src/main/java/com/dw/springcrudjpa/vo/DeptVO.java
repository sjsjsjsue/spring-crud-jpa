package com.dw.springcrudjpa.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DeptVO {
  
  private int class_num; // 과정번호
  private String class_name; // 과정명
  private String classroom; // 과정호실
  private String start_dat; // 시작 날짜
  private String end_date; //끝나는 날짜
  private String teacher; // 선생님

}
