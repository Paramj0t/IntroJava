package collectionFramework.mapInterfaces;

import java.util.*;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pen pen1 = new Pen(10, "blue");
			Pen pen2 = new Pen(10, "blue");
			System.out.println(pen1==pen2);
			System.out.println(pen1.equals(pen2)); 
			
			Set<Pen> pens = new HashSet<>();
			pens.add(pen1);
			pens.add(pen2);
			System.out.println(pens);
	}

}

class Pen{
	int price;
	String color;
	
	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Pen that = (Pen) obj;
//		boolean isEqual = this.price == that.price && this.color.equals(that.color);
//		return isEqual;
//	}
//	
//	@Override 
//	public int hashCode() {
//		return price + color.hashCode();
//	}
}