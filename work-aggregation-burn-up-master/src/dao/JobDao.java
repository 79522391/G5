package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Job;
import util.StringUtil;

public interface JobDao {
	public int JobAdd(Connection con,String jobID,String userId)throws Exception;
	
	public ResultSet searchKey(Connection con/*,PageBean pageBean*/,Job job)throws Exception;
	public ResultSet searchAll(Connection con,Job job)throws Exception;
	public ResultSet searchJobName(Connection con/*,PageBean pageBean*/,Job job)throws Exception;
	/*��˾ɸѡ*/
	public ResultSet searchCompanyName(Connection con/*,PageBean pageBean*/,Job job)throws Exception;
	/*н��ɸѡ*/
	public ResultSet searchSalary(Connection con/*,PageBean pageBean*/,Job job)throws Exception;
	/*����ɸѡ*/
	public ResultSet searchPlace(Connection con/*,PageBean pageBean*/,Job job)throws Exception;
	/*����ɸѡ*/
	public ResultSet searchExperience(Connection con/*,PageBean pageBean*/,Job job)throws Exception;
	/*ѧ��Ҫ��ɸѡ*/
	public ResultSet searchDegree(Connection con/*,PageBean pageBean*/,Job job)throws Exception;
	/*ְλ����ɸѡ*/
	public ResultSet searchType(Connection con/*,PageBean pageBean*/,Job job)throws Exception;
}
