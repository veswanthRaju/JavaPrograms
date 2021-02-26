import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedNumbers {

	public static void main(String[] args) {

		List<Integer> inputNumbers = Arrays.asList(3, 5, 6, 3, 4, 5, 6, 8, 6, 3, 5, 8, 9, 2);

		Map<Integer, List<Integer>> numbersMap = new HashMap<Integer, List<Integer>>();
		List<Integer> numbersList = null;

		for (int i = 0; i < inputNumbers.size(); i++) {

			if (numbersMap.containsKey(inputNumbers.get(i))) {
				numbersList = numbersMap.get(inputNumbers.get(i));
			} else {
				numbersList = new ArrayList<Integer>();
			}
			numbersList.add(inputNumbers.get(i));
			numbersMap.put(inputNumbers.get(i), numbersList);
		}

		Set<Entry<Integer, List<Integer>>> entrySet = numbersMap.entrySet();
		List<Integer> outputNumbers = new ArrayList<Integer>();
		for (Entry<Integer, List<Integer>> i : entrySet) {
			if (i.getValue().size() > 1) {
				outputNumbers.add(i.getKey());
			}
		}

		System.out.println(outputNumbers);
	}
}
