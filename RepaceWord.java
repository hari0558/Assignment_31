
public class ReplaceWord
{
public static void main(String[] args)
{
StringBuffer s1=new StringBuffer("java is object oriented,");
StringBuffer s2=new StringBuffer("java is programing language,");
s1.replace(0,4,"C++");
s2.replace(0,4,"C++");
s1.append(s2);
System.out.println("Modifying String is:"+s1);
}
}