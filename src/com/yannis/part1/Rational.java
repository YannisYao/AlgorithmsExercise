package com.yannis.part1;
/**
 * ʵ��һ�����ɱ����������֧�ּӼ��˳�����
 * @author Administrator
 *
 */
public class Rational {
	private long numerator = 0L;//����
	private long denominator = 0L;//��ĸ
	public Rational(long numerator, long denominator) {
		super();
		if (denominator == 0) throw new ArithmeticException();
		//ȥ�����ӷ�ĸ��Լ��
		long divisor = gcd(numerator,denominator);
		if(Math.abs(divisor) > 1) {
			numerator /= divisor;
			denominator /= divisor;
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}
	/**
	 * ������b֮��
	 * @param b
	 * @return
	 */
	public Rational plus(Rational b) {
		return new Rational(this.numerator*b.denominator+b.numerator*this.denominator,this.denominator*b.denominator);
	}
	 
    /**
     * ������bֻ��
     * @param b
     * @return
     */
	public Rational minus(Rational b) {
		return new Rational(this.numerator*b.denominator-b.numerator*this.denominator,this.denominator*b.denominator);
	}
	/**
	 * ������b֮��
	 * @param b
	 * @return
	 */
	public Rational times(Rational b) {
		return new Rational(this.numerator*b.numerator,this.denominator*b.denominator);
	}
	
	/**
	 * ������b֮��
	 * @param b
	 * @return
	 */
	public Rational divides(Rational b) {
		return new Rational(this.numerator*b.denominator,this.denominator*b.numerator);
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
	 * ŷ������㷨�����Լ��
	 * @param p
	 * @param q
	 * @return
	 */
	public static long gcd(long p,long q) {
		if(q == 0) return p;
		long r = p % q;
		return gcd(q,r);
	}
}

