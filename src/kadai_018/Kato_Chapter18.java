package kadai_018;

public abstract class Kato_Chapter18 {

	public String famiryName = "加藤";
	public String givenName;
	public String address = "東京都中野区●x";
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public void commonIntroduce() {
		System.out.println("名前は" + famiryName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	public abstract void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
}
