package com.dw.springcrudjpa.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.springcrudjpa.vo.StudentVO;

@Mapper
public interface StudentMapper {
   
  List<StudentVO> selectStudent();
  
  StudentVO selectFindStudentNum(int student_num);
  
 int insertStudent(StudentVO vo);
  
 int updateStudent(StudentVO vo);
 
 int deleteStudent(int student_num);
}
