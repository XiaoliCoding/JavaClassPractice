package PaperDemo;
import java.util.Arrays;

public class MutilQuestion extends Question {
    char[] answers;
    /*���캯��*/
    public MutilQuestion(String text,String[] options,char[] answers){
    	this.text = text;
    	this.options = options;
    	this.answers = answers;
    }
    /*���Ǹ����еķ���*/
    public boolean check(char[] answers){
    	return Arrays.equals(answers, this.answers);
    }
}
