import java.util.HashMap;

public class TrainScheduler {
	
	static final HashMap<Integer, Train> trainList;
	static
	{
		trainList = new HashMap<Integer,Train>();
	}

	public static synchronized HashMap<Integer, Train> getTrainList() {
		return trainList;
	}

	public static synchronized void setTrainList(Train train) {
		
		trainList.put(train.getTrainNumber(), train);
	}
}
