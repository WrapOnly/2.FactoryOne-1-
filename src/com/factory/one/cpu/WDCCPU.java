package com.factory.one.cpu;

import com.factory.one.iface.ICPU;

public class WDCCPU implements ICPU {

	@Override
	public void workWithCPU() {
		System.out.println("work with wdc cpu.");
	}

}
