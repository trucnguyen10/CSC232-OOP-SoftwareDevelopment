
import java.util.*;

public interface MovingAverages {

	static long min() { return StaticContainer.min(); }
	static long max() { return StaticContainer.max(); }

	void add(long N);
	double avg();

	static SimpleMovingAverage makeSimple(int N) {
		return new SimpleMovingAverage(N);
	}
	
	static CumulativeMovingAverage makeCumulative() {
		return new CumulativeMovingAverage();
	}

}