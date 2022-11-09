//	Parent Class

package org.inh.single.ex1;

//	extends used to call the parent class
public class Desktop  extends Computer{

	public void desktopSize() {
		System.out.println("Desktop size: 21 inch");

	}
	
	public static void main(String[] args) {
		Desktop d =new Desktop();
		d.computerModel();
		d.desktopSize();
	}
}
