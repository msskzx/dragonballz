package dragonball.model.exceptions;

@SuppressWarnings("serial")
public class MapIndexOutOfBoundsException extends IndexOutOfBoundsException {
	private int row;
	private int column;

	public MapIndexOutOfBoundsException(int row, int column) {
		super("can't move to row: "+row+ "column: "+column+"");
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

}
