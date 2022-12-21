package com.dw.springcrudjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.dw.springcrudjpa.mapper.DeptMapper;
import com.dw.springcrudjpa.vo.DeptVO;

@Service
public class DeptService {

  @Autowired
  DeptMapper deptMapper;

  // dept 조회!
  public List<DeptVO> selectDeptdw() {
    return deptMapper.selectDeptdw();
  }
  
  public DeptVO selectFindDeptdwNum(int class_num) {
	  return deptMapper.selectFindDeptdwNum(class_num);
  }
// 추가
public int insertDeptdw(@RequestBody DeptVO vo) {
  return deptMapper.insertDeptdw(vo);
}

public int deleteDept(@PathVariable int class_num) {
  return deptMapper.deleteDept(class_num);
}

public int updateDept(@RequestBody DeptVO vo) {
  return deptMapper.updateDept(vo);
}
  
}
