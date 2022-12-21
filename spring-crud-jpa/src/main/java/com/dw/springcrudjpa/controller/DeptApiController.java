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

import com.dw.springcrudjpa.service.DeptService;
import com.dw.springcrudjpa.vo.DeptVO;
import com.dw.springcrudjpa.vo.StudentVO;


@RestController
public class DeptApiController {
  
  @Autowired
  DeptService deptService;

  // 조회
  @GetMapping("/api/v1/deptdw")
  public List<DeptVO> callDept() {
    return deptService.selectDeptdw();
  }

  @GetMapping("/api/v1/deptdw/{class_num}")
  public DeptVO callDept(@PathVariable int class_num) {
	  return deptService.selectFindDeptdwNum(class_num);
  }
  // 추가
  @PostMapping("/api/v1/deptdw/join")
  public int insertDeptdw(@RequestBody DeptVO vo) {
    return deptService.insertDeptdw(vo);
  }
  // 삭제
  @DeleteMapping("/api/v1/deptdw/{class_num}")
  public int deleteDept(@PathVariable int class_num) {
    return deptService.deleteDept(class_num);
  }

  // 수정
  @PatchMapping("/api/v1/deptdw")
  public int updateDept(@RequestBody StudentVO vo) {
    return deptService.updateDept(vo);
  }
}
