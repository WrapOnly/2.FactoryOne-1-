package com.factory.one.factory;

import com.factory.one.cpu.SamSungCPU;
import com.factory.one.iface.ICPU;
import com.factory.one.iface.ICPUFactory;

public class SamFactory implements ICPUFactory {

	@Override
	public ICPU createCPU() {
		return new SamSungCPU();
	}

}
