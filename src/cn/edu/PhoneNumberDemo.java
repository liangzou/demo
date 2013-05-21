package cn.edu;

public class PhoneNumberDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[] = {0,0,0,0,0,0,0,0,0,0,0};
		int j=0;
		int k=0;
		char a1[][]={{' '},
				     {' '},
				     {'A','B','C'},
				     {'D','E','F'},
				     {'G','H','I'},
				     {'J','K','L'},
				     {'M','N','O'},
				     {'P','Q','R','S'},
				     {'T','U','V'},
				     {'W','X','Y','Z'},
		};
		String a="467";
		for(int i=0;i<a1.length;i++){
			b[i]=a1[i].length;
			//System.out.println(b[i]);
		}
		/*for(int i=0;i<10;i++){		
			System.out.println(b[i]);
		}*/
		
		while(j<a.length()){
			char t=a.charAt(j);
			int m=Integer.parseInt(String.valueOf(t));
			System.out.println("***"+m);
			//System.out.println(t);
			while(k<a1[m].length){
				System.err.println(a1[m][k]);
				k++;
			}
			j++;
		}
		
		/*char c[10][10]={
        	'';
        	'';
        	'A','B','C';
        	"",
        	"ABC",
        	"DEF",
        	"GHI",
        	"JKL",
        	"MNO",
        	"PQRS",
        	"TUV",
        	"WXYZ",
        	      };*/
	}

}
