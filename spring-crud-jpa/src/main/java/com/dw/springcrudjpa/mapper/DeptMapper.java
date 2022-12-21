package com.dw.springcrudjpa.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.dw.springcrudjpa.vo.DeptVO;


@Mapper
public interface DeptMapper {
  
 List<DeptVO> selectDeptdw();

 DeptVO selectFindDeptdwNum(int class_num);
  // dept 추가
  int insertDeptdw(DeptVO vo);

  int deleteDept(int class_num);

  int updateDept(DeptVO vo);

}
