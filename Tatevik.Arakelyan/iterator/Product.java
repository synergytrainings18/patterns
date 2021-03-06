package iterator;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * @author by Tatevik.Arakelyan on 6/19/2018.
 */
public class Product implements Iterable<Date> {
	private ArrayList<Date> productsDateList;

	@Nonnull
	@Override
	public Iterator<Date> iterator() {
		return new SpoiledProductIterator();
	}

	private class SpoiledProductIterator implements Iterator<Date> {
		private int testedDatePosition = 0;

		@Override
		public boolean hasNext() {
			int allProductsCount = productsDateList.size();
			for (; testedDatePosition < allProductsCount; testedDatePosition++) {
				Date currentDate = new Date();
				if (productsDateList.get(testedDatePosition).getTime() < currentDate.getTime()) {
					return true;
				}
			}
			return false;

		}

		@Override
		public Date next() {
			if (productsDateList.size() == 0) {
				return null;
			}
			return productsDateList.get(testedDatePosition);
		}

		@Override
		public void remove() {
			productsDateList.remove(testedDatePosition);
		}
	}

	public static void main(String[] args) {
		ArrayList<Date> productsDate = new ArrayList<>();

		productsDate.add(new Date(37837878673783L)); // 3169 year
		productsDate.add(new Date(785776878L)); // 1970 year
		productsDate.add(new Date(75887567867L)); // 1972 year

		Product product = new Product();
		Iterator iterator = product.iterator();
		product.productsDateList = productsDate;

		productsDate.forEach(date -> System.out.print("Before remove: " + date + '\n'));

		while (iterator.hasNext()) {
			System.out.print("Removed: " + iterator.next() + "\n");
			iterator.remove();
		}

		productsDate.forEach(date -> System.out.print("After remove: " + date + '\n'));


	}
}




