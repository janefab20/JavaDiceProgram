package dice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Images{
	private String imgName;
	private BufferedImage img;
	private ImageIcon image;
	
	public ImageIcon getImage(int number){
		image = null;
		img = null;
		switch(number){
		case 1:
			imgName = "one.jpg";
			break;
		case 2:
			imgName = "two.jpg";
			break;
		case 3:
			imgName = "three.jpg";
			break;
		case 4:
			imgName = "four.jpg";
			break;
		case 5:
			imgName = "five.jpg";
			break;
		case 6:
			imgName = "six.jpg";
			break;
		default:
			break;		
		}
		
		try {
		    img = ImageIO.read(new File("C:\\Users\\USER\\Documents\\java\\dice\\src\\dice\\"+imgName));
		} catch (IOException e) {
		}
		image = new ImageIcon(img);
		
		return image;
		
	}

	public int getWidth(){
		return img.getWidth();
	}
	
	public int getHeight(){
		return img.getHeight();
	}
}
