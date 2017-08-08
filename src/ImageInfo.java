import java.util.List;
import java.util.ArrayList;

import javax.swing.JButton;

public class ImageInfo {
	
	private String imageName;
	private int intPosition;
	private int[][] coordinates = new int[4][2];
	private List<JButton> options = new ArrayList<>();
	
	public String getImageName(){
		return this.imageName;
	}
	
	public int getIntPosition(){
		return this.intPosition;
	}
	
	public int[][] getCoordinates(){
		return this.coordinates;
	}
	
	public List<JButton> getOptions(){
		return this.options;
	}
	
	public int getNumOptions(){
		return this.options.size();
	}
	
	public void setImageName(String name){
		this.imageName = name;
	}
	
	public void setIntPosition(int intp){
		this.intPosition = intp;
	}
	
	public void setCoordinates(int TLx, int TLy, int TRx, int TRy, int BLx, int BLy, int BRx, int BRy){
		this.coordinates[0][0] = TLx;
		this.coordinates[0][1] = TLy;
		this.coordinates[1][0] = TRx;
		this.coordinates[1][1] = TRy;
		this.coordinates[2][0] = BLx;
		this.coordinates[2][1] = BLy;
		this.coordinates[3][0] = BRx;
		this.coordinates[3][1] = BRy;
	}
	
	public void setOptions(JButton ...buttons ){
		for(JButton myButtons: buttons){
			options.add(myButtons);
		}
	}
}
