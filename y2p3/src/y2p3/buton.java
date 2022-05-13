package y2p3;

import javax.swing.JButton;

public class buton extends JButton{
	private int row,col,value;
	private boolean stop;
	public buton(int row, int col) {
		this.row = row;
		this.col = col;
		this.stop=false;
	}	
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
