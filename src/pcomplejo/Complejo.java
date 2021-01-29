
package pcomplejo;

public class Complejo {
   private double real;
   private double img;
   
   public Complejo(){
       real=0;
       img=0;
   }
   
   public Complejo(double real, double img){
       this.real=real;
       this.img=img;
   }
   
   public double getReal(){
       return real;
   }
   
   public double getImg(){
       return img;
   }
   
   public void setReal(double real){
       this.real  = real;
   }
   
   public void setImg(double img){
       this.img = img;
   }
   
   public Complejo sumaComp(Complejo b){
        Complejo c= new Complejo();
        c.real= this.real+b.getReal();
        c.img= this.img+b.getImg();
        return c;
   }
   
   public Complejo restaComp(Complejo b){
       Complejo c= new Complejo();
       c.real=this.real-b.getReal();
       c.img=this.img-b.getImg();
       return c;
   }
    
   public Complejo multComp(Complejo b){
       Complejo c= new Complejo();
       c.real=this.real*b.getReal()-this.img*b.getImg();
       c.img=this.real*b.getImg()+this.img*b.getImg();
       return c;
   }
   
   public void conjugadoComp( ){
        img = -1*img ;  
   }
   
   public  double moduloComp(){
       return Math.sqrt(real*real+img*img);
   }

   public double angComp(){
    return Math.atan (  img /  real);
   }
   
   public String toString(){
       
   return real+" "+img+" i"; 
   
   }
}
