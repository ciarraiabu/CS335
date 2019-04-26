import java.util.Iterator;

public class ShapeIterator implements Iterator<Shape>{

	private Shape [] shapes;
	int pos;
	int pos1;
	
	public ShapeIterator(Shape []shapes){
		this.shapes = shapes;
		this.pos1=shapes.length-1;
	}
	@Override
	public boolean hasNext() {
		if(pos >= shapes.length || shapes[pos] == null)
			return false;
		return true;
	}
	
	public boolean hasPrev() {
		if(pos1 < 0 || shapes[pos1] == null)
			return false;
		return true;
	}

	@Override
	public Shape next() {
		return shapes[pos++];
	}

	@Override
	public void remove() {
		if(pos <=0 )
			throw new IllegalStateException("Illegal position");
		if(shapes[pos-1] !=null){
			for (int i= pos-1; i<(shapes.length-1);i++){
				shapes[i] = shapes[i+1];
			}
			shapes[shapes.length-1] = null;
		}
	}

	public boolean contains(String shape)
	{
		if(shape==null) return false;
		
		if(shape.length()<=0) return false;
		for(int i=0; i<shapes.length; i++)
		{
			if(shapes[i]!=null)
			{
			if(shapes[i].getName().equals(shape))
			{
				return true;
			}
			}
		}
		return false;
	}
	
	public Shape prev()
	{
		return shapes[pos1--];
	}

	
}
