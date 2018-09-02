package telran.imagga.dto;

import java.util.Arrays;

public class ResponseDto {
	Elements [] background_colors;
	Elements [] image_colors;
	Elements [] foreground_colors;
	
	public Elements[] getBackground_colors() {
		return background_colors;
	}
	public Elements[] getImage_colors() {
		return image_colors;
	}
	public Elements[] getForeground_colors() {
		return foreground_colors;
	}
	@Override
	public String toString() {
		return Arrays.toString(background_colors)
				+ Arrays.toString(image_colors) + Arrays.toString(foreground_colors);
	}
	
	

}
