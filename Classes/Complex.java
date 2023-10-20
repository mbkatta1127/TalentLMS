public class Complex {
    double realPart;
    double imaginaryPart; 

    public Complex(){
        this.realPart = 0.0; 
        this.imaginaryPart = 0.0; 
    }

    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart; 
    }

    public Complex add(Complex otherNumber){
        return new Complex(this.realPart + otherNumber.getRealPart(), 
        this.imaginaryPart + otherNumber.getImaginaryPart());
    }

    public Complex subtract(Complex otherNumber){
        return new Complex(this.realPart - otherNumber.getRealPart(), 
        this.imaginaryPart - otherNumber.getImaginaryPart());
    }

    public Complex multiply(Complex otherNumber){
        return new Complex((this.realPart * otherNumber.getRealPart()) - (this.imaginaryPart * otherNumber.getImaginaryPart()), 
        (this.realPart * otherNumber.getImaginaryPart()) + (this.imaginaryPart * otherNumber.getRealPart()));
    }

    public Complex divide(Complex otherNumber){
        Complex denFlip = new Complex(otherNumber.getRealPart(), -1 * otherNumber.getImaginaryPart()); 
        Complex topPart = multiply(denFlip); 
        double bottomPart = (otherNumber.getRealPart()*otherNumber.getRealPart()) - (-1)*(otherNumber.getImaginaryPart() * otherNumber.getImaginaryPart()); 
        return new Complex(topPart.getRealPart()/bottomPart, topPart.getImaginaryPart()/bottomPart);
    }

    public void setRealPart(double realPart){
        this.realPart = realPart; 
    }

    public void setImaginaryPart(double imaginaryPart){
        this.imaginaryPart = imaginaryPart; 
    }

    public double getRealPart(){
        return this.realPart; 
    }

    public double getImaginaryPart(){
        return this.imaginaryPart; 
    }

    public String toString(){
        if(this.getImaginaryPart()<0) return this.getRealPart() + "" + this.getImaginaryPart() + "i"; 
        else return this.getRealPart() + "+" + this.getImaginaryPart() + "i"; 
    }


}
