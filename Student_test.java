import java.io.*;

public class Student_test {
    public static void main(String[] argv) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Students s1 = new Students();
        s1.set_age(18);
        s1.show_info();
        Students s2 = new Students("Liu jingjing", "20184378", '2', 18);
        s2.show_info();
        String s3 = br.readLine();
        String sp = "[\\W]";
        System.out.println(s3);
        String[] result = s3.replace(" ", "").split(sp);
        int i = result.length;
        for(int j=0;j<i;j++){
            System.out.println(result[j]);
        }
        
    }
}
