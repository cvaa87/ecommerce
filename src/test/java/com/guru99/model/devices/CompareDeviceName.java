package com.guru99.model.devices;

public class CompareDeviceName implements CompareDevice {
	
	public String devicename;
	
	public CompareDeviceName(String devicename)
	{
		this.devicename = devicename;
	}

	public boolean Compare(Devices device) {
		        System.out.println("Title"+ device.getDeviceName());
				return devicename.equals(device.getDeviceName());
	}
	
	

}
