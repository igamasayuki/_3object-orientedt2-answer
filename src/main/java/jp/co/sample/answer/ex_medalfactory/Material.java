package jp.co.sample.answer.ex_medalfactory;

/**
 * 材料を表すクラス.
 * 
 * @author igamasayuki
 */
public class Material {
	/** 材料名 */
	private String name;
	/** コスト(原価) */
	private int cost;

	public Material() {
	}

	public Material(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Material [name=" + name + ", cost=" + cost + "]";
	}

}