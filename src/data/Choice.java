package data;

public class Choice {
	private String desc = """
			""";
	private Room leadsTo;
	
	public Choice(String desc) {
		this.desc = desc;
		this.desc = null;
	}
	
	public Choice(String desc, Room leadsTo) {
		this.desc = desc;
		this.leadsTo = leadsTo;
	}
	
	public String getDesc() {
		return desc;
	}
}