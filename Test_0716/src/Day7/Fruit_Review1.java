package Day7;

public class Fruit_Review1 {

	private String name;
	private int price;

	Fruit_Review1(String name, int price) {
		this.name = name;
		this.price = price;
	}

	void sell(int x) {
		System.out.println(x + " 개를 판매했습니다.");
	}

	public int getPrice() {
		return price;

	}

	public void setPrice(int p) {
		String status = "A";
		if (status.equals("A")) {

			if (p <= 0) {
				System.out.println(("가격이 0원 이하입니다. 다시확인해주세요"));
			} else {
				this.price = p;
				System.out.println(p+"원으로 가격이 수정되었습니다.");
			}

		}else {
			System.out.println("가격 수정권한이없습니다.");
		}
	}

}
