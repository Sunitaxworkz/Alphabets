import java.util.*;
class O{
public static void main(String[] args){
int i,j,n=7;


for(i=0;i<=n;i++){
	
for(j=0;j<=5;j++){
if((j==0 || j==4) && (i!=0 && i!=n) ||(i==0 || i==n) && j>0 && j<4)
	
System.out.print("*");
	
else
System.out.print(" ");

}
System.out.println();
}
}
}