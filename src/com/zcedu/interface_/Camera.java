package com.zcedu.interface_;

import java.util.Scanner;

public class Camera implements Usb{
	@Override
	public void usb() {
        String a = new Scanner(System.in).nextLine();
        System.out.println(a);
    }
}
