package PaperDemo;

import java.util.Scanner;

public class PaperDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Question[] paper = {null,null};//考卷    是选择题的组合
       paper[0] = new SimpleQuestion("如何买火车票靠谱？",new String[]{"A.电话","B.网上","C.黄牛","D.画的"},'A');
       paper[1] = new MutilQuestion("那几位是歌手？",new String[]{"A.刘德华","B.张学友","C.徐佳莹","D.赵雷"},new char[]{'A','B','C','D'});	
	   Scanner console = new Scanner(System.in);
	   for(int i = 0; i < paper.length; i++){
		   Question q = paper[i];
		   q.print();//打印试题
		   System.out.println("请选择：");
		   String str = console.nextLine();//等待用户答案
		   char[] answers = str.toCharArray();//转换答案为数组
		   //方法是动态绑定到对象，由具体对象决定执行哪个方法
		   if(q.check(answers))//检查用户答案
			   System.out.println("给力呀！");
		   else
			   System.out.println("亲，要努力呀！");
	   }
	}

}
