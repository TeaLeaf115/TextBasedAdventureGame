package data;

public class Choice {
	private String desc = """
			""";
	private String leadsTo;
	
	public Choice(String desc) {
		this.desc = desc;
		this.leadsTo = null;
	}
	
	public Choice(String desc, String leadsTo) {
		this.desc = desc;
		this.leadsTo = leadsTo;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getNextRoom() {
		return leadsTo;
	}
}
