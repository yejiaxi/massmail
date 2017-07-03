package cn.jiaxi.test;

/**
 *  @author yejx119334
 *  判断一个字符串，
 *  如果都是大写，输出true   
 *  都是小写，输出true   
 *  只有首字母大写，输出true    
 *  其余都是输出false
 */
public class Demo2 {
	public static void main(String[] args) {
		System.out.println(	detectCapitalUse("Adasad"));
	
	}
	
	public static  boolean detectCapitalUse(String word) {
		int lowCnt = 0;
		int UpCnt = 0;
		if( word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' ){//首字母大写
			for(int i=1; i<word.length(); i++){
				if( word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){//小写
					lowCnt++;
				}else{//大写
					UpCnt++;
				}
			}
			if(lowCnt == 0){//表示都是大写  
				return true;
			}else if(UpCnt == 0){//表示第一个大写，其余的小写
				return true;
			}else{//表示除了第一个大写  其余的还有大写和小写
				return false;
			}
			
		}else{//首字母小写
			for(int i=1; i<word.length(); i++){
				if( word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){//小写
					lowCnt++;
				}else{//大写
					UpCnt++;
				}
			}	
			if(UpCnt == 0){//表示全部都是小写
				return true;			
			}else{
				return false;
			}
		} 
	}
}
