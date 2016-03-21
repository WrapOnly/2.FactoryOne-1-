package com.factory.one.cpu;

import com.factory.one.factory.WDCFactory;
import com.factory.one.iface.ICPU;
import com.factory.one.iface.ICPUFactory;

public class CPUCenter {

	public static void main(String[] args) {
		ICPUFactory cpu = new WDCFactory();
		ICPU ic = cpu.createCPU();
		ic.workWithCPU();
	}

}
