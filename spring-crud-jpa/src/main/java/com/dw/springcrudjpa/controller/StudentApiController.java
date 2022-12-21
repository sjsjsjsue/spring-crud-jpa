package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.service.StudentService;
import com.dw.springcrudjpa.vo.StudentVO;

@RestController
public class StudentApiController {
  
  @Autowired
  StudentService studentService;

  // 조회
  @GetMapping("/api/v1/student")
  public List<StudentVO> callStudent() {
    return studentService.selectStudent();
  }
  
  @GetMapping("/api/v1/student/{student_num}")
  public StudentVO callStudentJoin(@PathVariable int student_num) {
    return studentService.selectFindStudentNum(student_num);
  }
  @PostMapping("/api/v1/student/join")
  public int insertStudent(@RequestBody StudentVO vo) {
	  return studentService.insertStudent(vo);
  }
  
  @PatchMapping("/api/v1/student")
  public int updateStudent(@RequestBody StudentVO vo) {
	  return studentService.updateStudent(vo);
  }
  
  @DeleteMapping("/api/v1/student/{student_num}")
  public int deleteStudent(@PathVariable int student_num) {
	  return studentService.deleteStudent(student_num);
  }
}
