package org.phone;

public class PhoneInfo {

	private void phoneName() {
		System.out.println("Phone Name: One Plus");
	}
	private void phoneEminumber() {
		System.out.println("EMI Number: 03112244567");
	}
	private void Camera() {
		System.out.println("Camera: 8 Pixel");
	}

	private void Storage() {
		System.out.println("Storage: 128 GB");
	}
	private void osName() {
		System.out.println("OS Name: Android");
	}
public static void main(String[] args) {
	PhoneInfo p =new PhoneInfo();
	p.phoneName();
	p.phoneEminumber();
	p.Camera();
	p.Storage();
	p.osName();
}


}





