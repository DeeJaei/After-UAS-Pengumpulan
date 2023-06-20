public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		if(width <= 0 || height <= 0) {
			throw new IllegalArgumentException("width and height must be greater than zero");
		}
		
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int area() {
		return width * height;
	}
	
	public int perimeter() {
		return 2 * (width + height);
	}
	
	public void printAll(){
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				System.out.println("*");
			}
			System.out.println("");
		}
	}

	public void printBorder(){
		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				System.out.println(j == 0 || j == width-1 || i == 0 || i == height-1 ? "*" : " ");
			}
			System.out.println("");
		}
	}

	public void print(String style){
		style = style.toLowerCase();
		if(style.equals("FUll")){
			printAll();
		}else if(style.equals("Border")){
			printBorder();
		}else{
			System.out.println("Style Not Recognize");
		}
	}
}
