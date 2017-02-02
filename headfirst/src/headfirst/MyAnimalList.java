package headfirst;

public class MyAnimalList {
	private static final int LIST_LENGTH = 5;
	private Animal[] animals = new Animal[LIST_LENGTH];
	private int nextIndex = 0;
	
	public void add(Animal a){
		if (nextIndex<animals.length) {
			animals[nextIndex] = a;
			nextIndex++;
		}
	}
}
