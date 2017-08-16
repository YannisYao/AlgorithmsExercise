package com.yannis.part1;
/**
 * 实现一个不可变的有理数，支持加减乘除运算,使用断言检测溢出
 * @author Administrator
 *
 */
public class Rational {
	private long numerator = 0L;//分子
	private long denominator = 0L;//分母
	public Rational(long numerator, long denominator) {
		super();
		if (denominator == 0) throw new ArithmeticException();
		assertDef(numerator);
		assertDef(denominator);
		//去掉分子分母的约数
		long divisor = gcd(numerator,denominator);
		if(Math.abs(divisor) > 1) {
			numerator /= divisor;
			denominator /= divisor;
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}
	/**
	 * 该数与b之和
	 * @param b
	 * @return
	 */
	public Rational plus(Rational b) {
		return new Rational(assertDef(this.numerator*b.denominator+b.numerator*this.denominator),assertDef(this.denominator*b.denominator));
	}
	 
    /**
     * 该数与b只差
     * @param b
     * @return
     */
	public Rational minus(Rational b) {
		return new Rational(assertDef(this.numerator*b.denominator-b.numerator*this.denominator),assertDef(this.denominator*b.denominator));
	}
	/**
	 * 该数与b之积
	 * @param b
	 * @return
	 */
	public Rational times(Rational b) {
		return new Rational(assertDef(this.numerator*b.numerator),assertDef(this.denominator*b.denominator));
	}
	
	/**
	 * 该数与b之商
	 * @param b
	 * @return
	 */
	public Rational divides(Rational b) {
		return new Rational(assertDef(this.numerator*b.denominator),(this.denominator*b.numerator));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rational other = (Rational) obj;
		if (denominator != other.denominator)
			return false;
		if (numerator != other.numerator)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Rational [numerator=" + numerator + ", denominator=" + denominator + "]"+"->result:"+(double)numerator/(double)denominator;
	}
	/**
	 * 欧几里得算法求最大公约数
	 * @param p
	 * @param q
	 * @return
	 */
	public static long gcd(long p,long q) {
		if(q == 0) return p;
		long r = p % q;
		return gcd(q,r);
	}
	
	public long assertDef(long num) {
		assert (num <= Long.MAX_VALUE || num >= Long.MIN_VALUE):"数据溢出！";
		return num;
	}
}

