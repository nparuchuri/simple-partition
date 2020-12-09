package com.nparuchuri.simplepartition;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 
 * @author nparuchuri
 *
 */
public class SimpleHashPartitioner {
	
	private static Logger logger = LogManager.getLogger(SimpleHashPartitioner.class);
	
	private int partitionCount;
	
	/**
	 * 
	 * @param partitionCount
	 */
	public SimpleHashPartitioner(int partitionCount) {
		this.partitionCount = partitionCount;
	}
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public int getPartition(String key) {
		int partition =  Math.floorMod(key.hashCode(), partitionCount);
		logger.info("Key = " + key + " Partition = " + partition);
		return partition;
	}

}
