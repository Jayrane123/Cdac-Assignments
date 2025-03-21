package Assignment4;

public class ComplexD {
	 private double real, imag;
	 ComplexD(){
			this.imag=0;
			this.real=0;
		}
	ComplexD(double real,double imag){
		this.real=real;
		this.imag=imag;
	}
	ComplexD(double real){
		this.real=real;
		this.imag=0;

	}
	
	public ComplexD add(ComplexD c) {
        return new ComplexD(this.real + c.real, this.imag + c.imag);
    }
	public ComplexD mul(ComplexD c) {
		double realNum=(this.real*c.real)-(this.imag * c.imag);
		double imagNum=(this.real*c.imag)+(this.imag * c.real);
		return new ComplexD(realNum,imagNum);
	}
	void display() {
		System.out.println(+real+(imag >= 0 ? "+" :"-" )+ Math.abs(imag)+"i");
		
	}
	public static void main(String[] args) {
		ComplexD n=new ComplexD(3,-3);
		ComplexD n1=new ComplexD(4,-2);
		
		ComplexD sum = n.add(n1);
		System.out.print("Sum: ");
		sum.display();
		ComplexD mul = n.mul(n1);
		System.out.print("Sum: ");
		mul.display();
		
		

	}

}
