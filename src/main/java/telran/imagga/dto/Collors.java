package telran.imagga.dto;

import java.util.Arrays;

public class Collors {
	ResultDto[]results;
	ErrorsDto []unsuccessful;

	public ResultDto[] getResults() {
		return results;
	}

	@Override
	public String toString() {
		if(results[0]== null) {
			return "unsuccessful= " + unsuccessful[0];
		}else {
		return "Collors [results=" + Arrays.toString(results);
	}
	}
	
	

}
