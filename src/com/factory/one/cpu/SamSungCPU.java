package com.factory.one.cpu;

import com.factory.one.iface.ICPU;

public class SamSungCPU implements ICPU {

	@Override
	public void workWithCPU() {
		System.out.println("work with samsung cpu.");
	}

}
