
public class CumulativeMovingAverage
	extends StaticContainer
	implements MovingAverages {

	long sum, size;
	
	public CumulativeMovingAverage() {
		this.sum = 0;
		this.size = 0;
	}
	public void add(long N) {
		if(!used) {
			minVal = N;
			maxVal  = N;
			used = true;
		}
		else {
			if(N < minVal) minVal = N;
			if(N > maxVal) maxVal = N;
		}
		sum+=N;
		size++;
	}
	public double avg()
	{
		if(size == 0) return 0.0;
		else return ((double) sum) / size;
	}

}
