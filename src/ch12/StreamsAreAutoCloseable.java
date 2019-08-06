/**
 * @Title StreamsAreAutoCloseable.java
 * @Package ch12
 * @Description TODO
 * @author �����
 * @date 2019��8��2��
 * @version 1.0
 */
package ch12;

import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

/**
 * @ClassName StreamsAreAutoCloseable
 * @Description ��try-with-resources �����Ӿ��д����Ķ��󶼱���ʵ�� java.langAutocloseable �ӿڣ�
 * ����ӿ���һ������ close()��
 * <br><br>
 * ��Դ�淶ͷ�п��԰���������壬����ͨ���ֺŷָ���һ���ֺſ�ѡ��ÿ�����嶼����try�����������close()������
 * @author �����
 * @date 2019��8��2��
 * 
 */
public class StreamsAreAutoCloseable {
    public static void
    main(String[] args) throws IOException{
        try(
                Stream<String> in = Files.lines(
                        Paths.get("StreamsAreAutoCloseable.java"));
                PrintWriter outfile = new PrintWriter(
                        "Results.txt"); // [1]
        ) {
            in.skip(5)
                    .limit(1)
                    .map(String::toLowerCase)
                    .forEachOrdered(outfile::println);
        } // [2]
    }
}
