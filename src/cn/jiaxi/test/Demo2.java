package cn.jiaxi.test;

/**
 *  @author yejx119334
 *  �ж�һ���ַ�����
 *  ������Ǵ�д�����true   
 *  ����Сд�����true   
 *  ֻ������ĸ��д�����true    
 *  ���඼�����false
 */
public class Demo2 {
	public static void main(String[] args) {
		System.out.println(	detectCapitalUse("Adasad"));
	
	}
	
	public static  boolean detectCapitalUse(String word) {
		int lowCnt = 0;
		int UpCnt = 0;
		if( word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' ){//����ĸ��д
			for(int i=1; i<word.length(); i++){
				if( word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){//Сд
					lowCnt++;
				}else{//��д
					UpCnt++;
				}
			}
			if(lowCnt == 0){//��ʾ���Ǵ�д  
				return true;
			}else if(UpCnt == 0){//��ʾ��һ����д�������Сд
				return true;
			}else{//��ʾ���˵�һ����д  ����Ļ��д�д��Сд
				return false;
			}
			
		}else{//����ĸСд
			for(int i=1; i<word.length(); i++){
				if( word.charAt(i) >= 'a' && word.charAt(i) <= 'z'){//Сд
					lowCnt++;
				}else{//��д
					UpCnt++;
				}
			}	
			if(UpCnt == 0){//��ʾȫ������Сд
				return true;			
			}else{
				return false;
			}
		} 
	}
}
