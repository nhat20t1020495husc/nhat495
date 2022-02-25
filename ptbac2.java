
import java.util.Scanner;
public class ptbac2 {
    public static void main(String []args){
        Scanner pt=new Scanner(System.in);
        try{
              System.out.println("Nhap he so bac 2 ,a  = ");
              float a=pt.nextFloat();
               System.out.println("Nhap he so bac 1 , b = ");
              float b=pt.nextFloat();
               System.out.println("Nhap he so tu do , c = ");
              float c=pt.nextFloat();
              if (a==0){
                  if (b==0 && c!=0) System.out.println("Phuong trinh vo nghiem !");
                  if (b==0 && c==0) System.out.println("Phuong trinh vo so nghiem !");
                  if (b!=0 && c!=0) System.out.println("Phuong trinh co mot nghiem " +"x = "+(-c/b));
              }
              else {
                  float d=b*b-4*a*c,x1,x2;
                  if (d>0)
                  {
                      x1 =(float) ((-b+ Math.sqrt(d)))/(2*a);
                      x2 =(float) ((-b- Math.sqrt(d)))/(2*a);
                      System.out.println("Phuong trinh co 2 nghiem phan biet la " +"x1 = " +x1 + ", x2 = "+x2 );
                  }
                  else if (d<0)
                      System.out.println("Phuong trinh vo nghiem !!");
                  else 
                      System.out.println("Phuong trinh co nghiem kep " +" x1 = x2 = "+(-b/(2*a)));
              }
        }
        catch( Exception e)
                      {
                      System.out.println("Loi Nhap !!");
                      }
              
                  
        
    }
}

    
    

