package model;

public class Job {
	private String jobId;//jobid
	private String jobName;//ְλ����
	private String companyName;//��˾����
	private String salary;//н��
	private String place;//��˾���ڵ�
	private String welfare;//����
	private String experience;//����Ҫ��
	private String degree;//ѧ��Ҫ��
	private String type;//���ͷ���
	private String url;//��ַ
	
	
	public Job() {
		super();
	}
	
	
	public Job(String jobId, String jobName, String companyName, String salary, String place, String welfare,
			String experience, String degree, String type, String url) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.companyName = companyName;
		this.salary = salary;
		this.place = place;
		this.welfare = welfare;
		this.experience = experience;
		this.degree = degree;
		this.type = type;
		this.url = url;
	}


	public String getJobId() {
		return jobId;
	}


	public void setJobId(String jobId) {
		this.jobId = jobId;
	}


	public String getJobName() {
		return jobName;
	}


	public void setJobName(String jobName) {
		this.jobName = jobName;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public String getWelfare() {
		return welfare;
	}


	public void setWelfare(String welfare) {
		this.welfare = welfare;
	}


	public String getExperience() {
		return experience;
	}


	public void setExperience(String experience) {
		this.experience = experience;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	
	
	
}
