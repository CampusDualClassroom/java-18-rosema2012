package com.campusdual.classroom;

import com.campusdual.util.Utils;
import jdk.jshell.execution.Util;

import javax.swing.text.Utilities;

public class Exercise18 {

	public static void main(String[] args) {
		int [] nums = createAndInitializeArray(7);
		showInlineArray(nums);
	}

	public static int[] createAndInitializeArray(int num){
		int [] numeros = new int[num];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (i+1);
		}
		return numeros;
	}

	public static void showInlineArray(int [] nums){
		for (int i = 0; i < nums.length; i++) {
			if(i!=nums.length-1) {
				System.out.print(nums[i] + " ");
			}else{
				System.out.println(nums[i]);
			}
		}
	}


}
