package PaperDemo;

public class Question {
    String text; //题干
    String [] options;//选项
    /*打印当前题目*/
    public void print(Question this){  //this引用的为子类实例
    	System.out.println(this.text);
    	for(int i = 0; i < this.options.length; i++)
    	{
    		System.out.print(options[i]+"\t");
    	}
    	System.out.println();
    }
    /* 检查答案   这个方法需要具体的覆盖方法*/
    public boolean check(char[] answers){
	 return false;
 }    
}