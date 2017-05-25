package cn.jbit.pb.tangcco.grade.biz;

import java.util.List;

import cn.jbit.pb.tangcco.grade.entity.Grade;

public interface GradeBiz {

//6个java方法 三个查询 新增、修改、删除
	
	//查多条
	public List<Grade> queryAllGrade();
	//查一条 实体
	public Grade detailGrade(int gradeid);
	//查一条 求和
	public int queryCountGrade();
	
	//新增、修改、删除的特点是返回类型是int
	public int addGrade(Grade grade);
	public int updateGrade(Grade grade);
	public int deleteGrade(int gradeid);
}
