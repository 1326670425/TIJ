/**
 * @Title FileSystemDemo.java
 * @Package ch18
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年8月6日
 * @version 1.0
 */
package ch18;

import java.nio.file.*;

/**
 * @ClassName FileSystemDemo
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年8月6日
 * 
 */
public class FileSystemDemo {
    static void show(String id, Object o) {
        System.out.println(id + ": " + o);
    }

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        FileSystem fsys = FileSystems.getDefault();
        for(FileStore fs : fsys.getFileStores())
            show("File Store", fs);
        for(Path rd : fsys.getRootDirectories())
            show("Root Directory", rd);
        show("Separator", fsys.getSeparator());
        show("UserPrincipalLookupService",
            fsys.getUserPrincipalLookupService());
        show("isOpen", fsys.isOpen());
        show("isReadOnly", fsys.isReadOnly());
        show("FileSystemProvider", fsys.provider());
        show("File Attribute Views",
        fsys.supportedFileAttributeViews());
    }
}
