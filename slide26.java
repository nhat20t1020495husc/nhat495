import java.util.Scanner;
public class slide26 {
    public static void main(String []args){
       Scanner n=new Scanner (System.in);
       try
       {
           System.out.println("Nhap lua chon (0- Single ,1- Married file jointly ,2- Married file seprately ,3- Head of household ) ");
           int a=n.nextInt();
           switch(a)
           {  
              
               case 1:  System.out.println("Nhap luong ");
               float b=n.nextFloat();
               if (0<=b && b<=8.35) {
                   System.out.println("So tien thue phai dong  : " +(b*0.1));
                   break;
               }
               else if (8.351<=b && b<=33.95) 
               {
                   System.out.println("So tien thue phai dong  : " +(b*0.15));
                   break;
               }
               else if (33.951<=b&& b<=82.25) 
               {
                   System.out.println("So tien thue phai dong  : " +(b*0.25));
                   break;
               }
               else if (82.251<=b&& b<=171.55) 
               {
                   System.out.println("So tien thue phai dong  : " +(b*0.28));
                   break;
               }
               else if (171.551<=b && b<=372.95) 
               {
                   System.out.println("So tien thue phai dong : " +(b*0.33));
                   break;
               }
               else 
               {
                  System.out.println("So tien thue phai dong : " +(b*0.35));
               break;
               }
               case 2 :  System.out.println("Nhap luong ");
                 float c=n.nextFloat();
               if (0<=c && c<=16.7) {
                   System.out.println("So tien thue phai dong  : " +(c*0.1));
                   break;
               }
               else if (16.701<=c && c<=67.9) {
                   System.out.println("So tien thue phai dong  : " +(c*0.15));
                   break;
               }
               else if (67.901<=c&& c<=137.05) {
                   System.out.println("So tien thue phai dong  : " +(c*0.25));
                   break;
               }
               else if (137.501<=c&& c<=208.85) {
                   System.out.println("So tien thue phai dong  : " +(c*0.28));
                   break;
               }
               else if (208.851<=c && c<=372.95) {
                   System.out.println("So tien thue phai dong : " +(c*0.33));
                   break;
               }
               else {
                  System.out.println("So tien thue phai dong : " +(c*0.35));
               break;
               }
               case 3:System.out.println("Nhap luong ");
               float d=n.nextFloat();
               if (0<=d&& d<=8.35) {
                   System.out.println("So tien thue phai dong  : " +(d*0.1));
                   break;
               }
               else if (8.351<=d && d<=33.95) 
               {
                   System.out.println("So tien thue phai dong  : " +(d*0.15));
                   break;
               }
               else if (33.951<=d&& d<=68.525) 
               {
                   System.out.println("So tien thue phai dong  : " +(d*0.25));
                   break;
               }
               else if (68.526<=d&& d<=104.425) 
               {
                   System.out.println("So tien thue phai dong  : " +(d*0.28));
                   break;
               }
               else if (104.426<=d && d<=186.475) 
               {
                   System.out.println("So tien thue phai dong : " +(d*0.33));
                   break;
               }
               else 
               {
                  System.out.println("So tien thue phai dong : " +(d*0.35));
               break;
               }
               case 4: System.out.println("Nhap luong ");
               float e=n.nextFloat();
               if (0<=e && e<=11.95) {
                   System.out.println("So tien thue phai dong  : " +(e*0.1));
                   break;
               }
               else if (11.951<=e && e<=45.5) 
               {
                   System.out.println("So tien thue phai dong  : " +(e*0.15));
                   break;
               }
               else if (45.501<=e&& e<=117.45) 
               {
                   System.out.println("So tien thue phai dong  : " +(e*0.25));
                   break;
               }
               else if (117.451<=e&& e<=190.2) 
               {
                   System.out.println("So tien thue phai dong  : " +(e*0.28));
                   break;
               }
               else if (190.201<=e&& e<=372.95) 
               {
                   System.out.println("So tien thue phai dong : " +(e*0.33));
                   break;
               }
               else 
               {
                  System.out.println("So tien thue phai dong : " +(e*0.35));
               break;
               }
               default: System.out.println("Errors: invailid status ");
               System.exit(1);
           }
       } catch(Exception e)
       {
           System.out.println("Loi nhap !!!");
       }
    }
}
    
