
public class Main {

	public static void main(String[] args) {
//		  MovingAverages cma = new CumulativeMovingAverage();
//		  MovingAverages sma10 = new SimpleMovingAverage(10);
//	 	  MovingAverages sma1 = new SimpleMovingAverage(1);
//		  MovingAverages cma2 = new CumulativeMovingAverage();
          MovingAverages sca = new scaled(2.5);
          
//		  for (int i = 1; i <= 100; i++) {
//		    cma.add(i);
//		    sma10.add(i);
//		    sma1.add(i);
//		  }

//		  System.out.println(cma.avg());
//		  System.out.println(sma10.avg());
//		  System.out.println(sma1.avg());
//		  System.out.println(MovingAverages.min());
//		  System.out.println(MovingAverages.max());
//
//	      sma1.add(500);
//		  System.out.println(sma1.avg());
//		  System.out.println(MovingAverages.max());
//		  System.out.println(cma2.avg());

		  for (int i = 1; i <= 4 ; i++) {
			    sca.add(i);
			  }

    System.out.println(sca.avg());
	System.out.println(MovingAverages.min());
    System.out.println(MovingAverages.max());
}
}
