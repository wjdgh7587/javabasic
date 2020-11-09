package kr.or.ksmart;

//Character Info
interface Job{
	public int getJobNumber();
	public String getJobName();
}
interface Nickname{
	public String getNickname();
}

//Server Info

interface Server{
	public String getServerName();
	public int getServerNumber();
}
class Server1 implements Server{
	private final String serverName;
	private final int serverNumber;
	
	public Server1(String a, int b) {
		this.serverName = a;;
		this.serverNumber = b;
	}

	@Override
	public String getServerName() {
		// TODO Auto-generated method stub
		return serverName;
	}

	@Override
	public int getServerNumber() {
		// TODO Auto-generated method stub
		return serverNumber;
	}
	
}

class Character1 extends Server1 implements Job,Nickname{
	
	public Character1(String a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}
	private String nickName;
	private int jobNumber;
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public void setJobNumber(int jobNumber) {
		this.jobNumber = jobNumber;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	private String jobName;
	

	
	@Override
	public String getNickname() {
		// TODO Auto-generated method stub
		return nickName;
	}

	@Override
	public int getJobNumber() {
		// TODO Auto-generated method stub
		return jobNumber;
	}

	@Override
	public String getJobName() {
		// TODO Auto-generated method stub
		return jobName;
	}
	@Override
	public String getServerName() {
		// TODO Auto-generated method stub
		return super.getServerName();
	}
	@Override
	public int getServerNumber() {
		// TODO Auto-generated method stub
		return super.getServerNumber();
	}
	
}

public class JavaPracticeGame {
	public static void main(String[] args) {
		
		Character1 char1 = new Character1("test",5);
		Job jobName1 = char1;
		Nickname nickname1 = char1;
		
		char1.setJobName("야만용사");
		char1.setJobNumber(1);
		char1.setNickName("야만용사시리즈");
		System.out.println(char1.getJobName());
		System.out.println(char1.getJobNumber());
		System.out.println(char1.getNickname());
		System.out.println(char1.getServerName());
		System.out.println(char1.getServerNumber());
	
		
	}
	
	
	

}
