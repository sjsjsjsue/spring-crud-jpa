package com.dw.springcrudjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dw.springcrudjpa.mapper.StudentMapper;
import com.dw.springcrudjpa.vo.StudentVO;

@Service
public class StudentService {

  @Autowired
  StudentMapper studentMapper;

  public List<StudentVO> selectStudent() {
    return studentMapper.selectStudent();
  }
  
  public StudentVO selectFindStudentNum(int student_num) {
	  
	  return studentMapper.selectFindStudentNum(student_num);
  }
  
  public int insertStudent(StudentVO vo) {
	  return studentMapper.insertStudent(vo);
  }
  
  public int updateStudent(StudentVO vo) {
	  return studentMapper.updateStudent(vo);
  }
  
  public int deleteStudent(int student_num) {
	  
	  return studentMapper.deleteStudent(student_num);
  }
}
