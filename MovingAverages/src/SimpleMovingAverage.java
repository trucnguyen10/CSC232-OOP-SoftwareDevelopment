import java.util.ArrayList;

public class SimpleMovingAverage
	extends StaticContainer
	implements MovingAverages{
	
	ArrayList<Long> list;
	long size;
	
	public SimpleMovingAverage(long N) {
		this.list = new ArrayList<Long>();
		this.size = N;
	}
	public void add(long N) {
		if(!used) {
			minVal = N;
			maxVal = N;
			used = true;
		}
		else 
		{
			if (N < minVal) minVal = N;
			if (N > maxVal) maxVal = N;
		}
		list.add(N);
	}
	public long total(long count) {
		long sum = 0;
		int i = list.size() - 1;
		while(count != 0) {
			sum+= list.get(i);
			count--;
			i--;
		}
		return sum;
	}
	public double avg() {
		long count = list.size();
		if(count==0) return 0.0;
		else if(count > size) return ((double) total(size)) / size;
		else return ((double) total(count) / count);
	}
}
