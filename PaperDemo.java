package PaperDemo;

import java.util.Scanner;

public class PaperDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Question[] paper = {null,null};//����    ��ѡ��������
       paper[0] = new SimpleQuestion("������Ʊ���ף�",new String[]{"A.�绰","B.����","C.��ţ","D.����"},'A');
       paper[1] = new MutilQuestion("�Ǽ�λ�Ǹ��֣�",new String[]{"A.���»�","B.��ѧ��","C.���Ө","D.����"},new char[]{'A','B','C','D'});	
	   Scanner console = new Scanner(System.in);
	   for(int i = 0; i < paper.length; i++){
		   Question q = paper[i];
		   q.print();//��ӡ����
		   System.out.println("��ѡ��");
		   String str = console.nextLine();//�ȴ��û���
		   char[] answers = str.toCharArray();//ת����Ϊ����
		   //�����Ƕ�̬�󶨵������ɾ���������ִ���ĸ�����
		   if(q.check(answers))//����û���
			   System.out.println("����ѽ��");
		   else
			   System.out.println("�ף�ҪŬ��ѽ��");
	   }
	}

}
