package telran.imagga.dto;

public class Elements {
	String closest_palette_color_parent;
	String closest_palette_color;
	Double percentage;
	Double percent;
	
	public String getClosest_palette_color_parent() {
		return closest_palette_color_parent;
	}
	public String getClosest_palette_color() {
		return closest_palette_color;
	}
	public Double getPercentage() {
		return percentage;
	}
	public Double getPercent() {
		return percent;
	}
	@Override
	public String toString() {
		if(percentage == null) {
			return "\n"+"color_parent=" + closest_palette_color_parent + ", palette_color="
					+ closest_palette_color + ", percent=" + percent + "]";
		}else {
		return "\n"+"color_parent=" + closest_palette_color_parent + ", palette_color="
				+ closest_palette_color + ", percentage=" + percentage +"]";
	}
	}
	
	
	

}
