package prob02;

public class Goods {
	private String[] infos;
	private String name;
	private int price;
	private int countStock;
	
	public Goods(String line) {
		infos = line.split(" ");
		name = infos[0];
		price = Integer.parseInt(infos[1]);
		countStock = Integer.parseInt(infos[2]);
	}
	
	public void showInfo() {
		System.out.println(name + " (가격: " + price + "원)이 " + countStock + "개 입고 되었습니다.");
	}
}
