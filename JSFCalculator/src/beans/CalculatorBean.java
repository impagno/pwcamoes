package beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CalculatorBean {
	private double num1;
	private double num2;
	private double oper;
	private boolean mostra = false;
	
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getOper() {
		return oper;
	}
	public void setOper(double oper) {
		this.oper = oper;
	}
	
	public boolean getMostra() {
		return mostra;
	}
	public void setMostra(boolean mostra) {
		this.mostra = mostra;
	}
	public void soma() {
		oper = num1 + num2;
		mostra = true;
	}
}
