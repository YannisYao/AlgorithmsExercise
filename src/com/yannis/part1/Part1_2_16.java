package com.yannis.part1;

import com.yannis.stdio.StdOut;

public class Part1_2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rational rational1 = new Rational(4,7);
		Rational rational2 = new Rational(8,21);
		
		StdOut.println(rational1.equals(rational2));
		StdOut.println(rational1.plus(rational2));
		StdOut.println(rational1.minus(rational2));
		StdOut.println(rational1.divides(rational2));
		StdOut.println(rational1.times(rational2));
		StdOut.println(""+rational1+rational2);

	}

}
