package com.yusmith.poweredtorch;

import java.lang.Math;

public class Utils {
	Utils() {
	}
	
	public static int mod(int a,int b) {
		//	a = b * n + x
		//  x = a - b*n (x<b)
		if (b == 0) return 0;
		if (b<0) {
			return -mod(-a,-b);
		} else if(a<0) {
			while (Math.abs(a-b)>b)a+=b;
			return a;
		} else {
			while (a-b>=0) a-=b;
			return a;
		}
		
	}
}