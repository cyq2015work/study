import org.junit.Test;


public class Methods {
	
	
	/*
	 * 
	 * Author:chen
	 * 
	 */
	
	
	@Test
	public void test(){
		//System.out.println(getNum(10));
		//getSushu(5,100);
		getShuixian(100,999);
	}
	//兔子1,1,2,3,5,8...
	public int getNum(int monthNum){
		if(monthNum==1 || monthNum==2){
			return 1;
		}else{
			return getNum(monthNum-1)+getNum(monthNum-2);
		}
	}
	
	//101-200之间的素数
	public void getSushu(int startNO,int endNO){
		int num=0;
		for(int i=startNO;i<=endNO;i++){
			boolean flag=true;
			for(int j=2;j<i/2;j++){
				if(i%j==0){
					flag=false;
					break;
				}
			}
			if(flag){
			num++;
			System.out.println(i);
			}
	}
		System.out.println("The count is="+num);
	}
	//水仙花数
	public void getShuixian(int startNO,int endNO){
		int sum=0;
		for(int i=startNO;i<endNO;i++){
			int snum=(i%10)*(i%10)*(i%10)+((i%100)/10)*((i%100)/10)*((i%100)/10)+(i/100)*(i/100)*(i/100);
			if(snum==i){
				System.out.println(i);
				sum++;
			}
		}
		System.out.println("sum="+sum);
	}
	
	
}
