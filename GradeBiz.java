package cn.jbit.pb.tangcco.grade.biz;

import java.util.List;

import cn.jbit.pb.tangcco.grade.entity.Grade;

public interface GradeBiz {

//6��java���� ������ѯ �������޸ġ�ɾ��
	
	//�����
	public List<Grade> queryAllGrade();
	//��һ�� ʵ��
	public Grade detailGrade(int gradeid);
	//��һ�� ���
	public int queryCountGrade();
	
	//�������޸ġ�ɾ�����ص��Ƿ���������int
	public int addGrade(Grade grade);
	public int updateGrade(Grade grade);
	public int deleteGrade(int gradeid);
}
