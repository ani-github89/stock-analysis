package client;

import java.io.IOException;

import aggregators.*;

public class AggregatorApp {




	public static void main(String[] args) throws IOException {

		MinAggregator agg = new MinAggregator();
		MaxAggregator aggMax = new MaxAggregator();
		MeanAggregator aggMean = new MeanAggregator();
		AggregatorProcessor<MinAggregator> aggsProcessor = new AggregatorProcessor<MinAggregator>(agg, "table.csv");
		double value = aggsProcessor.runAggregator(1);
		System.out.println("Min Aggregator=> "+value);

		AggregatorProcessor<MaxAggregator> aggsProcessorMax = new AggregatorProcessor<MaxAggregator>(aggMax, "table.csv");
		double valueMax = aggsProcessorMax.runAggregator(1);
		System.out.println("Max Aggregator=> "+valueMax);

		AggregatorProcessor<MeanAggregator> aggsProcessorMean = new AggregatorProcessor<MeanAggregator>(aggMean, "table.csv");
		double valueMean = aggsProcessorMean.runAggregator(1);
		System.out.println("Mean Aggregator=> "+valueMean);

	}

}
