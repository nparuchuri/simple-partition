package com.nparuchuri.simplepartition;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SimpleHashPartitionerTest {

	
	@Test
	public void test_getPartition() {
		
		SimpleHashPartitioner shp = new SimpleHashPartitioner(10);
		
		int partition = shp.getPartition("ACCOUNT1");
		
		assertEquals(shp.getPartition("ACCOUNT1"), partition);		
		
		
	}
}
