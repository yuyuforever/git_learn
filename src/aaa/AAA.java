package aaa;

import java.util.Random;
// 我正在开发，这个模块car_shop，现在我开发完了，合回到feature/car_shop
// 这个功能开发测试完了，准备发布，基于develop创建。
// 我今天开发了一些功能
public class AAA {
	static final int PRICE_TABLE_MAX = 3;
	static final int PRICE_TABLE_TIME = 300;
	static void Demo(){
		String result="";
		int i;
	    Random random = new Random();
	    for(i = 0;i < PRICE_TABLE_MAX;i++){
	    	result+=random.nextInt(10);
	        System.out.println(result);
	     }	       
	}
	public static void main(String[] args){
		int i;
        for( i = 0;i <PRICE_TABLE_TIME;i++){
           Demo();
           
        }
       
		}

}
