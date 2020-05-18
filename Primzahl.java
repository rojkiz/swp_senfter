package Primzahlenn;

public class Primzahl {
	 public static void main(String[] args){
	        int count =0;
	        boolean[] output=prim(1000);
	        for (int i = 2;i<1000;i++){
	            if (output[i] == true) {
	                System.out.println(i);
	                count++;
	            }

	        }
	        System.out.println(count);

	    }
	    static boolean[] prim(int sector){
	        boolean[] a=new boolean[sector];
	        for(int i=0;i<sector;i++)a[i]=true;
	        for (int i = 2;i<Math.sqrt(sector);i++){
	            if(a[i]==true){
	                int x = i;
	                while(x<sector){
	                    x+=i;
	                    try {
	                        a[x]=false;
	                    }catch (Exception e){}

	                }
	            }
	        }
	        return a;
	    }
}
