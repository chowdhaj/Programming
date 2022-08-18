package cas.lab7.wt;

import java.io.BufferedInputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import cas.lab7.wt.*;

public class Job implements Comparable<Job> {

	private final String jobName;
	private final double processingTime;
	
	public Job(String jobName, double processingTime) {
		if (processingTime < 0) {
			throw new IllegalArgumentException();
		}
		this.jobName = jobName;
		this.processingTime = processingTime;
	}
	
	public String getJobName() {
		return this.jobName;
	}
	
	public double getProcessingTime() {
		return this.processingTime;
	}
	
	@Override
	public int compareTo(Job that) {
		// TODO Auto-generated method stub
		if (this.processingTime < that.processingTime) {
			return -1;
		} else if (this.processingTime > that.processingTime) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public String toString() {
		return String.format("%s %.1f", this.jobName, this.processingTime);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (new BufferedInputStream(System.in));
		PrintWriter output = new PrintWriter(new OutputStreamWriter(System.out));
		int size = input.nextInt();
		Job[] jobs = new Job[size];
		for (int i = 0; i < size; i++) {
			String jobName = input.next();
			double jobDuration = input.nextDouble();
			jobs[i] = new Job(jobName, jobDuration);
		}
		
		Arrays.sort(jobs);
		//SelectionSort.sort(jobs);
		output.println();
		output.println("Sorted Jobs");
		for(int i = 0; i < size; i++) {
			output.println(jobs[i] + " ");
		}
		output.println();
		
		// No mem leak
		input.close();
		output.close();
	}
	
	/*
	 * We do not want to make the Job ADT prone to change because:
	 *     - Immutable data does not have side effects, so we can argue about its state
	 *     - There is no reason to change the data or measurements of anything. This is
	 *           because when testing code for runtime, the test should be conducted 
	 *           multiple times and then averaged out over the number of trials.
	 *     - Allowing the values to change leaves the data vulnerable for tampering. 
	 * 
	 * Since Java SE 7, Java uses the following sorting algorithms:
	 *     - TimSort (MergeSort) For Object Arrays
	 *     - Dual-Pivot QuickSort For Primitive Arrays 
	 *     
	 * We can sort the Jobs array with our recently implemented algorithms.
	 * For example:
	 *     SelectionSort.sort(jobs);
	 *     BubbleSort.sort(jobs);
	 *     ShellSort.sort(jobs);
	 *     
	 * In terms of running time, ShellSort would perform better.  
	 */
}