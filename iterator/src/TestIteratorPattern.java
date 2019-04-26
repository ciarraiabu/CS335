public class TestIteratorPattern {

	public static void main(String[] args) {
		ShapeStorage storage = new ShapeStorage();
 		storage.addShape("Polygon");
		storage.addShape("Hexagon");
		storage.addShape("Circle");
		storage.addShape("Rectangle");
		storage.addShape("Square");
		
		ShapeIterator iterator = new ShapeIterator(storage.getShapes());
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("Apply removing while iterating...");
		iterator = new ShapeIterator(storage.getShapes());
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println("Does shape contain this shape?");
		iterator = new ShapeIterator(storage.getShapes());
		while(iterator.hasNext()){
			if(iterator.contains("Circle"))
			{
				System.out.print("This exists");
			}
			else
			{
				System.out.print("This does not exist");
			}
		
		}
		System.out.println("Reverse the shape object.");
		iterator = new ShapeIterator(storage.getShapes());
		while(iterator.hasPrev()){
			System.out.println(iterator.prev());
		}
		
	}

}

