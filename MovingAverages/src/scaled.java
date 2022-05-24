import java.util.ArrayList;

public class scaled
extends StaticContainer
	implements MovingAverages {
	double scal = 0 ;
	ArrayList<Long> list;

	public scaled(double s) {
		this.scal = s;
		this.list = new ArrayList<Long>();
	}

	public void add(long N) {
		if(!used) {
			minVal = (long)( N * scal);
			maxVal  = (long)( N * scal);
			used = true;
		}
		else {
			if((long)( N * scal) < minVal) minVal = (long)( N * scal) ;
			if((long)( N * scal) > maxVal) maxVal = (long)( N * scal) ;
		}
		list.add(N);
	}
	
	public long scale(long count) {
		long sum = 0;
		int i = list.size() - 1;
		while(count != 0) {
			sum+= (int) (list.get(i) * scal);
			count--;
			i--;
		}		
		return sum;
	}
	
	public double avg()
	{
		if(list.size() == 0) return 0.0;
		else return ((double) scale(list.size())) / list.size();
	}
}
