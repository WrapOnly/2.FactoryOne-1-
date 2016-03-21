package com.factory.one.factory;

import com.factory.one.cpu.WDCCPU;
import com.factory.one.iface.ICPU;
import com.factory.one.iface.ICPUFactory;

public class WDCFactory implements ICPUFactory {

	@Override
	public ICPU createCPU() {
		return new WDCCPU();
	}

}
