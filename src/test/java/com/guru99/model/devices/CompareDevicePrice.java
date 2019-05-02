package com.guru99.model.devices;

public class CompareDevicePrice implements CompareDevice{
	
	Double deviceprice;
	
	public CompareDevicePrice(Double deviceprice)
	{
		this.deviceprice = deviceprice;
	}

	public boolean Compare(Devices device) {
		
		return deviceprice == device.getDevicePrice();
	}

}
